package es.upm.fi.dia.oeg.ogsadai.sparql.lqp.activities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import uk.org.ogsadai.activity.ActivityProcessingException;
import uk.org.ogsadai.activity.ActivityTerminatedException;
import uk.org.ogsadai.activity.ActivityUserException;
import uk.org.ogsadai.activity.io.TupleListIterator;
import uk.org.ogsadai.activity.transform.InvalidUnionException;
import uk.org.ogsadai.common.msgs.DAILogger;
import uk.org.ogsadai.expression.Expression;
import uk.org.ogsadai.expression.ExpressionEvaluationException;
import uk.org.ogsadai.expression.ExpressionFactory;
import uk.org.ogsadai.expression.IncomparableTypesException;
import uk.org.ogsadai.expression.arithmetic.ArithmeticExpression;
import uk.org.ogsadai.expression.arithmetic.ExpressionException;
import uk.org.ogsadai.parser.SQLParserException;
import uk.org.ogsadai.parser.sql92query.SQLQueryParser;
import uk.org.ogsadai.tuple.ColumnMetadata;
import uk.org.ogsadai.tuple.ColumnNotFoundException;
import uk.org.ogsadai.tuple.Null;
import uk.org.ogsadai.tuple.SimpleTuple;
import uk.org.ogsadai.tuple.SimpleTupleMetadata;
import uk.org.ogsadai.tuple.Tuple;
import uk.org.ogsadai.tuple.TupleMetadata;
import uk.org.ogsadai.tuple.TupleTypes;
import uk.org.ogsadai.tuple.TypeConverter;
import uk.org.ogsadai.tuple.TypeMismatchException;
import uk.org.ogsadai.tuple.join.ConfigurationException;
import uk.org.ogsadai.tuple.join.MultiValueTreeMap;
import uk.org.ogsadai.tuple.join.MultiValueTreeMapQuerier;
import uk.org.ogsadai.tuple.join.PrimaryComparisonExtractor;

public class SparqlUnion
{

    /** Copyright notice. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Universidad Politecnica de Madrid, 2011.";

    /** Logger object for logging in this class. */
    private static final DAILogger LOG = DAILogger.getLogger(SparqlUnion.class);

    /** The equality condition. */
    protected Expression mCondition;

    /** Stored tuples, indexed by results of one side of the primary expression. */
    private MultiValueTreeMap<Object, Tuple> mMap;

    /** Primary expression of the join condition. */
    private Expression mPrimaryExpression;

    /** One operand of the primary expression which provides the stored keys. */
    private ArithmeticExpression mStoredKey;

    /** The other operand of the primary expression. */
    private ArithmeticExpression mStreamedKey;

    private TupleMetadata mUnionMetadata;

    private TupleMetadata mCandidateMetadata;

    private TupleMetadata mStoredTupleMetadata;

    private List<Object> mUsedKeys;

    private List<Object> mAllKeys;

    public TupleMetadata configure(TupleMetadata left, TupleMetadata right)
            throws ColumnNotFoundException, TypeMismatchException,
            IncomparableTypesException, ConfigurationException,
            InvalidUnionException
    {
        TupleMetadata metadata = validateMetadata(left, right);
        findPrimaryExpression(left, right);
        mPrimaryExpression.configure(new SimpleTupleMetadata("", left, right));
        mUnionMetadata = metadata;
        mCandidateMetadata = left;
        mStoredTupleMetadata = right;
        mUsedKeys = new ArrayList<Object>();
        mAllKeys = new ArrayList<Object>();

        int storedKeyType = mStoredKey.getMetadata().getType();
        int streamedKeyType = mStreamedKey.getMetadata().getType();
        int resultType = TypeConverter.getArithmeticType(storedKeyType,
                streamedKeyType);

        mMap = new MultiValueTreeMap<Object, Tuple>();

        if (storedKeyType != resultType)
        {
            mStoredKey.resetType();
            mStoredKey.setContextType(resultType);
        }
        if (streamedKeyType != resultType)
        {
            mStreamedKey.resetType();
            mStreamedKey.setContextType(resultType);
        }
        return metadata;
    }

    /**
     * Validates that metadata from each input tuple list is the same, column
     * count, column names. Upcasting is used for arithmetic types so, for
     * example, {@link TupleTypes.SHORT} and {@link TupleTypes.INT} are deemed
     * to match. New tuple meta data reflecting such matches is returned.
     * 
     * @param wrapper
     *            Metadata wrappers for each input tuple list. There must be at
     *            least two.
     * @return tuple meta data for the UNION.
     * @throws InvalidUnionException
     *             If tuple streams are incompatible.
     */
    private TupleMetadata validateMetadata(TupleMetadata metadata1,
            TupleMetadata metadata2) throws InvalidUnionException
    {
        if (LOG.isDebugEnabled())
        {
            LOG.debug("Input 0 MetaData");
            LOG.debug(metadata1.toString());
            LOG.debug("Input 1 MetaData");
            LOG.debug(metadata2.toString());
        }
        List<ColumnMetadata> mergedMetadata2 = new ArrayList<ColumnMetadata>();
        for (int j = 0; j < metadata1.getColumnCount(); j++)
        {
            ColumnMetadata column1Metadata = metadata1.getColumnMetadata(j);
            mergedMetadata2.add(column1Metadata);
            for (int k = 0; k < metadata2.getColumnCount(); k++)
            {
                ColumnMetadata column2Metadata = metadata2.getColumnMetadata(k);
                if (!column1Metadata.getName()
                        .equals(column2Metadata.getName())
                // && !column1Metadata.getTableName().equals(
                // column2Metadata.getTableName())
                        && !containsAttrTable(mergedMetadata2,
                                column2Metadata.getName()))
                {
                    mergedMetadata2.add(column2Metadata);

                }
            }
        }

        return new SimpleTupleMetadata(mergedMetadata2);
    }

    private boolean containsAttrTable(List<ColumnMetadata> mergedMetadata,
            String name)
    {
        for (int i = 0; i < mergedMetadata.size(); i++)
        {
            String name1 = mergedMetadata.get(i).getName();
            if (name1.equals(name))
            {
                return true;
            }
        }
        return false;
    }

    protected void storeTuple(Tuple tuple)
    {
        Object key;
        try
        {
            mStoredKey.evaluate(tuple);
            key = mStoredKey.getResult();
            mAllKeys.add(key);
            mAllKeys.removeAll(mUsedKeys);
            if (key == null)
            {
                mMap.add("defaultKey", tuple);
            }
            else
            {
                mMap.add(key, tuple);
                if (LOG.isDebugEnabled())
                {
                    LOG.debug("String tuple: " + tuple);
                    LOG.debug("Storing key: " + key + " of type : "
                            + key.getClass().getName());
                }
            }

        }
        catch (ExpressionEvaluationException e)
        {
            if (e.canTreatAsNULL())
            {
                key = Null.getValue();
            }
            else
            {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * Stores tuples from one side of the join.
     * 
     * @param iterator
     *            tuple list iterator
     * @throws ActivityUserException
     * @throws ActivityProcessingException
     * @throws ActivityTerminatedException
     */
    public void storeTuples(TupleListIterator iterator)
            throws ActivityUserException, ActivityProcessingException,
            ActivityTerminatedException
    {
        Tuple tuple;
        while ((tuple = (Tuple) iterator.nextValue()) != null)
        {
            storeTuple(tuple);
        }
    }

    protected Iterator<Tuple> getCandidateMatches(Tuple tuple)
    {
        Object key = Null.getValue();
        try
        {
            mStreamedKey.evaluate(tuple);
            key = mStreamedKey.getResult();
            if (key == null)
            {
                key = "defaultKey";
            }
        }
        catch (ExpressionEvaluationException e)
        {
            if (e.canTreatAsNULL())
            {
                key = Null.getValue();
            }
            else
            {
                throw new RuntimeException(e);
            }
        }

        // if (LOG.isDebugEnabled())
        // {
        // LOG.debug("Streamed tuple: " + tuple);
        // LOG.debug("Streamed key: " + key + " of type : "
        // + key.getClass().getName());
        // }

        if (key != Null.getValue())
        {
            MultiValueTreeMapQuerier<Object, Tuple> querier = new MultiValueTreeMapQuerier<Object, Tuple>(
                    mMap);
            mUsedKeys.add(key);
            return querier.query(mPrimaryExpression, key);
        }
        else
        {
            // Null can join with nothing so return no candidate matches
            List<Tuple> emptyList = Collections.emptyList();
            return emptyList.iterator();
        }
    }

    public List<Object> getRestKey()
    {
        mAllKeys.removeAll(mUsedKeys);
        return mAllKeys;
    }

    protected Iterator<Tuple> getNotMatchedTuples(Object key)
    {
        if (key == null)
        {
            key = Null.getValue();
        }
        if (key != Null.getValue())
        {
            MultiValueTreeMapQuerier<Object, Tuple> querier = new MultiValueTreeMapQuerier<Object, Tuple>(
                    mMap);
            mUsedKeys.add(key);
            return querier.query(mPrimaryExpression, key);
        }
        else
        {
            // Null can join with nothing so return no candidate matches
            List<Tuple> emptyList = Collections.emptyList();
            return emptyList.iterator();
        }
    }

    /**
     * Extracts the primary expression if there is one and configures it.
     * 
     * @param expression
     *            expression from which to extract the primary expression
     * @param left
     *            tuple metadata for one join input
     * @param right
     *            tuple metadata for the other join input
     * @throws ConfigurationException
     * @throws TypeMismatchException
     */
    private void findPrimaryExpression(TupleMetadata left, TupleMetadata right)
            throws ConfigurationException
    {
        List<String> commonVars = new ArrayList<String>();
        for (int i = 0; i < left.getColumnCount(); i++)
        {
            ColumnMetadata leftColumn = left.getColumnMetadata(i);
            for (int j = 0; j < right.getColumnCount(); j++)
            {
                ColumnMetadata rightColumn = right.getColumnMetadata(j);
                if (rightColumn.getName().equals(leftColumn.getName())
                        && !rightColumn.getTableName().equals(
                                leftColumn.getTableName())
                        && !commonVars.contains(rightColumn.getTableName()
                                + "." + rightColumn.getName() + "="
                                + leftColumn.getTableName() + "."
                                + leftColumn.getName()))
                {
                    commonVars.add(rightColumn.getTableName() + "."
                            + rightColumn.getName() + "="
                            + leftColumn.getTableName() + "."
                            + leftColumn.getName());
                }
            }
        }

        String preficateFinal = "";
        for (String string : commonVars)
        {
            preficateFinal = preficateFinal + " AND " + string;
        }
        preficateFinal = preficateFinal
                .substring(preficateFinal.indexOf("D") + 1);

        try
        {
            PrimaryComparisonExtractor extractor = new PrimaryComparisonExtractor();
            Expression expr = null;
            expr = ExpressionFactory.buildExpression(SQLQueryParser
                    .getInstance().parseSQLForCondition(preficateFinal), null);
            mCondition = expr;
            mPrimaryExpression = extractor.extract(expr, left, right);
            mStoredKey = extractor.getRightExpression();
            mStoredKey.configure(right);
            mStreamedKey = extractor.getLeftExpression();
            mStreamedKey.configure(left);
        }
        catch (TypeMismatchException e)
        {
            throw new RuntimeException(e);
        }
        catch (ExpressionException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (SQLParserException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (LOG.isDebugEnabled())
        {
            LOG.debug("Tuple metadata left: " + left);
            LOG.debug("Tuple metadata right: " + right);
            LOG.debug("Primary Expression: " + mPrimaryExpression);
            LOG.debug("Stored Key: " + mStoredKey);
            LOG.debug("Streamed Key: " + mStreamedKey);
        }
    }

    public Tuple createUnionTuple(Tuple tuple, boolean candidate)
    {

        // candidate.getObject(metadata, columnName)
        TupleMetadata unionMetadata;
        if (candidate)
        {
            unionMetadata = mCandidateMetadata;
        }
        else
        {
            unionMetadata = mStoredTupleMetadata;
        }
        List<Object> newFields = new ArrayList<Object>();
        for (int i = 0; i < mUnionMetadata.getColumnCount(); i++)
        {
            ColumnMetadata columnMetadata = mUnionMetadata.getColumnMetadata(i);
            Object t = null;
            try
            {
                t = tuple.getObject(unionMetadata, columnMetadata.getName());
                newFields.add(t);
            }
            catch (ColumnNotFoundException e)
            {
                newFields.add(Null.VALUE);
            }
        }

        return new SimpleTuple(newFields);
    }

    /**
     * Produces a union between the given tuple and the stored tuples if they
     * match the condition.
     * 
     * @param tuple
     *            input tuple
     * @return iterates over the resulting joined tuples
     */
    public Iterable<Tuple> union(Tuple tuple)
    {
        return new UnionedTupleIterator(tuple);
    }

    /**
     * Joins a tuple with the candidate matches and iterates over the joined
     * tuples for which the condition holds true. By default, the tuple will be
     * joined on the right.
     * 
     * @author The OGSA-DAI Project Team.
     */
    private class UnionedTupleIterator implements Iterable<Tuple>,
            Iterator<Tuple>
    {
        /** Copyright notice. */
        private static final String COPYRIGHT_NOTICE = "Copyright (c) Universidad Politecnica de Madrid, 2011";

        /** List of candidate matches. */
        private Iterator<Tuple> mCandidateMatches;
        /** Tuple to join. */
        private Tuple mTuple;
        /** Next output tuple or <code>null</code> if none is available. */
        private Tuple mNext;

        /**
         * Constructor.
         * 
         * @param tuple
         *            the tuple to join
         */
        public UnionedTupleIterator(Tuple tuple)
        {
            mTuple = tuple;
            mCandidateMatches = getCandidateMatches(tuple);
        }

        /**
         * {@inheritDoc}
         */
        public boolean hasNext()
        {
            mNext = getNext();
            return (mNext != null);
        }

        /**
         * {@inheritDoc}
         */
        public Tuple next()
        {
            return mNext;
        }

        /**
         * Returns the next matching tuple.
         * 
         * @return next tuple or <code>null</code> if there are no more matching
         *         tuples
         */
        private Tuple getNext()
        {
            if (mCandidateMatches.hasNext())
            {
                Tuple product = createProductTuple(mCandidateMatches.next(),
                        mTuple);
                return product;
            }
            else
            {

            }

            return null;
        }

        protected Tuple createProductTuple(Tuple candidate, Tuple tuple)
        {

            // candidate.getObject(metadata, columnName)
            // TupleMetadata unionMetadata;
            List<Object> newFields = new ArrayList<Object>();
            for (int i = 0; i < mUnionMetadata.getColumnCount(); i++)
            {
                ColumnMetadata columnMetadata = mUnionMetadata
                        .getColumnMetadata(i);
                Object t = null;
                try
                {
                    t = tuple.getObject(mCandidateMetadata,
                            columnMetadata.getName());
                    if (t == null)
                    {
                        newFields.add(Null.VALUE);
                    }
                    else
                    {
                        newFields.add(t);
                    }
                }
                catch (ColumnNotFoundException e)
                {
                    t = candidate.getObject(mStoredTupleMetadata,
                            columnMetadata.getName());
                    if (t != null)
                    {
                        newFields.add(t);
                    }
                    else
                    {
                        newFields.add(Null.VALUE);
                    }
                }
            }

            return new SimpleTuple(newFields);
        }

        /**
         * {@inheritDoc}
         * 
         * @throws UnsupportedOperationException
         *             always
         */
        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        /**
         * {@inheritDoc}
         */
        public Iterator<Tuple> iterator()
        {
            return this;
        }
    }
}

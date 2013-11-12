package es.upm.fi.dia.oeg.ogsadai.sparql.lqp.operators;

import java.util.ArrayList;
import java.util.List;

import uk.org.ogsadai.common.msgs.DAILogger;
import uk.org.ogsadai.dqp.common.DataDictionary;
import uk.org.ogsadai.dqp.common.DataNode;
import uk.org.ogsadai.dqp.common.DataNodeTable;
import uk.org.ogsadai.dqp.common.EvaluationNode;
import uk.org.ogsadai.dqp.lqp.Annotation;
import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.AttributeImpl;
import uk.org.ogsadai.dqp.lqp.HeadingImpl;
import uk.org.ogsadai.dqp.lqp.OperatorID;
import uk.org.ogsadai.dqp.lqp.OperatorVisitor;
import uk.org.ogsadai.dqp.lqp.ScanOperator;
import uk.org.ogsadai.dqp.lqp.exceptions.LQPException;
import uk.org.ogsadai.dqp.lqp.operators.UnaryOperator;
import uk.org.ogsadai.tuple.TupleTypes;
import es.upm.fi.dia.oeg.ogsadai.sparql.patterns.SimpleBasicGraphPattern;

public class RDFEmptySetOperator extends UnaryOperator implements ScanOperator
{

    /**
     * SPARQL End point Source
     */
    private String mSource;

    /** Logger. */
    private static final DAILogger LOG = DAILogger
            .getLogger(RDFEmptySetOperator.class);

    /** Candidate data node tables. */
    protected List<DataNodeTable> mDataNodeTables;

    /** Data dictionary */
    protected DataDictionary mDataDictionary;

    /** Scan query */
    protected SimpleRDFServiceScanQuery mQuery;

    /** BGP in the query */
    protected SimpleBasicGraphPattern mBgp;

    /**
     * constructor, no arguments needed since it will be an empty and
     * non-functional scan
     * 
     */
    public RDFEmptySetOperator()
    {
        this.mID = OperatorID.getInstance("RDF_EMPTY_SET_SCAN");
        List<Attribute> attrs = new ArrayList<Attribute>();
        Attribute attr = new AttributeImpl("*", TupleTypes._STRING,
                "defaultDataset");
        attrs.add(attr);

        mOperatorHeading = new HeadingImpl(attrs);
        mBgp = new SimpleBasicGraphPattern();
        mQuery = new SimpleRDFServiceScanQuery("");
        mSource = "defaultDataset";
    }

    public SimpleBasicGraphPattern getBgp()
    {
        return mBgp;
    }

    public DataNode getDataNode()
    {
        DataNode dataNode = Annotation.getDataNodeAnnotation(this);
        EvaluationNode evalNode = Annotation.getEvaluationNodeAnnotation(this);

        if (dataNode != null)
        {
            if (!getDataNodes().contains(dataNode))
            {
                throw new RuntimeException("Inconsistent data.node annotation.");
            }
            else
            {
                return dataNode;
            }
        }
        else if (evalNode != null)
        {
            for (DataNode dn : getDataNodes())
            {
                if (dn.getEvaluationNode().equals(evalNode))
                {
                    return dn;
                }
            }
            throw new RuntimeException(
                    "Inconsistent evaluation.node annotation.");
        }
        else
        {
            return mDataNodeTables.get(0).getDataNode();
        }
    }

    public List<DataNode> getDataNodes()
    {
        List<DataNode> dataNodeList = new ArrayList<DataNode>();
        for (DataNodeTable dnt : mDataNodeTables)
        {
            dataNodeList.add(dnt.getDataNode());
        }
        return dataNodeList;
    }

    public void setDataDictionary(DataDictionary dataDictionary)
    {
        mQuery.setDataDictionary(dataDictionary);
        mDataDictionary = dataDictionary;
    }

    public void accept(OperatorVisitor visitor)
    {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update() throws LQPException
    {

        // TESTING PURPOSES
        // REMOVE WHEN WORKING WITH SERVERS

        if (mDataDictionary == null)
        {
            throw new IllegalStateException("Data Dictionary has not been set.");
        }

        // This is loading data node tables from the dictionary. first gets the
        // table schema: TableSchema[name=bsbm_offers_someTableName]. Each one
        // has a data node associated
        mDataNodeTables = mDataDictionary.getTableSchema(
                mSource + "_someTableName").getDataNodeTables();
        mOperatorHeading = new HeadingImpl(mOperatorHeading);
    }

    @Override
    public long getResultCardinality()
    {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void validate() throws LQPException
    {
    }

    public void setProjectAttributes(List<Attribute> attr)
    {
        mOperatorHeading = new HeadingImpl(attr);
    }

    /**
     * returns the query which will be sent to the SPARQL end point
     * 
     * @return
     */
    public String getPhysicalDatabaseQuery()
    {
        return "";
    }

    public void setOrigin(String source)
    {
        this.mSource = source;

    }

    public String getSource()
    {
        return mSource;

    }

    /**
     * Gets the query used to implement the table scan. As more operators get
     * imploded into this operator the query can get progressively more complex.
     * <p>
     * Implosion optimisers will typically cast the result of this call to a
     * subclass that provides more functionality.
     * 
     * @return the query that will be executed by the operator.
     */
    public SimpleRDFServiceScanQuery getQuery()
    {
        return mQuery;
    }

    public void setQuery(List<Attribute> attr)
    {
        // List<Attribute> attr = new ArrayList<Attribute>();
        // attr.add(new AttributeImpl(subject, TupleTypes._STRING, source));
        // attr.add(new AttributeImpl(predicate, TupleTypes._STRING, source));
        // attr.add(new AttributeImpl(object, TupleTypes._STRING, source));
        // mOperatorHeading = mOperatorHeading.createMerged(new
        // HeadingImpl(attr));
    }

    public void addDataNodeTable(DataNodeTable dnTable)
    {
        this.mDataNodeTables.add(dnTable);

    }
}
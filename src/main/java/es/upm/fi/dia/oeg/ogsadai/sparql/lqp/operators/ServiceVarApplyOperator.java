package es.upm.fi.dia.oeg.ogsadai.sparql.lqp.operators;

import java.util.Map;
import java.util.Set;

import uk.org.ogsadai.dqp.lqp.Annotation;
import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.Operator;
import uk.org.ogsadai.dqp.lqp.OperatorID;
import uk.org.ogsadai.dqp.lqp.OperatorVisitor;
import uk.org.ogsadai.dqp.lqp.operators.AbstractOperator;
import uk.org.ogsadai.dqp.lqp.operators.ApplyOperator;

public class ServiceVarApplyOperator extends ApplyOperator
{
    /** Copyright statement. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Pontificia Universidad Catolica de Chile, 2013.";

    private static final int DEFAULT_BATCH_SIZE = 2000;

    private int mBatchSize = DEFAULT_BATCH_SIZE;
    private String[] mAggregateNames;
    private String[] mAggregateExpressions;

    /**
     * Default constructor.
     */
    protected ServiceVarApplyOperator()
    {
        mID = OperatorID.getInstance("SPARQL_APPLY");
    }

    /**
     * Constructor.
     * 
     * @param operator
     *            wrapped operator
     * @param attrToBind
     *            attributes to bind
     */
    public ServiceVarApplyOperator(Operator operator, Set<Attribute> attrToBind)
    {
        this();
        mOperator = operator;
        Map<String, Object> annotations = ((AbstractOperator) operator).getAnnotations();
        for (String a : annotations.keySet())
        {
            // We don't want to inherit IMPLEMENTATION annotation
            if (!a.equals(Annotation.IMPLEMENTATION))
            {
                mAnnotations.put(a, annotations.get(a));
            }
        }
        mAttributesToBind = attrToBind;
    }

    /**
     * {@inheritDoc}
     */
    public void accept(OperatorVisitor visitor)
    {
        visitor.visit(this);
    }

    /**
     * Gets the batch size to be use for batch query execution. This is the
     * maximum number of values that will be included in the IN clause of a
     * batch query.
     * 
     * @return batch size
     */
    public int getBatchSize()
    {
        return mBatchSize;
    }

    /**
     * Sets the batch size to be used for batch query execution. This is the
     * maximum number of values that will be included in the IN clause of a
     * batch query.
     * 
     * @param batchSize
     *            batch size
     */
    public void setBatchSize(int batchSize)
    {
        mBatchSize = batchSize;
    }

    public void setAggregateExpressions(String[] aggregateExpressions)
    {
        mAggregateExpressions = aggregateExpressions;
    }

    public String[] getAggregateExpressions()
    {
        return mAggregateExpressions;
    }

    public void setAggregateNames(String[] aggregateNames)
    {
        mAggregateNames = aggregateNames;

    }

    public String[] getAggregateNames()
    {
        return mAggregateNames;
    }
}

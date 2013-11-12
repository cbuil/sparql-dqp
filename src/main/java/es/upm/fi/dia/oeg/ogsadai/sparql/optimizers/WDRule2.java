package es.upm.fi.dia.oeg.ogsadai.sparql.optimizers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import uk.org.ogsadai.dqp.common.CompilerConfiguration;
import uk.org.ogsadai.dqp.common.RequestDetails;
import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.Operator;
import uk.org.ogsadai.dqp.lqp.OperatorID;
import uk.org.ogsadai.dqp.lqp.exceptions.LQPException;
import uk.org.ogsadai.dqp.lqp.optimiser.Optimiser;
import uk.org.ogsadai.resource.dataresource.dqp.RequestDQPFederation;

public class WDRule2 implements Optimiser
{

    /** Copyright notice. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Universidad Politecnica de Madrid, 2010";

    /** Logger. */
    private static final Logger LOG = Logger.getLogger(WDRule2.class.getName());

    @Override
    public Operator optimise(Operator lqpRoot,
            RequestDQPFederation requestFederation,
            CompilerConfiguration compilerConfiguration,
            RequestDetails requestDetails) throws LQPException
    {
        LOG.info("Into WellDesignedRule2Optimiser BottomUpLQPWalker...");
        walk(lqpRoot);
        return lqpRoot;
    }

    /**
     * @param lqpRoot
     */
    private void walk(Operator lqpRoot)
    {
        List<Attribute> childAttributes = new ArrayList<>();
        if (lqpRoot.isBinary())
        {
            traverse(lqpRoot.getChild(0), childAttributes);
            traverse(lqpRoot.getChild(1), childAttributes);
        }
        else
        {
            traverse(lqpRoot.getChild(0), childAttributes);
        }
    }

    /**
     * @param lqpRoot
     */
    private void traverse(Operator lqpRoot, List<Attribute> childAttributes)
    {
        if (lqpRoot != null)
        {
            if (lqpRoot.isBinary())
            {
                traverse(lqpRoot.getChild(0), childAttributes);
                traverse(lqpRoot.getChild(1), childAttributes);
            }
            else
            {
                if (isServiceScan(lqpRoot))
                {
                    LOG.info("SERVICE SCAN, attributes: "
                            + lqpRoot.getHeading().getAttributes());
                    
                }
            }
        }
    }

    /**
     * checks if the current operator's child is a PROJECT + SERVICE_SCAN
     * operator
     * 
     * @param op
     * @return
     */
    private boolean isServiceScan(Operator op)
    {
        if (op.getChildCount() > 0
                & op.getID() == OperatorID.PROJECT)
        {
            if (op.getChild(0).getID() == OperatorID
                    .getInstance("RDF_SERVICE_SCAN"))
            {
                return true;
            }
        }
        return false;
    }
}

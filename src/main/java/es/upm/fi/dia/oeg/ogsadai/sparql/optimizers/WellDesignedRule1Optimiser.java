// Copyright (c) Copyright (c) The University of Edinburgh, Universidad Politecnica de Madrid, 2009-2012.
//
// LICENCE-START
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software 
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// LICENCE-END

package es.upm.fi.dia.oeg.ogsadai.sparql.optimizers;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.ListUtils;
import org.apache.log4j.Logger;

import uk.org.ogsadai.dqp.common.CompilerConfiguration;
import uk.org.ogsadai.dqp.common.RequestDetails;
import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.Operator;
import uk.org.ogsadai.dqp.lqp.OperatorID;
import uk.org.ogsadai.dqp.lqp.exceptions.LQPException;
import uk.org.ogsadai.dqp.lqp.operators.SelectOperator;
import uk.org.ogsadai.dqp.lqp.optimiser.Optimiser;
import uk.org.ogsadai.resource.dataresource.dqp.RequestDQPFederation;

/**
 * This class detects and applies rule 1 of the well designed patterns described
 * by Jorge Perez, Marcelo Arenas and Claudio Gutierrez. Identifies pattern ((P1
 * OPT P2) FILTER R) and transforms it in ((P1 FILTER R) OPT P2)
 * 
 * @author Carlos Buil Aranda,Oscar Corcho
 * @email cbuil@fi.upm.es, ocorcho@fi.upm.es
 * @institution Universidad Politecnica de Madrid
 * 
 */
public class WellDesignedRule1Optimiser implements Optimiser
{
    /** Copyright notice. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Universidad Politecnica de Madrid, 2010";

    /** Logger. */
    private static final Logger LOG = Logger
            .getLogger(WellDesignedRule1Optimiser.class.getName());

    public void addProperty(String key, String value)
    {
        // TODO Auto-generated method stub

    }

    public Operator optimise(Operator lqpRoot,
            RequestDQPFederation requestFederation,
            CompilerConfiguration compilerConfiguration,
            RequestDetails requestDetails) throws LQPException
    {
        LOG.info("Into BottomUpLQPWalker...");
        walk(lqpRoot);
        return lqpRoot;
    }

    /**
     * @param lqpRoot
     */
    private void walk(Operator lqpRoot)
    {
        if (lqpRoot.isBinary())
        {
            traverse(lqpRoot.getChild(0));
            traverse(lqpRoot.getChild(1));
        }
        else
        {
            traverse(lqpRoot.getChild(0));
        }
    }

    /**
     * @param lqpRoot
     */
    private void traverse(Operator lqpRoot)
    {
        if (lqpRoot != null)
        {
            if (lqpRoot.isBinary())
            {
                traverse(lqpRoot.getChild(0));
                traverse(lqpRoot.getChild(1));
            }
            else
            {
                if (isServiceScan(lqpRoot))
                {
                    LOG.info("SERVICE SCAN, attributes: "
                            + lqpRoot.getHeading().getAttributes());
                    if (lqpRoot.getParent().getID() == OperatorID
                            .getInstance("LEFT_OUTER_JOIN"))
                    {
                        if (!lqpRoot.getParent().getChild(0).equals(lqpRoot))
                        {
                            if (lqpRoot.getParent().getParent().getID() == OperatorID
                                    .getInstance("SELECT"))
                            {
                                LOG.debug("Pattern 1 found...");
                                if (checkSafeCondition(lqpRoot.getParent()
                                        .getParent(), lqpRoot.getParent()))
                                {
                                    LOG.debug("pattern safe: "
                                            + lqpRoot.getID());
                                    // pattern ((P1 FILTER R) OPT P2) found
                                    // different order than with left child
                                    // (getChild(0))

                                    // careful with the order of the operators
                                    // in this operation, it might be different
                                    // depending on the right/side of the
                                    // pattern found
                                    Operator optimisedOperator = null;
                                    Operator parentLeftJoin = null;
                                    parentLeftJoin = lqpRoot.getParent();
                                    Operator grandPaPaSelectOperator = parentLeftJoin
                                            .getParent().getParent();
                                    Operator rightOptOperator = lqpRoot
                                            .getParent().getChild(0);

                                    grandPaPaSelectOperator.disconnect();
                                    grandPaPaSelectOperator
                                            .setChild(0, lqpRoot);
                                    parentLeftJoin.setChild(0,
                                            grandPaPaSelectOperator);
                                    parentLeftJoin
                                            .setChild(1, rightOptOperator);

                                    try
                                    {
                                        parentLeftJoin.update();
                                    }
                                    catch (LQPException e)
                                    {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                    }
                                }
                                else
                                {
                                    LOG.debug("pattern not safe: "
                                            + lqpRoot.getID());
                                }
                            }
                        }
                        else if (!lqpRoot.getParent().getChild(1).equals(
                                lqpRoot))
                        {
                            if (lqpRoot.getParent().getParent().getID() == OperatorID
                                    .getInstance("SELECT"))
                            {
                                LOG.debug("Pattern 1 found...");
                                if (checkSafeCondition(lqpRoot.getParent()
                                        .getParent(), lqpRoot.getParent()))
                                {
                                    // pattern ((P1 FILTER R) OPT P2) found
                                    // different order than with left child
                                    // (getChild(0))

                                    // careful with the order of the operators
                                    // in this operation, it might be different
                                    // depending on the right/side of the
                                    // pattern found
                                    Operator parentProjectOp = null;
                                    Operator parentLeftJoin = null;
                                    parentLeftJoin = lqpRoot.getParent();
                                    Operator parentSelectOperator = parentLeftJoin
                                            .getParent();
                                    Operator rightOptOperator = lqpRoot
                                            .getParent().getChild(1);
                                    parentProjectOp = parentLeftJoin
                                            .getParent().getParent();

                                    parentSelectOperator.disconnect();
                                    parentProjectOp.disconnect();
                                    
                                    parentSelectOperator
                                            .setChild(0, lqpRoot);
                                    parentLeftJoin.disconnect();
                                    parentLeftJoin.setChild(0,
                                            parentSelectOperator);
                                    parentLeftJoin
                                            .setChild(1, rightOptOperator);
                                    parentProjectOp.setChild(0, parentLeftJoin);

                                    try
                                    {
                                        parentLeftJoin.update();
                                        parentSelectOperator.update();
                                        parentProjectOp.update();
                                    }
                                    catch (LQPException e)
                                    {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                    }
                                }
                                else
                                {
                                    LOG.debug("pattern NOT safe: "
                                            + lqpRoot.getID());
                                }
                            }
                        }

                    }
                }
                else
                {
                    traverse(lqpRoot.getChild(0));
                }
            }
        }
        LOG.info("bottom of the LQP");
    }

    /**
     * checks if the current operator's child is a PROJECT + SERVICE_SCAN
     * operator
     * 
     * @param child
     * @return
     */
    private boolean isServiceScan(Operator child)
    {
        if (child.getChildCount() > 0
                & child.getID() == OperatorID.getInstance("PROJECT"))
        {
            if (child.getChild(0).getID() == OperatorID
                    .getInstance("RDF_SERVICE_SCAN"))
            {
                return true;
            }
        }
        return false;
    }

    /**
     * checks safe condition (variables in P1 are in P2 and P')
     * 
     * @param filterSelectOperator
     * 
     * @param optionalOperator
     *            (P1 OPT P2)
     * 
     * @return true if pattern is safe
     */
    private boolean checkSafeCondition(Operator filterSelectOperator,
            Operator optionalOperator)
    {
        List<String> pPrimeAttrs = new ArrayList<String>();
        // getting variables from left side of AND (parent operator)
        for (Attribute attribute : ((SelectOperator) filterSelectOperator)
                .getUsedAttributes())
        {
            pPrimeAttrs.add(attribute.getName());
        }

        // getting variables from P2
        List<String> p2Attrs = new ArrayList<String>();
        for (Attribute attribute : optionalOperator.getChild(1).getHeading()
                .getAttributes())
        {
            p2Attrs.add(attribute.getName());
        }
        // p2Attrs.addAll(pPrimeAttrs);

        List<String> intersection = null;
        intersection = new ArrayList<String>();
        intersection = ListUtils.intersection(pPrimeAttrs, p2Attrs);
        // getting variables from P2
        List<String> p1Attrs = new ArrayList<String>();
        for (Attribute attribute : optionalOperator.getChild(0).getHeading()
                .getAttributes())
        {
            p1Attrs.add(attribute.getName());
        }

        if (p1Attrs.containsAll(pPrimeAttrs))
        {
            return true;
        }
        return false;
    }
}

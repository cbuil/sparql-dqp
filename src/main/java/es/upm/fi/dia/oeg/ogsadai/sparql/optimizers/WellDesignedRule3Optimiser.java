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

import org.apache.log4j.Logger;

import uk.org.ogsadai.dqp.common.CompilerConfiguration;
import uk.org.ogsadai.dqp.common.RequestDetails;
import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.CommonPredicate;
import uk.org.ogsadai.dqp.lqp.Operator;
import uk.org.ogsadai.dqp.lqp.OperatorID;
import uk.org.ogsadai.dqp.lqp.Predicate;
import uk.org.ogsadai.dqp.lqp.exceptions.LQPException;
import uk.org.ogsadai.dqp.lqp.operators.InnerThetaJoinOperator;
import uk.org.ogsadai.dqp.lqp.operators.LeftOuterJoinOperator;
import uk.org.ogsadai.dqp.lqp.optimiser.Optimiser;
import uk.org.ogsadai.expression.ExpressionFactory;
import uk.org.ogsadai.expression.arithmetic.ExpressionException;
import uk.org.ogsadai.parser.SQLParserException;
import uk.org.ogsadai.parser.sql92query.SQLQueryParser;
import uk.org.ogsadai.resource.dataresource.dqp.RequestDQPFederation;

import org.apache.commons.collections.ListUtils;

import es.upm.fi.dia.oeg.ogsadai.sparql.utils.SparqlDQPUtil;

/**
 * This class detects and applies rule 3 of the well designed patterns described
 * by Jorge Perez, Marcelo Arenas and Claudio Gutierrez. Identifies pattern ((P1
 * OPT P2) AND P3) and transforms it in ((P1 AND P2) OPT P3)
 * 
 * @author Carlos Buil Aranda,Oscar Corcho
 * @email cbuil@fi.upm.es, ocorcho@fi.upm.es
 * @institution Universidad Politecnica de Madrid
 * 
 */
public class WellDesignedRule3Optimiser implements Optimiser
{

    /** Copyright notice. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Universidad Politecnica de Madrid, 2010";

    /** Logger. */
    private static final Logger LOG = Logger
            .getLogger(WellDesignedRule3Optimiser.class.getName());

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
                                    .getInstance("INNER_THETA_JOIN"))
                            {
                                LOG.debug("Pattern 3 found...");
                                if (checkSafeCondition(lqpRoot.getParent()
                                        .getParent().getChild(1), lqpRoot
                                        .getParent()))
                                {
                                    LOG.debug("pattern safe: "
                                            + lqpRoot.getID());
                                    // pattern ((P1 OPT P2) AND P3) found
                                    // different order than with left child
                                    // (getChild(0))

                                    // careful with the order of the operators
                                    // in this operation, it might be different
                                    // depending on the right/side of the
                                    // pattern found
                                    Operator optimisedOperator = null;
                                    Operator parent = null;
                                    parent = lqpRoot.getParent();
                                    Operator grandPaPaOperator = parent
                                            .getParent().getParent();
                                    Operator rightOptOperator = lqpRoot
                                            .getParent().getChild(1);
                                    optimisedOperator = reorder(lqpRoot,
                                            rightOptOperator);
                                    grandPaPaOperator.disconnect();
                                    try
                                    {
                                        // grandPaOperator.disconnect();
                                        grandPaPaOperator.setChild(0,
                                                optimisedOperator);
                                        grandPaPaOperator.update();
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
                                    .getInstance("INNER_THETA_JOIN"))
                            {
                                LOG.debug("Pattern 3 found...");
                                if (checkSafeCondition(lqpRoot.getParent()
                                        .getParent().getChild(0), lqpRoot
                                        .getParent()))
                                {
                                    LOG.debug("pattern safe: "
                                            + lqpRoot.getID());
                                    // pattern ((P1 OPT P2) AND P3) found
                                    // different order than with left child
                                    // (getChild(0))

                                    // careful with the order of the operators
                                    // in this operation, it might be different
                                    // depending on the right/side of the
                                    // pattern found
                                    Operator optimisedOperator = null;
                                    Operator parent = null;
                                    parent = lqpRoot.getParent();
                                    Operator grandPaPaOperator = parent
                                            .getParent().getParent();
                                    Operator rightOptOperator = lqpRoot
                                            .getParent().getChild(1);
                                    optimisedOperator = reorder(lqpRoot,
                                            rightOptOperator);
                                    grandPaPaOperator.disconnect();
                                    try
                                    {
                                        // grandPaOperator.disconnect();
                                        grandPaPaOperator.setChild(0,
                                                optimisedOperator);
                                        grandPaPaOperator.update();
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
     * @param ousideOperator
     *            operator P'
     * @param optionalOperator
     *            (P1 OPT P2)
     * 
     * @return true if pattern is safe
     */
    private boolean checkSafeCondition(Operator ousideOperator,
            Operator optionalOperator)
    {
        List<String> pPrimeAttrs = new ArrayList<String>();
        // getting variables from left side of AND (parent operator)
        for (Attribute attribute : ousideOperator.getHeading().getAttributes())
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

        if (p1Attrs.containsAll(intersection))
        {
            return true;
        }
        return false;
    }

    /**
     * This class applies Rule 2 reordering the operators
     * 
     * @param p1Operator
     * @param rightOptOperator
     * @return operator optimised operator
     * 
     */
    private Operator reorder(Operator p1Operator, Operator rightOptOperator)
    {
        // I get (P1 AND (P2 OPT P3)) p1 is the current operator
        List<String> predicateList = new ArrayList<String>();
        List<Attribute> entry = new ArrayList<Attribute>();
        Operator p2Operator = null;
        p2Operator = rightOptOperator;
        Operator p3Operator = null;
        if (!rightOptOperator.getParent().getParent().getChild(0).equals(
                rightOptOperator.getParent()))
        {
            p3Operator = rightOptOperator.getParent().getParent().getChild(0);
        }
        else
        {
            p3Operator = rightOptOperator.getParent().getParent().getChild(1);
        }

        // add all attributes to the AND operator
        entry.addAll(p1Operator.getHeading().getAttributes());
        entry.addAll(p3Operator.getHeading().getAttributes());

        predicateList = SparqlDQPUtil.getPredicate(entry);
        Operator newOptional = null;

        // I just use the first predicate
        Predicate p = null;
        Operator newInnerJoin = null;
        try
        {
            p = new CommonPredicate(ExpressionFactory.buildExpression(
                    SQLQueryParser.getInstance().parseSQLForCondition(
                            predicateList.get(0)), null));
            newInnerJoin = new InnerThetaJoinOperator(p);
            SparqlDQPUtil.connectBinary(newInnerJoin, p1Operator, p3Operator);
            newInnerJoin.update();

            // I create now the OPTIONAL part which will be connected to the
            // previous AND

            entry = new ArrayList<Attribute>();
            entry.addAll(newInnerJoin.getHeading().getAttributes());
            entry.addAll(p2Operator.getHeading().getAttributes());
            // I create new join condition using new AND operator attributes
            // and left child attributes from OPT
            predicateList = SparqlDQPUtil.getPredicate(entry);

            p = new CommonPredicate(ExpressionFactory.buildExpression(
                    SQLQueryParser.getInstance().parseSQLForCondition(
                            predicateList.get(0)), null));
            newOptional = new LeftOuterJoinOperator(p);
            SparqlDQPUtil.connectBinary(newOptional, newInnerJoin, p2Operator);
            newOptional.update();

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
        catch (LQPException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return newOptional;
    }
}

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

import es.upm.fi.dia.oeg.ogsadai.sparql.utils.SparqlDQPUtil;

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
import uk.org.ogsadai.dqp.lqp.operators.ProductOperator;
import uk.org.ogsadai.dqp.lqp.optimiser.Optimiser;
import uk.org.ogsadai.expression.ExpressionFactory;
import uk.org.ogsadai.expression.arithmetic.ExpressionException;
import uk.org.ogsadai.parser.SQLParserException;
import uk.org.ogsadai.parser.sql92query.SQLQueryParser;
import uk.org.ogsadai.resource.dataresource.dqp.RequestDQPFederation;

/**
 * This class detects and applies rule 2 of the well designed patterns described
 * by Jorge Perez, Marcelo Arenas and Claudio Gutierrez (P1 AND (P2 OPT P3))
 * TRANSFORMS IN ((P1 AND P2) OPT P3)
 * 
 * @author Carlos Buil Aranda,Oscar Corcho
 * @email cbuil@fi.upm.es, ocorcho@fi.upm.es
 * @institution Universidad Politecnica de Madrid
 * 
 */
public class WellDesignedRule2Optimiser implements Optimiser
{

    /** Copyright notice. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Universidad Politecnica de Madrid, 2010";

    /** Logger. */
    private static final Logger LOG = Logger
            .getLogger(WellDesignedRule2Optimiser.class.getName());

    public void addProperty(String key, String value)
    {
        // TODO Auto-generated method stub

    }

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
                            .getInstance("INNER_THETA_JOIN"))
                    {
                        if (!lqpRoot.getParent().getChild(0).equals(lqpRoot))
                        {
                            if (lqpRoot.getParent().getChild(0).getID() == OperatorID
                                    .getInstance("LEFT_OUTER_JOIN"))
                            {
                                LOG.debug("Pattern 2 found...");
                                if (checkSafeCondition(lqpRoot, lqpRoot
                                        .getParent().getChild(0)))
                                {
                                    LOG.debug("pattern safe: "
                                            + lqpRoot.getID());
                                    // pattern (P1 AND (P2 OPT P3)) found
                                    // what is there are more patterns without
                                    // PROJECT SERVICESCAN?
                                    Operator optimisedOperator = null;
                                    Operator parent = null;
                                    parent = lqpRoot.getParent();
                                    if (parent.getParent() != null)
                                    {
                                        Operator grandPaOperator = parent
                                                .getParent();
                                        optimisedOperator = reorder(lqpRoot,
                                                parent.getChild(0));
                                        if (grandPaOperator.getChildCount() > 1)
                                        {
                                            Operator tmpOp = null;
                                            if (grandPaOperator.getChild(0)
                                                    .equals(parent))
                                            {
                                                tmpOp = grandPaOperator
                                                        .getChild(1);
                                            }
                                            else
                                            {
                                                tmpOp = grandPaOperator
                                                        .getChild(0);
                                            }
                                            Operator grandPaPa = null;
                                            grandPaPa = grandPaOperator
                                                    .getParent();
                                            grandPaOperator.disconnect();
                                            try
                                            {

                                                List<String> predicateList = new ArrayList<String>();
                                                predicateList = SparqlDQPUtil
                                                        .getCommonPredicates(
                                                                tmpOp.getHeading()
                                                                        .getAttributes(),
                                                                optimisedOperator
                                                                        .getHeading()
                                                                        .getAttributes());

                                                if (predicateList.size() > 0)
                                                {

                                                    Predicate p = new CommonPredicate(
                                                            ExpressionFactory
                                                                    .buildExpression(
                                                                            SQLQueryParser
                                                                                    .getInstance()
                                                                                    .parseSQLForCondition(
                                                                                            predicateList
                                                                                                    .get(0)),
                                                                            null));
                                                    grandPaOperator = new InnerThetaJoinOperator(
                                                            p);
                                                    SparqlDQPUtil
                                                            .connectBinary(
                                                                    grandPaOperator,
                                                                    optimisedOperator,
                                                                    tmpOp);
                                                }
                                                else
                                                {
                                                    grandPaOperator = new ProductOperator(
                                                            tmpOp,
                                                            optimisedOperator);
                                                }
                                                grandPaOperator.update();
                                                // grandPaOperator.disconnect();
                                                grandPaOperator.setChild(0,
                                                        optimisedOperator);
                                                grandPaOperator.setChild(1,
                                                        tmpOp);
                                                grandPaOperator.update();
                                                grandPaPa.setChild(0,
                                                        grandPaOperator);
                                                grandPaPa.update();
                                                // I search again for new
                                                // patterns due
                                                // to the last reordering
                                                traverse(lqpRoot);
                                                LOG.debug("Updated reordering at patttern 2");
                                            }
                                            catch (LQPException e)
                                            {
                                                // TODO Auto-generated catch
                                                // block
                                                e.printStackTrace();
                                            }
                                            catch (ExpressionException e)
                                            {
                                                // TODO Auto-generated catch
                                                // block
                                                e.printStackTrace();
                                            }
                                            catch (SQLParserException e)
                                            {
                                                // TODO Auto-generated catch
                                                // block
                                                e.printStackTrace();
                                            }
                                        }
                                        else
                                        {
                                            grandPaOperator.disconnect();
                                            try
                                            {
                                                // grandPaOperator.disconnect();
                                                grandPaOperator.setChild(0,
                                                        optimisedOperator);
                                                grandPaOperator.update();
                                                LOG.debug("Updated reordering at patttern 2");
                                            }
                                            catch (LQPException e)
                                            {
                                                // TODO Auto-generated catch
                                                // block
                                                e.printStackTrace();
                                            }
                                        }
                                    }
                                    else
                                    {
                                        // I'm in a pattern in which there is no
                                        // grandparent, the parent is a project
                                        // operator
                                        LOG.debug("No grand parent...");
                                    }
                                    // grandPaOperator.disconnect();
                                    // try
                                    // {
                                    // // grandPaOperator.disconnect();
                                    // grandPaOperator.setChild(0,
                                    // optimisedOperator);
                                    // grandPaOperator.update();
                                    // }
                                    // catch (LQPException e)
                                    // {
                                    // // TODO Auto-generated catch block
                                    // e.printStackTrace();
                                    // }
                                }
                                else
                                {
                                    LOG.debug("pattern not safe: "
                                            + lqpRoot.getID());
                                }
                            }
                        }
                        else if (!lqpRoot.getParent().getChild(1)
                                .equals(lqpRoot))
                        {
                            if (lqpRoot.getParent().getChild(1).getID() == OperatorID
                                    .getInstance("LEFT_OUTER_JOIN"))
                            {
                                LOG.debug("Pattern found...");
                                if (checkSafeCondition(lqpRoot, lqpRoot
                                        .getParent().getChild(1)))
                                {
                                    LOG.debug("pattern safe: "
                                            + lqpRoot.getID());
                                    // pattern (P1 AND (P2 OPT P3)) found
                                    // different order than with left child
                                    // (getChild(0))

                                    // careful wit6h the order of the operators
                                    // in this operation, it might be different
                                    // depending on the right/side of the
                                    // pattern found
                                    // Operator optimisedOperator = null;
                                    // Operator parent = null;
                                    // parent = lqpRoot.getParent();
                                    // Operator grandPaOperator = parent
                                    // .getParent();
                                    // optimisedOperator = reorder(lqpRoot,
                                    // parent
                                    // .getChild(1));
                                    // grandPaOperator.disconnect();
                                    // try
                                    // {
                                    // // grandPaOperator.disconnect();
                                    // grandPaOperator.setChild(0,
                                    // optimisedOperator);
                                    // grandPaOperator.update();
                                    // // I search again for new patterns due
                                    // // to the last reordering
                                    // traverse(lqpRoot);
                                    // }
                                    // catch (LQPException e)
                                    // {
                                    // // TODO Auto-generated catch block
                                    // e.printStackTrace();
                                    // }
                                    LOG.debug("pattern safe: "
                                            + lqpRoot.getID());
                                    // pattern (P1 AND (P2 OPT P3)) found
                                    // what is there are more patterns without
                                    // PROJECT SERVICESCAN?
                                    Operator optimisedOperator = null;
                                    Operator parent = null;
                                    parent = lqpRoot.getParent();
                                    if (parent.getParent() != null)
                                    {
                                        Operator grandPaOperator = parent
                                                .getParent();
                                        optimisedOperator = reorder(lqpRoot,
                                                parent.getChild(1));
                                        if (grandPaOperator.getChildCount() > 1)
                                        {
                                            Operator tmpOp = null;
                                            if (grandPaOperator.getChild(0)
                                                    .equals(parent))
                                            {
                                                tmpOp = grandPaOperator
                                                        .getChild(1);
                                            }
                                            else
                                            {
                                                tmpOp = grandPaOperator
                                                        .getChild(0);
                                            }
                                            Operator grandPaPa = null;
                                            grandPaPa = grandPaOperator
                                                    .getParent();
                                            grandPaOperator.disconnect();
                                            try
                                            {

                                                List<String> predicateList = new ArrayList<String>();
                                                predicateList = SparqlDQPUtil
                                                        .getCommonPredicates(
                                                                tmpOp.getHeading()
                                                                        .getAttributes(),
                                                                optimisedOperator
                                                                        .getHeading()
                                                                        .getAttributes());

                                                if (predicateList.size() > 0)
                                                {

                                                    Predicate p = new CommonPredicate(
                                                            ExpressionFactory
                                                                    .buildExpression(
                                                                            SQLQueryParser
                                                                                    .getInstance()
                                                                                    .parseSQLForCondition(
                                                                                            predicateList
                                                                                                    .get(0)),
                                                                            null));
                                                    grandPaOperator = new InnerThetaJoinOperator(
                                                            p);
                                                    SparqlDQPUtil
                                                            .connectBinary(
                                                                    grandPaOperator,
                                                                    optimisedOperator,
                                                                    tmpOp);
                                                }
                                                else
                                                {
                                                    grandPaOperator = new ProductOperator(
                                                            tmpOp,
                                                            optimisedOperator);
                                                }
                                                grandPaOperator.update();
                                                // grandPaOperator.disconnect();
                                                grandPaOperator.setChild(0,
                                                        optimisedOperator);
                                                grandPaOperator.setChild(1,
                                                        tmpOp);
                                                grandPaOperator.update();
                                                grandPaPa.setChild(0,
                                                        grandPaOperator);
                                                grandPaPa.update();
                                                // I search again for new
                                                // patterns due
                                                // to the last reordering
                                                traverse(lqpRoot);
                                                LOG.debug("Updated reordering at patttern 2");
                                            }
                                            catch (LQPException e)
                                            {
                                                // TODO Auto-generated catch
                                                // block
                                                e.printStackTrace();
                                            }
                                            catch (ExpressionException e)
                                            {
                                                // TODO Auto-generated catch
                                                // block
                                                e.printStackTrace();
                                            }
                                            catch (SQLParserException e)
                                            {
                                                // TODO Auto-generated catch
                                                // block
                                                e.printStackTrace();
                                            }
                                        }
                                        else
                                        {
                                            Operator ggP = null;
                                            if (grandPaOperator.getParent() != null)
                                            {
                                                ggP = grandPaOperator
                                                        .getParent();
                                            }
                                            grandPaOperator.disconnect();
                                            try
                                            {
                                                // grandPaOperator.disconnect();
                                                grandPaOperator.setChild(0,
                                                        optimisedOperator);
                                                grandPaOperator.update();
                                                if (ggP != null)
                                                {
                                                    grandPaOperator
                                                            .setParent(ggP);
                                                }
                                                LOG.debug("Updated reordering at patttern 2");
                                            }
                                            catch (LQPException e)
                                            {
                                                // TODO Auto-generated catch
                                                // block
                                                e.printStackTrace();
                                            }
                                        }
                                    }
                                    else
                                    {
                                        // I'm in a pattern in which there is no
                                        // grandparent, the parent is a project
                                        // operator
                                        LOG.debug("No grand parent...");
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
     * Given a binary search tree, print out its data elements in increasing
     * sorted order.
     */
    // void printTree(struct node* node) {
    // if (node == NULL) return;
    //
    // printTree(node->left);
    // printf("%d ", node->data);
    // printTree(node->right);
    // }
    //
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
     * @param optionalOperator
     * @return operator optimised
     * 
     */
    private Operator reorder(Operator p1Operator, Operator optionalOperator)
    {
        // I get (P1 AND (P2 OPT P3)) p1 is the current operator
        List<String> predicateList = new ArrayList<String>();
        // List<Attribute> entry = new ArrayList<Attribute>();
        Operator p2Operator = optionalOperator.getChild(0);
        Operator p3Operator = optionalOperator.getChild(1);

        // add all attributes to the AND operator
        // entry.addAll(p1Operator.getHeading().getAttributes());
        // entry.addAll(p2Operator.getHeading().getAttributes());

        predicateList = SparqlDQPUtil.getCommonPredicates(p1Operator
                .getHeading().getAttributes(), p2Operator.getHeading()
                .getAttributes());
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
            SparqlDQPUtil.connectBinary(newInnerJoin, p1Operator, p2Operator);
            newInnerJoin.update();

            // I create now the OPTIONAL part which will be connected to the
            // previous AND

            // entry = new ArrayList<Attribute>();
            // entry.addAll(newInnerJoin.getHeading().getAttributes());
            // entry.addAll(p3Operator.getHeading().getAttributes());
            // I create new join condition using new AND operator attributes
            // and left child attributes from OPT
            // predicateList = utils.getPredicate(entry);
            predicateList = SparqlDQPUtil.getCommonPredicates(newInnerJoin
                    .getHeading().getAttributes(), p3Operator.getHeading()
                    .getAttributes());

            p = new CommonPredicate(ExpressionFactory.buildExpression(
                    SQLQueryParser.getInstance().parseSQLForCondition(
                            predicateList.get(0)), null));
            newOptional = new LeftOuterJoinOperator(p);
            SparqlDQPUtil.connectBinary(newOptional, newInnerJoin, p3Operator);
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

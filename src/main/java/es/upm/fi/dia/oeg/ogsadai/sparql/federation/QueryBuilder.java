//Copyright (c) Universidad Politecnica de Madrid, 2009-2012.
//
//LICENCE-START
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//
//http://www.apache.org/licenses/LICENSE-2.0
//
//Unless required by applicable law or agreed to in writing, software 
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.
//LICENCE-END

package es.upm.fi.dia.oeg.ogsadai.sparql.federation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.CommonTree;

import uk.org.ogsadai.common.msgs.DAILogger;
import uk.org.ogsadai.context.OGSADAIContext;
import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.Operator;
import uk.org.ogsadai.dqp.lqp.exceptions.LQPException;
import uk.org.ogsadai.dqp.lqp.operators.DuplicateEliminationOperator;
import uk.org.ogsadai.dqp.lqp.operators.LimitOperator;
import uk.org.ogsadai.dqp.lqp.operators.NilOperator;
import uk.org.ogsadai.dqp.lqp.operators.ProjectOperator;
import uk.org.ogsadai.dqp.lqp.optimiser.QueryNormaliser;
import uk.org.ogsadai.dqp.lqp.udf.repository.NoSuchFunctionException;
import uk.org.ogsadai.expression.arithmetic.ExpressionException;
import uk.org.ogsadai.parser.SQLParserException;
import uk.org.ogsadai.tuple.converters.StringConversionException;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.ASTConstants;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.ASTUtil;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.SPARQLParserException;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.antlr.SparqlParser;
import es.upm.fi.dia.oeg.ogsadai.sparql.processor.GroupProcessor;
import es.upm.fi.dia.oeg.ogsadai.sparql.query.Dataset;
import es.upm.fi.dia.oeg.ogsadai.sparql.query.Prefix;
import es.upm.fi.dia.oeg.ogsadai.sparql.query.QueryType;
import es.upm.fi.dia.oeg.ogsadai.sparql.query.SparqlQueryFactory;
import es.upm.fi.dia.oeg.ogsadai.sparql.query.SparqlSelectQuery;
import es.upm.fi.dia.oeg.ogsadai.sparql.utils.SparqlDQPUtil;

/**
 * Builds a SPARQL Fed query plan
 * 
 * @author Carlos Buil-Aranda, Oscar Corcho
 * @email cbuil@fi.upm.es, ocorcho@fi.upm.es
 * @institution Universidad Politecnica de Madrid
 * 
 */
public class QueryBuilder
{
    private QueryExecutionContext mQueryExecutionContext;

    // /** The operator builder */
    // private OperatorBuilder mOperatorBuilder;
    /** Logger. */
    private static final DAILogger LOG = DAILogger
            .getLogger(QueryBuilder.class);

    /**
     * Constructor.
     * 
     * @param QueryExecutionContext
     *            query execution contexts, contains data dictionary and query
     *            AST
     */
    public QueryBuilder(QueryExecutionContext context)
    {
        mQueryExecutionContext = context;
    }

    /**
     * Builds a query plan for a query.
     * 
     * @param queryContext
     *            abstract syntax tree
     * @return root operator of the query plan
     * @throws LQPException
     *             if an error occurred
     */
    public Operator buildLQP() throws LQPException
    {
        Operator nilOperator = new NilOperator();
        Operator statementRoot = null;
        try
        {
            statementRoot = buildStatement(mQueryExecutionContext.getAst());
        }
        catch (ExpressionException e)
        {
            throw new LQPException(e);
        }
        catch (SQLParserException e)
        {
            e.printStackTrace();
        }
        catch (NoSuchFunctionException e)
        {
            e.printStackTrace();
        }
        catch (StringConversionException e)
        {
            e.printStackTrace();
        }
        catch (MalformedQueryException e)
        {
            e.printStackTrace();
        }
        catch (SPARQLParserException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Check if we have ORDER_BY
        // if (mQueryExecutionContext.getAst().getChildCount() > 1)
        // {
        // Operator sortOperator = new SortOperator(statementRoot,
        // (CommonTree) mQueryExecutionContext.getAst().getChild(1));
        // nilOperator.setChild(0, sortOperator);
        // }
        // else
        // {
        // nilOperator.setChild(0, statementRoot);
        // }
        nilOperator.setChild(0, statementRoot);

        // We need to validate pre-normalised LQP as the query normaliser
        // expects that we have already detected all the correlated attributes
        nilOperator.validate();

        // Query normaliser will turn
        Operator root = null;
        QueryNormaliser qn = new QueryNormaliser();
        root = qn.optimise(nilOperator, null, null, null);
        return root;
    }

    /**
     * Builds tree from statement AST.
     * 
     * @param statementAST
     * @return tree root operator
     * @throws LQPException
     * @throws ExpressionException
     * @throws SQLParserException
     * @throws NoSuchFunctionException
     * @throws StringConversionException
     * @throws MalformedQueryException
     * @throws SPARQLParserException
     */
    private Operator buildStatement(CommonTree statementAST)
            throws LQPException, ExpressionException, SQLParserException,
            NoSuchFunctionException, StringConversionException,
            MalformedQueryException, SPARQLParserException
    {
        String astText = statementAST.getText();
        Operator statementRoot = null;

        if (astText.equals(ASTConstants.QUERY))
        {
            Map<String, CommonTree> queryStructure;
            queryStructure = ASTUtil.getQueryStructure(statementAST);

            List<Prefix> prefixList = SparqlDQPUtil.getPrefixes(queryStructure
                    .get(ASTConstants.PROLOGUE));

            if (queryStructure.get(ASTConstants.SELECT_QUERY) != null)
            {
                SparqlSelectQuery sparqlQuery = (SparqlSelectQuery) SparqlQueryFactory
                        .createSparqlQuery(QueryType.SELECT_QUERY);

                // Process PREFIX
                sparqlQuery.setPrefixes(prefixList);
                sparqlQuery.setDataDictionary(mQueryExecutionContext
                        .getQueryDictionary());
                if (queryStructure.get(ASTConstants.FROM_LIST_TOKEN) == null)
                {
                    // empty list of datasets if there is no dataset specified
                    // in the FROM list
                    sparqlQuery.setDatasets(new ArrayList<Dataset>());
                }
                else
                {
                    sparqlQuery.setDatasets(SparqlDQPUtil
                            .getDataSources(queryStructure
                                    .get(ASTConstants.FROM_LIST_TOKEN)));
                }
                sparqlQuery.setQueryStructure(ASTUtil
                        .getQueryStructure(queryStructure
                                .get(ASTConstants.SELECT_QUERY)));
                sparqlQuery.setDefaultDataset((String) OGSADAIContext
                        .getInstance().get("defaultDataset"));
                Operator selectQueryOperator = buildSelectQuery(sparqlQuery);

                if (!sparqlQuery.getQuerySelectVariables().get(0).getName()
                        .equals("*"))
                {
                    statementRoot = new ProjectOperator(selectQueryOperator,
                            getSelectVariables(selectQueryOperator,
                                    sparqlQuery.getQuerySelectVariables()));
                    statementRoot.update();
                }
                else
                {
                    statementRoot = selectQueryOperator;
                }

                // sparqlQuery.setQueryAst(queryStructure
                // .get(ASTConstants.SELECT_QUERY));
            }
            else if (queryStructure.get(ASTConstants.CONSTRUCT_QUERY) != null)
            {
                // TODO work in construct queries
            }
            else if (queryStructure.get(ASTConstants.ASK_QUERY) != null)
            {
                // TODO work in ASK queries
            }
            else if (queryStructure.get(ASTConstants.DESCRIBE_QUERY) != null)
            {
                // TODO work in DESCRIBE queries
            }

            // Split the tree into branches
            /*
             * what this is doing is getting from the generated AST a new tree
             * for select, one for from and another for prefix (I added that).
             * The tokens identify the part of the tree to build. The tokens are
             * specified in the grammar.
             */

        }
        else
        {
            throw new LQPException("Queries with " + astText
                    + " are not yet supported");
        }
        return statementRoot;
    }

    /**
     * Builds a select list - product of all relations. I process all elements
     * in a SELECT clause
     * 
     * @param ast
     * @param prefixMap
     * @param dataSourcesMap
     * @return a select operator
     * @throws LQPException
     * @throws ExpressionException
     * @throws SQLParserException
     * @throws NoSuchFunctionException
     * @throws StringConversionException
     * @throws MalformedQueryException
     * @throws SPARQLParserException
     */
    private Operator buildSelectQuery(SparqlSelectQuery sparqlSelectQuery)
            throws LQPException, ExpressionException, SQLParserException,
            NoSuchFunctionException, StringConversionException,
            MalformedQueryException, SPARQLParserException
    {
        Operator currentRoot = null;

        sparqlSelectQuery.setQuerySelectVariables(SparqlDQPUtil
                .buildSelectVariables(sparqlSelectQuery.getQueryStructure()
                        .get(ASTConstants.SELECT_LIST)));
        currentRoot = GroupProcessor.processGroupGraphPattern(
                sparqlSelectQuery,
                sparqlSelectQuery.getQueryStructure().get(
                        ASTConstants.WHERE_TOKEN));
        if (sparqlSelectQuery.getQueryStructure().get(
                ASTConstants.SOLUTION_MODIFIER) != null)
        {
            buildSolutionModifier(sparqlSelectQuery.getQueryStructure().get(
                    ASTConstants.SOLUTION_MODIFIER));
        }

        // Project variables in select clause
        if (!sparqlSelectQuery.getQuerySelectVariables().get(0).getName()
                .equals("*"))
        {
            List<Attribute> varList;
            varList = getSelectVariables(currentRoot,
                    sparqlSelectQuery.getQuerySelectVariables());
            if (varList.isEmpty())
            {
                throw new LQPException(
                        "No variables to be selected in the SPARQL query.");
                // RDFEmptySetOperator emptyOp = new RDFEmptySetOperator();
                // emptyOp.setDataDictionary(sparqlSelectQuery.getDataDictionary());
                //
                // LOG.debug("Default dataset table: " + "defaultDataset");
                // DataNode dn = sparqlSelectQuery.getDataDictionary()
                // .getTableSchema("defaultDataset" + "_someTableName")
                // .getDataNodeTables().get(0).getDataNode(); // get from
                // // "DataDictionary"
                // Annotation.addDataNodeAnnotation(emptyOp, dn);
                //
                // emptyOp.update();
                //
                // List<Attribute> attrbs = new ArrayList<Attribute>();
                // Attribute attr = new AttributeImpl("dummy",
                // TupleTypes._STRING,
                // "defaultDataset");
                // attr.addAnnotation("resourceId",
                // dn.getResourceID().toString());
                // // new way of getting the evaluation node, first using the
                // // alias
                // // I get the evaluation node, second, once I have the
                // // evaluation
                // // node, using the resourceID I build where it is going to
                // // be
                // // evaluated
                // attrbs.add(attr);
                // ProjectOperator project = new ProjectOperator(emptyOp,
                // attrbs);
                // project.addAnnotation("originalSource", "defaultDataset");
                // project.addAnnotation("safe", "");
                // project.update();
                //
                // currentRoot = project;
            }
            else
            {
                Operator projectVariables = new ProjectOperator(currentRoot,
                        varList);
                projectVariables.update();

                currentRoot = projectVariables;
            }
        }

        // Deal with DISTINCT
        if (sparqlSelectQuery.getQueryStructure().get(ASTConstants.SELECT_LIST)
                .getChild(0).getType() == SparqlParser.DISTINCT)
        {
            Operator duplElimOperator = new DuplicateEliminationOperator(
                    currentRoot);

            duplElimOperator.update();
            currentRoot = duplElimOperator;
        }

        currentRoot.validate();

        return currentRoot;
    }

    /**
     * builds the solution modifiers for the SPARQL query
     * 
     * @param child
     * @return root operator with the solution modifiers attached
     */
    private Operator buildSolutionModifier(CommonTree child)
    {
        String limitExpression = "";
        LimitOperator limit = new LimitOperator(limitExpression);

        return limit;
    }

    private List<Attribute> getSelectVariables(Operator selectQueryOperator,
            List<Attribute> querySelectVariables)
    {
        List<Attribute> selectVars = null;
        List<String> namesAdded = null;
        namesAdded = new ArrayList<String>();
        selectVars = new ArrayList<Attribute>();

        for (Attribute attribute : querySelectVariables)
        {
            for (Attribute attribute2 : selectQueryOperator.getHeading()
                    .getAttributes())
            {
                if (attribute.getName().equals(attribute2.getName())
                        & !selectVars.contains(attribute2)
                        & !namesAdded.contains(attribute2.getName()))
                {
                    selectVars.add(attribute2);
                    namesAdded.add(attribute2.getName());
                }
            }

        }
        return selectVars;
    }
}

package es.upm.fi.dia.oeg.ogsadai.sparql.federation;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;

import es.upm.fi.dia.oeg.ogsadai.sparql.parser.SPARQLParserException;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.SimpleSparqlQueryParser;

import uk.org.ogsadai.activity.ActivityUserException;
import uk.org.ogsadai.common.msgs.DAILogger;
import uk.org.ogsadai.context.OGSADAIContext;
import uk.org.ogsadai.dqp.common.DataDictionary;
import uk.org.ogsadai.dqp.common.RequestDetails;
import uk.org.ogsadai.dqp.execute.QueryPlanBuilder;
import uk.org.ogsadai.dqp.execute.SQLQueryPlanBuilder;
import uk.org.ogsadai.dqp.lqp.Operator;
import uk.org.ogsadai.dqp.lqp.exceptions.LQPException;
import uk.org.ogsadai.dqp.lqp.udf.FunctionRepository;
import uk.org.ogsadai.resource.dataresource.dqp.DQPFederation;
import uk.org.ogsadai.resource.dataresource.dqp.DQPResourceAccessor;

public class SPARQLQueryPlanBuilder implements QueryPlanBuilder
{
    /** Copyright notice. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) The University of Edinburgh, 2009, Universidad Politecnica de Madrid, 2010";

    /** Logger. */
    private static final DAILogger LOG = DAILogger
            .getLogger(SQLQueryPlanBuilder.class);

    /**
     * {@inheritDoc}
     */
    public Operator buildQueryPlan(String query,
            DQPResourceAccessor dqpResourceAccessor,
            RequestDetails requestDetails) throws ActivityUserException
    {
        // get function repository from the context
        FunctionRepository functionRepository = (FunctionRepository) OGSADAIContext
                .getInstance().get(FunctionRepository.FUNCTION_REPOSITORY_KEY);

        CommonTree ast = parseSPARQL(query);
        if (LOG.isDebugEnabled())
        {
            LOG.debug("Parsed query");
            LOG.debug((new DOTTreeGenerator()).toDOT(ast).toString());
        }
        return buildValidatedLQP(ast, dqpResourceAccessor, requestDetails,
                functionRepository);
    }

    /**
     * Parses an SPARQL query and returns the abstract syntax tree.
     * 
     * @param sparql
     *            SPARQL expression
     * @return abstract syntax tree
     * @throws ActivityUserException
     *             if parsing failed
     * @throws SPARQLParserException
     */
    private CommonTree parseSPARQL(String sparql) throws ActivityUserException
    {
        try
        {
            return SimpleSparqlQueryParser.getInstance().parseSparqlQuery(
                    sparql);
        }
        catch (SPARQLParserException e)
        {
            throw new ActivityUserException(e);
        }
    }

    /**
     * Builds and validates a logical query plan from a given abstract syntax
     * tree.
     * 
     * @param ast
     *            abstract syntax tree
     * @param dqpResourceAccessor
     *            DQP resource accessor giving access to the resource's
     *            configuration.
     * @param requestDetails
     *            details of the user's request
     * @param functionRepository
     *            function repository or <tt>null</tt> if functions are not
     *            supported.
     * 
     * @return validated logical query plan
     * @throws ActivityUserException
     */
    private Operator buildValidatedLQP(CommonTree ast,
            DQPResourceAccessor dqpResourceAccessor,
            RequestDetails requestDetails, FunctionRepository functionRepository)
            throws ActivityUserException
    {
        try
        {
            SimpleRDFDataDictionary dict = new SimpleRDFDataDictionary();
            dict = (SimpleRDFDataDictionary) ((DQPFederation) dqpResourceAccessor
                    .getFederation()).getDataDictionary(requestDetails);
            QueryExecutionContext queryExecutionContext;
            queryExecutionContext = new QueryExecutionContext(dict, ast,
                    dqpResourceAccessor.getFederation().getEvaluationNodes());
            QueryBuilder builder = QueryBuilderFactory
                    .create(queryExecutionContext);
            Operator root = builder.buildLQP();
            root.validate();
            return root;
        }
        catch (LQPException e)
        {
            throw new ActivityUserException(e);
        }
    }
}

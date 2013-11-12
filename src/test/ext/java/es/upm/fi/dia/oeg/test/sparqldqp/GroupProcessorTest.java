package es.upm.fi.dia.oeg.test.sparqldqp;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.antlr.runtime.tree.CommonTree;

import uk.org.ogsadai.context.OGSADAIContext;
import uk.org.ogsadai.converters.databaseschema.TableMetaDataImpl;
import uk.org.ogsadai.dqp.common.DataDictionary;
import uk.org.ogsadai.dqp.common.simple.SimpleDataDictionary;
import uk.org.ogsadai.dqp.common.simple.SimplePhysicalSchema;
import uk.org.ogsadai.dqp.common.simple.SimpleTableSchema;
import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.Operator;
import uk.org.ogsadai.dqp.lqp.OperatorID;
import uk.org.ogsadai.dqp.lqp.exceptions.LQPException;
import uk.org.ogsadai.dqp.lqp.udf.FunctionRepository;
import uk.org.ogsadai.dqp.presentation.common.SimpleDataNode;
import uk.org.ogsadai.dqp.test.TestPropertiesProvider;
import uk.org.ogsadai.expression.arithmetic.ExpressionException;
import uk.org.ogsadai.resource.dataresource.dqp.DQPContext;
import uk.org.ogsadai.resource.dataresource.dqp.DQPFederation;
import uk.org.ogsadai.resource.dataresource.dqp.FunctionRepositoryConfig;
import es.upm.fi.dia.oeg.ogsadai.sparql.federation.SimpleRDFDataDictionary;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.ASTConstants;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.ASTUtil;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.SPARQLParserException;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.SimpleSparqlQueryParser;
import es.upm.fi.dia.oeg.ogsadai.sparql.processor.GroupProcessor;
import es.upm.fi.dia.oeg.ogsadai.sparql.query.Prefix;
import es.upm.fi.dia.oeg.ogsadai.sparql.query.SparqlSelectQuery;
import es.upm.fi.dia.oeg.ogsadai.sparql.utils.SparqlDQPUtil;

public class GroupProcessorTest extends TestCase
{
    /** Copyright statement. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Universidad Politecnica de Madrid, 2009-2010.";

    private SimpleSparqlQueryParser mParser;

    private Map<String, String> mTestQueries;

    private DataDictionary mDataDictionary;

    private String mPath = "/media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/";

    /**
     * Runs the test cases.
     * 
     * @param args
     *            Not used
     */
    public static void main(String[] args)
    {
        junit.textui.TestRunner.run(GroupProcessorTest.class);
    }

    /**
     * Constructor.
     * 
     * @param name
     *            Test case name.
     * @throws Exception
     *             If any problems arise in reading the test properties.
     */
    public GroupProcessorTest(String name) throws Exception
    {
        super(name);
    }

    public void setUp() throws Exception
    {
        super.setUp();
        mPath = TestPropertiesProvider.getProperty("lqp.output.path");
        mParser = SimpleSparqlQueryParser.getInstance();
        mTestQueries = new HashMap<>();
        mTestQueries
                .put("testProcessWhereGroups",
                        "PREFIX :  <http://example.org/ns#> "
                                + "PREFIX a: <http://example.org/ns2#> "
                                + "SELECT * WHERE { ?a :j :k {?a :b ?c} { ?a ?f ?g  OPTIONAL {?a :c :d} }"
                                + "  OPTIONAL {SERVICE <http://test.org/sparql> {?s ?p ?a}}}");
        mTestQueries.put("testProcessWhereUNION",
                "PREFIX :  <http://example.org/ns#> "
                        + "PREFIX a: <http://example.org/ns2#> "
                        + "SELECT * WHERE { {:a :b ?c} UNION {?s ?p ?o}}");
        mTestQueries.put("testProcessWhereOptional",
                "PREFIX :  <http://example.org/ns#> "
                        + "PREFIX a: <http://example.org/ns2#> "
                        + "SELECT * WHERE { ?a :b ?c OPTIONAL {?a :b :c}}");
        mTestQueries.put("testProcessWhereAnd",
                "PREFIX :  <http://example.org/ns#> "
                        + "PREFIX a: <http://example.org/ns2#> "
                        + "SELECT * WHERE { ?a :b ?c . ?a ?f ?g  }");
        mTestQueries.put("testProcessWhereServiceAnd",
                "PREFIX :  <http://example.org/ns#> "
                        + "PREFIX a: <http://example.org/ns2#> "
                        + "SELECT * WHERE { ?a :b ?c . ?a ?f ?g  "
                        + "  SERVICE <http://test.org/sparql> {?a ?p ?o} }");
        mTestQueries.put("testProcessWhereFilter",
                "PREFIX :  <http://example.org/ns#> "
                        + "PREFIX a: <http://example.org/ns2#> "
                        + "SELECT * WHERE { ?a :b ?c . ?a ?f ?g  "
                        + "  FILTER regex(?a, \"test\")}");
        mTestQueries.put("testProcessWhereFilter2",
                "PREFIX :  <http://example.org/ns#> "
                        + "PREFIX a: <http://example.org/ns2#> "
                        + "SELECT * WHERE { ?a :b ?c . ?a ?f ?g  "
                        + "  FILTER (?a = 0)}");
        mTestQueries.put("testGetPredicateFromBGP", " a:a :b :c .?d :e :f");

        File xml = TestHelper.getFileFromFileName("DQPContext.xml");
        DQPContext context = new DQPContext("file://" + xml.getAbsolutePath());
        DQPFederation federation = context.getDQPFederation();
        mDataDictionary = new SimpleRDFDataDictionary();
        ((SimpleRDFDataDictionary) mDataDictionary)
                .addEvaluationNodes(federation.getEvaluationNodes());

        TableMetaDataImpl tableMetaData = new TableMetaDataImpl("cat",
                "schema", "someTableName");
        SimplePhysicalSchema physicalSchema = new SimplePhysicalSchema(
                "someTableName", "defaultDataset", -1, -1, -1);

        SimpleDataNode dataNode = new SimpleDataNode("resourceID", "default",
                null);

        SimpleTableSchema dataSchema = new SimpleTableSchema("cat", dataNode,
                tableMetaData, physicalSchema);
        ((SimpleDataDictionary) mDataDictionary).add(dataSchema);

        FunctionRepository functionRepository = FunctionRepositoryConfig
                .createFunctionRepository(TestPropertiesProvider
                        .getFunctionsConfigPath());
        OGSADAIContext.getInstance().put(
                FunctionRepository.FUNCTION_REPOSITORY_KEY, functionRepository);
        OGSADAIContext.getInstance().put("defaultDataset",
                "default");
    }

    public void testProcessGroupGraphPatternAnd()
    {
        String query = mTestQueries.get("testProcessWhereAnd");

        System.out.println(query);
        CommonTree abstractSyntaxTree;

        try
        {
            Map<String, CommonTree> queryStructure;
            abstractSyntaxTree = mParser.parseSparqlQuery(query);
            queryStructure = ASTUtil.getQueryStructure(abstractSyntaxTree);

            SparqlSelectQuery sparqlSelectQuery = new SparqlSelectQuery();
            sparqlSelectQuery.setDataDictionary(mDataDictionary);
            sparqlSelectQuery.setDefaultDataset((String) OGSADAIContext
                    .getInstance().get("defaultDataset"));

            List<Prefix> prefixList = SparqlDQPUtil.getPrefixes(queryStructure
                    .get(ASTConstants.PROLOGUE));
            sparqlSelectQuery.setPrefixes(prefixList);

            Map<String, CommonTree> selectQueryStructure = ASTUtil
                    .getQueryStructure(queryStructure
                            .get(ASTConstants.SELECT_QUERY));
            List<Attribute> querySelectVariables;
            querySelectVariables = SparqlDQPUtil
                    .buildSelectVariables(selectQueryStructure
                            .get(ASTConstants.SELECT_LIST));
            sparqlSelectQuery.setQuerySelectVariables(querySelectVariables);
            sparqlSelectQuery.setQueryStructure(selectQueryStructure);
            Operator lqpRoot = GroupProcessor.processGroupGraphPattern(
                    sparqlSelectQuery, sparqlSelectQuery.getQueryStructure()
                            .get(ASTConstants.WHERE_TOKEN));
            assertTrue(lqpRoot.getID() == OperatorID.INNER_THETA_JOIN);
            TestHelper
                    .writeFile(lqpRoot, OperatorID.INNER_THETA_JOIN.toString(),
                            query, mPath, "dot");
        }
        catch (SPARQLParserException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (LQPException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (ExpressionException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void testProcessGroupGraphPatternOptional() throws Exception
    {
        String query = mTestQueries.get("testProcessWhereOptional");

        CommonTree abstractSyntaxTree;

        try
        {
            Map<String, CommonTree> queryStructure;
            abstractSyntaxTree = mParser.parseSparqlQuery(query);
            queryStructure = ASTUtil.getQueryStructure(abstractSyntaxTree);

            SparqlSelectQuery sparqlSelectQuery = new SparqlSelectQuery();
            sparqlSelectQuery.setDataDictionary(mDataDictionary);
            sparqlSelectQuery.setDefaultDataset((String) OGSADAIContext
                    .getInstance().get("defaultDataset"));

            List<Prefix> prefixList = SparqlDQPUtil.getPrefixes(queryStructure
                    .get(ASTConstants.PROLOGUE));
            sparqlSelectQuery.setPrefixes(prefixList);

            Map<String, CommonTree> selectQueryStructure = ASTUtil
                    .getQueryStructure(queryStructure
                            .get(ASTConstants.SELECT_QUERY));
            List<Attribute> querySelectVariables;
            querySelectVariables = SparqlDQPUtil
                    .buildSelectVariables(selectQueryStructure
                            .get(ASTConstants.SELECT_LIST));
            sparqlSelectQuery.setQuerySelectVariables(querySelectVariables);
            sparqlSelectQuery.setQueryStructure(selectQueryStructure);
            Operator lqpRoot = GroupProcessor.processGroupGraphPattern(
                    sparqlSelectQuery, sparqlSelectQuery.getQueryStructure()
                            .get(ASTConstants.WHERE_TOKEN));
            assertTrue(lqpRoot.getID() == OperatorID.LEFT_OUTER_JOIN);
            TestHelper.writeFile(lqpRoot,
                    OperatorID.LEFT_OUTER_JOIN.toString(), query, mPath, "dot");
        }
        catch (SPARQLParserException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (LQPException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (ExpressionException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void testProcessGroupGraphPatternServiceAnd() throws Exception
    {
        String query = mTestQueries.get("testProcessWhereServiceAnd");

        CommonTree abstractSyntaxTree;

        try
        {
            Map<String, CommonTree> queryStructure;
            abstractSyntaxTree = mParser.parseSparqlQuery(query);
            queryStructure = ASTUtil.getQueryStructure(abstractSyntaxTree);

            SparqlSelectQuery sparqlSelectQuery = new SparqlSelectQuery();
            sparqlSelectQuery.setDataDictionary(mDataDictionary);
            sparqlSelectQuery.setDefaultDataset((String) OGSADAIContext
                    .getInstance().get("defaultDataset"));

            List<Prefix> prefixList = SparqlDQPUtil.getPrefixes(queryStructure
                    .get(ASTConstants.PROLOGUE));
            sparqlSelectQuery.setPrefixes(prefixList);

            Map<String, CommonTree> selectQueryStructure = ASTUtil
                    .getQueryStructure(queryStructure
                            .get(ASTConstants.SELECT_QUERY));
            List<Attribute> querySelectVariables;
            querySelectVariables = SparqlDQPUtil
                    .buildSelectVariables(selectQueryStructure
                            .get(ASTConstants.SELECT_LIST));
            sparqlSelectQuery.setQuerySelectVariables(querySelectVariables);
            sparqlSelectQuery.setQueryStructure(selectQueryStructure);
            Operator lqpRoot = GroupProcessor.processGroupGraphPattern(
                    sparqlSelectQuery, sparqlSelectQuery.getQueryStructure()
                            .get(ASTConstants.WHERE_TOKEN));
            assertTrue(lqpRoot.getID() == OperatorID.INNER_THETA_JOIN);
            TestHelper.writeFile(lqpRoot,
                    OperatorID.INNER_THETA_JOIN.toString() + "_SERVICE", query,
                    mPath, "dot");
        }
        catch (SPARQLParserException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (LQPException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (ExpressionException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void testProcessGroupGraphPatternGroups()
    {
        String query = mTestQueries.get("testProcessWhereGroups");

        CommonTree abstractSyntaxTree;

        try
        {
            Map<String, CommonTree> queryStructure;
            abstractSyntaxTree = mParser.parseSparqlQuery(query);
            queryStructure = ASTUtil.getQueryStructure(abstractSyntaxTree);

            SparqlSelectQuery sparqlSelectQuery = new SparqlSelectQuery();
            sparqlSelectQuery.setDataDictionary(mDataDictionary);
            sparqlSelectQuery.setDefaultDataset((String) OGSADAIContext
                    .getInstance().get("defaultDataset"));

            List<Prefix> prefixList = SparqlDQPUtil.getPrefixes(queryStructure
                    .get(ASTConstants.PROLOGUE));
            sparqlSelectQuery.setPrefixes(prefixList);

            Map<String, CommonTree> selectQueryStructure = ASTUtil
                    .getQueryStructure(queryStructure
                            .get(ASTConstants.SELECT_QUERY));
            List<Attribute> querySelectVariables;
            querySelectVariables = SparqlDQPUtil
                    .buildSelectVariables(selectQueryStructure
                            .get(ASTConstants.SELECT_LIST));
            sparqlSelectQuery.setQuerySelectVariables(querySelectVariables);
            sparqlSelectQuery.setQueryStructure(selectQueryStructure);
            Operator lqpRoot = GroupProcessor.processGroupGraphPattern(
                    sparqlSelectQuery, sparqlSelectQuery.getQueryStructure()
                            .get(ASTConstants.WHERE_TOKEN));
            assertTrue(lqpRoot.getID() == OperatorID.LEFT_OUTER_JOIN);
            TestHelper.writeFile(lqpRoot, OperatorID.LEFT_OUTER_JOIN.toString()
                    + "_GROUP", query, mPath, "dot");
        }
        catch (SPARQLParserException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (LQPException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (ExpressionException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void testProcessGroupGraphPatternUnion()
    {
        String query = mTestQueries.get("testProcessWhereUNION");
        CommonTree abstractSyntaxTree;
        try
        {
            Map<String, CommonTree> queryStructure;
            abstractSyntaxTree = mParser.parseSparqlQuery(query);
            queryStructure = ASTUtil.getQueryStructure(abstractSyntaxTree);

            SparqlSelectQuery sparqlSelectQuery = new SparqlSelectQuery();
            sparqlSelectQuery.setDataDictionary(mDataDictionary);
            sparqlSelectQuery.setDefaultDataset((String) OGSADAIContext
                    .getInstance().get("defaultDataset"));

            List<Prefix> prefixList = SparqlDQPUtil.getPrefixes(queryStructure
                    .get(ASTConstants.PROLOGUE));
            sparqlSelectQuery.setPrefixes(prefixList);

            Map<String, CommonTree> selectQueryStructure = ASTUtil
                    .getQueryStructure(queryStructure
                            .get(ASTConstants.SELECT_QUERY));
            List<Attribute> querySelectVariables;
            querySelectVariables = SparqlDQPUtil
                    .buildSelectVariables(selectQueryStructure
                            .get(ASTConstants.SELECT_LIST));
            sparqlSelectQuery.setQuerySelectVariables(querySelectVariables);
            sparqlSelectQuery.setQueryStructure(selectQueryStructure);
            Operator lqpRoot = GroupProcessor.processGroupGraphPattern(
                    sparqlSelectQuery, sparqlSelectQuery.getQueryStructure()
                            .get(ASTConstants.WHERE_TOKEN));
            assertTrue(lqpRoot.getID().toString().equals("SPARQL_UNION"));
            TestHelper.writeFile(lqpRoot, "SPARQL_UNION", query, mPath, "dot");
        }
        catch (SPARQLParserException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (LQPException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (ExpressionException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void testProcessGroupGraphPatternFilter()
    {
        String query = mTestQueries.get("testProcessWhereFilter");
        CommonTree abstractSyntaxTree;
        try
        {
            Map<String, CommonTree> queryStructure;
            abstractSyntaxTree = mParser.parseSparqlQuery(query);
            queryStructure = ASTUtil.getQueryStructure(abstractSyntaxTree);

            SparqlSelectQuery sparqlSelectQuery = new SparqlSelectQuery();
            sparqlSelectQuery.setDataDictionary(mDataDictionary);
            sparqlSelectQuery.setDefaultDataset((String) OGSADAIContext
                    .getInstance().get("defaultDataset"));

            List<Prefix> prefixList = SparqlDQPUtil.getPrefixes(queryStructure
                    .get(ASTConstants.PROLOGUE));
            sparqlSelectQuery.setPrefixes(prefixList);

            Map<String, CommonTree> selectQueryStructure = ASTUtil
                    .getQueryStructure(queryStructure
                            .get(ASTConstants.SELECT_QUERY));
            List<Attribute> querySelectVariables;
            querySelectVariables = SparqlDQPUtil
                    .buildSelectVariables(selectQueryStructure
                            .get(ASTConstants.SELECT_LIST));
            sparqlSelectQuery.setQuerySelectVariables(querySelectVariables);
            sparqlSelectQuery.setQueryStructure(selectQueryStructure);
            Operator lqpRoot = GroupProcessor.processGroupGraphPattern(
                    sparqlSelectQuery, sparqlSelectQuery.getQueryStructure()
                            .get(ASTConstants.WHERE_TOKEN));
            assertTrue(lqpRoot.getID() == OperatorID.SELECT);
            TestHelper.writeFile(lqpRoot, "FILTER", query, mPath, "dot");
        }
        catch (SPARQLParserException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (LQPException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (ExpressionException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public void testProcessGroupGraphPatternFilter2()
    {
        String query = mTestQueries.get("testProcessWhereFilter2");
        CommonTree abstractSyntaxTree;
        try
        {
            Map<String, CommonTree> queryStructure;
            abstractSyntaxTree = mParser.parseSparqlQuery(query);
            queryStructure = ASTUtil.getQueryStructure(abstractSyntaxTree);

            SparqlSelectQuery sparqlSelectQuery = new SparqlSelectQuery();
            sparqlSelectQuery.setDataDictionary(mDataDictionary);
            sparqlSelectQuery.setDefaultDataset((String) OGSADAIContext
                    .getInstance().get("defaultDataset"));

            List<Prefix> prefixList = SparqlDQPUtil.getPrefixes(queryStructure
                    .get(ASTConstants.PROLOGUE));
            sparqlSelectQuery.setPrefixes(prefixList);

            Map<String, CommonTree> selectQueryStructure = ASTUtil
                    .getQueryStructure(queryStructure
                            .get(ASTConstants.SELECT_QUERY));
            List<Attribute> querySelectVariables;
            querySelectVariables = SparqlDQPUtil
                    .buildSelectVariables(selectQueryStructure
                            .get(ASTConstants.SELECT_LIST));
            sparqlSelectQuery.setQuerySelectVariables(querySelectVariables);
            sparqlSelectQuery.setQueryStructure(selectQueryStructure);
            Operator lqpRoot = GroupProcessor.processGroupGraphPattern(
                    sparqlSelectQuery, sparqlSelectQuery.getQueryStructure()
                            .get(ASTConstants.WHERE_TOKEN));
            assertTrue(lqpRoot.getID() == OperatorID.SELECT);
            TestHelper.writeFile(lqpRoot, "FILTER", query, mPath, "dot");
        }
        catch (SPARQLParserException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (LQPException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (ExpressionException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

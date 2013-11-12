package es.upm.fi.dia.oeg.test.sparqldqp.servicevar;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.CommonTree;

import junit.framework.TestCase;

import uk.org.ogsadai.context.OGSADAIContext;
import uk.org.ogsadai.converters.databaseschema.TableMetaDataImpl;
import uk.org.ogsadai.dqp.common.DataDictionary;
import uk.org.ogsadai.dqp.common.EvaluationNode;
import uk.org.ogsadai.dqp.common.simple.SimpleDataDictionary;
import uk.org.ogsadai.dqp.common.simple.SimplePhysicalSchema;
import uk.org.ogsadai.dqp.common.simple.SimpleTableSchema;
import uk.org.ogsadai.dqp.lqp.Operator;
import uk.org.ogsadai.dqp.lqp.OperatorID;
import uk.org.ogsadai.dqp.lqp.exceptions.LQPException;
import uk.org.ogsadai.dqp.lqp.udf.FunctionRepository;
import uk.org.ogsadai.dqp.presentation.common.SimpleDataNode;
import uk.org.ogsadai.dqp.presentation.common.SimpleEvaluationNode;
import uk.org.ogsadai.dqp.test.TestPropertiesProvider;
import uk.org.ogsadai.resource.dataresource.dqp.DQPContext;
import uk.org.ogsadai.resource.dataresource.dqp.DQPFederation;
import uk.org.ogsadai.resource.dataresource.dqp.FunctionRepositoryConfig;
import es.upm.fi.dia.oeg.ogsadai.sparql.federation.QueryBuilder;
import es.upm.fi.dia.oeg.ogsadai.sparql.federation.QueryExecutionContext;
import es.upm.fi.dia.oeg.ogsadai.sparql.federation.SimpleRDFDataDictionary;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.SPARQLParserException;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.SimpleSparqlQueryParser;
import es.upm.fi.dia.oeg.test.sparqldqp.QueryBuilderTest;
import es.upm.fi.dia.oeg.test.sparqldqp.TestHelper;

public class ServiceVarTest extends TestCase
{
    /** Copyright statement. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Universidad Politecnica de Madrid, 2009-2010.";

    private SimpleSparqlQueryParser mParser;

    private Map<String, String> mTestQueries;

    private DataDictionary mDataDictionary;

    private String mPath;

    Set<EvaluationNode> mEvaluationNodes;

    /**
     * Runs the test cases.
     * 
     * @param args
     *            Not used
     */
    public static void main(String[] args)
    {
        junit.textui.TestRunner.run(QueryBuilderTest.class);
    }

    /**
     * Constructor.
     * 
     * @param name
     *            Test case name.
     * @throws Exception
     *             If any problems arise in reading the test properties.
     */
    public ServiceVarTest(String name) throws Exception
    {
        super(name);
    }

    public void setUp() throws Exception
    {
        super.setUp();
        mPath = TestPropertiesProvider.getProperty("lqp.output.path");
        mParser = SimpleSparqlQueryParser.getInstance();
        mTestQueries = new HashMap<>();
        mTestQueries.put("testProcessServiceVar1",
                "PREFIX :  <http://example.org/ns#> "
                        + "PREFIX a: <http://example.org/ns2#> "
                        + "SELECT * WHERE { ?a :j :k SERVICE ?a {?b :b ?c}}");

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

        SimpleDataNode dataNode = new SimpleDataNode("resourceID",
                "defaultDataset", null);

        SimpleTableSchema dataSchema = new SimpleTableSchema("cat", dataNode,
                tableMetaData, physicalSchema);
        ((SimpleDataDictionary) mDataDictionary).add(dataSchema);

        FunctionRepository functionRepository = FunctionRepositoryConfig
                .createFunctionRepository(TestPropertiesProvider
                        .getFunctionsConfigPath());
        OGSADAIContext.getInstance().put(
                FunctionRepository.FUNCTION_REPOSITORY_KEY, functionRepository);
        OGSADAIContext.getInstance().put("defaultDataset", "defaultDataset");

        mEvaluationNodes = new HashSet<EvaluationNode>();
        EvaluationNode evaluationNode = new SimpleEvaluationNode(
                "http://bla.com", "DataRequestExecutionResource",
                "http://bla.com", "http://bla.com", true, null);
        mEvaluationNodes.add(evaluationNode);
    }

    public void testSelectQuery()
    {
        String query = mTestQueries.get("testProcessServiceVar1");
        QueryExecutionContext context;
        CommonTree abstractSyntaxTree;
        try
        {
            abstractSyntaxTree = mParser.parseSparqlQuery(query);
            context = new QueryExecutionContext(mDataDictionary,
                    abstractSyntaxTree, mEvaluationNodes);
            QueryBuilder builder = new QueryBuilder(context);
            Operator lqpRoot;
            lqpRoot = builder.buildLQP();
            TestHelper.writeFile(lqpRoot, OperatorID.NIL.toString(), query,
                    mPath, "dot");
            assertTrue(lqpRoot.getID() == OperatorID.NIL);
        }
        catch (SPARQLParserException e1)
        {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        catch (LQPException e)
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

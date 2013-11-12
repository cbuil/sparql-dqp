package cl.puc.ing.dcc.db.logs.test.direct_restriction_tests;

import java.io.File;
import java.io.IOException;
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
import uk.org.ogsadai.dqp.lqp.exceptions.LQPException;
import uk.org.ogsadai.dqp.lqp.udf.FunctionRepository;
import uk.org.ogsadai.dqp.lqp.util.DOTFileGenerator;
import uk.org.ogsadai.dqp.presentation.common.SimpleDataNode;
import uk.org.ogsadai.dqp.test.TestPropertiesProvider;
import uk.org.ogsadai.expression.arithmetic.ExpressionException;
import uk.org.ogsadai.resource.dataresource.dqp.DQPContext;
import uk.org.ogsadai.resource.dataresource.dqp.DQPFederation;
import uk.org.ogsadai.resource.dataresource.dqp.FunctionRepositoryConfig;
import cl.puc.ing.dcc.db.logs.PatternRestrictor;
import cl.puc.ing.dcc.db.logs.RestrictionsN;
import es.upm.fi.dia.oeg.ogsadai.sparql.federation.SimpleRDFDataDictionary;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.ASTConstants;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.ASTUtil;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.SPARQLParserException;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.SimpleSparqlQueryParser;
import es.upm.fi.dia.oeg.ogsadai.sparql.processor.GroupProcessor;
import es.upm.fi.dia.oeg.ogsadai.sparql.query.Prefix;
import es.upm.fi.dia.oeg.ogsadai.sparql.query.SparqlSelectQuery;
import es.upm.fi.dia.oeg.ogsadai.sparql.utils.SparqlDQPUtil;
import es.upm.fi.dia.oeg.test.sparqldqp.TestHelper;

public class UnionDirectRestrictionTest extends TestCase
{
    /** Copyright statement. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Pontificia Universidad Catolica de Chile, 2012.";

    private SimpleSparqlQueryParser mParser;

    private Map<String, String> mTestQueries;

    private DataDictionary mDataDictionary;

    private String mPath = "/media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/";

    private Operator mLqpRoot1 = null;

    private Operator mLqpRoot2 = null;

    /**
     * Constructor.
     * 
     * @param name
     *            Test case name.
     * @throws Exception
     *             If any problems arise in reading the test properties.
     */
    public UnionDirectRestrictionTest(String name) throws Exception
    {
        super(name);
    }

    public void setUp() throws Exception
    {
        super.setUp();

        mPath = TestPropertiesProvider.getProperty("lqp.output.path");
        mParser = SimpleSparqlQueryParser.getInstance();
        mTestQueries = new HashMap<>();
        mTestQueries.put("testProcessWhereUNION1",
                "PREFIX :  <http://example.org/ns#> "
                        + "PREFIX a: <http://example.org/ns2#> "
                        + "SELECT * WHERE { {?a :b :c} UNION {?s ?p :o}}");
        mTestQueries.put("testProcessWhereUNION2",
                "PREFIX :  <http://example.org/ns#> "
                        + "PREFIX a: <http://example.org/ns2#> "
                        + "SELECT * WHERE { {?a ?b ?c} UNION {?s ?p ?o}}");

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

        String query1 = mTestQueries.get("testProcessWhereUNION1");
        String query2 = mTestQueries.get("testProcessWhereUNION2");

        CommonTree abstractSyntaxTree;

        try
        {
            Map<String, CommonTree> queryStructure;
            abstractSyntaxTree = mParser.parseSparqlQuery(query1);
            queryStructure = ASTUtil.getQueryStructure(abstractSyntaxTree);

            SparqlSelectQuery sparqlSelectQuery1 = new SparqlSelectQuery();
            sparqlSelectQuery1.setDataDictionary(mDataDictionary);
            sparqlSelectQuery1.setDefaultDataset((String) OGSADAIContext
                    .getInstance().get("defaultDataset"));

            List<Prefix> prefixList = SparqlDQPUtil.getPrefixes(queryStructure
                    .get(ASTConstants.PROLOGUE));
            sparqlSelectQuery1.setPrefixes(prefixList);

            Map<String, CommonTree> selectQueryStructure = ASTUtil
                    .getQueryStructure(queryStructure
                            .get(ASTConstants.SELECT_QUERY));
            List<Attribute> querySelectVariables;
            querySelectVariables = SparqlDQPUtil
                    .buildSelectVariables(selectQueryStructure
                            .get(ASTConstants.SELECT_LIST));
            sparqlSelectQuery1.setQuerySelectVariables(querySelectVariables);
            sparqlSelectQuery1.setQueryStructure(selectQueryStructure);
            mLqpRoot1 = GroupProcessor.processGroupGraphPattern(
                    sparqlSelectQuery1, sparqlSelectQuery1.getQueryStructure()
                            .get(ASTConstants.WHERE_TOKEN));

            Map<String, CommonTree> queryStructure2;
            CommonTree abstractSyntaxTree2 = mParser.parseSparqlQuery(query2);
            queryStructure2 = ASTUtil.getQueryStructure(abstractSyntaxTree2);

            SparqlSelectQuery sparqlSelectQuery2 = new SparqlSelectQuery();
            sparqlSelectQuery2.setDataDictionary(mDataDictionary);
            sparqlSelectQuery2.setDefaultDataset((String) OGSADAIContext
                    .getInstance().get("defaultDataset"));

            List<Prefix> prefixList2 = SparqlDQPUtil
                    .getPrefixes(queryStructure2.get(ASTConstants.PROLOGUE));
            sparqlSelectQuery2.setPrefixes(prefixList2);

            Map<String, CommonTree> selectQueryStructure2 = ASTUtil
                    .getQueryStructure(queryStructure2
                            .get(ASTConstants.SELECT_QUERY));
            List<Attribute> querySelectVariables2;
            querySelectVariables2 = SparqlDQPUtil
                    .buildSelectVariables(selectQueryStructure2
                            .get(ASTConstants.SELECT_LIST));
            sparqlSelectQuery2.setQuerySelectVariables(querySelectVariables2);
            sparqlSelectQuery2.setQueryStructure(selectQueryStructure2);
            mLqpRoot2 = GroupProcessor.processGroupGraphPattern(
                    sparqlSelectQuery2, sparqlSelectQuery2.getQueryStructure()
                            .get(ASTConstants.WHERE_TOKEN));
            
            writeDotFile(mLqpRoot1, mPath + "lqp1.dot");
            writeDotFile(mLqpRoot2, mPath + "lqp2.dot");
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

    public void testRestrictionChecker()
    {
//        PatternRestrictor pr = new PatternRestrictor();
        RestrictionsN rl = new RestrictionsN();
        boolean isRestriction = rl.restrictionChecker(mLqpRoot1, mLqpRoot2);
        assertTrue(isRestriction);
    }
    
    public void testRestrictionCheckerFalse()
    {
//        PatternRestrictor pr = new PatternRestrictor();
        RestrictionsN rl = new RestrictionsN();
        boolean isRestriction = rl.restrictionChecker(mLqpRoot2, mLqpRoot1);
        assertFalse(isRestriction);
    }

    private void writeDotFile(Operator lqpRoot, String pathname)
    {
        DOTFileGenerator dotFileGenerator = new DOTFileGenerator();
        boolean writeHeading = false;
        File fDot = new File(pathname);
        try
        {
            dotFileGenerator.writeDotToFile(lqpRoot, writeHeading, fDot);
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

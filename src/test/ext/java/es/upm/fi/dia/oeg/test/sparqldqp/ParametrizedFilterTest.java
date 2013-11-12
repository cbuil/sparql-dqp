package es.upm.fi.dia.oeg.test.sparqldqp;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.antlr.runtime.tree.CommonTree;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

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
import uk.org.ogsadai.dqp.lqp.util.DOTFileGenerator;
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

@RunWith(Parameterized.class)
public class ParametrizedFilterTest
{
    /** Copyright statement. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Pontificia Universidad Catolica de Chile, 2013";

    static Logger _log = Logger.getLogger(ParametrizedFilterTest.class
            .getName());

    private SimpleSparqlQueryParser mParser;

    private DataDictionary mDataDictionary;

    private static String mPath = "/media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/";

    private static File queryFile;

    private static SparqlSelectQuery sparqlSelectQuery;

    /**
     * Constructor.
     * 
     * @param name
     *            Test case name.
     * @throws Exception
     *             If any problems arise in reading the test properties.
     */
    public ParametrizedFilterTest(File queryFile) throws Exception
    {
        this.queryFile = queryFile;
    }

    /**
     * Returns the list of matching query files in the specified directory.
     * 
     * @return list of query files.
     * @throws ConfigurationException
     *             if an error occurs during query reading.
     */
    @Parameters
    public static Collection<File[]> queryList() throws Exception
    {

        Collection<File[]> data = new ArrayList<File[]>();

        File dir = new File(mPath + "/etc/filter_test_queries")
                .getAbsoluteFile();
        if (dir == null)
            throw new Exception("missing query dir setting '" + dir);

        // split multiple query dirs
        // String[] queryDirs = queryDir.split(";");
        List<File> queryList = new ArrayList<File>();

        if (!dir.isDirectory() || !dir.canRead())
            _log.info("cannot read query directory: " + dir);

        for (File file : dir.listFiles())
        {
            if (file.isFile() && file.getName().endsWith(".rq"))
            {
                File[] fileArg = new File[] { file };
                data.add(fileArg);
            }
        }

        if (queryList.size() == 0)
            _log.info("found no matching queries");

        Collections.sort(queryList);
        return data;
    }

    /**
     * Reads a SPARQL query from a file.
     * 
     * @param file
     *            the file to read.
     * @return the query.
     * @throws IOException
     *             if an error occurs during query reading.
     */
    private String readQueryFile(File queryFile) throws IOException
    {
        String query = "";
        StringBuffer buffer = new StringBuffer();
        BufferedReader r = new BufferedReader(new FileReader(queryFile));
        String input;
        while ((input = r.readLine()) != null)
        {
            buffer.append(input).append("\n");
//            if (input.isEmpty())
//            {
//                query = buffer.toString();
//                buffer.setLength(0);
//            }
        }
        query = buffer.toString();
        return query;
    }

    @Before
    public void setUp() throws Exception
    {
        mPath = TestPropertiesProvider.getProperty("lqp.output.path");
        mParser = SimpleSparqlQueryParser.getInstance();

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
        OGSADAIContext.getInstance().put("defaultDataset", "http://127.0.0.1:2020/default");

        // String queries = "";
        _log.info("Query file: " + queryFile);
        // queries = readQueryFile(ParametrizedFilterTest.queryFile);
        String mQuery = readQueryFile(ParametrizedFilterTest.queryFile);

        System.out.println(mQuery);
        CommonTree abstractSyntaxTree;

        try
        {
            Map<String, CommonTree> queryStructure;
            abstractSyntaxTree = mParser.parseSparqlQuery(mQuery);
            queryStructure = ASTUtil.getQueryStructure(abstractSyntaxTree);

            sparqlSelectQuery = new SparqlSelectQuery();
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

    @Test
    public void testRestrictionChecker()
    {
        Operator lqpRoot;
        try
        {
            lqpRoot = GroupProcessor.processGroupGraphPattern(
                    sparqlSelectQuery, sparqlSelectQuery.getQueryStructure()
                            .get(ASTConstants.WHERE_TOKEN));
            assertTrue(lqpRoot.getID() == OperatorID.SELECT);
            writeDotFile(lqpRoot, mPath);
        }
        catch (LQPException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (SPARQLParserException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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

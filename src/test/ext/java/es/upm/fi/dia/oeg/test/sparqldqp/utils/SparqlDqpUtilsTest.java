package es.upm.fi.dia.oeg.test.sparqldqp.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.antlr.runtime.tree.CommonTree;

import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.AttributeImpl;
import uk.org.ogsadai.dqp.lqp.exceptions.LQPException;
import uk.org.ogsadai.expression.arithmetic.ExpressionException;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.ASTConstants;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.ASTUtil;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.SPARQLParserException;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.SimpleSparqlQueryParser;
import es.upm.fi.dia.oeg.ogsadai.sparql.patterns.SimpleBasicGraphPattern;
import es.upm.fi.dia.oeg.ogsadai.sparql.query.Prefix;
import es.upm.fi.dia.oeg.ogsadai.sparql.query.PrefixImpl;
import es.upm.fi.dia.oeg.ogsadai.sparql.utils.SparqlDQPUtil;

public class SparqlDqpUtilsTest extends TestCase
{
    /** Copyright statement. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Universidad Politecnica de Madrid, 2009-2010.";

    private SimpleSparqlQueryParser mParser;

    private Map<String, String> mTestQueries;

    /**
     * Runs the test cases.
     * 
     * @param args
     *            Not used
     */
    public static void main(String[] args)
    {
        junit.textui.TestRunner.run(SparqlDqpUtilsTest.class);
    }

    /**
     * Constructor.
     * 
     * @param name
     *            Test case name.
     * @throws Exception
     *             If any problems arise in reading the test properties.
     */
    public SparqlDqpUtilsTest(String name) throws Exception
    {
        super(name);
    }

    public void setUp() throws Exception
    {
        super.setUp();
        mParser = SimpleSparqlQueryParser.getInstance();
        mTestQueries = new HashMap<>();
        mTestQueries.put("testPrefix", "PREFIX :  <http://example.org/ns#> "
                + "PREFIX a: <http://example.org/ns2#> "
                + "SELECT * WHERE { ?a :b ?c }");
        mTestQueries.put("testGetTriplePatterns",
                "PREFIX :  <http://example.org/ns#> "
                        + "PREFIX a: <http://example.org/ns2#> "
                        + "SELECT * WHERE { ?a :b ?c }");
        mTestQueries.put("testGetPredicateFromBGP", " a:a :b :c .?d :e :f");
        mTestQueries.put("testGetFilterString", " FILTER regex(?a, \"test\")");
    }

    /**
     * tests get query prefixes
     */
    public void testGetPrefixes()
    {
        List<Prefix> prefixes = new ArrayList<Prefix>();
        String query = mTestQueries.get("testGetTriplePatterns");
        String[] p1;
        p1 = new String[2];
        p1[0] = "";
        p1[1] = "http://example.org/ns#";
        Prefix prefix1 = new PrefixImpl();
        prefix1.setPrefix(p1);
        prefixes.add(prefix1);

        String[] p2;
        p2 = new String[2];
        p2[0] = "a";
        p2[1] = "http://example.org/ns2#";
        Prefix prefix2 = new PrefixImpl();
        prefix2.setPrefix(p2);
        prefixes.add(prefix2);
        List<Prefix> testedPrefixList;

        CommonTree abstractSyntaxTree;
        try
        {
            abstractSyntaxTree = mParser.parseSparqlQuery(query);
            Map<String, CommonTree> queryStructure;
            queryStructure = ASTUtil.getQueryStructure(abstractSyntaxTree);

            testedPrefixList = SparqlDQPUtil.getPrefixes(queryStructure
                    .get(ASTConstants.PROLOGUE));
            for (Prefix prefix : testedPrefixList)
            {
                boolean exist = false;
                for (Prefix prefixToTest : prefixes)
                {
                    if (prefixToTest.toString().equals(prefix.toString()))
                    {
                        exist = true;
                    }
                }
                assertTrue(exist);
            }
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

    }

    /**
     * tests get query data sources (FROM)
     */
    public void testGetDatasources()
    {
        // TODO: test get datasources (FROM LIST)
    }

    /**
     * tests get build the query variables (SELECT VARS)
     */
    public void testGetQueryVariables()
    {
        // TODO: test get datasources (FROM LIST)
    }

    public void testGetSelectQueryVariables()
    {
        List<Attribute> queryVariablesToTest;
        List<Attribute> queryVariablesTested;
        queryVariablesToTest = new ArrayList<Attribute>();
        queryVariablesTested = new ArrayList<Attribute>();
        String query = mTestQueries.get("testGetSelectQueryVariables");
        CommonTree abstractSyntaxTree;
        try
        {
            abstractSyntaxTree = mParser.parseSparqlQuery(query);
            Map<String, CommonTree> queryStructure;
            queryStructure = ASTUtil.getQueryStructure(abstractSyntaxTree);
            queryVariablesTested = SparqlDQPUtil
                    .buildSelectVariables(queryStructure
                            .get(ASTConstants.SELECT_LIST));
            for (Attribute attribute : queryVariablesTested)
            {
                boolean exist = false;
                for (Attribute attributeTested : queryVariablesToTest)
                {
                    if (attribute.equals(attributeTested))
                    {
                        exist = true;
                    }
                }
                assertTrue(exist);
            }

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
        catch (ExpressionException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void testGetPredicateFromBGP() throws LQPException
    {
        CommonTree abstractSyntaxTree;
        String query = mTestQueries.get("testGetPredicateFromBGP");

        try
        {
            Prefix p = new PrefixImpl();
            String[] s;
            s = new String[2];
            s[0] = "a";
            s[1] = "http://xmlns.com/foaf/0.1/People/";
            String[] s1;
            s1 = new String[2];
            s1[0] = "";
            s1[1] = "http://xmlns.com/foaf/0.1/People/2/";
            Prefix p2 = new PrefixImpl();
            p2.setPrefix(s1);
            p.setPrefix(s);
            List<Prefix> prefixList = new ArrayList<>();
            prefixList.add(p);
            prefixList.add(p2);
            abstractSyntaxTree = mParser.parseTripleBlock(query);
            SimpleBasicGraphPattern bgpToTest = new SimpleBasicGraphPattern(
                    "?a", ":b", "?c");
            SimpleBasicGraphPattern predicate = SparqlDQPUtil.getTriplePattern(
                    (CommonTree) abstractSyntaxTree.getChild(0), prefixList);
            assertTrue(predicate.equals(bgpToTest));

        }
        catch (SPARQLParserException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void testGetCommonPredicates()
    {
        Attribute attr11 = new AttributeImpl("attr1", "test1");
        Attribute attr12 = new AttributeImpl("attr2", "test1");
        Attribute attr21 = new AttributeImpl("attr1", "test2");
        Attribute attr22 = new AttributeImpl("attr2", "test2");
        List<Attribute> attrList1 = new ArrayList<>();
        attrList1.add(attr11);
        attrList1.add(attr12);
        List<Attribute> attrList2 = new ArrayList<>();
        attrList2.add(attr21);
        attrList2.add(attr22);

        List<String> commonPredicatesToTest = new ArrayList<>();
        commonPredicatesToTest.add("test1.attr1=test2.attr1");
        commonPredicatesToTest.add("test1.attr2=test2.attr2");

        List<String> commonPredicates = new ArrayList<>();
        commonPredicates = SparqlDQPUtil.getCommonPredicates(attrList1,
                attrList2);

        assertTrue(commonPredicatesToTest.contains(commonPredicates.get(0)));
        assertTrue(commonPredicatesToTest.contains(commonPredicates.get(1)));
    }

    public void testGetFilterString()
    {
        CommonTree abstractSyntaxTree;
        String query = mTestQueries.get("testGetFilterString");
        String prefixes = mTestQueries.get("testPrefix");
        String filterString = "";
        try
        {
            abstractSyntaxTree = mParser.parseSparqlQuery(prefixes);
            Map<String, CommonTree> queryStructure;
            queryStructure = ASTUtil.getQueryStructure(abstractSyntaxTree);

            List<Prefix> testedPrefixList = SparqlDQPUtil
                    .getPrefixes(queryStructure.get(ASTConstants.PROLOGUE));
            abstractSyntaxTree = mParser.parseFilterString(query);
            filterString = SparqlDQPUtil.getFilterString(abstractSyntaxTree,
                    testedPrefixList);
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

        assertTrue(filterString.replaceAll(" ", "").equals(
                query.replaceAll("FILTER", "").replaceAll(" ", "")));
    }
    /**
     * tests get triple patterns from a query
     */
    // public void testGetTriplePatterns()
    // {
    // String query = mTestQueries.get("testGetTriplePatterns");
    // List<TriplePattern> triples = new ArrayList<>();
    // triples.add(new TriplePattern("?a", "<http://example.org/ns#b>", "?c"));
    // List<Prefix> prefixTest;
    // CommonTree abstractSyntaxTree;
    // try
    // {
    // abstractSyntaxTree = mParser.parseSparqlQuery(query);
    // prefixMap = SparqlDQPUtil
    // .getPrefixes((CommonTree) abstractSyntaxTree.getChild(0));
    // List<TriplePattern> testTriples;
    // testTriples = SparqlDQPUtil.getTriplePatterns(abstractSyntaxTree,
    // prefixMap);
    // for (TriplePattern testedTriplePattern : testTriples)
    // {
    // assertTrue(triples.contains(testedTriplePattern));
    // }
    // }
    // catch (SPARQLParserException e1)
    // {
    // // TODO Auto-generated catch block
    // e1.printStackTrace();
    // }
    // catch (LQPException e)
    // {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // }
    // }
}

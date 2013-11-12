package es.upm.fi.dia.oeg.test.sparqldqp.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.CommonTree;

import junit.framework.TestCase;

import es.upm.fi.dia.oeg.ogsadai.sparql.parser.ASTConstants;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.ASTUtil;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.SPARQLParserException;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.SimpleSparqlQueryParser;
import es.upm.fi.dia.oeg.ogsadai.sparql.query.Prefix;

public class ASTUtilTest extends TestCase
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
        junit.textui.TestRunner.run(ASTUtilTest.class);
    }

    /**
     * Constructor.
     * 
     * @param name
     *            Test case name.
     * @throws Exception
     *             If any problems arise in reading the test properties.
     */
    public ASTUtilTest(String name) throws Exception
    {
        super(name);
    }

    public void setUp() throws Exception
    {
        super.setUp();
        mParser = SimpleSparqlQueryParser.getInstance();
        mTestQueries = new HashMap<>();
        mTestQueries.put("testGetPredicateFromBGP",
                " a:test1 :b ?c ");
        mTestQueries.put("testGetPredicate",
                        " ?a :b ?c . a:test1 :b ?c");
    }

    public void testGetPredicateFromBGP()
    {
        CommonTree abstractSyntaxTree;
        String query = mTestQueries.get("testGetPredicateFromBGP");

        try
        {
            abstractSyntaxTree = mParser.parseTripleBlock(query);
            CommonTree predicate = ASTUtil.getPredicateFromBGP(abstractSyntaxTree);
            assertTrue(predicate.equals(abstractSyntaxTree));
            
        }
        catch (SPARQLParserException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
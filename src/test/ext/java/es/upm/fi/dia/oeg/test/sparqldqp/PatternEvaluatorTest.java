package es.upm.fi.dia.oeg.test.sparqldqp;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.SimpleSparqlQueryParser;

public class PatternEvaluatorTest extends TestCase
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
        junit.textui.TestRunner.run(PatternEvaluatorTest.class);
    }

    /**
     * Constructor.
     * 
     * @param name
     *            Test case name.
     * @throws Exception
     *             If any problems arise in reading the test properties.
     */
    public PatternEvaluatorTest(String name) throws Exception
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
    }

}
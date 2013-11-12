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

package es.upm.fi.dia.oeg.ogsadai.sparql.parser;

import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplateGroup;

import es.upm.fi.dia.oeg.ogsadai.sparql.parser.SPARQLParserException;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.antlr.SparqlLexer;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.antlr.SparqlParser;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.antlr.SparqlParser.filter_return;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.antlr.SparqlParser.groupGraphPattern_return;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.antlr.SparqlParser.regexExpression_return;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.antlr.SparqlParser.triplesBlock_return;

import uk.org.ogsadai.dqp.lqp.Operator;
import uk.org.ogsadai.parser.SQLParserException;
import uk.org.ogsadai.parser.sql92query.ANTLRNoCaseStringStream;
import uk.org.ogsadai.parser.sql92query.ParserRecognitionException;
import uk.org.ogsadai.parser.sql92query.SQL92QueryLexer;
import uk.org.ogsadai.parser.sql92query.SQL92QueryParser;

/**
 * An SPARQL Query parser.
 * 
 * @author Carlos Buil Aranda. Ontology Engineering Group, UPM
 * This development has been carried out within the ADMIRE project
 * 
 */
public class SimpleSparqlQueryParser implements SparqlQueryParser
{
    /** Copyright notice */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Ontology Engineering Group, 2009.";

	private static final int ID = 0;

    /** Singleton instance */
    private static SimpleSparqlQueryParser mInstance = new SimpleSparqlQueryParser();

    /** String template library for generating SQL statements from a tree */
    private StringTemplateGroup mTemplates = null;

    /**
     * Private constructor for singleton.
     */
    private SimpleSparqlQueryParser()
    {
        // singleton constructor
    }

    /**
     * Returns the instance of this singleton.
     * 
     * @return singleton instance
     */
    public static SimpleSparqlQueryParser getInstance()
    {
        return mInstance;
    }


    /**
     * Parses an SPARQL expression that describes a query.
     * 
     * @param expression
     *            SPARQL expression
     * @return abstract syntax corresponding to the input expression
     * @throws SPARQLParserException
     */
    public CommonTree parseSPARQLForSelectQuery(String expression)
            throws SPARQLParserException
    {
        SparqlLexer lex = new SparqlLexer(new ANTLRNoCaseStringStream(
                expression));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        SparqlParser g = new SparqlParser(tokens);
        try
        {
            SparqlParser.selectQuery_return result = g.selectQuery();           
            return (CommonTree) result.getTree();
        }
        catch (RecognitionException e)
        {
            throw new SPARQLParserException(ParserRecognitionException
                    .getInstance(e));
        }
    }
    
//    /**
//     * Parses an SPARQL expression containing a condition in a FILTER expression 
//     * 
//     * @param expression
//     *            SPARQL condition expression
//     * @return abstract syntax tree corresponding to the input expression
//     * @throws SPARQLParserException
//     */
//    public CommonTree parseSPARQLForCondition(String expression)
//            throws SPARQLParserException
//    {
//        SparqlLexer lex = new SparqlLexer(new ANTLRNoCaseStringStream(
//                expression));
//        CommonTokenStream tokens = new CommonTokenStream(lex);
//
//        SparqlParser g = new SparqlParser(tokens);
//
//        try
//        {
//            SQL92QueryParser.search_condition_return result = g
//                    .search_condition();
//            return (CommonTree) result.getTree();
//        }
//        catch (RecognitionException e)
//        {
//            throw new SPARQLParserException(ParserRecognitionException
//                    .getInstance(e));
//        }
//    }

//    public CommonTree parseSPARQLForSelectList(String expression)
//        throws SPARQLParserException
//    {
//        SparqlLexer lex = new SparqlLexer(new ANTLRNoCaseStringStream(
//            expression));
//        CommonTokenStream tokens = new CommonTokenStream(lex);
//
//        SparqlParser g = new SparqlParser(tokens);
//        try
//        {
//        	SparqlParser.select_list_return result = g.select_list();
//            return (CommonTree) result.getTree();
//        }
//        catch (RecognitionException e)
//        {
//            throw new SPARQLParserException(ParserRecognitionException
//                .getInstance(e));
//        }
//    }
    
    /**
     * Parses an SQL expression that describes a column.
     * 
     * @param expression
     *            SQL expression
     * @return abstract syntax corresponding to the input expression
     * @throws SPARQLParserException
     */
//    public CommonTree parseSPARQLForDerivedColumn(String expression)
//            throws SPARQLParserException
//    {        
//        SparqlLexer lex = new SparqlLexer(new ANTLRNoCaseStringStream(
//                expression));
//        CommonTokenStream tokens = new CommonTokenStream(lex);
//
//        SparqlParser g = new SparqlParser(tokens);
//        try
//        {
//        	SparqlParser.derived_column_return result = g.derived_column();
//            return (CommonTree) result.getTree();
//        }
//        catch (RecognitionException e)
//        {
//            throw new SPARQLParserException(ParserRecognitionException
//                    .getInstance(e));
//        }
//    }

//    public CommonTree parseSQLForValueExpressionOrStar(String expression)
//        throws SPARQLParserException
//    {
//        if (expression.equals(ASTConstants.STAR_TOKEN))
//        {
//            TreeAdaptor adaptor = new CommonTreeAdaptor();
//            CommonTree ct = (CommonTree) adaptor.create(SPARQLQueryParser.ID,
//                ASTConstants.STAR_TOKEN);
//
//            return  ct;
//        }
//
//        SparqlLexer lex = new SparqlLexer(new ANTLRNoCaseStringStream(
//            expression));
//        CommonTokenStream tokens = new CommonTokenStream(lex);
//
//        SparqlParser g = new SparqlParser(tokens);
//        try
//        {
//            SparqlParser.value_expression_return result = g
//                .value_expression();
//            return (CommonTree) result.getTree();
//        }
//        catch (RecognitionException e)
//        {
//            throw new SPARQLParserException(ParserRecognitionException
//                .getInstance(e));
//        }
//    }

    /**
     * Parses an SQL expression that describes a literal.
     * 
     * @param expression
     *            SQL expression
     * @return abstract syntax corresponding to the input expression
     * @throws SPARQLParserException
     */
//    public CommonTree parseSQLForLiteral(String expression)
//            throws SPARQLParserException
//    {
//        SparqlLexer lex = new SparqlLexer(new ANTLRNoCaseStringStream(
//                expression));
//        CommonTokenStream tokens = new CommonTokenStream(lex);
//
//        SparqlParser g = new SparqlParser(tokens);
//
//        try
//        {
//        	SparqlParser.literal_return result = g.literal();
//            return (CommonTree) result.getTree();
//        }
//        catch (RecognitionException e)
//        {
//            throw new SPARQLParserException(ParserRecognitionException
//                    .getInstance(e));
//        }
//    }

    /**
     * Parses an SQL expression containing a condition (in a where clause, for
     * example.
     * 
     * @param expression
     *            SQL condition expression
     * @return abstract syntax tree corresponding to the input expression
     * @throws SPARQLParserException
     */
//    public CommonTree parseSQLForCondition(String expression)
//            throws SPARQLParserException
//    {
//        SparqlLexer lex = new SparqlLexer(new ANTLRNoCaseStringStream(
//                expression));
//        CommonTokenStream tokens = new CommonTokenStream(lex);
//
//        SparqlParser g = new SparqlParser(tokens);
//
//        try
//        {
//            SparqlParser.search_condition_return result = g
//                    .search_condition();
//            return (CommonTree) result.getTree();
//        }
//        catch (RecognitionException e)
//        {
//            throw new SPARQLParserException(ParserRecognitionException
//                    .getInstance(e));
//        }
//    }

    /**
     * Loads the string template library if it has not been loaded before.
     * 
     * @throws SPARQLParserInitialisationException
     */
//    private void loadStringTemplateLib()
//            throws SPARQLParserInitialisationException
//    {
//        if (mTemplates == null)
//        {
//            try
//            {
//                // Load up template definitions from a file on the classpath
//                InputStreamReader reader = new InputStreamReader(Thread
//                        .currentThread().getContextClassLoader()
//                        .getResourceAsStream("SQL92Query.stg"));
//                mTemplates = new StringTemplateGroup(reader);
//                reader.close();
//            }
//            catch (FileNotFoundException e)
//            {
//                throw new SPARQLParserInitialisationException(e);
//            }
//            catch (IOException e)
//            {
//                throw new SPARQLParserInitialisationException(e);
//            }
//        }
//    }

    public static void main(String[] args) throws Exception
    {
//        String inputFile = args[0];
//        String outputFile = args[1];
        try
        {
        	String SPARQLquery;
//            BufferedReader br = new BufferedReader(new FileReader(inputFile));
//            StringBuilder queryBuilder = new StringBuilder();
//            String line;
//
//            while ((line = br.readLine()) != null)
//            {
//                queryBuilder.append(line);
//                queryBuilder.append(" ");
//            }
//            br.close();
            SimpleSparqlQueryParser parser = SimpleSparqlQueryParser.getInstance();
//            CommonTree ast = parser.parseSPARQL(queryBuilder.toString());
//            CommonTree ast = parser.parseSPARQL("PREFIX p: <http://dbpedia.org/property/> " +
//            		"PREFIX p: <http://dbpedia.org/property/> " +
//            		"SELECT ?artist ?artwork ?museum ?director " +
//            		"WHERE {" +
//            		"  ?artwork p:artist ?artist ." +
//            		"  ?artwork p:museum ?museum ." +
//            		"  ?museum p:director ?director}");
            
            		
//            		SPARQLquery = "PREFIX p: <http://dbpedia.org/property/> " +
//            		"SELECT ?name ?email " +
//            		"WHERE {   ?person rdf:type foaf:Person ." +
//            		"   ?person foaf:name ?name ." +
//            		"  OPTIONAL {?person foaf:mbox ?email} }";
            
//            SPARQLquery = 
//            	"PREFIX foaf: <http://xmlns.com/foaf/0.1/> " +
//            	"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " +
//            	"FROM dbpediaResource <http://dbpedia.org>" +
//            	"FROM geonamesResource <http://dbpedia.org>" +
//        		"SELECT ?s1.name ?s3.email " +
//        		"WHERE {   ?s1.person rdf:type foaf:Person ." +
//        		"   ?s2.person foaf:name ?s2.name ." +
//        		"  OPTIONAL {?s3.person foaf:mbox ?s3.email} }";
            		
            SPARQLquery = 
            	"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " +
            	"PREFIX foaf: <http://xmlns.com/foaf/0.1/> " +
            	"SELECT ?geonamesResource.name ?geonamesResource.nick " +
            	"FROM dbpediaResource: <http://www.dajobe.org/foaf.rdf>" +
            	"FROM RDFResource: <http://www.dajobe.org/foaf.rdf>" +
            	"WHERE {" +
            	"   ?dbpediaResource.x rdf:type foaf:Person ." +
//            	"   ?dbpediaResource.x foaf:name ?geonamesResource.name ." +
            	"   OPTIONAL { ?RDFResource.x foaf:nick ?RDFResource.nick } }";
            		
//            SPARQLquery = 
//            "PREFIX mo: <http://purl.org/ontology/mo/> " +
//    		"PREFIX foaf:  <http://xmlns.com/foaf/0.1/> " +
//    		"SELECT ?name ?hp ?loc " +
//    		"WHERE {" +
////    		"   ?s1.a a mo:MusicArtist ." +
////    		"   ?s1.a foaf:name ?s1.name ." +
//    		"   ?s1.a foaf:name ?s1.name " +
//    		" OPTIONAL { ?s2.a foaf:homepage ?s2.hp }" +
//    		" OPTIONAL { ?s3.a foaf:based_near ?s3.loc }}";
            		
//            SPARQLquery = "PREFIX dmi: <http://www.admire-project.eu/ontologies/CRISP-DMIOntology.owl#> " +
//            		"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " +
//    		"SELECT ?dbpedia.x ?geonames.y " +
//    		"FROM dbpedia: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " +
//    		"FROM geonames: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " +
//    		"WHERE {   	?dbpedia.x dmi:hasInput ?dbpedia.y .	" +
//    		"?geonames.y rdf:type dmi:SQLSentence .}";
            
            CommonTree ast = parser.parseSparqlQuery(SPARQLquery);
            
//            CommonTree ast = parser.parseSPARQL("PREFIX dmi: <http://www.admire-project.eu/ontologies/CRISP-DMIOntology.owl#> " +
//            		"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " +
//    		"SELECT ?x ?y " +
//    		"FROM dbpedia: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " +
//    		"FROM geonames: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " +
//    		"WHERE {   	?x dmi:hasInput ?y .	" +
//    		"?y rdf:type dmi:SQLSentence .}");

            DOTTreeGenerator dotGenerator = new DOTTreeGenerator();
            String dotString = dotGenerator.toDOT(ast).toString();
            
            Pattern myPattern = Pattern.compile("node[^;]*",
                Pattern.CASE_INSENSITIVE | Pattern.DOTALL | Pattern.MULTILINE);
            Matcher myMatcher = myPattern.matcher(dotString);

            StringBuffer sb = new StringBuffer();
            if (myMatcher.find())
                myMatcher
                    .appendReplacement(sb, "node [shape=box, fontsize=11]");
            myMatcher.appendTail(sb);

            FileWriter fw = new FileWriter("output.ast");
            fw.write(sb.toString());
            fw.close();
            
//            CompilerConfiguration cConfiguration =
//                new XMLCompilerConfiguration(
//                    TestPropertiesProvider.getCompilerConfigPath());
            
//            SPARQLLQPBuilder sparqlLqp = new SPARQLLQPBuilder(null, null);
//            
//            Operator lqpRoot = sparqlLqp.buildLQP(ast);
        }
        catch (Exception e)
        {
        	e.printStackTrace();
            System.out.println(e.getCause().getMessage());
        }
    }

    @Override
    public CommonTree parseSparqlQuery(String expression)
            throws SPARQLParserException
    {
        SparqlLexer lex = new SparqlLexer(new ANTLRNoCaseStringStream(
                expression));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SparqlParser g = new SparqlParser(tokens);

        try
        {
            SparqlParser.query_return result = g.query();
            return (CommonTree) result.getTree();
        }
        catch (RecognitionException e)
        {
            throw new SPARQLParserException(ParserRecognitionException
                    .getInstance(e));
        }
    }
    
//    @Override
    public CommonTree parseTripleBlock(String expression)
            throws SPARQLParserException
    {
        SparqlLexer lex = new SparqlLexer(new ANTLRNoCaseStringStream(
                expression));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SparqlParser g = new SparqlParser(tokens);

        try
        {
            triplesBlock_return result = g.triplesBlock();
            return (CommonTree) result.getTree();
        }
        catch (RecognitionException e)
        {
            throw new SPARQLParserException(ParserRecognitionException
                    .getInstance(e));
        }
    }
    
    public CommonTree parseFilterString(String expression)
            throws SPARQLParserException
    {
        SparqlLexer lex = new SparqlLexer(new ANTLRNoCaseStringStream(
                expression));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SparqlParser g = new SparqlParser(tokens);

        try
        {
            filter_return result = g.filter();
            return (CommonTree) result.getTree();
        }
        catch (RecognitionException e)
        {
            throw new SPARQLParserException(ParserRecognitionException
                    .getInstance(e));
        }
    }
    
    public CommonTree parseRegexString(String expression)
            throws SPARQLParserException
    {
        SparqlLexer lex = new SparqlLexer(new ANTLRNoCaseStringStream(
                expression));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SparqlParser g = new SparqlParser(tokens);

        try
        {
            regexExpression_return result = g.regexExpression();
            return (CommonTree) result.getTree();
        }
        catch (RecognitionException e)
        {
            throw new SPARQLParserException(ParserRecognitionException
                    .getInstance(e));
        }
    }
    
    public CommonTree parseGroupGraphPattern(String expression)
            throws SPARQLParserException
    {
        SparqlLexer lex = new SparqlLexer(new ANTLRNoCaseStringStream(
                expression));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SparqlParser g = new SparqlParser(tokens);

        try
        {
            groupGraphPattern_return result = g.groupGraphPattern();
            return (CommonTree) result.getTree();
        }
        catch (RecognitionException e)
        {
            throw new SPARQLParserException(ParserRecognitionException
                    .getInstance(e));
        }
    }
}

package es.upm.fi.dia.oeg.ogsadai.sparql.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.apache.log4j.Logger;

import es.upm.fi.dia.oeg.ogsadai.sparql.parser.ASTConstants;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.SPARQLParserException;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.SimpleSparqlQueryParser;
import es.upm.fi.dia.oeg.ogsadai.sparql.parser.antlr.SparqlParser;
import es.upm.fi.dia.oeg.ogsadai.sparql.patterns.SimpleBasicGraphPattern;
import es.upm.fi.dia.oeg.ogsadai.sparql.query.Dataset;
import es.upm.fi.dia.oeg.ogsadai.sparql.query.DatasetImpl;
import es.upm.fi.dia.oeg.ogsadai.sparql.query.Prefix;
import es.upm.fi.dia.oeg.ogsadai.sparql.query.PrefixImpl;

import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.AttributeImpl;
import uk.org.ogsadai.dqp.lqp.Operator;
import uk.org.ogsadai.dqp.lqp.exceptions.LQPException;
import uk.org.ogsadai.expression.arithmetic.ExpressionException;
import uk.org.ogsadai.tuple.TupleTypes;

public class SparqlDQPUtil
{
    /** Logger. */
    private static final Logger LOG = Logger.getLogger(SparqlDQPUtil.class);

    // Suppress default constructor for noninstantiability
    private SparqlDQPUtil()
    {
        throw new AssertionError();
    }

    public static String randomId()
    {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABSDEFGHIJKLMNOPQRSTUVWXYZ"
                .toCharArray();
        Random r = new Random(System.currentTimeMillis());
        char[] id = new char[8];
        for (int i = 0; i < 8; i++)
        {
            id[i] = chars[r.nextInt(chars.length)];
        }
        return new String(id);
    }

    /**
     * get the variables in a AST
     * 
     * @param ast
     * @param vars
     * @param mapVars
     */
    public static void getVars(CommonTree ast, List<String> vars,
            Map<String, String> mapVars)
    {
        for (int i = 0; i < ast.getChildCount(); i++)
        {
            CommonTree child = (CommonTree) ast.getChild(i);

            if (child.getType() == SparqlParser.VAR)
            {
                String var = child.getChild(0).getText().replaceAll("\\?", "");
                vars.add(var);
                mapVars.put(var, ast.getText());
            }
            else
            {
                getVars(child, vars, mapVars);
            }
        }
    }

    /**
     * @param ast
     * @param terms
     * @param mapTerms
     * @param prefixList
     * @throws LQPException
     */
    public static void getTerms(CommonTree ast, List<String> terms,
            Map<String, String> mapTerms, List<Prefix> prefixList,
            String element) throws LQPException
    {
        for (int i = 0; i < ast.getChildCount(); i++)
        {
            if (ast.getType() == SparqlParser.PREDICATE)
            {
                element = ast.getText();
            }
            else if (ast.getType() == SparqlParser.OBJECT)
            {
                element = ast.getText();
            }
            else if (ast.getType() == SparqlParser.SUBJECT)
            {
                element = ast.getText();
            }
            CommonTree child = (CommonTree) ast.getChild(i);

            if (child.getType() == SparqlParser.PATH_PRIMARY)
            {
                if (child.getChild(0).getType() == SparqlParser.PREFIX)
                {
                    CommonTree childPrefix = (CommonTree) child.getChild(0);
                    String prefixRightSide = childPrefix.getChild(0).getText();
                    // String prefixValue = prefixList.get(prefixDeclaration
                    // .substring(i, prefixDeclaration.indexOf(':')));
                    String prefixName = prefixRightSide.substring(0,
                            prefixRightSide.indexOf(':'));
                    String prefixValue = "";
                    for (Prefix prefix : prefixList)
                    {
                        if (prefixName.equals(prefix.getPrefixName()))
                        {
                            prefixValue = prefix.getPrefixValue();
                        }
                    }
                    prefixRightSide = prefixRightSide.substring(prefixRightSide
                            .indexOf(':') + 1);
                    prefixRightSide = prefixValue + prefixRightSide;
                    terms.add(prefixRightSide);
                    mapTerms.put(prefixRightSide, element);
                }
                else if (child.getChild(0).getType() == SparqlParser.TERM_NO_PREFIX)
                {
                    CommonTree childPrefix = (CommonTree) child.getChild(0);
                    String termNoPrefix = childPrefix.getChild(0).getText();
                    terms.add(termNoPrefix);
                    mapTerms.put(termNoPrefix, element);
                }
                // else
                // {
                // throw new
                // LQPException("Wrong variable when building the LQP: ");
                // }

            }
            else if (child.getType() == SparqlParser.OBJECT
                    | child.getType() == SparqlParser.SUBJECT)
            {
                String triple_part = child.getText();
                child = (CommonTree) child.getChild(0);
                if (child.getType() != SparqlParser.VAR)
                {
                    if (child.getChild(0).getType() == SparqlParser.PREFIX)
                    {
                        CommonTree childPrefix = (CommonTree) child.getChild(0);
                        String prefixRightSide = childPrefix.getChild(0)
                                .getText();
                        // String prefixValue = prefixList.get(prefixDeclaration
                        // .substring(i, prefixDeclaration.indexOf(':')));
                        String prefixName = prefixRightSide.substring(0,
                                prefixRightSide.indexOf(':'));
                        String prefixValue = "";
                        for (Prefix prefix : prefixList)
                        {
                            if (prefixName.equals(prefix.getPrefixName()))
                            {
                                prefixValue = prefix.getPrefixValue();
                            }
                        }
                        prefixRightSide = prefixRightSide
                                .substring(prefixRightSide.indexOf(':') + 1);
                        prefixRightSide = prefixValue + prefixRightSide;
                        terms.add(prefixRightSide);
                        mapTerms.put(prefixRightSide, triple_part);
                    }
                    else if (child.getChild(0).getType() == SparqlParser.TERM_NO_PREFIX)
                    {
                        CommonTree childPrefix = (CommonTree) child.getChild(0);
                        String termNoPrefix = childPrefix.getChild(0).getText();
                        terms.add(termNoPrefix);
                        mapTerms.put(termNoPrefix, triple_part);
                    }
                    // else
                    // {
                    // throw new
                    // LQPException("Wrong variable when building the LQP: ");
                    // }
                }
            }
            else
            {
                getTerms(child, terms, mapTerms, prefixList, element);
            }
        }
    }

    // /**
    // * @param ast
    // * @param terms
    // * @param mapTerms
    // * @param prefixList
    // * @throws LQPException
    // */
    // public static void getTerms(CommonTree ast, List<String> terms,
    // Map<String, String> mapTerms, List<Prefix> prefixList)
    // throws LQPException
    // {
    // for (int i = 0; i < ast.getChildCount(); i++)
    // {
    // CommonTree child = (CommonTree) ast.getChild(i);
    //
    // if (child.getType() == SparqlParser.TERM)
    // {
    // if (child.getChild(0).getType() == SparqlParser.PREFIX)
    // {
    // CommonTree childPrefix = (CommonTree) child.getChild(0);
    // String prefixDeclaration = childPrefix.getChild(0)
    // .getText();
    // String prefixValue = "";
    // String prefixName = prefixDeclaration
    // .substring(i, prefixDeclaration.indexOf(':'));
    // for (Prefix prefix : prefixList)
    // {
    // if (prefixName.equals(prefix.getPrefixName()))
    // {
    // prefixValue = prefix.getPrefixValue();
    // }
    // }
    // prefixDeclaration = prefixValue.substring(0,
    // prefixValue.length() - 1)
    // + prefixDeclaration.substring(prefixDeclaration
    // .indexOf(':') + 1) + '>';
    // terms.add(prefixDeclaration);
    // mapTerms.put(prefixDeclaration, ast.getText());
    // }
    // else if (child.getChild(0).getType() == SparqlParser.TERM_NO_PREFIX)
    // {
    // CommonTree childPrefix = (CommonTree) child.getChild(0);
    // String termNoPrefix = childPrefix.getChild(0).getText();
    // terms.add(termNoPrefix);
    // mapTerms.put(termNoPrefix, ast.getText());
    // }
    // // else
    // // {
    // // throw new
    // // LQPException("Wrong variable when building the LQP: ");
    // // }
    //
    // }
    // else
    // {
    // getTerms(child, terms, mapTerms, prefixList);
    // }
    // }
    // }

    /**
     * gets all triples in the parse tree
     * 
     * @param ast
     * @param triplesList
     */
    public static void getTriples(CommonTree ast, List<CommonTree> triplesList)
    {
        for (int i = 0; i < ast.getChildCount(); i++)
        {
            CommonTree child = (CommonTree) ast.getChild(i);

            if (child.getType() == SparqlParser.TRIPLES_SAME_SUBJECT)
            {
                triplesList.add(child);
            }
            else if (child.getChildCount() > 0)
            {
                getTriples((CommonTree) child.getChild(0), triplesList);
            }
        }
    }

    /**
     * Finds optionals in the WHERE clause (only first level optionals)
     * 
     * @param ast
     * @param optionalList
     */
    public static void getOptionals(CommonTree ast,
            List<CommonTree> optionalList)
    {
        for (int i = 0; i < ast.getChildCount(); i++)
        {
            CommonTree child = (CommonTree) ast.getChild(i);

            if (child.getType() == SparqlParser.OPTIONAL)
            {
                optionalList.add(child);
            }
            else if (child.getChildCount() > 0)
            {
                getOptionals((CommonTree) child.getChild(0), optionalList);
            }
        }
    }

    /**
     * This method returns a list of the existing services in the query
     * 
     * @param ast
     * @param servicesList
     * @param triplesList
     */
    public static void getServices(CommonTree ast,
            List<CommonTree> servicesList, List<CommonTree> triplesList)
    {
        for (int i = 0; i < ast.getChildCount(); i++)
        {
            CommonTree child = (CommonTree) ast.getChild(i);

            if (child.getType() == SparqlParser.SERVICE)
            {
                servicesList.add(child);
            }
            else if (child.getType() == SparqlParser.TRIPLES_SAME_SUBJECT)
            {
                triplesList.add(child);
            }
            else if (child.getChildCount() > 0)
            {
                getOptionals((CommonTree) child.getChild(0), servicesList);
            }
        }
    }

    /**
     * I go through all the tree searching for all the vars in the SERVICE some
     * of these vars should be in the var list in the SELECT statement
     * 
     * @param ast
     * @param varList
     */
    public static void getServiceVars(CommonTree ast, List<String> varList)
    {
        for (int i = 0; i < ast.getChildCount(); i++)
        {
            CommonTree child = (CommonTree) ast.getChild(i);

            if (child.getType() == SparqlParser.VAR
                    & ast.getType() != SparqlParser.URI)
            {
                String var = child.getChild(0).getText();
                var = var.replaceAll("\\?", "");
                if (!varList.contains(var))
                {
                    varList.add(var);
                }
            }
            else
            {
                getServiceVars(child, varList);
            }
        }
    }

    public static void getTerms(CommonTree ast, List<String> termList)
    {
        for (int i = 0; i < ast.getChildCount(); i++)
        {
            CommonTree child = (CommonTree) ast.getChild(i);

            if (ast.getType() == SparqlParser.OBJECT)
            {
                if (child.getChild(0).getType() == SparqlParser.TERM_NO_PREFIX)
                {
                    String var = child.getChild(0).getChild(0).getText();
                    if (!termList.contains(var))
                    {
                        termList.add(var);
                    }
                }
            }
            else if (ast.getType() == SparqlParser.SUBJECT)
            {
                if (child.getChild(0).getType() == SparqlParser.TERM_NO_PREFIX)
                {
                    String var = child.getChild(0).getChild(0).getText();
                    if (!termList.contains(var))
                    {
                        termList.add(var);
                    }
                }
            }
            else
            {
                getTerms(child, termList);
            }
        }

    }

    /**
     * returns the URI of the SPARQL endpoint specified in SERVICE <XXX>
     * 
     * @param ast
     * @return the endpoint address
     */
    public static String getSource(Tree ast)
    {
        String source = null;
        for (int i = 0; i < ast.getChildCount(); i++)
        {
            CommonTree child = (CommonTree) ast.getChild(i);

            if (child.getType() == SparqlParser.TERM_NO_PREFIX)
            {
                source = child.getChild(0).getText();
            }
            else
            {
                if (child.getType() == SparqlParser.VAR
                        & ast.getType() == SparqlParser.URI)
                {
                    source = child.getChild(0).getText();
                }
                else
                {
                    source = getSource(child);
                }

            }
        }
        return source;
    }

    /**
     * gets the FILTER string from a group pattern
     * 
     * @param ct
     * @param list
     * @return a string with the sparql query
     */
    public static String getFilterString(CommonTree ct, List<Prefix> list)
    {
        String query = "";
        if (ct.getType() == SparqlParser.FILTER)
        {
            query = walk((CommonTree) ct.getChild(0), query, list);
        }
        System.out.println("FILTER string: " + query);
        return query;
    }

    /**
     * generates a query from a CommonTree i.e. a SERVICE
     * 
     * @param ct
     * @param list
     * @return a string with the sparql query
     */
    public static String getQuery(CommonTree ct, List<Prefix> list)
    {
        String query = "";
        if (ct.getType() == SparqlParser.SERVICE)
        {
            query = walk((CommonTree) ct.getChild(1), query, list);
        }
        else if (ct.getType() == SparqlParser.FILTER)
        {
            query = walk((CommonTree) ct.getChild(0), query, list);
        }
        return query;
    }

    /**
     * generates a query from a List<CommonTree> intended for the default graph
     * 
     * @param ct
     * @param prefixMap
     * @return a string with the sparql query
     */
    public static String getQuery(List<CommonTree> ct, List<Prefix> prefixMap)
    {
        String query = "";
        for (CommonTree commonTree : ct)
        {
            query = walk(commonTree, query, prefixMap);
        }

        return query;
    }

    /**
     * parses the query tree and gets the a list of GGPs
     * 
     * @param ast
     * @param groupList
     */
    public static void getGroups(CommonTree ast, List<CommonTree> groupList)
    {
        for (int i = 0; i < ast.getChildCount(); i++)
        {
            CommonTree child = (CommonTree) ast.getChild(i);

            if (child.getType() == SparqlParser.GROUP)
            {
                groupList.add(child);
            }
            else if (child.getType() == SparqlParser.OPTIONAL)
            {
                groupList.add(child);
            }
            else if (child.getChildCount() > 0)
            {
                getGroups((CommonTree) child.getChild(0), groupList);
            }
        }
    }

    /**
     * Creates a Join expression from a set of attributes Error if there is more
     * than 2 attributes (or odd number of attributes)
     * 
     * @param entry
     * @return a list with all possible predicates
     */
    public static List<String> getPredicate(List<Attribute> entry)
    {
        String predicate = "";
        List<String> predicateList = new ArrayList<String>();
        Iterator attrIt = entry.iterator();
        while (attrIt.hasNext())
        {
            Attribute attr1 = (Attribute) attrIt.next();
            String attr1String = attr1.toString();
            if (attrIt.hasNext())
            {
                predicate = attr1String + " = "
                        + ((Attribute) attrIt.next()).toString();
            }
            predicateList.add(predicate);
            predicate = "";
        }
        return predicateList;
    }

    /**
     * Returns the common variables between two nodes
     * 
     * @param existingNodeAttributes
     * @param nodeAttributes
     * @return a set of common variables between nodes
     */
    public static Set<Attribute> getCommonVariables(
            List<Attribute> existingNodeAttributes,
            List<Attribute> nodeAttributes)
    {
        Set<Attribute> commonVariables = new HashSet<Attribute>();
        for (Attribute v1 : nodeAttributes)
        {
            for (Attribute v2 : existingNodeAttributes)
            {
                if (v1.getName().equals(v2.getName())
                        & !v1.getSource().equals(v2.getSource()))
                {
                    commonVariables.add(v1);
                    commonVariables.add(v2);
                }
            }
        }
        return commonVariables;
    }

    /**
     * Returns the common predicates between two nodes
     * 
     * @param prOp1
     * @param prOp0
     * @return a set of common variables between nodes
     */
    public static List<String> getCommonPredicates(List<Attribute> prOp0Attrs,
            List<Attribute> prOp1Attrs)
    {
        List<String> commonVariables = new ArrayList<String>();
        for (Attribute v1 : prOp0Attrs)
        {
            for (Attribute v2 : prOp1Attrs)
            {
                if (v1.getName().equals(v2.getName()))
                // & !v1.getSource().equals(v2.getSource()))
                {
                    commonVariables.add(v1.toString() + "=" + v2.toString());
                    // commonVariables.add(v2);
                }
            }
        }
        return commonVariables;
    }

    /**
     * removes duplicated vars in a list
     * 
     * @param commonVars
     * @return a list of variables without duplicates
     */
    public static List<String> removeDuplicates(List<String> commonVars)
    {
        List<String> sList = new ArrayList<String>();

        for (String s : commonVars)
        {
            if (sList.contains(s))
            {
                // sList.add(s);
                // commonVars.remove(s);
            }
            else
            {
                sList.add(s);
            }
        }
        return sList;
    }

    /**
     * Connects children to a binary operator.
     * 
     * @param operator
     *            parent operator
     * @param leftChildOperator
     *            left child operator
     * @param rightChildOperator
     *            right child operator
     */
    public static void connectBinary(Operator operator,
            Operator leftChildOperator, Operator rightChildOperator)
    {
        operator.setChild(0, leftChildOperator);
        operator.setChild(1, rightChildOperator);
    }

    /**
     * safeness condition: http://www.w3.org/2009/sparql/wiki/Certainly_bound
     * 
     * @param serviceOperatorList
     * @param operatorService
     * @return
     */
    public static boolean checkSafeness(List<Operator> serviceOperatorList,
            Operator operatorService)
    {
        boolean safe = false;
        if (serviceOperatorList.size() < 2
                & operatorService.getHeading().getAttributes().get(0)
                        .getSource().equals("varResource"))
        {
            safe = false;
            LOG.debug("SERVICE not safe, only one SERVICE expression with variable "
                    + operatorService.getAnnotation("originalSource"));
        }
        else
        {
            if (((String) operatorService.getAnnotation("originalSource"))
                    .contains("http"))
            {
                safe = true;
            }
            else
            {
                for (Operator operator : serviceOperatorList)
                {
                    for (Attribute attr : operator.getHeading().getAttributes())
                    {
                        if (attr.getName()
                                .equals(operatorService
                                        .getAnnotation("originalSource"))
                                & !operator.equals(operatorService))
                        {
                            if (((String) operator.getAnnotation("safe"))
                                    .equals("true"))
                            {
                                safe = true;
                                operatorService.addAnnotation("safe", "true");
                                operatorService.addAnnotation("depends",
                                        operator);
                            }
                            else
                            {
                                safe = checkSafeness(serviceOperatorList,
                                        operator);
                                operatorService.addAnnotation("safe", "true");
                                operatorService.addAnnotation("depends",
                                        operator);
                            }
                            break;
                        }
                    }
                    // What if attr.getSource() is also a variable?
                    // if it is safe, now we have to establish the execution
                    // order
                }
            }
        }
        return safe;
    }

    /**
     * Walks the AST building again the query for a SERVICE clause
     * 
     * @param ast
     * @param query
     * @param prefixList
     * @return the SPARQL query
     */
    private static String walk(CommonTree ast, String query,
            List<Prefix> prefixList)
    {
        // String query = "";
        switch (ast.getType())
        {
        case SparqlParser.GROUP_GRAPH_PATTERN:
            for (int i = 0; i < ast.getChildCount(); i++)
            {
                CommonTree child = (CommonTree) ast.getChild(i);
                query = walk(child, query, prefixList);
            }
            break;
        case SparqlParser.TRIPLES_SAME_SUBJECT:
            for (int i = 0; i < ast.getChildCount(); i++)
            {
                CommonTree child = (CommonTree) ast.getChild(i);
                query = walk(child, query, prefixList);
            }
            query = query + " . ";
            break;
        case SparqlParser.OPTIONAL:
            query = query + "OPTIONAL { ";
            for (int i = 0; i < ast.getChildCount(); i++)
            {
                CommonTree child = (CommonTree) ast.getChild(i);
                query = walk(child, query, prefixList);
            }
            query = query + " } ";
            break;
        case SparqlParser.SUBJECT:
            for (int i = 0; i < ast.getChildCount(); i++)
            {
                CommonTree child = (CommonTree) ast.getChild(i);
                query = walk(child, query, prefixList);
            }
            break;
        case SparqlParser.TERM_NO_PREFIX:
            // query = query + " <" + ast.getChild(0) + "> ";
            query = query + ast.getChild(0);
            break;
        case SparqlParser.PREFIX:
            String prefix = "";
            prefix = ast.getChild(0).getText();
            String term = ast.getChild(0).getText();
            term = term.substring(term.lastIndexOf(":") + 1);
            prefix = prefix.substring(0, prefix.lastIndexOf(":"));
            String prefixValue = null;
            for (Prefix prefix2 : prefixList)
            {
                if (prefix2.getPrefixName().equals(prefix))
                {
                    prefixValue = prefix2.getPrefixValue();
                }
            }
            if (prefixValue != null)
            {
                query = query + " <" + prefixValue + term + "> ";
            }
            else if (prefix.equals("bif") & term.equals("contains"))
            {
                query = query + "<" + ast.getChild(0).getText() + ">";
            }
            break;
        case SparqlParser.PROPERTY_LIST:
            for (int i = 0; i < ast.getChildCount(); i++)
            {
                CommonTree child = (CommonTree) ast.getChild(i);
                query = walk(child, query, prefixList);
            }
            break;
        // case SparqlParser.PROPERTY:
        // for (int i = 0; i < ast.getChildCount(); i++)
        // {
        // CommonTree child = (CommonTree) ast.getChild(i);
        // query = walk(child, query, prefixList);
        // }
        // break;
        case SparqlParser.PATH:
            for (int i = 0; i < ast.getChildCount(); i++)
            {
                query = walk((CommonTree) ast.getChild(i), query, prefixList);
            }
            break;
        case SparqlParser.PATH_ELT_OR_INVERSE:
            query = walk((CommonTree) ast.getChild(0), query, prefixList);
            break;
        case SparqlParser.PATH_SEQUENCE:
            query = walk((CommonTree) ast.getChild(0), query, prefixList);
            break;
        case SparqlParser.PATH_PRIMARY:
            query = walk((CommonTree) ast.getChild(0), query, prefixList);
            break;
        case SparqlParser.PREDICATE:
            if (ast.getChild(0).getText().equals("a"))
            {
                query = query
                        + " <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ";
            }
            else
            {
                query = walk((CommonTree) ast.getChild(0), query, prefixList);
            }

            if (ast.getChildCount() > 1)
            {
                query = walk((CommonTree) ast.getChild(1), query, prefixList);
            }
            break;
        case SparqlParser.TERM:
            if (ast.getChild(0).getType() == SparqlParser.TERM_NO_PREFIX)
            {
                // query = query + " <" + ast.getChild(0).getChild(0).getText()
                // + "> ";
                query = query + " " + ast.getChild(0).getChild(0).getText()
                        + " ";
            }
            else if (ast.getChild(0).getType() == SparqlParser.PREFIX)
            {
                query = walk((CommonTree) ast.getChild(0), query, prefixList);
            }
            else
            {
                query = query + " " + ast.getChild(0).getText() + " ";
                if (ast.getChildCount() > 1)
                {
                    if (ast.getChild(1).getType() == SparqlParser.REFERENCE)
                    {
                        query = query
                                + ast.getChild(1).getText()
                                + walk((CommonTree) ast.getChild(2), "",
                                        prefixList);
                    }
                }
            }
            break;
        case SparqlParser.VAR:
            query = query + " " + ast.getChild(0).getText() + " ";
            break;
        case SparqlParser.OBJECT:
            for (int i = 0; i < ast.getChildCount(); i++)
            {
                CommonTree child = (CommonTree) ast.getChild(i);
                query = walk(child, query, prefixList);
            }
            break;
        case SparqlParser.FILTER:
            if (ast.getChild(0).getType() == SparqlParser.CALL)
            {
                query = walk((CommonTree) ast.getChild(0), query, prefixList);
            }
            else if (ast.getChild(0).getType() == SparqlParser.EXPRESSION)
            {
                // Process bracketted expression

            }
            else if (ast.getChild(0).getType() == SparqlParser.FUNCTION)
            {
                query = walk((CommonTree) ast.getChild(0), query, prefixList);
            }
            query = query + "FILTER("
                    + walk((CommonTree) ast.getChild(0), "", prefixList) + ")";
            break;
        case SparqlParser.EXPRESSION:
            query = walk((CommonTree) ast.getChild(0), query, prefixList);
            break;
        case SparqlParser.BRACKETTED_EXPRESSION:
            query = query
                    + walk((CommonTree) ast.getChild(0), query, prefixList);
            // if (ast.getChild(0).getType() == SparqlParser.AND)
            // {
            // // relational expression
            // query = query
            // + walk((CommonTree) ast.getChild(0).getChild(0), "",
            // prefixList);
            // }
            // else if (ast.getChild(0).getType() == SparqlParser.OR)
            // {
            // // relational expression
            // CommonTree child = (CommonTree) ast.getChild(0);
            // query = query
            // + walk((CommonTree) child.getChild(0), "", prefixList)
            // + " || "
            // + walk((CommonTree) child.getChild(1), "", prefixList);
            // }
            // else if (ast.getChild(0).getType() == SparqlParser.UNARY)
            // {
            // // unary expression
            // CommonTree child = (CommonTree) ast.getChild(0);
            // for (int i = 0; i < child.getChildCount(); i++)
            // {
            // query = query
            // + walk((CommonTree) child.getChild(i), "",
            // prefixList);
            // }
            // }
            // else
            // {
            // query = query
            // + walk((CommonTree) ast.getChild(0), query, prefixList);
            // }
            // if (ast.getChildCount() > 1)
            // {
            // int numChild = 0;
            // while (numChild < ast.getChildCount())
            // {
            // if (ast.getChild(numChild).getType() == SparqlParser.AND)
            // {
            // query = query + " && ";
            // }
            // else if (ast.getChild(numChild).getType() ==
            // SparqlParser.RELATIONALEXPRESSION)
            // {
            // query = walk((CommonTree) ast.getChild(numChild),
            // query, prefixList);
            // }
            // else
            // {
            // query = query
            // + ((CommonTree) ast.getChild(numChild))
            // .getText();
            // }
            // numChild++;
            // }
            // }
            // else
            // {
            // query = query
            // + walk((CommonTree) ast.getChild(0), query, prefixList);
            // }
            break;
        case SparqlParser.UNARY:
            // unary expression
            CommonTree child = (CommonTree) ast.getChild(0);
            for (int i = 0; i < ast.getChildCount(); i++)
            {
                query = query
                        + walk((CommonTree) ast.getChild(i), "", prefixList);
            }
            break;
        case SparqlParser.SOLUTION_MODIFIER:
            query = walk((CommonTree) ast.getChild(0), query, prefixList);
            break;
        case SparqlParser.ORDER_BY:
            query = walk((CommonTree) ast.getChild(0), query, prefixList);
            break;
        case SparqlParser.ORDER_CONDITION:
            if (((CommonTree) ast.getChild(0)).getType() == SparqlParser.ASC)
            {
                query = query + "ASC ?"
                        + ((CommonTree) ast.getChild(1)).getChild(0).getText();
            }
            else if (((CommonTree) ast.getChild(0)).getType() == SparqlParser.DESC)
            {
                query = query + "DESC ?"
                        + ((CommonTree) ast.getChild(1)).getChild(0).getText();
            }
            else
            {
                query = query + ((CommonTree) ast.getChild(0)).getText();
            }
            break;
        case SparqlParser.BUILTINCALL:
            query = walk((CommonTree) ast.getChild(0), query, prefixList);
            break;
        case SparqlParser.REGEX:
            if (ast.getChildCount() > 2)
            {
                query = query + " regex("
                        + walk((CommonTree) ast.getChild(0), "", prefixList)
                        + ","
                        + walk((CommonTree) ast.getChild(1), "", prefixList)
                        + ","
                        + walk((CommonTree) ast.getChild(2), "", prefixList)
                        + ") ";
            }
            else
            {
                query = query + " regex("
                        + walk((CommonTree) ast.getChild(0), "", prefixList)
                        + ","
                        + walk((CommonTree) ast.getChild(1), "", prefixList)
                        + ") ";
            }
            break;
        case SparqlParser.CALL:
            query = walk((CommonTree) ast.getChild(0), query, prefixList);
            break;
        case SparqlParser.RELATIONALEXPRESSION:
            int numChild = 0;
            String operator = ast.getChild(0).getText();
            ast = (CommonTree) ast.getChild(0);
            String[] operators = new String[2];
            while (numChild < ast.getChildCount())
            {
                if (((CommonTree) ast.getChild(numChild)).getType() == SparqlParser.IRIORREF)
                {
                    query = walk((CommonTree) ast.getChild(numChild), query,
                            prefixList);
                }
                else if (((CommonTree) ast.getChild(numChild)).getType() == SparqlParser.NUMERICLITERAL)
                {
                    query = query
                            + ast.getChild(numChild).getChild(0).getText();
                    // + "^^http://www.w3.org/2001/XMLSchema#integer";
                }
                else if (ast.getChild(numChild).getType() == SparqlParser.BUILTINCALL)
                {
                    query = walk((CommonTree) ast.getChild(numChild), query,
                            prefixList);
                }
                else if (ast.getChild(numChild).getType() == SparqlParser.VAR)
                {
                    query = walk((CommonTree) ast.getChild(numChild), query,
                            prefixList);
                }
                else if (ast.getChild(numChild).getType() == SparqlParser.RDFLITERAL)
                {
                    for (int i = 0; i < ast.getChild(numChild).getChildCount(); i++)
                    {
                        String childText = "";
                        childText = ast.getChild(numChild).getChild(i)
                                .getText();
                        if (childText.equals("PREFIX"))
                        {
                            childText = walk((CommonTree) ast
                                    .getChild(numChild).getChild(i), "",
                                    prefixList);
                        }
                        query = query + childText;
                    }

                }
                else
                {
                    query = query + ast.getChild(numChild).getText();
                }
                operators[numChild] = query;
                numChild++;
            }
            break;
        case SparqlParser.IRIORREF:
            if (ast.getChildCount() > 1)
            {
                query = query
                        + walk((CommonTree) ast.getChild(0), "", prefixList)
                        + "(";
                query = walk((CommonTree) ast.getChild(1), query, prefixList)
                        + ")";
            }
            else
            {
                query = query
                        + walk((CommonTree) ast.getChild(0), "", prefixList);
            }
            break;
        case SparqlParser.LANG:
            query = query + ast.getText() + "("
            // + ast.getChild(0).getChild(0).getChild(0).getText() + ")";
                    + walk((CommonTree) ast.getChild(0), "", prefixList) + ")";
            break;
        case SparqlParser.SEMICOLON:
            query = query + " ; ";
            break;
        case SparqlParser.STR:
            query = query + " str( "
                    + walk((CommonTree) ast.getChild(0), "", prefixList) + ")";
            break;
        case SparqlParser.ISBLANK:
            query = query + " isBlank( "
                    + walk((CommonTree) ast.getChild(0), "", prefixList) + ")";
            break;
        case SparqlParser.BOUND:
            query = query + " bound( "
                    + walk((CommonTree) ast.getChild(0), "", prefixList) + ")";
            break;
        case SparqlParser.ISIRI:
            query = query + " isIRI( "
                    + walk((CommonTree) ast.getChild(0), "", prefixList) + ")";
            break;
        case SparqlParser.ISLITERAL:
            query = query + " isLiteral( "
                    + walk((CommonTree) ast.getChild(0), "", prefixList) + ")";
            break;
        case SparqlParser.DATATYPE:
            query = query + " datatype( "
                    + walk((CommonTree) ast.getChild(0), "", prefixList) + ")";
            break;
        case SparqlParser.LANGMATCHES:
            query = query + " langMatches( "
                    + walk((CommonTree) ast.getChild(0), "", prefixList) + ","
                    + walk((CommonTree) ast.getChild(1), "", prefixList) + ")";
            break;
        case SparqlParser.SAMETERM:
            query = query + " sameTerm( "
                    + walk((CommonTree) ast.getChild(0), "", prefixList) + ")";
            break;
        case SparqlParser.EQUAL:
            query = query + walk((CommonTree) ast.getChild(0), "", prefixList)
                    + " = "
                    + walk((CommonTree) ast.getChild(1), "", prefixList);
            break;
        case SparqlParser.NOT_EQUAL:
            query = query
                    + walk((CommonTree) ast.getChild(0), "", prefixList)
                    + " != "
                    + ((CommonTree) ast.getChild(1).getChild(0)).getChild(0)
                            .getText();
            break;
        case SparqlParser.LESS:
            query = query
                    + walk((CommonTree) ast.getChild(0), "", prefixList)
                    + " < "
                    + ((CommonTree) ast.getChild(1).getChild(0)).getChild(0)
                            .getText();
            break;
        case SparqlParser.GREATER:
            query = query
                    + walk((CommonTree) ast.getChild(0), "", prefixList)
                    + " > "
                    + ((CommonTree) ast.getChild(1).getChild(0)).getChild(0)
                            .getText();
            break;
        case SparqlParser.LESS_EQUAL:
            query = query
                    + walk((CommonTree) ast.getChild(0), "", prefixList)
                    + " <= "
                    + ((CommonTree) ast.getChild(1).getChild(0)).getChild(0)
                            .getText();
            break;
        case SparqlParser.GREATER_EQUAL:
            query = query
                    + walk((CommonTree) ast.getChild(0), "", prefixList)
                    + " >="
                    + ((CommonTree) ast.getChild(1).getChild(0)).getChild(0)
                            .getText();
            break;
        case SparqlParser.IN:
            query = query + " sameTerm( "
                    + walk((CommonTree) ast.getChild(0), "", prefixList) + ")";
            break;
        case SparqlParser.NOT:
            query = query + " sameTerm( "
                    + walk((CommonTree) ast.getChild(0), "", prefixList) + ")";
            break;
        case SparqlParser.NUMERICLITERAL:
            query = query + ast.getChild(0).getText();
            break;
        case SparqlParser.RDFLITERAL:
            if (ast.getChild(0).getChildCount() == 0)
            {
                return ast.getChild(0).getText();
            }
            else
            {
                for (int i = 0; i < ast.getChild(0).getChildCount(); i++)
                {
                    String childText = "";
                    childText = ast.getChild(0).getChild(i).getText();
                    if (childText.equals("PREFIX"))
                    {
                        childText = walk(
                                (CommonTree) ast.getChild(0).getChild(i), "",
                                prefixList);
                    }
                    query = query + childText;
                }
            }
        case SparqlParser.AND:
            query = query + walk((CommonTree) ast.getChild(0), "", prefixList)
                    + " && "
                    + walk((CommonTree) ast.getChild(1), "", prefixList);
            break;
        case SparqlParser.OR:
            query = query + walk((CommonTree) ast.getChild(0), "", prefixList)
                    + " || "
                    + walk((CommonTree) ast.getChild(1), "", prefixList);
            break;
        case SparqlParser.FUNCTION:
            query = query + walk((CommonTree) ast.getChild(0), "", prefixList);
            break;
        case SparqlParser.BOOLEANLITERAL:
            query = ast.getChild(0).getText();
            break;
        default:
            LOG.debug("Default case walking the parse tree: " + ast.getText());
            query = ast.getText();
        }

        return query;
    }

    // public static List<SimpleBasicGraphPattern> getTriplePatterns(
    // CommonTree ast, Map<String, String> prefixMap) throws LQPException
    // {
    // List<CommonTree> triples = new ArrayList<CommonTree>();
    // List<SimpleBasicGraphPattern> listTriples = new
    // ArrayList<SimpleBasicGraphPattern>();
    // SparqlDQPUtil.getTriples(ast, triples);
    // for (CommonTree triple : triples)
    // {
    // SimpleBasicGraphPattern triplePattern = getTriplePattern(triple,
    // prefixMap);
    // listTriples.add(triplePattern);
    // }
    // return listTriples;
    // }

    public static SimpleBasicGraphPattern getTriplePattern(CommonTree triple,
            List<Prefix> prefixList) throws LQPException
    {
        SimpleBasicGraphPattern triplePattern = new SimpleBasicGraphPattern();
        List<String> vars = new ArrayList<String>();
        Map<String, String> mapVars = new HashMap<String, String>();

        // Predicate p = null;
        List<String> terms = new ArrayList<String>();
        Map<String, String> mapTerms = new HashMap<String, String>();
        getVars(triple, vars, mapVars);
        getTerms(triple, terms, mapTerms, prefixList, "");
        for (String key : mapTerms.keySet())
        {
            String term = mapTerms.get(key);
            if (term.equals("PREDICATE"))
            {
                triplePattern.setPredicate("<" + key + ">");
            }
            else if (term.equals("SUBJECT"))
            {
                triplePattern.setSubject("<" + key + ">");
            }
            else if (term.equals("OBJECT"))
            {
                triplePattern.setObject("<" + key + ">");
            }
        }
        for (String key : mapVars.keySet())
        {
            String var = mapVars.get(key);
            if (var.equals("PREDICATE"))
            {
                triplePattern.setPredicate("?" + key);
            }
            else if (var.equals("SUBJECT"))
            {
                triplePattern.setSubject("?" + key);
            }
            else if (var.equals("OBJECT"))
            {
                triplePattern.setObject("?" + key);
            }
        }
        return triplePattern;
    }

    public static List<Prefix> getPrefixes(CommonTree ast) throws LQPException
    {
        String prefix[];
        List<Prefix> prefixes = new ArrayList<Prefix>();
        Prefix p;

        for (int i = 0; i < ast.getChildCount(); i++)
        {
            CommonTree child = (CommonTree) ast.getChild(i);
            String childText = child.getText();

            if (child.getType() == SparqlParser.PREFIX)
            {
                for (int j = 0; j < child.getChildCount(); j = j + 2)
                {
                    prefix = new String[2];
                    prefix[0] = child
                            .getChild(j)
                            .getText()
                            .substring(0,
                                    child.getChild(j).getText().length() - 1);
                    prefix[1] = child
                            .getChild(j + 1)
                            .getText()
                            .substring(
                                    1,
                                    child.getChild(j + 1).getText().length() - 1);
                    p = new PrefixImpl();
                    p.setPrefix(prefix);
                    prefixes.add(p);
                }

            }
            else
            {
                // prefixMap = getPrefixes(child);
                throw new LQPException("UNEXPECTED TOKEN: " + childText);
            }
        }

        return prefixes;
    }

    /**
     * @param ast
     * @return the data sources used in the query
     */
    public static List<Dataset> getDataSources(CommonTree ast)
    {
        List<Dataset> datasetList = new ArrayList<Dataset>();
        Dataset d = new DatasetImpl();

        CommonTree child = (CommonTree) ast.getChild(0);
        String childText = child.getText();
        d.setDatasetName(childText);
        datasetList.add(d);
        // String child2Text = child.getChild(0).getText();
        // dataSourcesMap.put(child2Text.substring(0, child2Text.indexOf(':')),
        // childText);

        return datasetList;

    }

    /**
     * Build buildSelectVariables.
     * 
     * @param ast
     * @return a list of attributes containing the variables to Select in the
     *         query
     * @throws LQPException
     * 
     *             Here we have the list of variables in the SPARQL SELECT
     *             clause
     * @throws ExpressionException
     * 
     */
    public static List<Attribute> buildSelectVariables(CommonTree ast)
            throws LQPException, ExpressionException
    {
        List<Attribute> selectVars = new ArrayList<>();

        for (int i = 0; i < ast.getChildCount(); i++)
        {
            if (!(ast.getChild(i).getType() == SparqlParser.DISTINCT))
            {
                selectVars.add(new AttributeImpl(ast.getChild(i).getText()
                        .replaceAll("\\?", ""), TupleTypes._STRING));
            }
        }

        return selectVars;
    }

    /*
     * returns the opQ's Strongly Bound variables
     */
    public static List<Attribute> getStronglyBoundVariables(Operator opQ)
    {
        List<Attribute> leftChildVars = null;
        List<Attribute> rightChildVars = null;
        List<Attribute> sbVars = null;
        sbVars = new ArrayList<>();
        if (opQ.getID().toString().equals("RDF_DATABASE_SCAN"))
        {
            return opQ.getHeading().getAttributes();
        }
        else if (opQ.getID().toString().equals("PROJECT"))
        {
            return getStronglyBoundVariables(opQ.getChild(0));
        }
        else if (opQ.getID().toString().equals("RENAME"))
        {
            return getStronglyBoundVariables(opQ.getChild(0));
        }
        else if (opQ.getID().toString().equals("INNER_THETA_JOIN"))
        {
            leftChildVars = opQ.getChild(0).getHeading().getAttributes();
            sbVars.addAll(leftChildVars);
            rightChildVars = opQ.getChild(1).getHeading().getAttributes();
            for (Attribute attribute : rightChildVars)
            {
                if (!leftChildVars.contains(attribute))
                {
                    sbVars.add(attribute);
                }
            }
        }
        else if (opQ.getID().toString().equals("SPARQL_UNION"))
        {
            leftChildVars = opQ.getChild(0).getHeading().getAttributes();
            rightChildVars = opQ.getChild(1).getHeading().getAttributes();
            List<Attribute> tmpList = null;
            tmpList = new ArrayList<>();
            Iterator it = SparqlDQPUtil.getCommonVariables(leftChildVars,
                    rightChildVars).iterator();
            while (it.hasNext())
            {
                tmpList.add((Attribute) it.next());
            }
            return tmpList;
        }
        else if (opQ.getID().toString().equals("LEFT_OUTER_JOIN"))
        {
            sbVars = opQ.getChild(0).getHeading().getAttributes();
        }
        else if (opQ.getID().toString().equals("SELECT"))
        {
            sbVars = opQ.getChild(0).getHeading().getAttributes();
        }
        return sbVars;
    }

    public static boolean hasAttribute(List<Attribute> attributesOp1,
            Attribute attribute2)
    {
        for (Attribute attribute1 : attributesOp1)
        {
            if (attribute1.getName().equals(attribute2.getName()))
            {
                return true;
            }
        }
        return false;
    }

    public static Set<Attribute> getServiceVariable(
            List<Attribute> scanAttributes, Attribute serviceVarAttribute)
    {
        Set<Attribute> tmpList = null;
        tmpList = new HashSet<Attribute>();
        for (Attribute attribute : scanAttributes)
        {
            if (attribute.getName().equals(serviceVarAttribute.getName()))
            {
                tmpList.add(attribute);
                return tmpList;
            }
        }
        return tmpList;

    }

    public static String[] processRegex(String filterExpression)
            throws SPARQLParserException
    {
        String[] regex_parameters = new String[3];
        CommonTree filterAst = SimpleSparqlQueryParser.getInstance()
                .parseRegexString(filterExpression.trim());
        if (filterAst.getChildCount() > 2)
        {
            regex_parameters[0] = filterAst.getChild(0).getChild(0).getText();
            regex_parameters[1] = filterAst.getChild(1).getChild(0).getText();
            regex_parameters[2] = filterAst.getChild(2).getChild(0).getText();
        }
        else
        {
            regex_parameters[0] = filterAst.getChild(0).getChild(0).getText();
            regex_parameters[1] = filterAst.getChild(1).getChild(0).getText();
        }

        return regex_parameters;
    }
}

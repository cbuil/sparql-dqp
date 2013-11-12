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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.tree.CommonTree;

import es.upm.fi.dia.oeg.ogsadai.sparql.parser.antlr.SparqlParser;

import uk.org.ogsadai.dqp.lqp.exceptions.LQPException;
import uk.org.ogsadai.dqp.lqp.udf.repository.NoSuchFunctionException;
import uk.org.ogsadai.expression.arithmetic.ArithmeticExpression;
import uk.org.ogsadai.expression.arithmetic.ArithmeticExpressionFactory;
import uk.org.ogsadai.expression.arithmetic.ExpressionException;
import uk.org.ogsadai.parser.SQLParserException;

/**
 * Utility class for processing abstract syntax trees.
 * 
 * @author The OGSA-DAI Project Team, Carlos Buil-Aranda, Oscar Corcho
 * @email cbuil@fi.upm.es, ocorcho@fi.upm.es
 * @institution Universidad Politecnica de Madrid
 * 
 */
public class ASTUtil
{
    /** Copyright notice. */
    private static final String COPYRIGHT_NOTICE = 
        "Copyright (c) The University of Edinburgh, 2008";

    // These Token objects below as used just now in place of constants for
    // these tokens.  When we have constants in ASTConstants for these tokens
    // then the constants should be used instead.

    /** AND token. */
    private static CommonToken mAndToken = null;
    /** OR token. */
    private static CommonToken mOrToken = null;
    /** = token. */
    private static CommonToken mEqualsToken = null;
    /** >= token. */
    private static CommonToken mGreaterThanEqualsToken = null;
    /** > token. */
    private static CommonToken mGreaterThanToken = null;
    /** < token. */
    private static CommonToken mLessThanEqualsToken = null;
    /** <= token */
    private static CommonToken mLessThanToken = null;
    /** literal token */
    private static CommonToken mLiteralToken = null;
    
    public static CommonTree getPredicateFromBGP(CommonTree basicGraphPattern)
    {
        CommonTree predicate = null;
        for (int i = 0; i < basicGraphPattern.getChildCount(); i++)
        {
            CommonTree child = (CommonTree) basicGraphPattern.getChild(i);

            if (child.getChild(0).getType() == SparqlParser.PREFIX)
            {
                
            }
            if(child.getType() != SparqlParser.PREDICATE){
                predicate = getPredicateFromBGP(child);
            }
            else {
                predicate = (CommonTree) child.getChild(0);
                return predicate;
            }
            i++;
        }
//        if(basicGraphPattern.getChild(0).getType() != SparqlParser.PREDICATE){
//            predicate = getPredicateFromBGP((CommonTree) basicGraphPattern.getChild(0));
//        }
//        else {
//            predicate = (CommonTree) basicGraphPattern.getChild(0);
//            return predicate;
//        }
        return predicate;
    }
    
    /**
     * Gets the table name from a TABLECOLUMN node.
     * 
     * @param tableColumnNode TABLECOLUMN node
     * 
     * @return the table name with dots to separate the components of the
     *         name if there are multiple components, for example 
     *         <tt>"a.b"</tt>.
     */
    public static String getTableColumnName(CommonTree tableColumnNode)
    {
        if (tableColumnNode.getText().equals("TABLECOLUMN"))
        {
            StringBuffer sb = new StringBuffer();
            for (int i=0; i<tableColumnNode.getChildCount(); ++i)
            {
                if (i>0)
                {
                    sb.append(".");
                }
                sb.append(tableColumnNode.getChild(i).getText());
            }
            return sb.toString();
        }
        return null;
    }
    
    /**
     * Creates a new literal node containing the given text.
     * 
     * @param text text the literal node should contain
     * 
     * @return new literal node
     */
//    public static synchronized CommonTree getLiteralNode(String text)
//    {
//        if (mLiteralToken == null)
//        {
//            String condition = "x=2";
//            try
//            {
//                CommonTree literal = (CommonTree) SPARQLQueryParser.getInstance().
//                    parseSPARQLForCondition(condition).getChild(1);
//               
//                mLiteralToken = (CommonToken) literal.getToken();
//            }
//            catch (SQLParserException e)
//            {
//                // Should not occur
//            }
//        }
//        return new CommonTree(new CommonToken(mLiteralToken.getType(), text));
//    }
//    
    /**
     * Gets a new greater than or equals (>=) node.
     * 
     * @param lhsChild left hand side child
     * @param rhsChild right hand side child
     * 
     * @return new greater than or equals node containing the given children.
     */
//    public static synchronized CommonTree getGreaterThanEqualsNode(
//        CommonTree lhsChild,
//        CommonTree rhsChild)
//    {
//        if (mGreaterThanEqualsToken == null)
//        {
//            String condition = "x>=y";
//            try
//            {
//                mGreaterThanEqualsToken = (CommonToken) SPARQLQueryParser.
//                    getInstance().parseSQLForCondition(condition).getToken();
//            }
//            catch (SQLParserException e)
//            {
//                // Should not occur
//                throw new RuntimeException(
//                    "Failed to parse " + condition + " : should not happen", e);
//            }
//        }
//        CommonTree result = new CommonTree(mGreaterThanEqualsToken);
//        result.addChild(lhsChild);
//        result.addChild(rhsChild);
//        return result;
//    }

    /**
     * Gets a new greater than (>) node.
     * 
     * @param lhsChild left hand side child
     * @param rhsChild right hand side child
     * 
     * @return new greater than node containing the given children.
     */
//    public static synchronized CommonTree getGreaterThanNode(
//        CommonTree lhsChild,
//        CommonTree rhsChild)
//    {
//        if (mGreaterThanToken == null)
//        {
//            String condition = "x>y";
//            try
//            {
//                mGreaterThanToken = (CommonToken) SPARQLQueryParser.
//                    getInstance().parseSQLForCondition(condition).getToken();
//            }
//            catch (SQLParserException e)
//            {
//                // Should not occur
//                throw new RuntimeException(
//                    "Failed to parse " + condition + " : should not happen", e);
//            }
//        }
//        CommonTree result = new CommonTree(mGreaterThanToken);
//        result.addChild(lhsChild);
//        result.addChild(rhsChild);
//        return result;
//    }
    
    /**
     * Gets a new less than or equals (<=) node.
     * 
     * @param lhsChild left hand side child
     * @param rhsChild right hand side child
     * 
     * @return new less than or equals node containing the given children.
     */
//    public static synchronized CommonTree getLessThanEqualsNode(
//        CommonTree lhsChild,
//        CommonTree rhsChild)
//    {
//        if (mLessThanEqualsToken == null)
//        {
//            String condition = "x<=y";
//            try
//            {
//                mLessThanEqualsToken = (CommonToken) SPARQLQueryParser.
//                    getInstance().parseSQLForCondition(condition).getToken();
//            }
//            catch (SQLParserException e)
//            {
//                // Should not occur
//                throw new RuntimeException(
//                    "Failed to parse " + condition + " : should not happen", e);
//            }
//        }
//        CommonTree result = new CommonTree(mLessThanEqualsToken);
//        result.addChild(lhsChild);
//        result.addChild(rhsChild);
//        return result;
//    }

    /**
     * Gets a new less than (<) node.
     * 
     * @param lhsChild left hand side child
     * @param rhsChild right hand side child
     * 
     * @return new less than node containing the given children.
     */
//    public static synchronized CommonTree getLessThanNode(
//        CommonTree lhsChild,
//        CommonTree rhsChild)
//    {
//        if (mLessThanToken == null)
//        {
//            String condition = "x<y";
//            try
//            {
//                mLessThanToken = (CommonToken) SPARQLQueryParser.
//                    getInstance().parseSQLForCondition(condition).getToken();
//            }
//            catch (SQLParserException e)
//            {
//                // Should not occur
//                throw new RuntimeException(
//                    "Failed to parse " + condition + " : should not happen", e);
//            }
//        }
//        CommonTree result = new CommonTree(mLessThanToken);
//        result.addChild(lhsChild);
//        result.addChild(rhsChild);
//        return result;
//    }    
    
    /**
     * Gets a new equals (=) node.
     * 
     * @param lhsChild left hand side child
     * @param rhsChild right hand side child
     * 
     * @return new equals node containing the given children.
     */
//    public static synchronized CommonTree getEqualsNode(
//        CommonTree lhsChild,
//        CommonTree rhsChild)
//    {
//        if (mEqualsToken == null)
//        {
//            String condition = "x=y";
//            try
//            {
//                mEqualsToken = (CommonToken) SPARQLQueryParser.getInstance().
//                    parseSQLForCondition(condition).getToken();
//            }
//            catch (SQLParserException e)
//            {
//                // Should not occur
//                throw new RuntimeException(
//                    "Failed to parse " + condition + " : should not happen", e);
//            }
//        }
//        CommonTree result = new CommonTree(mEqualsToken);
//        result.addChild(lhsChild);
//        result.addChild(rhsChild);
//        return result;
//    }
    
    
    /**
     * Gets a new AND node with no children.
     * 
     * @return a new AND node.  
     */
//    public static synchronized CommonTree getAndNode()
//    {
//        if (mAndToken == null)
//        {
//            String condition = "x=y AND a=b";
//            try
//            {
//                mAndToken = (CommonToken) SPARQLQueryParser.getInstance().
//                    parseSQLForCondition(condition).getToken();
//            }
//            catch (SQLParserException e)
//            {
//                // Should not occur
//                throw new RuntimeException(
//                    "Failed to parse " + condition + " : should not happen", e);
//            }
//        }
//        return new CommonTree(mAndToken);
//    }
    
    /**
     * Creates a new AND node.
     * 
     * @param lhsChild left hand size child
     * @param rhsChild right hand size child
     * 
     * @return a new AND node with the specified children.
     */
//    public static CommonTree getAndNode(
//        CommonTree lhsChild,
//        CommonTree rhsChild)
//    {
//        CommonTree result = getAndNode();
//        result.addChild(lhsChild);
//        result.addChild(rhsChild);
//        return result;
//    }

    /**
     * Gets a new OR node with no children.
     * 
     * @return a new OR node, caller should add two children.
     */
//    public static synchronized CommonTree getOrNode()
//    {
//        if (mOrToken == null)
//        {
//            String condition = "x=y OR a=b";
//            try
//            {
//                mOrToken = (CommonToken) SPARQLQueryParser.getInstance().
//                    parseSQLForCondition(condition).getToken();
//            }
//            catch (SQLParserException e)
//            {
//                // Should not occur
//                throw new RuntimeException(
//                    "Failed to parse " + condition + " : should not happen", e);
//            }
//        }
//        return new CommonTree(mOrToken);
//    }
    
    /**
     * Gets a new OR node.
     * 
     * @param lhsChild left hand size child
     * @param rhsChild right hand size child
     * 
     * @return a new OR node with the specified children.
     */
//    public static CommonTree getOrNode(
//        CommonTree lhsChild,
//        CommonTree rhsChild)
//    {
//        CommonTree result = getOrNode();
//        result.addChild(lhsChild);
//        result.addChild(rhsChild);
//        return result;
//    }

    /**
     * Gets a new where node with no children.
     * 
     * @return a new where node.
     */
    public static CommonTree getWhereNode()
    {
        return new CommonTree(
            new CommonToken(SparqlParser.WHERE, ASTConstants.WHERE_TOKEN));
    }
    
    /**
     * Is the given node a where node.
     * 
     * @param node node to check
     * 
     * @return <tt>true</tt> if the node is a where node, <tt>false</tt> 
     *         otherwise.
     */
    public static boolean isWhereNode(CommonTree node)
    {
        return node.getText().equals(ASTConstants.WHERE_TOKEN);
    }
    
    /**
     * Is the given node an AND node.
     * 
     * @param node node to check
     * 
     * @return <tt>true</tt> if the node is an AND node, <tt>false</tt> 
     *         otherwise.
     */
    public static boolean isAndNode(CommonTree node)
    {
        return node.getText().equals(ASTConstants.AND_TOKEN);
    }
    
    /**
     * Is the given node an OR node.
     * 
     * @param node node to check
     * 
     * @return <tt>true</tt> if the node is an OR node, <tt>false</tt> 
     *         otherwise.
     */
    public static boolean isOrNode(CommonTree node)
    {
        return node.getText().equals(ASTConstants.OR_TOKEN);
    }
    
    public static Map<String, CommonTree> getQueryStructure(CommonTree queryAST)
    {
        Map<String, CommonTree> queryStructure = new HashMap<String, CommonTree>();

        for (int i = 0; i < queryAST.getChildCount(); i++)
        {
            CommonTree child = (CommonTree) queryAST.getChild(i);
            queryStructure.put(child.getText(), child);
        }

        return queryStructure;
    }

    public static boolean containsSubqueries(CommonTree ast)
    {
        for (int i = 0; i < ast.getChildCount(); i++)
        {
            CommonTree child = (CommonTree) ast.getChild(i);

            // We are interested in the top level query only.
            if (child.getText().equals(ASTConstants.QUERY_TOKEN))
            {
                return true;
            }
            else
            {
                return containsSubqueries(child);
            }
        }
        return false;
    }

//    public static void getAttributes(CommonTree ast, List<Attribute> attributes)
//    {
//        if (ast.getText().equals(ASTConstants.TABLECOLUMN_TOKEN))
//        {
//            attributes.add(getAttribute(ast));
//        }
//        else
//        {
//            for (int i = 0; i < ast.getChildCount(); i++)
//            {
//                CommonTree child = (CommonTree) ast.getChild(i);
//                getAttributes(child, attributes);
//            }
//        }
//    }
//
//    private static Attribute getAttribute(CommonTree tablecolumnAST)
//    {
//        Attribute attr;
//        if (tablecolumnAST.getChildCount() > 1)
//        {
//            // TODO set the type?
//            attr = new AttributeImpl(tablecolumnAST.getChild(1).getText(), -1,
//                tablecolumnAST.getChild(0).getText());
//        }
//        else
//        {
//            // TODO set the type?
//            attr = new AttributeImpl(tablecolumnAST.getChild(0).getText(), -1,
//                null);
//        }
//        return attr;
//    }

//    public static void renameAttributes(CommonTree ast,
//        Map<Attribute, Attribute> fromToMap)
//    {
//        List<CommonTree> tableColumnASTs = new ArrayList<CommonTree>();
//        ASTUtil.getTableColumnASTs(ast, tableColumnASTs);
//        
//        TreeAdaptor adaptor = new CommonTreeAdaptor();
//        for (CommonTree columnAST : tableColumnASTs)
//        {
//            Attribute columnAttribute;
//            if (columnAST.getChildCount() == 2)
//            {
//                columnAttribute = new AttributeImpl(columnAST.getChild(1)
//                    .getText(), -1, columnAST.getChild(0).getText());
//            }
//            else
//            {
//                columnAttribute = new AttributeImpl(columnAST.getChild(0)
//                    .getText());
//            }
//
//            Attribute renameAttribute = fromToMap.get(columnAttribute);
//
//            if (renameAttribute != null)
//            {
//                if (columnAST.getChildCount() == 2)
//                {
//                    columnAST.deleteChild(1);
//                    columnAST.deleteChild(0);
//                }
//                else
//                {
//                    columnAST.deleteChild(0);
//                }
//
//                if (renameAttribute.getSource() != null)
//                {
//                    columnAST.addChild((CommonTree) adaptor.create(
//                    		SparqlParser.ID, renameAttribute.getSource()));
//                }
//                columnAST.addChild((CommonTree) adaptor.create(
//                		SparqlParser.ID, renameAttribute.getName()));
//            }
//        }
//    }
//
//    public static void getTableColumnASTs(CommonTree ast,
//        List<CommonTree> tableColumnASTs)
//    {
//        // Check if the ast is a TABLECOLUMN
//        if(ast.getText().equals(ASTConstants.TABLECOLUMN_TOKEN))
//        {
//            tableColumnASTs.add(ast);
//        }
//        else
//        {
//            List<TableColumnParent> tableColumnParentList = new ArrayList<TableColumnParent>();
//            getTableColumnParents(ast, tableColumnParentList);
//    
//            for (TableColumnParent tcp : tableColumnParentList)
//            {
//                tableColumnASTs.add(tcp.getTableColumnAST());
//            }
//        }
//    }
//
//    private static void getTableColumnParents(CommonTree ast,
//        List<TableColumnParent> tablecolumnParentList)
//    {
//        CommonTree child;
//        for (int i = 0; i < ast.getChildCount(); i++)
//        {
//            child = (CommonTree) ast.getChild(i);
//            if (child.getText().equals(ASTConstants.TABLECOLUMN_TOKEN))
//            {
//                tablecolumnParentList.add(new TableColumnParent(i, ast));
//            }
//            else
//            {
//                getTableColumnParents(child, tablecolumnParentList);
//            }
//        }
//    }

    /**
     * 
     * @author The OGSA-DAI Project Team.
     */
    private static class TableColumnParent
    {
        /** Copyright notice. */
        private static final String COPYRIGHT_NOTICE = "Copyright (c) The University of Edinburgh, 2008";

        int mTableColumnIdx;
        CommonTree mParentAST;

        /**
         * Constructor.
         * 
         * @param tableColumnIdx
         * @param partentAST
         */
        public TableColumnParent(int tableColumnIdx, CommonTree partentAST)
        {
            mTableColumnIdx = tableColumnIdx;
            mParentAST = partentAST;
        }

        /**
         * 
         * @return
         */
        public CommonTree getTableColumnAST()
        {
            return (CommonTree) mParentAST.getChild(mTableColumnIdx);
        }
    }

    /**
     * Extracts aggregate functions. (FUNCTION) branches of the AST are replaced
     * by (TABLECOLUMN bindingID) branches, where bindingID is automatically
     * generated, unique ID.
     * 
     * User provided list is populated with Function objects representing
     * extracted aggregates. Each function object stores associated bindingID.
     * 
     * @param ast
     *            ast - usually WHERE or SELECT_LIST branches.
     * @param aggregates
     *            a List to be populated with Function objects.
     * @throws ExpressionException
     *             when there were problems with parsing parameter list.
     * @throws NoSuchFunctionException
     */
//    public static void extractAggregates(CommonTree ast,
//        List<Function> aggregates, FunctionRepository functionRepository)
//        throws ExpressionException, NoSuchFunctionException
//    {
//        for (int i = 0; i < ast.getChildCount(); i++)
//        {
//            CommonTree child = (CommonTree) ast.getChild(i);
//
//            // We are interested in the top level query only.
//            if (child.getText().equals(ASTConstants.FUNCTION_TOKEN))
//            {
//                // Get function name and retrieve function object.
//                Function function = functionRepository
//                    .getFunctionInstanceByName(extractFunctionName(child));
//                function.initialiseExpr(extractParameters(child, 1));
//
//                if (function.getType() == FunctionType.SQL_AGGREGATE
//                    || function.getType() == FunctionType.UDF_AGGREGATE)
//                {
//                    // Check if function already exists
//                    Function existingAggregate = null;
//                    for (Function f : aggregates)
//                    {
//                        if (function.equals(f))
//                        {
//                            existingAggregate = f;
//                        }
//                    }
//                    // If it does not then generate new bindingID and add new
//                    // function
//                    if (existingAggregate == null)
//                    {
//                        function.addAnnotation(Annotation.RESULT_BIND_NAME,
//                            LQPBuilder.getNextID());
//                        aggregates.add(function);
//                    }
//                    else
//                    {
//                        function = existingAggregate;
//                    }
//
//                    TreeAdaptor adaptor = new CommonTreeAdaptor();
//                    CommonTree tableColumn = (CommonTree) adaptor
//                        .create(
//                        		SparqlParser.TABLECOLUMN,
//                        		SparqlParser.tokenNames[SparqlParser.TABLECOLUMN]);
//                    tableColumn.addChild((CommonTree) adaptor.create(
//                    		SparqlParser.ID, (String) function
//                            .getAnnotation(Annotation.RESULT_BIND_NAME)));
//                    ast.setChild(i, tableColumn);
//                }
//            }
//            // Skip sub queries
//            else if (!child.getText().equals(ASTConstants.QUERY_TOKEN))
//            {
//                extractAggregates(child, aggregates, functionRepository);
//            }
//        }
//    }

    public static boolean containsFunctions(CommonTree ast)
    {
        if(ast == null)
        {
            return false;
        }
        
        if(ast.getText().equals(ASTConstants.FUNCTION_TOKEN))
        {
            return true;
        }
        else
        {
            for(int i=0; i<ast.getChildCount(); i++)
            {
                containsFunctions((CommonTree) ast.getChild(i));
            }
        }
        return false;
    }
    
//    public static void extractSelectSubqueries(CommonTree ast,
//        Map<String, CommonTree> subqueries)
//    {
//        for (int i = 0; i < ast.getChildCount(); i++)
//        {
//            CommonTree child = (CommonTree) ast.getChild(i);
//
//            if (child.getText().equals(ASTConstants.QUERY_TOKEN))
//            {
//                // Assign variable name and modify AST
//                String bindingID = LQPBuilder.getNextID();
//
//                TreeAdaptor adaptor = new CommonTreeAdaptor();
//                CommonTree tableColumn = (CommonTree) adaptor.create(
//                		SparqlParser.TABLECOLUMN,
//                    SparqlParser.tokenNames[SparqlParser.TABLECOLUMN]);
//                tableColumn.addChild((CommonTree) adaptor.create(
//                		SparqlParser.ID, bindingID));
//                ast.setChild(i, tableColumn);
//
//                subqueries.put(bindingID, child);
//            }
//            else
//            {
//                extractSelectSubqueries(child, subqueries);
//            }
//        }
//    }

    public static void extractRelations(CommonTree astWithRelationChildren,
        List<CommonTree> relationASTs)
    {
        for (int i = 0; i < astWithRelationChildren.getChildCount(); i++)
        {
            CommonTree child = (CommonTree) astWithRelationChildren.getChild(i);
            if (child.getText().equals(ASTConstants.RELATION_TOKEN))
                relationASTs.add(child);
        }
    }

//    public static void extractExistentialPredicates(CommonTree ast,
//        List<CommonTree> existPredASTs)
//    {
//        for (int i = 0; i < ast.getChildCount(); i++)
//        {
//            CommonTree child = (CommonTree) ast.getChild(i);
//
//            if (child.getText().equals(ASTConstants.NOT_TOKEN))
//            {
//                CommonTree notChild = (CommonTree) child.getChild(0);
//
//                if (notChild.getText().equals(ASTConstants.NOT_TOKEN))
//                {
//                    // We have double negation NOT(NOT p) -> p
//                    ast.setChild(i, (CommonTree) notChild.getChild(0));
//                    // We still need to parse the collapsed branch
//                    i--;
//                }
//                else if (notChild.getText().equals(ASTConstants.EXISTS_TOKEN))
//                {
//                    // We have NOT EXISTS
//                    existPredASTs.add(child);
//                    ast.setChild(i, getTrueAST());
//                }
//            }
//            else if (child.getText().equals(ASTConstants.EXISTS_TOKEN))
//            {
//                // We have EXISTS
//                existPredASTs.add(child);
//                ast.setChild(i, getTrueAST());
//            }
//            else if (!child.getText().equals(ASTConstants.QUERY_TOKEN))
//            {
//                extractExistentialPredicates(child, existPredASTs);
//            }
//        }
//    }

    /**
     * TODO: Change when TRUE/FALSE supported.
     * 
     * @return
     */
//    public static CommonTree getTrueAST()
//    {
//        SPARQLQueryParser parser = SPARQLQueryParser.getInstance();
//        try
//        {
//            return parser.parseSPARQLForCondition("1=1");
//        }
//        catch (SQLParserException e)
//        {
//            // IMPOSSIBLE
//            e.printStackTrace();
//            return null;
//        }
//    }

    public static boolean containsIsNullPredicate(CommonTree ast)
    {
        for (int i = 0; i < ast.getChildCount(); i++)
        {
            if (ast.getText().equals(ASTConstants.IS_NULL_TOKEN))
            {
                return true;
            }
            else
            {
                containsIsNullPredicate((CommonTree) ast.getChild(i));
            }
        }
        return false;
    }

    public static void splitConjunction(CommonTree ast,
        List<CommonTree> splitPredicates)
    {
        if (ast.getText().equals(ASTConstants.AND_TOKEN))
        {
            splitConjunction((CommonTree) ast.getChild(0), splitPredicates);
            splitConjunction((CommonTree) ast.getChild(1), splitPredicates);
        }
        else
        {
            splitPredicates.add(ast);
        }
    }

    public static void checkForUnsupportedConditionTokens(CommonTree ast)
        throws LQPException
    {
        String[] unsupportedComparisonTokens = new String[] {
            ASTConstants.ALL_TOKEN, ASTConstants.ANY_TOKEN,
            ASTConstants.IN_TOKEN, ASTConstants.OR_TOKEN };

        for (int i = 0; i < ast.getChildCount(); i++)
        {
            CommonTree child = (CommonTree) ast.getChild(i);
            for (String token : unsupportedComparisonTokens)
            {
                if (child.getText().equals(token))
                    throw new LQPException("Unsupported condition token : "
                        + token);
            }
            checkForUnsupportedConditionTokens(child);
        }
    }

    /**
     * Walks function AST and returns function name.
     * 
     * @param functionAST
     *            function AST
     * @return function name
     */
    public static String extractFunctionName(CommonTree functionAST)
    {
        return functionAST.getChild(0).getText();
    }

    /**
     * Walks function AST and returns a list of string representations for
     * parameters.
     * 
     * TODO: This implementation is a bit hacky - we detect the type of the
     * parameter (value expr/condition) using brute force.
     * 
     * @param functionAST
     * @return
     * @throws SQLParserException
     */
//    public static List<String> extractParameterList(CommonTree functionAST,
//        int startIdx) throws SQLParserException
//    {
//    	SPARQLQueryParser parser = SPARQLQueryParser.getInstance();
//        List<String> parameterList = new ArrayList<String>();
//
//        for (int i = startIdx; i < functionAST.getChildCount(); i++)
//        {
//            CommonTree child = (CommonTree) functionAST.getChild(i);
//            String param = parser.generateSQLForValueExpressionOrStar(child);
//            if (param == null)
//            {
//                param = parser.generateSQLForCondition(child);
//            }
//
//            if (param != null)
//            {
//                parameterList.add(param);
//            }
//            else
//            {
//                throw new SQLParserException(new Exception(
//                    "Parameter AST could not be parsed: "
//                        + child.toStringTree()));
//            }
//        }
//
//        return parameterList;
//    }
    
    public static List<ArithmeticExpression> extractParameters(
        CommonTree functionAST, int startIdx) throws ExpressionException
    {
        List<ArithmeticExpression> parameters = 
            new ArrayList<ArithmeticExpression>();

        for (int i = startIdx; i < functionAST.getChildCount(); i++)
        {
            CommonTree child = (CommonTree) functionAST.getChild(i);
            parameters.add(ArithmeticExpressionFactory
                .buildArithmeticExpression(child, null));
        }
        return parameters;
    }

//    public static void rewriteAttributeASTs(CommonTree astToRewrite,
//        Map<Attribute, CommonTree> rewriteMap)
//    {
//        TreeAdaptor adaptor = new CommonTreeAdaptor();
//
//        List<TableColumnParent> tableColumnParentList = new ArrayList<TableColumnParent>();
//        getTableColumnParents(astToRewrite, tableColumnParentList);
//
//        for (TableColumnParent tcp : tableColumnParentList)
//        {
//            Attribute attr = getAttribute(tcp.getTableColumnAST());
//            CommonTree replacementAST = rewriteMap.get(attr);
//
//            if (replacementAST != null)
//            {
//                // we need keep alias when parent is a COLUMN ast
//                if (tcp.mParentAST.getText().equals(ASTConstants.COLUMN_TOKEN))
//                {
//                    if (tcp.mParentAST.getChildCount() > 1)
//                    {
//                        tcp.mParentAST.setChild(1, (CommonTree) adaptor.create(
//                            SparqlParser.ID, attr.getName()));
//                    }
//                    else
//                    {
//                        tcp.mParentAST.addChild((CommonTree) adaptor.create(
//                        		SparqlParser.ID, attr.getName()));
//                    }
//                }
//                tcp.mParentAST.setChild(tcp.mTableColumnIdx,
//                    (BaseTree) replacementAST.getChild(0).dupTree());
//
//            }
//        }
//    }
}

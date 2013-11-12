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

/**
 * AST constants.
 * 
 * @author The OGSA-DAI Project Team, Carlos Buil-Aranda, Oscar Corcho
 * @email cbuil@fi.upm.es, ocorcho@fi.upm.es
 * @institution Universidad Politecnica de Madrid
 * 
 */
public abstract class ASTConstants
{
    /** Copyright notice. */
    private static final String COPYRIGHT_NOTICE =
            "Copyright (c) The University of Edinburgh, 2008";

    /** Parser tokens */
    public static final String QUERY = "QUERY";
    public static final String PREFIX_DECLARATION = "PREFIX_DECLARATION";
    public static final String PREFIX = "PREFIX";
    public static final String SELECT_QUERY = "SELECT_QUERY";
    public static final String CONSTRUCT_QUERY = "CONSTRUCT_QUERY";
    public static final String DESCRIBE_QUERY = "DESCRIBE_QUERY";
    public static final String ASK_QUERY = "ASK_QUERY";
    public static final String SELECT_LIST = "SELECT_LIST";
    public static final String SOLUTION_MODIFIER = "SOLUTION_MODIFIER";
    public static final String PROLOGUE = "PROLOGUE";
    public static final String DESCRIBE_TOKEN = "DESCRIBE";
    public static final String ASK_TOKEN = "ASK";
    public static final String NAMED_TOKEN = "NAMED";
    public static final String CONSTRUCT_TOKEN = "CONSTRUCT";
    
    public static final String ORDER_BY_TOKEN = "ORDER BY";
    public static final String LIMIT_TOKEN = "LIMIT";
    public static final String OFFSET_TOKEN = "OFFSET";
    
    public static final String OPTIONAL_TOKEN = "OPTIONAL";
    public static final String FILTER_TOKEN = "FILTER";
    public static final String GRAPH_TOKEN = "GRAPH";
    
    public static final String REGEX_TOKEN = "REGEX";
    
    public static final String SELECT_LIST_TOKEN = "selectQuery";
    public static final String FROM_LIST_TOKEN = "FROM";
    public static final String WHERE_TOKEN = "WHERE";
    
    public static final String UNION_TOKEN = "UNION";
    public static final String INTERSECT_TOKEN = "INTERSECT";
    public static final String QUERY_TOKEN = "QUERY";

    public static final String ALL_TOKEN = "ALL";
    public static final String ANY_TOKEN = "ANY";
    public static final String IN_TOKEN = "IN";

    public static final String GROUP_BY_TOKEN = "GROUP_BY";
    
    public static final String DISTINCT_TOKEN = "DISTINCT";
    public static final String RELATION_TOKEN = "RELATION";
    public static final String RIGHT_OUTER_JOIN_TOKEN = "RIGHT_OUTER_JOIN";
    public static final String LEFT_OUTER_JOIN_TOKEN = "LEFT_OUTER_JOIN";
    public static final String FULL_OUTER_JOIN_TOKEN = "FULL_OUTER_JOIN";
    public static final String JOIN_TOKEN = "JOIN";
    public static final String FUNCTION_TOKEN = "FUNCTION";

    
    

    public static final String STAR_TOKEN = "*";
    public static final String NOT_TOKEN = "NOT";
    public static final String EXISTS_TOKEN = "EXISTS";
    
    public static final String IS_NULL_TOKEN = "IS_NULL";
    public static final String AND_TOKEN = "AND";
    public static final String OR_TOKEN = "OR";
    public static final String BINDINGS_TOKEN = "BINDINGS_CLAUSE";
    
    
}

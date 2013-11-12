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

import org.antlr.runtime.tree.CommonTree;

/**
 * This class creates a LQP from a SPARQL 1.1 query. It uses a graph structure
 * to represent the relations between the JOIN operators in the query
 * 
 * @author Carlos Buil-Aranda, Oscar Corcho
 * @email cbuil@fi.upm.es, ocorcho@fi.upm.es
 * @institution Universidad Politecnica de Madrid
 * 
 */
public interface SparqlQueryParser
{

    public CommonTree parseSparqlQuery(String expression) throws SPARQLParserException;
//    public String generateSPARQL(CommonTree abstractSyntaxTree) throws SPARQLParserException;

}

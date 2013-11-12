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

package es.upm.fi.dia.oeg.ogsadai.sparql.lqp.operators;

import java.util.List;

import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.RenameMap;

/**
 * This interface is used for scanning the query in the SPARQL SERVICE 
 * 
 * @author Carlos Buil Aranda, Oscar Corcho
 * @email cbuil@fi.upm.es, ocorcho@fi.upm.es
 * @institution Universidad Politecnica de Madrid
 *
 */
public interface ServiceScanQuery
{
    /**
     * Adds a SELECT predicate to the query. If the query has multiple
     * predicates they will be combined using an AND operator.
     * 
     * @param predicate
     *            predicate to add.
     */
    public void addPredicate(String predicate);

    /**
     * Sets the attributes to be included in the PROJECT list. Each attribute in
     * the list will be cloned (ignoring annotations) and the clone will be
     * added to this object. Any previous set of project attributes will be
     * overwritten.
     * 
     * @param attributeList
     *            project attributes.
     */
    public void setProjectAttributes(List<Attribute> attributeList);

    /**
     * @param renameMap
     */
    public void setRenameMap(RenameMap renameMap);

}

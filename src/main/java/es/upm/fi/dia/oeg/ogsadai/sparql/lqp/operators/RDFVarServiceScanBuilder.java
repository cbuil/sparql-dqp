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

import uk.org.ogsadai.client.toolkit.SingleActivityOutput;
import uk.org.ogsadai.client.toolkit.activities.generic.GenericActivity;
import uk.org.ogsadai.dqp.execute.workflow.ActivityPipelineBuilder;
import uk.org.ogsadai.dqp.execute.workflow.PipelineWorkflowBuilder;
import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.Operator;

/**
 * executes the scan query extracted from the SERVICE definition it does not
 * build the actual query, it just executes it
 * 
 * @author Carlos Buil Aranda
 * @email cbuil@ing.puc.cl
 * @institution Pontifici Universidad Catolica de Chile
 * 
 */
public class RDFVarServiceScanBuilder implements ActivityPipelineBuilder
{
    /** Copyright statement. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Universidad Politecnica de Madrid, 2011.";

    /**
     * {@inheritDoc}
     */
    public SingleActivityOutput build(Operator op,
            List<SingleActivityOutput> outputs, PipelineWorkflowBuilder builder)
    {
        RDFVarServiceScanOperator operator = (RDFVarServiceScanOperator) op;

        GenericActivity query = new GenericActivity(
                "es.upm.fi.dia.oeg.ogsadai.rdfactivity.VarSparqlEndpointQueryActivity");
        query.createInput("endpointURL");
        query.createInput("expression");
        query.createOutput("rdfdata");

        // String endpoint = operator.getEndpoint();

        query.setResourceID(operator.getDataNode().getResourceID());
        String expression = operator.getPhysicalDatabaseQuery();
        query.addInput("expression", expression);

        // find query apply operator
        Operator current = operator;
        while (!current.getID().toString().equals("SPARQL_APPLY"))
        {
            current = current.getParent();
        }
        builder.addInput(current, operator, query.getInput("endpointURL"));

        builder.add(query);

        GenericActivity rename = new GenericActivity(
                "uk.org.ogsadai.MetadataRename");
        rename.createInput("data");
        rename.createInput("resultColumnNames");
        rename.createOutput("result", GenericActivity.LIMITED_VALIDATION);

        List<Attribute> attributes = operator.getHeading().getAttributes();
        String[] newNames = new String[attributes.size()];
        for (int i = 0; i < newNames.length; i++)
        {
            newNames[i] = attributes.get(i).toString();
        }
        rename.addInputList("resultColumnNames", newNames);
        rename.connectInput("data", query.getOutput("rdfdata"));
        builder.add(rename);
        return rename.getOutput("result");
    }
}

package es.upm.fi.dia.oeg.ogsadai.sparql.lqp.operators;

import java.util.List;

import uk.org.ogsadai.client.toolkit.SingleActivityOutput;
import uk.org.ogsadai.client.toolkit.activities.generic.GenericActivity;
import uk.org.ogsadai.dqp.execute.ActivityConstructionException;
import uk.org.ogsadai.dqp.execute.workflow.ActivityPipelineBuilder;
import uk.org.ogsadai.dqp.execute.workflow.PipelineWorkflowBuilder;
import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.Operator;

public class FusionTableScanBuilder implements ActivityPipelineBuilder
{

    @Override
    public SingleActivityOutput build(Operator op,
            List<SingleActivityOutput> outputs, PipelineWorkflowBuilder builder)
            throws ActivityConstructionException
    {
        FusionTableScanOperator operator = (FusionTableScanOperator) op;

        GenericActivity query = new GenericActivity(
                "cl.puc.ing.dcc.db.ogsadai.fusiontables.FusionTableQueryActivity");
        query.createInput("expression");
        query.createInput("mapping_url");
        query.createOutput("rdfdata");

        query.setResourceID(operator.getDataNode().getResourceID());
        String expression = operator.getPhysicalDatabaseQuery();
        query.addInput("expression", expression);
        String mappingFileURL = operator.getMappingFileURL();
        query.addInput("mapping_url", mappingFileURL);
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

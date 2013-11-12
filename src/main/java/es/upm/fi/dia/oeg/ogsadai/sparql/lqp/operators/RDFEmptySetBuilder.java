package es.upm.fi.dia.oeg.ogsadai.sparql.lqp.operators;

import java.util.List;

import uk.org.ogsadai.client.toolkit.SingleActivityOutput;
import uk.org.ogsadai.client.toolkit.activities.generic.GenericActivity;
import uk.org.ogsadai.dqp.execute.workflow.ActivityPipelineBuilder;
import uk.org.ogsadai.dqp.execute.workflow.PipelineWorkflowBuilder;
import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.Operator;

public class RDFEmptySetBuilder implements ActivityPipelineBuilder
{
    /** Copyright statement. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Pontificia Universidad Catolica de Chile, 2013.";

    /**
     * {@inheritDoc}
     */
    public SingleActivityOutput build(Operator op,
            List<SingleActivityOutput> outputs, PipelineWorkflowBuilder builder)
    {
        RDFEmptySetOperator operator = (RDFEmptySetOperator) op;

        GenericActivity query = new GenericActivity(
                "es.upm.fi.dia.oeg.EmptyRDFQueryActivity");
        query.createInput("expression");
        query.createOutput("rdfdata");

        // Here I configure to what OGSA-DAI data resource I will send the query
        query.setResourceID(operator.getSource());
        String expression = operator.getPhysicalDatabaseQuery();
        query.addInput("expression", expression);
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
package es.upm.fi.dia.oeg.ogsadai.sparql.lqp.operators;

import java.util.List;

import uk.org.ogsadai.client.toolkit.SingleActivityOutput;
import uk.org.ogsadai.client.toolkit.activities.generic.GenericActivity;
import uk.org.ogsadai.common.msgs.DAILogger;
import uk.org.ogsadai.dqp.execute.ActivityConstructionException;
import uk.org.ogsadai.dqp.execute.workflow.ActivityPipelineBuilder;
import uk.org.ogsadai.dqp.execute.workflow.PipelineWorkflowBuilder;
import uk.org.ogsadai.dqp.lqp.Operator;

/**
 * Builds activities for operator SPARQL UNION.
 *
 * @author Carlos Buil Aranda
 */
public class SparqlUnionBuilder implements ActivityPipelineBuilder
{
    /** Copyright notice. */
    private static final String COPYRIGHT_NOTICE = 
        "Copyright (c) Universidad Politecnica de Madrid, 2011";
    
    /** Logger. */
    private static final DAILogger LOG = 
        DAILogger.getLogger(SparqlUnionBuilder.class);

    /**
     * {@inheritDoc}
     */
    public SingleActivityOutput build(
            Operator op, 
            List<SingleActivityOutput> outputs,
            PipelineWorkflowBuilder builder) 
        throws ActivityConstructionException
    {
    	LOG.debug("performing a SPARQL union using outer union");

        SingleActivityOutput outputLeft = outputs.get(0);
        SingleActivityOutput outputRight = outputs.get(1);
        
        GenericActivity union =
            new GenericActivity("es.upm.fi.dia.oeg.SparqlUnion");
        union.createInput("data", 2);
        union.createOutput("data", GenericActivity.LIMITED_VALIDATION);
        union.connectInput("data", 0, outputLeft);
        union.connectInput("data", 1, outputRight);
        builder.add(union);
        
        return union.getOutput("data");
    }
}

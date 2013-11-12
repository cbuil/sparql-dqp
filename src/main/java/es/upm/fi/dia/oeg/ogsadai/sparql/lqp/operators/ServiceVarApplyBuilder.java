package es.upm.fi.dia.oeg.ogsadai.sparql.lqp.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import uk.org.ogsadai.client.toolkit.SingleActivityOutput;
import uk.org.ogsadai.client.toolkit.activities.generic.GenericActivity;
import uk.org.ogsadai.client.toolkit.activities.generic.TraversableSingleActivityOutput;
import uk.org.ogsadai.data.IntegerData;
import uk.org.ogsadai.data.ListBegin;
import uk.org.ogsadai.data.ListEnd;
import uk.org.ogsadai.data.StringData;
import uk.org.ogsadai.dqp.execute.ActivityConstructionException;
import uk.org.ogsadai.dqp.execute.workflow.ActivityPipelineBuilder;
import uk.org.ogsadai.dqp.execute.workflow.BuilderUtils;
import uk.org.ogsadai.dqp.execute.workflow.PipelineWorkflowBuilder;
import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.Operator;
import uk.org.ogsadai.dqp.lqp.OperatorID;
import uk.org.ogsadai.dqp.lqp.exceptions.AmbiguousAttributeException;
import uk.org.ogsadai.dqp.lqp.exceptions.AttributeNotFoundException;
import uk.org.ogsadai.dqp.lqp.operators.QueryApplyOperator;
import uk.org.ogsadai.tuple.TupleMetadata;

/**
 * Builds activities for the Service Var Scan operator. In this way the SCAN
 * operator is executed in multiple data sources (SPARQL endpoints). The
 * multiple endpoint addresses come from t he execution of other operator bound
 * to this one using an Apply operator.
 * 
 * This activity creates a chain of multiple SPARQL query activities.
 * 
 * @author Carlos Buil-Aranda cbuil@ing.puc.cl.
 */
public class ServiceVarApplyBuilder implements ActivityPipelineBuilder
{

    /** Copyright statement. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Pontificia Universidad Catolica de Chile, 2013.";

    /** Join operator annotation for which side to read first. */
    private static final String READ_FIRST = "readFirst";

    /** Join operator annotation left hand metadata. */
    private static final String METADATA_LEFT = "metadataLeft";

    /** Join operator annotation right hand metadata. */
    private static final String METADATA_RIGHT = "metadataRight";

    @Override
    public SingleActivityOutput build(Operator op,
            List<SingleActivityOutput> outputs, PipelineWorkflowBuilder builder)
            throws ActivityConstructionException
    {

        ServiceVarApplyOperator serviceVarApplyOp = (ServiceVarApplyOperator) op;
        Collection<Attribute> attributesToBind = serviceVarApplyOp.getAttributesToBind();

        SingleActivityOutput dataOutput;
        int varScanIndex;
        List<Attribute> serviceVariable = containsAttributes(serviceVarApplyOp.getChild(0), attributesToBind);
        // check which child is the filtered tuple stream
        if (!serviceVariable.isEmpty())
        {
            varScanIndex = 1;
            dataOutput = outputs.get(0);
        }
        else
        {
            varScanIndex = 0;
            dataOutput = outputs.get(1);
        }

        SingleActivityOutput varScanOutput = outputs.get(varScanIndex);

        GenericActivity stats = new GenericActivity(
                "uk.org.ogsadai.AttributeStatistics");
        stats.createInput("data");
        stats.connectInput("data", dataOutput);
        stats.createInput("columnIds");
        stats.createInput("numBuckets");
        stats.createOutput("data");
        stats.createOutput("result");
        builder.add(stats);

        stats.addInput("columnIds", ListBegin.VALUE);
        for (Attribute attribute : serviceVariable)
        {
            stats.addInput("columnIds", new StringData(attribute.toString()));
        }
        stats.addInput("columnIds", ListEnd.VALUE);
        // TODO number of buckets is hard coded
        stats.addInput("numBuckets", new IntegerData(100));

        List<SingleActivityOutput> joinInputs = new ArrayList<SingleActivityOutput>(
                2);
        // output from stats must be read first by the join activity
        // otherwise the workflow may deadlock
        String readFirst;
        TupleMetadata metadataLeft = serviceVarApplyOp.getChild(0).getHeading()
                .getTupleMetadata();
        TupleMetadata metadataRight = serviceVarApplyOp.getChild(1).getHeading()
                .getTupleMetadata();
        if (varScanIndex == 0)
        {
            joinInputs.add(varScanOutput);
            joinInputs.add(stats.getOutput("data"));
            readFirst = "right";
        }
        else
        {
            joinInputs.add(stats.getOutput("data"));
            joinInputs.add(varScanOutput);
            readFirst = "left";
        }

        Operator scanVarOperator = findQueryApplyOperator(serviceVarApplyOp);
        if (scanVarOperator == null)
        {
            throw new ActivityConstructionException(new Exception(
                    "No RDF_SERVICE_SCAN_VAR operator found."));
        }

//        SingleActivityOutput scanVarOutput = builder.buildOperator(
//                scanVarOperator, joinInputs);
        // add the unconnected output to the builder
        TraversableSingleActivityOutput statsOutput = stats.getOutput("result");

        // executes the repeated scanVarOperator wrapped into the apply operator
        // using the results coming from statsOutput
//        builder.addOutput(serviceVarApplyOp, scanVarOperator, statsOutput);

        // now we add the join operator to the result of the scan var operator

        Operator joinOperator = serviceVarApplyOp.getOperator();
        joinOperator.addAnnotation(READ_FIRST, readFirst);
        joinOperator.addAnnotation(METADATA_LEFT, metadataLeft);
        joinOperator.addAnnotation(METADATA_RIGHT, metadataRight);
        
        SingleActivityOutput joinOutput = builder.buildOperator(joinOperator,
                joinInputs);

        // add the unconnected output to the builder
        builder.addOutput(serviceVarApplyOp, scanVarOperator, statsOutput);
        return joinOutput;

    }

    /**
     * Returns <code>true</code> if the heading of the operator contains the
     * specified attributes.
     * 
     * @param operator
     *            operator
     * @param attributes
     *            attributes to check
     * @return <code>true</code> if all attributes are contained in the
     *         operator's heading, <code>false</code> otherwise
     */
    private List<Attribute> containsAttributes(Operator operator,
            Collection<Attribute> attributes)
    {
        List<Attribute> result;
        result = new ArrayList<>();
        for (Attribute attribute : operator.getHeading().getAttributes())
        {
            if (attribute.getName().equals(
                    ((Attribute) attributes.toArray()[0]).getName()))
            {
                result.add(attribute);
                break;
            }
        }
        return result;
    }

    /**
     * Traverses the operator tree and looks for a filtered table scan operator.
     * 
     * @param operator
     *            root of the tree to traverse
     * @return the filtered table scan operator
     */
    private Operator findQueryApplyOperator(Operator operator)
    {
        Operator result = null;
        if (operator.getID().toString().equals("RDF_SERVICE_SCAN_VAR"))
        {
            result = operator;
        }
        else if (operator.getChild(0) != null)
        {
            result = findQueryApplyOperator(operator.getChild(0));
            if (result == null && operator.isBinary())
            {
                result = findQueryApplyOperator(operator.getChild(1));
            }
        }
        return result;
    }
}

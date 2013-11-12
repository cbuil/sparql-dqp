package es.upm.fi.dia.oeg.ogsadai.sparql.lqp.activities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import uk.org.ogsadai.activity.ActivityContractName;
import uk.org.ogsadai.activity.ActivityProcessingException;
import uk.org.ogsadai.activity.ActivityTerminatedException;
import uk.org.ogsadai.activity.ActivityUserException;
import uk.org.ogsadai.activity.MatchedIterativeActivity;
import uk.org.ogsadai.activity.extension.ResourceActivity;
import uk.org.ogsadai.activity.io.ActivityInput;
import uk.org.ogsadai.activity.io.BlockWriter;
import uk.org.ogsadai.activity.io.ControlBlock;
import uk.org.ogsadai.activity.io.PipeClosedException;
import uk.org.ogsadai.activity.io.PipeIOException;
import uk.org.ogsadai.activity.io.PipeTerminatedException;
import uk.org.ogsadai.activity.io.TypedActivityInput;
import uk.org.ogsadai.metadata.MetadataWrapper;
import uk.org.ogsadai.resource.ResourceAccessor;
import uk.org.ogsadai.tuple.ColumnMetadata;
import uk.org.ogsadai.tuple.Null;
import uk.org.ogsadai.tuple.SimpleColumnMetadata;
import uk.org.ogsadai.tuple.SimpleTuple;
import uk.org.ogsadai.tuple.SimpleTupleMetadata;
import uk.org.ogsadai.tuple.Tuple;
import uk.org.ogsadai.tuple.TupleTypes;
import es.upm.fi.dia.oeg.ogsadai.rdfresource.RDFConnectionProvider;

public class EmptyRDFQueryActivity extends MatchedIterativeActivity implements
        ResourceActivity
{
    /** Copyright statement. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Pontificia Universidad Catolica de Chile, 2013.";

    /** Logger. */
    private static final Logger LOG = Logger
            .getLogger(EmptyRDFQueryActivity.class.getName());

    /** Activity input name - SPARQL expression */
    public static final String INPUT_SPARQL_EXPRESSION = "expression";

    /** Activity output name - produces lists of tuples */
    public static final String OUTPUT_SPARQL_RESULTS = "rdfdata";

    /** The RDFDataResource connection provider */
    private RDFConnectionProvider mResource;

    /**
     * Constructor.
     */
    public EmptyRDFQueryActivity()
    {
        super();
        LOG.debug("Inside SPARQLQueryActivity constructor");
        mContracts
                .add(new ActivityContractName(
                        "es.upm.fi.dia.oeg.ogsadai.rdfactivity.contract.EmptyRDFQuery"));
    }

    @Override
    protected ActivityInput[] getIterationInputs()
    {
        LOG.debug("Inside SPARQLQueryActivity getIterationInputs()");
        return new ActivityInput[] { new TypedActivityInput(
                INPUT_SPARQL_EXPRESSION, String.class), };
    }

    @Override
    protected void postprocess() throws ActivityUserException,
            ActivityProcessingException, ActivityTerminatedException
    {
        LOG.debug("Inside SPARQLQueryActivity postprocess()");
    }

    @Override
    protected void preprocess() throws ActivityUserException,
            ActivityProcessingException, ActivityTerminatedException
    {
        validateOutput(OUTPUT_SPARQL_RESULTS);
    }

    @Override
    protected void processIteration(Object[] iterationData)
            throws ActivityProcessingException, ActivityTerminatedException,
            ActivityUserException
    {
        LOG.debug("Inside processIteration(Object[] iterationData)");
        LOG.debug("Creating empty tuple list");
        BlockWriter output = getOutput();
        try
        {
            output.write(ControlBlock.LIST_BEGIN);

            List<String> resultVars = new ArrayList<>();
            resultVars.add("*");
            // resultvars.add("null");
            Iterator<String> it1 = resultVars.listIterator();
            List<ColumnMetadata> listColumnMetadata = new ArrayList<ColumnMetadata>();
            while (it1.hasNext())
            {
                String var = (String) it1.next();
                listColumnMetadata.add(new SimpleColumnMetadata(var,
                        TupleTypes._STRING, 100,
                        ColumnMetadata.COLUMN_NULLABLE, 10000));
            }

            output.write(new MetadataWrapper(new SimpleTupleMetadata(
                    listColumnMetadata)));
            List<Object> lst = new ArrayList<Object>();
            lst.add(Null.VALUE);
            Tuple tuple = new SimpleTuple(lst);
            output.write(tuple);
            output.write(ControlBlock.LIST_END);
        }
        catch (PipeClosedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (PipeIOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (PipeTerminatedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally
        {
            LOG.debug("Closing BlockWriter in Empty RDF activity.");
            output.closeForWriting();
            LOG.debug("BlockWriter CLOSED in Empty RDF activity.");
        }
    }

    // @Override
    public Class getTargetResourceAccessorClass()
    {
        LOG.debug("Inside getTargetResourceAccessorClass");
        return RDFConnectionProvider.class;
    }

    // @Override
    public void setTargetResourceAccessor(ResourceAccessor targetResource)
    {
        LOG.debug("Inside setTargetResourceAccessorClass");
        mResource = (RDFConnectionProvider) targetResource;
    }

    protected void cleanUp() throws Exception
    {
        LOG.debug("Inside cleaning up");
        super.cleanUp();
    }

}
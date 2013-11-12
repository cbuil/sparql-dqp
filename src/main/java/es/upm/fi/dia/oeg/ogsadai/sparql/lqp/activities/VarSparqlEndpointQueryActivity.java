package es.upm.fi.dia.oeg.ogsadai.sparql.lqp.activities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.ResultSet;

import uk.org.ogsadai.activity.ActivityContractName;
import uk.org.ogsadai.activity.ActivityProcessingException;
import uk.org.ogsadai.activity.ActivityTerminatedException;
import uk.org.ogsadai.activity.ActivityUserException;
import uk.org.ogsadai.activity.MatchedIterativeActivity;
import uk.org.ogsadai.activity.io.ActivityIOException;
import uk.org.ogsadai.activity.io.ActivityInput;
import uk.org.ogsadai.activity.io.BlockWriter;
import uk.org.ogsadai.activity.io.ControlBlock;
import uk.org.ogsadai.activity.io.TupleListActivityInput;
import uk.org.ogsadai.activity.io.TupleListIterator;
import uk.org.ogsadai.activity.io.TypedActivityInput;
import uk.org.ogsadai.common.msgs.DAILogger;
import uk.org.ogsadai.metadata.MetadataWrapper;
import uk.org.ogsadai.tuple.ColumnMetadata;
import uk.org.ogsadai.tuple.SimpleColumnMetadata;
import uk.org.ogsadai.tuple.SimpleTupleMetadata;
import uk.org.ogsadai.tuple.Tuple;
import uk.org.ogsadai.tuple.TupleTypes;
import es.upm.fi.dia.oeg.ogsadai.rdfresource.RDFConnectionProvider;

/**
 * An activity that executes SPARQL query on a target RDF data resource and
 * produces a list of tuples containing the results of the query.
 * <p>
 * Activity inputs:
 * </p>
 * <ul>
 * <li>
 * <code>expression</code>. Type: {@link java.lang.String}. SPARQL query
 * expression.</li>
 * </ul>
 * <p>
 * Activity outputs:
 * </p>
 * <ul>
 * <li>
 * <code>data</code>. Type: OGSA-DAI list of {@link uk.org.ogsadai.tuple.Tuple}
 * with the first item in the list an instance of
 * {@link uk.org.ogsadai.metadata.MetadataWrapper} containing a
 * {@link uk.org.ogsadai.tuple.TupleMetadata} object. The tuples produced by the
 * query.</li>
 * </ul>
 * <p>
 * Configuration parameters: none.
 * </p>
 * <p>
 * Activity input/output ordering: none.
 * </p>
 * <p>
 * Activity contracts:
 * </p>
 * <ul>
 * <li>
 * <code>es.upm.fi.dia.oeg.ogsadai.rdfactivity.contract.EPRQueryActivity</code></li>
 * </ul>
 * <p>
 * Target data resource:
 * <ul>
 * <li>
 * {@link es.upm.fi.dia.oeg.ogsadai.rdfresource.RDFResource}</li>
 * </ul>
 * </p>
 * </p>
 * <p>
 * Behaviour:
 * </p>
 * <ul>
 * <li>
 * This activity accepts a sequence of SPARQL query expressions as input and is
 * targeted at a RDF data resource. In each iteration one input query is
 * processed by executing the query across the target data resource. The results
 * of each iteration is a OGSA-DAI list of tuples with a metadata header block.</li>
 * <li>
 * Partial data may be produced if an error occurs at any stage of processing.</li>
 * </ul>
 * 
 * @author Carlos Buil Aranda, Oscar Corcho
 * @email cbuil@fi.upm.es, ocorcho@fi.upm.es
 * @institution Universidad Politecnica de Madrid
 */
public class VarSparqlEndpointQueryActivity extends MatchedIterativeActivity
{
    /** Copyright statement. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Pontificia Universidad Catolica de Chile, 2013.";

    /** Logger. */
    private static final DAILogger LOG = DAILogger
            .getLogger(VarSparqlEndpointQueryActivity.class);

    /** Activity input name - SPARQL expression */
    public static final String INPUT_SPARQL_EXPRESSION = "expression";

    /** Activity input name - SPARQL expression */
    public static final String INPUT_SPARQL_ENDPOINT = "endpointURL";

    /** Activity output name - produces lists of tuples */
    public static final String OUTPUT_SPARQL_RESULTS = "rdfdata";

    /** The RDFDataResource connection provider */
    private RDFConnectionProvider mResource;

    /**
     * SPARQL EPR address
     */
    private String mAddress;

    /**
     * Constructor.
     */
    public VarSparqlEndpointQueryActivity()
    {
        super();
        mContracts
                .add(new ActivityContractName(
                        "es.upm.fi.dia.oeg.ogsadai.rdfactivity.contract.VarSparqlEndpointQueryActivity"));
    }

    @Override
    protected ActivityInput[] getIterationInputs()
    {
        return new ActivityInput[] {
                new TypedActivityInput(INPUT_SPARQL_EXPRESSION, String.class),
                new TupleListActivityInput(INPUT_SPARQL_ENDPOINT),

        };
    }

    @Override
    protected void postprocess() throws ActivityUserException,
            ActivityProcessingException, ActivityTerminatedException
    {
        // no post processing

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
        final String expression = (String) iterationData[0];
        TupleListIterator endpointTuples = (TupleListIterator) iterationData[1];
        // mAddress = (String) iterationData[1];
        try
        {
            LOG.debug("About to query SPARQL endpoint...");
            Query query = QueryFactory.create(expression);

            Tuple tuple;
            BlockWriter output = getOutput(OUTPUT_SPARQL_RESULTS);
            boolean includeListMarkers = true;
            if (includeListMarkers)
            {
                output.write(ControlBlock.LIST_BEGIN);
            }
            if (query != null)
            {

                Query query1 = QueryFactory.create(query);
                List<String> resultvars = query1.getResultVars();
                Iterator<String> it1 = resultvars.listIterator();
                List<ColumnMetadata> listColumnMetadata = new ArrayList<ColumnMetadata>();
                while (it1.hasNext())
                {
                    String var = (String) it1.next();
                    listColumnMetadata.add(new SimpleColumnMetadata(var,
                            TupleTypes._STRING, 100,
                            ColumnMetadata.COLUMN_NULLABLE, 10000));
                }

                LOG.debug("Sparql VAR query metadata: " + listColumnMetadata);
                output.write(new MetadataWrapper(new SimpleTupleMetadata(
                        listColumnMetadata)));
                while ((tuple = (Tuple) endpointTuples.nextValue()) != null)
                {
                    String sparqlEndpoint = tuple.getString(1);
                    LOG.debug("Endpoint to query: " + sparqlEndpoint);
                    
                    // Create a single execution of this query, apply to a model
                    // which is wrapped up as a Dataset
                    final QueryExecution qexec = QueryExecutionFactory
                            .sparqlService(
                                    sparqlEndpoint.substring(1,
                                            sparqlEndpoint.length() - 1), query);
                    ResultSet rs = null;
                    try
                    {
                        LOG.debug("About to execute SPARQL query...");
                        rs = qexec.execSelect();
                        LOG.debug("SPARQL query " + query + " executed");
                    }
                    finally
                    {
                        if (rs != null)
                        {
                            // QueryExecution objects should be closed to free
                            // any
                            // system resources
                            LOG.debug("About to create OGSA-DAI tuples...");
                            VarRDFUtilities.createTupleList(rs, output);
                            LOG.debug("tuples created...");
                        }
                        else
                        {
                            LOG.debug("ResultSet is null, did you write correctly the SPARQL EPR address?");
                        }

                        qexec.close();
                    }
                }
            }
            if (includeListMarkers)
            {
                output.write(ControlBlock.LIST_END);
                output.closeForWriting();
            }
        }
        catch (IOException e)
        {
            throw new ActivityIOException(e);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    protected void cleanUp() throws Exception
    {
        super.cleanUp();
    }

}

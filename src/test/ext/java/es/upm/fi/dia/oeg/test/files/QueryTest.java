package es.upm.fi.dia.oeg.test.files;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Vector;

import org.apache.log4j.Logger;

import es.upm.fi.dia.oeg.ogsadai.sparql.client.RDFActivity;
import es.upm.fi.dia.oeg.test.files.config.Query;
import es.upm.fi.dia.oeg.test.files.config.QueryLoader;

import uk.org.ogsadai.client.toolkit.DataRequestExecutionResource;
import uk.org.ogsadai.client.toolkit.DataSourceDataValueIterator;
import uk.org.ogsadai.client.toolkit.DataSourceResource;
import uk.org.ogsadai.client.toolkit.PipelineWorkflow;
import uk.org.ogsadai.client.toolkit.RequestExecutionType;
import uk.org.ogsadai.client.toolkit.RequestResource;
import uk.org.ogsadai.client.toolkit.ServerProxy;
import uk.org.ogsadai.client.toolkit.activities.delivery.WriteToDataSource;
import uk.org.ogsadai.client.toolkit.activities.transform.TupleBinaryDataStreamParseException;
import uk.org.ogsadai.client.toolkit.activities.transform.TupleToByteArrays;
import uk.org.ogsadai.client.toolkit.exception.ClientException;
import uk.org.ogsadai.client.toolkit.exception.ClientServerCompatibilityException;
import uk.org.ogsadai.client.toolkit.exception.ClientToolkitException;
import uk.org.ogsadai.client.toolkit.exception.DataSourceUsageException;
import uk.org.ogsadai.client.toolkit.exception.DataStreamErrorException;
import uk.org.ogsadai.client.toolkit.exception.RequestException;
import uk.org.ogsadai.client.toolkit.exception.ResourceCreationException;
import uk.org.ogsadai.client.toolkit.exception.ResourceUnknownException;
import uk.org.ogsadai.client.toolkit.exception.ServerCommsException;
import uk.org.ogsadai.client.toolkit.exception.ServerException;
import uk.org.ogsadai.client.toolkit.exception.UnexpectedDataValueException;
import uk.org.ogsadai.client.toolkit.resource.ResourceFactory;
import uk.org.ogsadai.exception.MalformedListBeginException;
import uk.org.ogsadai.resource.ResourceID;
import uk.org.ogsadai.tuple.serialise.UnsupportedTupleTypeException;

public class QueryTest
{
    /** Logger. */
    private static final Logger LOG = Logger.getLogger(QueryTest.class
            .getName());

    private static final String DEFAULT_CONFIG = "test.properties";

    public static void main(String[] args) throws Exception
    {
        String configFile;

        if (args.length == 0)
        {
            configFile = DEFAULT_CONFIG;
            System.out.println("using default config: " + configFile);
        }
        else
        {
            configFile = args[0];
            System.out.println("using config: " + configFile);
        }

        Iterator<Query> queries = null;
        QueryLoader.load(configFile);
        queries = QueryLoader.loadQueries();
        String server = QueryLoader.getServer();
        while (queries.hasNext())
        {
            Query query = queries.next();
            try
            {
                System.out.println("Query Name: " + query.getName());
                runWorkflow(query.getQuery(), server);
            }
            catch (ResourceCreationException e)
            {
                e.printStackTrace();
            }
            catch (ServerCommsException e)
            {
                e.printStackTrace();
            }
            catch (ServerException e)
            {
                e.printStackTrace();
            }
            catch (ClientToolkitException e)
            {
                e.printStackTrace();
            }
            catch (ClientServerCompatibilityException e)
            {
                e.printStackTrace();
            }
            catch (DataStreamErrorException e)
            {
                e.printStackTrace();
            }
            catch (UnexpectedDataValueException e)
            {
                e.printStackTrace();
            }
            catch (DataSourceUsageException e)
            {
                e.printStackTrace();
            }
            catch (ResourceUnknownException e)
            {
                e.printStackTrace();
            }
            catch (ClientException e)
            {
                e.printStackTrace();
            }
            catch (RequestException e)
            {
                e.printStackTrace();
            }
            catch (MalformedListBeginException e)
            {
                e.printStackTrace();
            }
            catch (TupleBinaryDataStreamParseException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            catch (UnsupportedTupleTypeException e)
            {
                e.printStackTrace();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }

    private static void runWorkflow(String query, String server)
            throws ResourceCreationException, ServerCommsException,
            ServerException, ClientToolkitException,
            ClientServerCompatibilityException, ResourceUnknownException,
            ClientException, RequestException, DataStreamErrorException,
            UnexpectedDataValueException, DataSourceUsageException,
            MalformedListBeginException, TupleBinaryDataStreamParseException,
            IOException, UnsupportedTupleTypeException, SQLException
    {
        URL serverBaseUrl;
        serverBaseUrl = new URL(server);

        ResourceID drerId = new ResourceID("DataRequestExecutionResource");

        ServerProxy serverProxy = new ServerProxy();
        serverProxy.setDefaultBaseServicesURL(serverBaseUrl);

        DataRequestExecutionResource drer = serverProxy
                .getDataRequestExecutionResource(drerId);

        // Create a data source resource for async comms
        DataSourceResource dataSource = ResourceFactory.createDataSource(
                serverProxy, drer);

        RDFActivity rdfActivity = new RDFActivity(query);

        // rdfActivity.setResourceID("biocyc");

        // Transform
        TupleToByteArrays tupleToByteArrays = new TupleToByteArrays();
        tupleToByteArrays.connectDataInput(rdfActivity.getDataOutput());
        tupleToByteArrays.addSize(5000);

        WriteToDataSource writeToDS = new WriteToDataSource();
        writeToDS.setResourceID(dataSource.getResourceID());
        writeToDS.connectInput(tupleToByteArrays.getResultOutput());

        // Deliver.
        // Workflow.
        PipelineWorkflow pipeline = new PipelineWorkflow();
        pipeline.add(rdfActivity);
        pipeline.add(tupleToByteArrays);
        pipeline.add(writeToDS);

        // Execute.
        RequestResource requestResource = null;
        long startTime = 0;
        long responseAfter = 0;
        try
        {
            startTime = System.currentTimeMillis();
            System.out.println("Start Time: " + startTime);
            requestResource = drer.execute(pipeline,
                    RequestExecutionType.ASYNCHRONOUS);
            requestResource.pollUntilRequestStarted(100);
            responseAfter = System.currentTimeMillis() - startTime;
            System.out.println("Response after: " + responseAfter);
        }
        catch (Throwable e)
        {
            System.out.println("A problem has occured...");
            while (e != null)
            {
                System.out.println(e.getMessage());
                e = e.getCause();
            }
            System.exit(1);
        }

//        System.out.println("Data Source Status... "
//                + dataSource.getStatus().toString());
//
//        System.out.println(requestResource.getRequestExecutionStatus()
//                .toString());

        DataSourceDataValueIterator dataValueIterator = new DataSourceDataValueIterator(
                dataSource);
        dataValueIterator.setNumBlocksPerCall(20);
        tupleToByteArrays.getResultOutput().setDataValueIterator(
                dataValueIterator);

        // Get results.
        if (tupleToByteArrays.hasNextResult())
        {
            // Get ResultSet.
            ResultSet rs = tupleToByteArrays.nextResultAsResultSet();
            // Get ResultSet meta data.
            ResultSetMetaData md = rs.getMetaData();
            // Get column names and initial column widths.
            int numColumns = md.getColumnCount();
            String[] columns = new String[numColumns];
            int[] widths = new int[numColumns];
            for (int i = 0; i < numColumns; i++)
            {
                String column = md.getColumnLabel(i + 1);
                columns[i] = column;
                widths[i] = column.length();
            }
            // Get ResultSet rows and update column widths also.
            Vector<String[]> rows = new Vector<String[]>();
            while (rs.next())
            {
                String[] fields = new String[numColumns];
                for (int i = 0; i < numColumns; i++)
                {
                    fields[i] = rs.getString(i + 1);
                    if (fields[i] != null)
                    {
                        widths[i] = Math.max(widths[i], fields[i].length());
                    }
                }
                rows.add(fields);
                // System.out.println(fields[0]);
            }
            rs.close();

            long totalTime1 = System.currentTimeMillis() - startTime;
            System.out.println("total time before printing results: "
                    + totalTime1);

            // Print column names.
            String tableHeading = "| ";
            for (int i = 0; i < numColumns; i++)
            {
                tableHeading += (pad(columns[i], widths[i]) + " | ");
            }
//            System.out.println(tableHeading);
            // Print rows.
            int j = 0;
            for (j = 0; j < rows.size(); j++)
            {
                // String[] row = rows.get(j);
                // String rowString = "| ";
                // for (int i = 0; i < numColumns; i++) {
                // rowString += (pad(row[i], widths[i]) + " | ");
                // }
                // System.out.println(rowString);
            }
            System.out.println("result number: " + j);
        }
        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("total time: " + totalTime);
    }

    /**
     * Pad a string out to a given width with space characters.
     * 
     * @param base
     *            String to pad.
     * @param width
     *            If greater than length of <code>base</code> then append
     *            <code>width - base.size()</code> spaces to <code>base</code>.
     * @return padded string.
     */
    public static String pad(String base, int width)
    {
        if (base == null)
        {
            base = "";
        }
        StringBuffer baseBuffer = new StringBuffer(base);
        int padLength = width - base.length();
        for (int i = 0; i < padLength; i++)
        {
            baseBuffer.append(" ");
        }
        return baseBuffer.toString();
    }
}

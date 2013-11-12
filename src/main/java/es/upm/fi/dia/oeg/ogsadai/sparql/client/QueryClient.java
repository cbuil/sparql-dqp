package es.upm.fi.dia.oeg.ogsadai.sparql.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Timestamp;
import java.util.Vector;

import uk.org.ogsadai.client.toolkit.DataRequestExecutionResource;
import uk.org.ogsadai.client.toolkit.DataSourceDataValueIterator;
import uk.org.ogsadai.client.toolkit.DataSourceResource;
import uk.org.ogsadai.client.toolkit.PipelineWorkflow;
import uk.org.ogsadai.client.toolkit.RequestExecutionType;
import uk.org.ogsadai.client.toolkit.RequestResource;
import uk.org.ogsadai.client.toolkit.activities.delivery.WriteToDataSource;
import uk.org.ogsadai.client.toolkit.activities.transform.TupleToByteArrays;
import uk.org.ogsadai.client.toolkit.presentation.jersey.JerseyServer;
import uk.org.ogsadai.client.toolkit.resource.ResourceFactory;
import uk.org.ogsadai.resource.ResourceID;

/**
 * @author cbuil
 * 
 */
public class QueryClient
{

    private static String mSPARQLquery = "select distinct ?clase where  { ?clase rdf:type owl:Class FILTER regex(?clase, 'city','i') } ";

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception
    {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        String url = "http://127.0.0.1:8080/dai/services/";

        if (args.length > 0)
        {
            mSPARQLquery = args[0];
            if (args[0].equals("-f"))
            {
                StringBuffer sb = new StringBuffer();
                if (args[1].contains("http"))
                {
                    URL httpFileConnection = new URL(args[1]);
                    URLConnection yc = httpFileConnection.openConnection();
                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(yc.getInputStream()));

                    String eachLine = br.readLine();
                    while (eachLine != null)
                    {
                        sb.append(eachLine);
                        sb.append("\n");
                        eachLine = br.readLine();
                    }

                }
                else
                {
                    File f = new File(args[1]);
                    FileReader fr = new FileReader(f);
                    BufferedReader br = new BufferedReader(fr);
                    String eachLine = br.readLine();

                    while (eachLine != null)
                    {
                        sb.append(eachLine);
                        sb.append("\n");
                        eachLine = br.readLine();
                    }
                    br.close();
                }
                mSPARQLquery = sb.toString();
            }
            else if (args[0].equals("-q"))
            {
                mSPARQLquery = args[1];
            }
            else
            {
                System.out.println("Wrong argument");
            }
            if (args.length > 2)
            {
                if (args[2].equals("-s"))
                {
                    url = args[3];
                }
                else
                {
                    System.out.println("Wrong argument, server expected");
                }
            }
        }
        else
        {
            System.out.println("arguments needed");
            System.exit(-1);
        }
        System.out.println(mSPARQLquery);
        System.out.println(ts);

        JerseyServer server = new JerseyServer();
        server.setDefaultBaseServicesURL(new URL(url));
        DataRequestExecutionResource drer = server
                .getDataRequestExecutionResource(new ResourceID(
                        "DataRequestExecutionResource"));

        // Create a data source resource for async comms
        DataSourceResource dataSource = ResourceFactory.createDataSource(
                server, drer);

        RDFActivity rdfActivity = new RDFActivity(mSPARQLquery);

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

        System.out.println("Data Source Status... "
                + dataSource.getStatus().toString());

        System.out.println(requestResource.getRequestExecutionStatus()
                .toString());

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
            System.out.println(tableHeading);
            // Print rows.
            int j = 0;
            for (j = 0; j < rows.size(); j++)
            {
                String[] row = rows.get(j);
                String rowString = "| ";
                for (int i = 0; i < numColumns; i++)
                {
                    rowString += (pad(row[i], widths[i]) + " | ");
                }
                System.out.println(rowString);
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
        if (base != null)
        {
            StringBuffer baseBuffer = new StringBuffer(base);
            int padLength = width - base.length();
            for (int i = 0; i < padLength; i++)
            {
                baseBuffer.append(" ");
            }
            return baseBuffer.toString();
        }
        else
        {
            return "";
        }
    }
}

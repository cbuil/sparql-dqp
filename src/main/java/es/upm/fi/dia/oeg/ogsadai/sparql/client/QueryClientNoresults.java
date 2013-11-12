// Copyright (c) Copyright (c) Universidad Politecnica de Madrid, 2009-2012.
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

package es.upm.fi.dia.oeg.ogsadai.sparql.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
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
import uk.org.ogsadai.client.toolkit.ServerProxy;
import uk.org.ogsadai.client.toolkit.activities.delivery.WriteToDataSource;
import uk.org.ogsadai.client.toolkit.activities.transform.TupleToByteArrays;
import uk.org.ogsadai.client.toolkit.presentation.jersey.JerseyServer;
import uk.org.ogsadai.client.toolkit.resource.ResourceFactory;
import uk.org.ogsadai.resource.ResourceID;

public class QueryClientNoresults
{
    private static String mSPARQLquery = "PREFIX dbpedia: <http://dbpedia.org/ontology/> "
            + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> "
            + "PREFIX dbprop: <http://dbpedia.org/property/> "
            + " PREFIX rdf: <www.w3.org/TR/rdf-syntax/> "
            + "PREFIX geoes: <http://geo.linkeddata.es/ontology/> "
            + "PREFIX geo: <http://www.w3.org/2003/01/geo/wgs84_pos#> "
            + "PREFIX owl: <http://www.w3.org/2002/07/owl#> "
            + "Prefix lgd:<http://linkedgeodata.org/> "
            + " Prefix lgdo:<http://linkedgeodata.org/ontology/> "
            + " PREFIX lgdp: <http://linkedgeodata.org/property/> "
            + "PREFIX foaf: <http://xmlns.com/foaf/0.1/> "
            + " SELECT ?dbpediaResource ?nombre ?lat ?long ?s  ?geonames ?type ?l "
            + "WHERE {"
            + " 	SERVICE <http://dbpedia.org/sparql> {"
            + "	  	?dbpediaResource foaf:name ?name . "
            + " 		?name bif:contains \"Madrid\" . "
            + " 		?dbpediaResource owl:sameAs ?geonames . "
            + "	} . "
            + " 	 SERVICE <http://geo.linkeddata.es/sparql> {   "
            + " 			?p owl:sameAs ?dbpediaResource . "
            + "			?p geoes:formadoPor ?nombre . "
            + " 			?nombre geo:geometry ?geo1 .	"
            + " 			?geo1 <http://www.w3.org/2003/01/geo/wgs84_pos#lat> ?lat .  "
            + " 			?geo1 <http://www.w3.org/2003/01/geo/wgs84_pos#long> ?long .   "
            + " }"
            + "	OPTIONAL{  SERVICE <http://geo.linkeddata.es/nomgeo/sparql> {   "
            // Aqui puedo consultar los senderos, rutas, etc. que hay en Madrid
            // utilizando la geometr??a, que deber??an coincidir
            + " 			?s <http://www.w3.org/2003/01/geo/wgs84_pos#geometry> ?geo2 . "
            + " 			?geo2 <http://www.w3.org/2003/01/geo/wgs84_pos#lat> ?lat .  "
            + " 			?geo2 <http://www.w3.org/2003/01/geo/wgs84_pos#long> ?long .   "
            + " 		}  } "
            + " OPTIONAL { 	SERVICE <http://linkedgeodata.org/sparql> {"
            + "		?geonames rdf:type ?type . " + "		 ?geonames lgdp:is_in ?l . "
            // + "	 	?geonames bif:contains \"Madrid\" "
            + " } }  " + "  } ";

    private static String mServer = "http://localhost:8080/dai/services/";
    
    private static int mTimeOut = 1800000;

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception
    {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        System.out.println(ts);

        if (args.length > 0)
        {
            mSPARQLquery = args[0];
            if (args[0].equals("-f"))
            {
                File f = new File(args[1]);
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                StringBuffer sb = new StringBuffer();
                String eachLine = br.readLine();

                while (eachLine != null)
                {
                    sb.append(eachLine);
                    sb.append("\n");
                    eachLine = br.readLine();
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
                    mServer = args[3];
                }
                else
                {
                    System.out.println("Wrong argument, server expected");
                }
            }
            if (args.length > 4)
            {
                if (args[4].equals("-t"))
                {
                    mTimeOut = Integer.parseInt(args[5]);
                }
                else
                {
                    System.out.println("Wrong argument, timeout expected");
                }
            }
        }
        else
        {
            System.out.println("arguments needed");
            System.exit(-1);
        }

        System.out.println("The query is: " + mSPARQLquery);

        JerseyServer jerseyServer = new JerseyServer();
        jerseyServer.setDefaultBaseServicesURL(new URL(mServer));
        DataRequestExecutionResource drer = jerseyServer
                .getDataRequestExecutionResource(new ResourceID(
                        "DataRequestExecutionResource"));

        // Create a data source resource for async comms
        DataSourceResource dataSource = ResourceFactory.createDataSource(
                jerseyServer, drer);
        
        RDFActivity rdfActivity = new RDFActivity(mSPARQLquery);

        // rdfActivity.setResourceID("biocyc");

        // Transform
        TupleToByteArrays tupleToByteArrays = new TupleToByteArrays();
        tupleToByteArrays.connectDataInput(rdfActivity.getDataOutput());
        tupleToByteArrays.addSize(5000);

        WriteToDataSource writeToDS = new WriteToDataSource();
        dataSource.setTimeout(mTimeOut);
        System.out.println(dataSource.getTerminationTime());
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
//            System.out.println(tableHeading);
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

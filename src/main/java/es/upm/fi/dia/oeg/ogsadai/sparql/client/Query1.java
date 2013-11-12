package es.upm.fi.dia.oeg.ogsadai.sparql.client;

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
import uk.org.ogsadai.client.toolkit.activities.delivery.WriteToDataSource;
import uk.org.ogsadai.client.toolkit.activities.transform.TupleToByteArrays;
import uk.org.ogsadai.client.toolkit.presentation.jersey.JerseyServer;
import uk.org.ogsadai.client.toolkit.resource.ResourceFactory;
import uk.org.ogsadai.resource.ResourceID;

/**
 * @author cbuil
 * 
 */
public class Query1 {

	private static String mSPARQLquery = "PREFIX dbpedia: <http://dbpedia.org/ontology/> "
			+ "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> "
			+ "PREFIX dbprop: <http://dbpedia.org/property/> "
			+ " PREFIX rdf: <www.w3.org/TR/rdf-syntax/> "
			+ "PREFIX geoes: <http://geo.linkeddata.es/ontology/> "
			+ "PREFIX geo: <http://www.w3.org/2003/01/geo/wgs84_pos#> "
			+ "PREFIX owl: <http://www.w3.org/2002/07/owl#> "
			+ " SELECT ?dbpediaResource  ?name "
			+ "WHERE {"
			+ " 	SERVICE <http://dbpedia.org/sparql> {"
			+ "	  	?dbpediaResource <http://dbpedia.org/property/officialName> ?name . "
			+ " 		?name bif:contains '\"Comunidad de Madrid\"' . } } ";

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println(mSPARQLquery);
		System.out.println(ts);

		JerseyServer server = new JerseyServer();
        String url = "http://localhost:8080/dai/services/";
        server.setDefaultBaseServicesURL(new URL(url));
        DataRequestExecutionResource drer = 
            server.getDataRequestExecutionResource(new ResourceID("DataRequestExecutionResource"));

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
		try {
			startTime = System.currentTimeMillis();
			System.out.println("Start Time: " + startTime);
			requestResource = drer.execute(pipeline,
					RequestExecutionType.ASYNCHRONOUS);
			requestResource.pollUntilRequestStarted(100);
			responseAfter = System.currentTimeMillis() - startTime;
			System.out.println("Response after: " + responseAfter);
		} catch (Throwable e) {
			System.out.println("A problem has occured...");
			while (e != null) {
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
		if (tupleToByteArrays.hasNextResult()) {
			// Get ResultSet.
			ResultSet rs = tupleToByteArrays.nextResultAsResultSet();
			// Get ResultSet meta data.
			ResultSetMetaData md = rs.getMetaData();
			// Get column names and initial column widths.
			int numColumns = md.getColumnCount();
			String[] columns = new String[numColumns];
			int[] widths = new int[numColumns];
			for (int i = 0; i < numColumns; i++) {
				String column = md.getColumnLabel(i + 1);
				columns[i] = column;
				widths[i] = column.length();
			}
			// Get ResultSet rows and update column widths also.
			Vector<String[]> rows = new Vector<String[]>();
			while (rs.next()) {
				String[] fields = new String[numColumns];
				for (int i = 0; i < numColumns; i++) {
					fields[i] = rs.getString(i + 1);
					widths[i] = Math.max(widths[i], fields[i].length());
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
			for (int i = 0; i < numColumns; i++) {
				tableHeading += (pad(columns[i], widths[i]) + " | ");
			}
			System.out.println(tableHeading);
			// Print rows.
			int j = 0;
			for (j = 0; j < rows.size(); j++) {
				String[] row = rows.get(j);
				String rowString = "| ";
				for (int i = 0; i < numColumns; i++) {
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
	public static String pad(String base, int width) {
		StringBuffer baseBuffer = new StringBuffer(base);
		int padLength = width - base.length();
		for (int i = 0; i < padLength; i++) {
			baseBuffer.append(" ");
		}
		return baseBuffer.toString();
	}
}

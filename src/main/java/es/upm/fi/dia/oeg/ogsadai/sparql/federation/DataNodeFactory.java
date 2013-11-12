package es.upm.fi.dia.oeg.ogsadai.sparql.federation;

import java.net.MalformedURLException;
import java.util.Random;
import java.util.Set;

import uk.org.ogsadai.converters.databaseschema.TableMetaData;
import uk.org.ogsadai.converters.databaseschema.TableMetaDataImpl;
import uk.org.ogsadai.dqp.common.DataDictionary;
import uk.org.ogsadai.dqp.common.DataNode;
import uk.org.ogsadai.dqp.common.EvaluationNode;
import uk.org.ogsadai.dqp.common.PhysicalSchema;
import uk.org.ogsadai.dqp.common.TableSchema;
import uk.org.ogsadai.dqp.common.simple.SimplePhysicalSchema;
import uk.org.ogsadai.dqp.common.simple.SimpleTableSchema;
import uk.org.ogsadai.dqp.presentation.common.SimpleDataNode;
import uk.org.ogsadai.dqp.presentation.common.SimpleEvaluationNode;
import uk.org.ogsadai.dqp.presentation.jersey.JerseyEvaluationNode;

public class DataNodeFactory
{

    // Suppress default constructor for noninstantiability
    private DataNodeFactory()
    {
        throw new AssertionError();
    }

    /**
     * gets the node in which the query will be executed
     * 
     * @param dataDictionary
     * @param source
     * @return
     */
    public static DataNode create(DataDictionary dataDictionary, String source,
            String sourceUUID)
    {
        DataNode newDataNode = null;
        try
        {
            Set<EvaluationNode> serverList = ((SimpleRDFDataDictionary) dataDictionary)
                    .getEvaluationNodes();
            Random rand = new Random(serverList.size());
            int x = rand.nextInt(serverList.size());
            EvaluationNode server = (EvaluationNode) serverList.toArray()[x];
            EvaluationNode newEvaluationNode = new JerseyEvaluationNode(server
                    .getServer().getDefaultBaseServicesURL().toString(),
                    "DataRequestExecutionResource", server.getServer()
                            .getDefaultDataSourceServiceName(), server
                            .getServer().getDefaultDataSinkServiceName(), false);
            newDataNode = new SimpleDataNode("DataRequestExecutionResource",
                    sourceUUID, newEvaluationNode);
            String catalog = dataDictionary.getTableSchemas().iterator().next()
                    .getSchema().getCatalogName();
            TableMetaData tableMetaData = null;
            PhysicalSchema physicalSchema = new SimplePhysicalSchema(
                    "tableMetadataName", "tableMetadataSchema", 10000, 10, 10);
            tableMetaData = new TableMetaDataImpl(catalog, source,
                    "someTableName");
            TableSchema schema = new SimpleTableSchema(catalog, newDataNode,
                    tableMetaData, physicalSchema);
            ((SimpleRDFDataDictionary) dataDictionary).add(schema);
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        return newDataNode;
    }

}

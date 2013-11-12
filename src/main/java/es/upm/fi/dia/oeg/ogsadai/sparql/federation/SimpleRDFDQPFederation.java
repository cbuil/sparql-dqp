// Copyright (c) Copyright (c) The University of Edinburgh, Universidad Politecnica de Madrid, 2009-2012.
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


package es.upm.fi.dia.oeg.ogsadai.sparql.federation;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import uk.org.ogsadai.activity.extension.ServiceAddresses;
import uk.org.ogsadai.common.msgs.DAILogger;
import uk.org.ogsadai.config.Key;
import uk.org.ogsadai.context.OGSADAIConstants;
import uk.org.ogsadai.context.OGSADAIContext;
import uk.org.ogsadai.converters.databaseschema.TableMetaData;
import uk.org.ogsadai.converters.databaseschema.TableMetaDataImpl;
import uk.org.ogsadai.dqp.common.DataDictionary;
import uk.org.ogsadai.dqp.common.DataNode;
import uk.org.ogsadai.dqp.common.EvaluationNode;
import uk.org.ogsadai.dqp.common.PhysicalSchema;
import uk.org.ogsadai.dqp.common.RequestDetails;
import uk.org.ogsadai.dqp.common.TableSchema;
import uk.org.ogsadai.dqp.common.simple.SimplePhysicalSchema;
import uk.org.ogsadai.dqp.common.simple.SimpleTableSchema;
import uk.org.ogsadai.dqp.lqp.udf.FunctionRepository;
import uk.org.ogsadai.dqp.presentation.common.DQPResourceConfiguration;
import uk.org.ogsadai.dqp.presentation.common.DQPResourceConfigurationException;
import uk.org.ogsadai.dqp.presentation.common.ExtractLogicalSchemaException;
import uk.org.ogsadai.dqp.presentation.common.TableSchemaFetcher;
import uk.org.ogsadai.dqp.presentation.common.XMLDQPResourceConfiguration;
import uk.org.ogsadai.resource.dataresource.dqp.DQPFederation;
import uk.org.ogsadai.resource.dataresource.dqp.DuplicateResourceNameException;
import uk.org.ogsadai.server.OGSADAIWebServerContext;

/**
 * Class that configures the SPARQL federation. It reads the DQP configuration
 * file, getting and initialising the DQP data dictionary
 * 
 * @author cbuil
 * 
 */
public class SimpleRDFDQPFederation implements DQPFederation
{
    /** Copyright notice. */
    private static final String COPYRIGHT_NOTICE = "Copyright (c) Universidad Politecnica de Madrid, 2009.";

    /** Logger for this class. */
    private static final DAILogger LOG = DAILogger
            .getLogger(SimpleRDFDQPFederation.class);

    /** Configuration key for fetch physical schema flag. */
    private static final Key FETCH_PHYSICAL_SCHEMA_KEY = 
        new Key("dqp.resource.fetch.physical.schema");

    /** DQP configuration. */
    private DQPResourceConfiguration mConfig;

    /** Data dictionary. */
    private DataDictionary mDictionary;

    /** 
     * Flag to control whether or not we get the physical schema. Not
     * We will almost always wish to do this but during development while
     * this is flakey some users do no wish this.
     */
    private boolean mFetchPhysicalSchema = true;

    /**
     * Constructor.
     */
    public SimpleRDFDQPFederation()
    {
        mConfig = new XMLDQPResourceConfiguration();
    }

    public void setConfiguration(DQPResourceConfiguration config)
    {
        mConfig = config;
    }

    public void setFetchPhysicalSchema(boolean fetch)
    {
        mFetchPhysicalSchema = fetch;
    }
    
    /**
     * {@inheritDoc}
     */
    public DataDictionary getDataDictionary(
            RequestDetails requestDetails)
            throws DQPResourceConfigurationException
    {
        // lazy initialisation
        if (mDictionary == null)
        {
            try
            {
                populateDataDictionary(requestDetails);
            }
            catch (DuplicateResourceNameException e)
            {
                throw new DQPResourceConfigurationException(e);
            }
            catch (ExtractLogicalSchemaException e)
            {
                throw new DQPResourceConfigurationException(e);
            }
            catch (Exception e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return mDictionary;
    }

    /**
     * {@inheritDoc}
     */
    public void refreshDataDictionary(RequestDetails requestDetails)
            throws DQPResourceConfigurationException
    {
        try
        {
            populateDataDictionary(requestDetails);
        }
        catch (DuplicateResourceNameException e)
        {
            throw new DQPResourceConfigurationException(e);
        }
        catch (ExtractLogicalSchemaException e)
        {
            throw new DQPResourceConfigurationException(e);
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * {@inheritDoc}
     */
    public Set<DataNode> getDataNodes()
    {
        return mConfig.getDataNodes();
    }

    /**
     * {@inheritDoc}
     */
    public Set<EvaluationNode> getEvaluationNodes()
    {
        return mConfig.getEvaluationNodes();
    }

    /**
     * {@inheritDoc}
     */
    public EvaluationNode getLocalNode()
    {
        return mConfig.getLocalNode();
    }

    /**
     * Fetches the table schemas from the remote resources and populates the
     * data dictionary.
     * 
     * @param requestDetails
     *            details of parent request
     * 
     * @throws DuplicateResourceNameException
     *             if there is a duplicate resource name or alias name
     * @throws ExtractLogicalSchemaException
     *             if a problem occurred fetching the schemas
     */
    private void populateDataDictionary(RequestDetails requestDetails)
            throws DuplicateResourceNameException,
            ExtractLogicalSchemaException
    {
        LOG.debug("In SimpleDQPFederation#populateDataDictionary");

        SimpleRDFDataDictionary dictionary = new SimpleRDFDataDictionary();
        mDictionary = dictionary;
        dictionary.setFunctionRepository((FunctionRepository) OGSADAIContext
                .getInstance().get(FunctionRepository.FUNCTION_REPOSITORY_KEY));
        dictionary.addEvaluationNodes(mConfig.getEvaluationNodes());

        try
        {
            Set<DataNode> dataNodes = getDataNodes();
            Set<String> resourceNames = new HashSet<String>();

            for (Iterator<DataNode> iterator = dataNodes.iterator(); iterator
                    .hasNext();)
            {
                DataNode node = iterator.next();
                if (!resourceNames.add(node.getTableNamePrefix()))
                {
                    throw new DuplicateResourceNameException(node
                            .getTableNamePrefix());
                }
            }
            TableSchemaFetcher schemaFetcher = mConfig.getTableSchemaFetcher();
            for (Iterator<DataNode> iterator = dataNodes.iterator(); iterator
                    .hasNext();)
            {
                DataNode node = iterator.next();
                if (LOG.isDebugEnabled())
                {
                    LOG.debug("Fetching table schemas at " + node);
                }
                try
                {
                  String catalog = "{" + getURL(requestDetails) + "}"
                     + requestDetails.getResourceID();
                    // These are simply default values if we are
                     // not fetching the physical schema
                     PhysicalSchema physicalSchema = new SimplePhysicalSchema(
                     "tableMetadataName", "tableMetadataSchema", 10000, 10, 10);
                     TableMetaData tableMetaData = new TableMetaDataImpl(catalog,
                     "schema", "someTableName");
                     TableSchema schema = new SimpleTableSchema(catalog, node,
                     tableMetaData, physicalSchema);
                     dictionary.add(schema);
                }
                catch (ExtractLogicalSchemaException e)
                {
                    LOG.debug("Could not access schema at " + node);
                    LOG.warn(e);

                    if (LOG.isDebugEnabled())
                    {
                        StringWriter sw = new StringWriter();
                        e.printStackTrace(new PrintWriter(sw));
                        LOG.debug(sw.toString());
                    }
                }
            }
        }
        catch (Throwable e)
        {
            e.printStackTrace();
            LOG.error(e);
            throw new ExtractLogicalSchemaException(e);
        }

    }

    // /**
    // * Fetches the table schemas from the remote resources and populates the
    // * data dictionary.
    // *
    // * @param requestDetails
    // * details of parent request
    // * @throws Exception
    // */
    // private void populateDataDictionary(RequestDetails requestDetails)
    // throws Exception
    // {
    //
    // LOG.debug("In SimpleDQPFederation#populateDataDictionary");
    //
    // SimpleRDFDataDictionary dictionary = new SimpleRDFDataDictionary();
    // mDictionary = dictionary;
    //
    // // here I (Carlos) should configure/specify in the DQP resource file
    // // where is this schema
    // // TableSchemaFetcher schemaFetcher = mConfig.getTableSchemaFetcher();
    //
    // dictionary.setFunctionRepository((FunctionRepository) OGSADAIContext
    // .getInstance().get(FunctionRepository.FUNCTION_REPOSITORY_KEY));
    // Set<DataNode> dataNodes = getDataNodes();
    //
    // for (Iterator<DataNode> iterator = dataNodes.iterator(); iterator
    // .hasNext();)
    // {
    // DataNode node = iterator.next();
    // // List<TableMetaData> metadata = schemaFetcher.fetchSchema(node,
    // // requestDetails);
    //
    // // for (TableMetaData md : metadata) {
    // String catalog = "{" + getURL(requestDetails) + "}"
    // + requestDetails.getResourceID();
    //
    // // These are simply default values if we are
    // // not fetching the physical schema
    // PhysicalSchema physicalSchema = new SimplePhysicalSchema(
    // "tableMetadataName", "tableMetadataSchema", 10000, 10, 10);
    // // physicalSchema = new SimplePhysicalSchema(
    // // md.getName(),
    // // md.getSchemaName(),
    // // 10000,
    // // 10,
    // // 10);
    // TableMetaData tableMetaData = new TableMetaDataImpl(catalog,
    // "schema", "someTableName");
    // TableSchema schema = new SimpleTableSchema(catalog, node,
    // tableMetaData, physicalSchema);
    // dictionary.add(schema);
    // // }
    // }
    // // try
    // // {
    // // Set<DataNode> dataNodes = getDataNodes();
    // // Set<String> resourceNames = new HashSet<String>();
    // //
    // // for (Iterator<DataNode> iterator = dataNodes.iterator();
    // // iterator.hasNext();)
    // // {
    // // DataNode node = iterator.next();
    // // if (!resourceNames.add(node.getTableNamePrefix()))
    // // {
    // // throw new DuplicateResourceNameException(node.getTableNamePrefix());
    // // }
    // // }
    // // TableSchemaFetcher schemaFetcher = mConfig.getTableSchemaFetcher();
    // // for (Iterator<DataNode> iterator = dataNodes.iterator();
    // // iterator.hasNext();)
    // // {
    // // DataNode node = iterator.next();
    // // if (LOG.isDebugEnabled())
    // // {
    // // LOG.debug("Fetching table schemas at " + node);
    // // }
    // // try
    // // {
    // // List<TableMetaData> metadata =
    // // schemaFetcher.fetchSchema(node, requestDetails);
    // //
    // // Map<String, PhysicalSchema> nameToPhysicalMap =
    // // new HashMap<String, PhysicalSchema>();
    // //
    // // if (mFetchPhyiscalSchema)
    // // {
    // // List<PhysicalSchema> physical =
    // // schemaFetcher.fetchPhysicalSchema(
    // // node, requestDetails);
    // // for(PhysicalSchema ps : physical)
    // // {
    // // nameToPhysicalMap.put(ps.getTableName(), ps);
    // // }
    // // }
    // //
    // // for(TableMetaData md : metadata)
    // // {
    // // String catalog = "{" + getURL() + "}"
    // // + requestDetails.getResourceID();
    // //
    // // PhysicalSchema physicalSchema;
    // // if (mFetchPhyiscalSchema)
    // // {
    // // physicalSchema =
    // // nameToPhysicalMap.get(md.getName());
    // // }
    // // else
    // // {
    // // // These are simply default values if we are
    // // // not fetching the physical schema
    // // physicalSchema = new SimplePhysicalSchema(
    // // md.getName(),
    // // md.getSchemaName(),
    // // 10000,
    // // 10,
    // // 10);
    // // }
    // //
    // // TableSchema schema = new SimpleTableSchema(
    // // catalog, node, md, physicalSchema);
    // // dictionary.add(schema);
    // // }
    // // }
    // // catch (ExtractLogicalSchemaException e)
    // // {
    // // LOG.debug("Could not access schema at " + node);
    // // LOG.warn(e);
    // //
    // // if (LOG.isDebugEnabled())
    // // {
    // // StringWriter sw = new StringWriter();
    // // e.printStackTrace(new PrintWriter(sw));
    // // LOG.debug(sw.toString());
    // // }
    // // }
    // // }
    // // }
    // // catch (Throwable e)
    // // {
    // // e.printStackTrace();
    // // LOG.error(e);
    // // throw new ExtractLogicalSchemaException(e);
    // // }
    //
    // }

    /**
     * Returns the URL of the data resource information service that provides
     * access to this data resource.
     * 
     * @return DRIS URL
     * @throws Exception
     *             If any problems arise in getting the information.
     */
    private String getURL(RequestDetails requestDetails) throws Exception
    {
        OGSADAIContext context = OGSADAIContext.getInstance();
        ServiceAddresses addresses = null;
        if (context.containsKey(OGSADAIConstants.WEB_SERVER_URL))
        {
            try
            {
                // Is there a URL provided in the server configuration?
                addresses = new OGSADAIWebServerContext();
            }
            catch (Exception e)
            {
                LOG.error(e);
            }
        }
        // Either there was no URL or there was a problem so use the
        // request context.
        if (addresses == null)
        {
            addresses = (ServiceAddresses) requestDetails.getRequestResource()
                    .getAttribute(OGSADAIConstants.WEB_SERVER_CONTEXT);
        }
        return addresses.getDataSinkService().toString();
    }
}

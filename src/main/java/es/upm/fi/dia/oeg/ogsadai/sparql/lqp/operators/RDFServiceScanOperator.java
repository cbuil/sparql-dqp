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

package es.upm.fi.dia.oeg.ogsadai.sparql.lqp.operators;

import java.util.ArrayList;
import java.util.List;

import uk.org.ogsadai.common.msgs.DAILogger;
import uk.org.ogsadai.dqp.common.DataDictionary;
import uk.org.ogsadai.dqp.common.DataNode;
import uk.org.ogsadai.dqp.common.DataNodeTable;
import uk.org.ogsadai.dqp.common.EvaluationNode;
import uk.org.ogsadai.dqp.lqp.Annotation;
import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.AttributeImpl;
import uk.org.ogsadai.dqp.lqp.HeadingImpl;
import uk.org.ogsadai.dqp.lqp.OperatorID;
import uk.org.ogsadai.dqp.lqp.OperatorVisitor;
import uk.org.ogsadai.dqp.lqp.ScanOperator;
import uk.org.ogsadai.dqp.lqp.exceptions.AmbiguousAttributeException;
import uk.org.ogsadai.dqp.lqp.exceptions.AmbiguousMappingException;
import uk.org.ogsadai.dqp.lqp.exceptions.LQPException;
import uk.org.ogsadai.dqp.lqp.operators.UnaryOperator;
import uk.org.ogsadai.tuple.TupleTypes;

/**
 * Performs an scan of the triples store in the service
 * 
 * @author cbuil
 * 
 */
public class RDFServiceScanOperator extends UnaryOperator implements
        ScanOperator
{

    /**
     * SPARQL End point Source
     */
    private String source;

    /**
     * SPARQL End point Source
     */
    private String endpointURL;

    /** Logger. */
    private static final DAILogger LOG = DAILogger
            .getLogger(RDFServiceScanOperator.class);

    /** Candidate data node tables. */
    protected List<DataNodeTable> mDataNodeTables;

    /** Data dictionary */
    protected DataDictionary mDataDictionary;

    /** Scan query */
    protected SimpleRDFServiceScanQuery mQuery;

    /**
     * constructor, passes the SPARQL endpoint ID
     * 
     * @param query
     *            the actual query to the SPARQL endpoint/RDF dataset
     * @param source
     *            the RDF data repository
     * @param varList
     *            contains the attributes of the operator, i.e. the attributes
     *            of the final query to the RDF repository
     */
    public RDFServiceScanOperator(String query, String source,
            List<String> varList, List<String> valuesList, String endpointURL)
    {
        this.mID = OperatorID.getInstance("RDF_SERVICE_SCAN");
        List<Attribute> attr = new ArrayList<Attribute>();

        for (String attrb : varList)
        {
            attr.add(new AttributeImpl(attrb, TupleTypes._STRING, source));
        }

        mOperatorHeading = new HeadingImpl(attr);
        this.source = source;
        this.endpointURL = endpointURL;
        mQuery = new SimpleRDFServiceScanQuery(query);
        mQuery.setSourceName(source);
    }

    public DataNode getDataNode()
    {
        DataNode dataNode = Annotation.getDataNodeAnnotation(this);
        EvaluationNode evalNode = Annotation.getEvaluationNodeAnnotation(this);

        if (dataNode != null)
        {
            if (!getDataNodes().contains(dataNode))
            {
                throw new RuntimeException("Inconsistent data.node annotation.");
            }
            else
            {
                return dataNode;
            }
        }
        else if (evalNode != null)
        {
            for (DataNode dn : getDataNodes())
            {
                if (dn.getEvaluationNode().equals(evalNode))
                {
                    return dn;
                }
            }
            throw new RuntimeException(
                    "Inconsistent evaluation.node annotation.");
        }
        else
        {
            return mDataNodeTables.get(0).getDataNode();
        }
    }

    public List<DataNode> getDataNodes()
    {
        List<DataNode> dataNodeList = new ArrayList<DataNode>();
        for (DataNodeTable dnt : mDataNodeTables)
        {
            dataNodeList.add(dnt.getDataNode());
        }
        return dataNodeList;
    }

    public void setDataDictionary(DataDictionary dataDictionary)
    {
        mQuery.setDataDictionary(dataDictionary);
        mDataDictionary = dataDictionary;
    }

    public void accept(OperatorVisitor visitor)
    {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update() throws LQPException
    {

        // TESTING PURPOSES
        // REMOVE WHEN WORKING WITH SERVERS

        if (mDataDictionary == null)
        {
            throw new IllegalStateException("Data Dictionary has not been set.");
        }

     // This is loading data node tables from the dictionary. first gets the
        // table schema: TableSchema[name=bsbm_offers_someTableName]. Each one
        // has a data node associated
        mDataNodeTables = mDataDictionary.getTableSchema(
                source + "_someTableName").getDataNodeTables();
        mOperatorHeading = new HeadingImpl(mOperatorHeading);
    }

    @Override
    public long getResultCardinality()
    {
        return 1000;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void validate() throws LQPException
    {
    }

    public void setProjectAttributes(List<Attribute> attr)
    {
        mOperatorHeading = new HeadingImpl(attr);
    }

    /**
     * returns the query which will be sent to the SPARQL end point
     * 
     * @return
     */
    public String getPhysicalDatabaseQuery()
    {
        String query = "";
        try
        {
            query = mQuery.getPhysicalDatabaseSPARQLQuery(source);
            System.out.println(query);
        }
        catch (AmbiguousMappingException e)
        {
            e.printStackTrace();
        }
        catch (AmbiguousAttributeException e)
        {
            e.printStackTrace();
        }
        return query;
    }

    public void setOrigin(String source)
    {
        this.source = source;

    }

    public String getSource()
    {
        return source;

    }

    public void setEndpointURL(String url)
    {
        this.endpointURL = url;

    }

    public String getEndpointURL()
    {
        return endpointURL;

    }

    /**
     * Gets the query used to implement the table scan. As more operators get
     * imploded into this operator the query can get progressively more complex.
     * <p>
     * Implosion optimisers will typically cast the result of this call to a
     * subclass that provides more functionality.
     * 
     * @return the query that will be executed by the operator.
     */
    public SimpleRDFServiceScanQuery getQuery()
    {
        return mQuery;
    }

    public void setQuery(List<Attribute> attr)
    {
        // List<Attribute> attr = new ArrayList<Attribute>();
        // attr.add(new AttributeImpl(subject, TupleTypes._STRING, source));
        // attr.add(new AttributeImpl(predicate, TupleTypes._STRING, source));
        // attr.add(new AttributeImpl(object, TupleTypes._STRING, source));
        // mOperatorHeading = mOperatorHeading.createMerged(new
        // HeadingImpl(attr));
    }

    public void addDataNodeTable(DataNodeTable dnTable)
    {
        this.mDataNodeTables.add(dnTable);

    }

}

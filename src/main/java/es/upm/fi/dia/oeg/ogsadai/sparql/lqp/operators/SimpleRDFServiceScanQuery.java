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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import uk.org.ogsadai.converters.databaseschema.ColumnMetaData;
import uk.org.ogsadai.converters.databaseschema.TableMetaData;
import uk.org.ogsadai.dqp.common.DataDictionary;
import uk.org.ogsadai.dqp.common.TableSchema;
import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.AttributeImpl;
import uk.org.ogsadai.dqp.lqp.Heading;
import uk.org.ogsadai.dqp.lqp.HeadingImpl;
import uk.org.ogsadai.dqp.lqp.RenameMap;
import uk.org.ogsadai.dqp.lqp.exceptions.AmbiguousAttributeException;
import uk.org.ogsadai.dqp.lqp.exceptions.AmbiguousMappingException;
import uk.org.ogsadai.dqp.lqp.exceptions.TableNotFoundException;
import uk.org.ogsadai.resource.dataresource.dqp.DQPInternalException;

/**
 * The query to a SERVICE is contained in this operator
 * 
 * @author cbuil
 *
 */
public class SimpleRDFServiceScanQuery implements ServiceScanQuery
{

    /** Default cardinality */
    protected static final long DEFAULT_CARDINALITY = 1000;

    /** Table names used in a query. */
    private List<String> mTableNames = new ArrayList<String>();

    /** Attributes in the select list. */
    private List<Attribute> mProjectAttributes = new ArrayList<Attribute>();

    /** A list of predicates. */
    private List<String> mPredicateList = new ArrayList<String>();
    
    /** Data dictionary. */
    private DataDictionary mDataDictionary;

    /**
     * the rename map
     */
    protected RenameMap mRenameMap;
    
    /**
     * The query to the RDF repository
     */
    private String query;

    /**
     * The SERVICE Scan query is added to the system
     *  
     * @param query
     */
    public SimpleRDFServiceScanQuery(String query)
    {
        this.query = query;
    }

    // @Override
    public void addPredicate(String predicate)
    {
        mPredicateList.add(predicate);
    }

    public Heading getHeading() throws TableNotFoundException
    {
        if (mProjectAttributes.size() == 0)
        {
            Heading physicalHead = mDataDictionary.getHeading(mTableNames
                    .get(0));
            return new HeadingImpl(physicalHead);
        }
        else
        {
            for (Attribute attr : mProjectAttributes)
            {
                String attrName = attr.getName();
                TableSchema tableSchema = mDataDictionary.getTableSchema(attr
                        .getSource());
                TableMetaData tableMetaData = tableSchema.getSchema();
                for (int i = 0; i < tableMetaData.getColumnCount(); ++i)
                {
                    ColumnMetaData colMetaData = tableMetaData.getColumn(i + 1);
                    if (colMetaData.getName().equals(attrName))
                    {
                        attr.setType(colMetaData.getTupleType());
                    }
                }
            }
            return new HeadingImpl(mProjectAttributes);
        }
    }

    public String getPhysicalDatabaseSPARQLQuery(String source)
            throws AmbiguousMappingException, AmbiguousAttributeException
    {
        try
        {
            Map<Attribute, Attribute> renameMap = new HashMap<Attribute, Attribute>();
            List<String> localTableNames = new ArrayList<String>();
            for (String name : mTableNames)
            {
                String localName = source;
                // mDataDictionary.getTableSchema(name).
                // getDataNodeTable(dataNode).getOriginalTableName();

                localTableNames.add(localName);
                for (Attribute attr : mDataDictionary.getHeading(name)
                        .getAttributes())
                {
                    renameMap.put(attr, attr
                            .getCloneNewSource(localName, false));
                }
            }

            // careful here, I skip the rename map.
            // Anyway I'm not using it because my table name is always the same,
            // but careful
            List<Attribute> localAtributes = new ArrayList<Attribute>();
            for (Attribute attr : mProjectAttributes)
            {
                // localAtributes.add(renameMap.get(attr));
                localAtributes.add(new AttributeImpl(mRenameMap
                        .getOriginalAttribute(attr)
                        + " = " + attr, attr.getType(), attr.getSource()));
            }

            List<String> localPredicateList = new ArrayList<String>();
            for (String p : mPredicateList)
            {
                localPredicateList.add(p);
            }

//            return generateSPARQL(localTableNames, localAtributes,
//                    localPredicateList);
            return query;
        }
        catch (TableNotFoundException e)
        {
            // This should not occur.
            throw new DQPInternalException(e);
        }
    }

    public String getSPARQLQuery()
    {
//        return generateSPARQL(mTableNames, mProjectAttributes, mPredicateList);
        return query;
    }
    
    public String getServiceQuery()
    {
        return query;
    }

    public String getSourceName()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public void setDataDictionary(DataDictionary dataDictionary)
    {
        this.mDataDictionary = dataDictionary;
    }

    public void setSourceName(String sourceName)
    {
        // TODO Auto-generated method stub

    }

    private static String generateSPARQL(List<String> tableNames,
            List<Attribute> projectAttributes, List<String> predicateList)
    {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT ");
        if (projectAttributes.size() == 0)
        {
            sb.append("*");
        }
        else
        {
            for (int i = 0; i < projectAttributes.size(); i++)
            {
                String s = projectAttributes.get(i).getName().substring(
                        projectAttributes.get(i).getName().indexOf('=') + 2,
                        projectAttributes.get(i).getName().length());
                sb.append("?" + s.substring(s.indexOf('.') + 1));
                if (i < projectAttributes.size() - 1)
                {
                    sb.append(" ");
                }
            }
        }

        if (predicateList.size() > 0)
        {
            sb.append(" WHERE {");

            Map<String, String> triple = new HashMap<String, String>();

            for (int i = 0; i < predicateList.size(); i++)
            {
                String p = predicateList.get(i);
                if (p.substring(p.indexOf('.') + 1, p.indexOf('=') - 1).equals(
                        "subject"))
                {
                    triple.put("subject", "<" + p.substring(p.indexOf('=') + 2)
                            + ">");
                }
                if (p.substring(p.indexOf('.') + 1, p.indexOf('=') - 1).equals(
                        "predicate"))
                {
                    triple.put("predicate", "<"
                            + p.substring(p.indexOf('=') + 2) + ">");
                }
                if (p.substring(p.indexOf('.') + 1, p.indexOf('=') - 1).equals(
                        "object"))
                {
                    triple.put("object", "<" + p.substring(p.indexOf('=') + 2)
                            + ">");
                }
                // sb.append(predicateList.get(i).toString());
            }

            Set<String> set = triple.keySet();
            if (!set.contains("subject"))
            {
                for (Attribute att : projectAttributes)
                {
                    if (att.getName().contains("subject"))
                    {
                        String s = att.getName().substring(
                                att.getName().indexOf('=') + 2);
                        triple.put("subject", "?"
                                + s.substring(s.indexOf('.') + 1));
                    }
                }
            }
            if (!set.contains("object"))
            {
                for (Attribute att : projectAttributes)
                {
                    if (att.getName().contains("object"))
                    {
                        String s = att.getName().substring(
                                att.getName().indexOf('=') + 2);
                        triple.put("object", "?"
                                + s.substring(s.indexOf('.') + 1));
                    }
                }
            }
            if (!set.contains("predicate"))
            {
                for (Attribute att : projectAttributes)
                {
                    if (att.getName().contains("predicate"))
                    {
                        String s = att.getName().substring(
                                att.getName().indexOf('=') + 2);
                        triple.put("predicate", "?"
                                + s.substring(s.indexOf('.') + 1));
                    }
                }
            }

            sb.append(triple.get("subject") + " " + triple.get("predicate")
                    + " " + triple.get("object") + " }");
        }
        return sb.toString();// + " LIMIT 1000 OFFSET 9000";
    }

    // @Override
    public void setProjectAttributes(List<Attribute> attributeList)
    {
        mProjectAttributes.clear();
        for (Attribute attr : attributeList)
        {
            mProjectAttributes.add(attr.getClone(false));
        }
    }

    public void setRenameMap(RenameMap renameMap)
    {
        mRenameMap = renameMap;
    }
}
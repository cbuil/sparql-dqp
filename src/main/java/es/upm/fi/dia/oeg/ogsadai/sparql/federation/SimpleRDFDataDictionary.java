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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import uk.org.ogsadai.converters.databaseschema.ColumnMetaData;
import uk.org.ogsadai.converters.databaseschema.KeyMetaData;
import uk.org.ogsadai.converters.databaseschema.TableMetaData;
import uk.org.ogsadai.dqp.common.EvaluationNode;
import uk.org.ogsadai.dqp.common.TableSchema;
import uk.org.ogsadai.dqp.common.simple.SimpleDataDictionary;
import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.AttributeImpl;
import uk.org.ogsadai.dqp.lqp.Heading;
import uk.org.ogsadai.dqp.lqp.HeadingImpl;
import uk.org.ogsadai.dqp.lqp.exceptions.TableNotFoundException;
import uk.org.ogsadai.dqp.lqp.udf.FunctionRepository;

/**
 * Simple implementation of a data dictionary which stores the table schemas in
 * memory.
 * 
 * TODO: doc
 * 
 * @author The OGSA-DAI Project Team.
 */
public class SimpleRDFDataDictionary extends SimpleDataDictionary //implements DataDictionary 
{
    /** Copyright notice. */
    private static final String COPYRIGHT_NOTICE = 
            "Copyright (c) The University of Edinburgh, 2008, Universidad Politecnica de Madrid, 2011";

    private final Set<TableSchema> mLogicalSchemas = new HashSet<TableSchema>();

    private final Map<String, TableSchema> mTableMetadata = new HashMap<String, TableSchema>();

    private FunctionRepository mFunctionRepository;

    private final List<String> mServerList = new ArrayList<String>();

    private Set<EvaluationNode> mEvaluationNodes;

    public Set<TableSchema> getTableSchemas()
    {
        return mLogicalSchemas;
    }

    /**
     * Add a new schema to the data dictionary.
     * 
     * @param schema
     *            table schema to add
     */
    public synchronized void add(TableSchema schema)
    {
        mLogicalSchemas.add(schema);
        mTableMetadata.put(schema.getTableName(), schema);
    }

    /**
     * Remove a schema from the data dictionary.
     * 
     * @param schema
     *            table schema to remove
     */
    public synchronized void remove(TableSchema schema)
    {
        mLogicalSchemas.remove(schema);
        mTableMetadata.remove(schema.getTableName());
    }

    public Heading getHeading(String tableName) throws TableNotFoundException
    {
        TableSchema schema = mTableMetadata.get(tableName);
        if (schema == null)
        {
            throw new TableNotFoundException(tableName);
        }

        Set<String> keyColumnNameSet = new HashSet<String>();
        TableMetaData metadata = schema.getSchema();
        String[] primaryKeys = metadata.getPrimaryKeys();
        if (primaryKeys.length == 1)
        {
            // we can use only non composite key for attributes
            keyColumnNameSet.add(primaryKeys[0]);
        }

        KeyMetaData[] kmdArray = metadata.getImportedKeys();
        if (kmdArray != null)
        {
            for (KeyMetaData kmd : kmdArray)
            {
                keyColumnNameSet.add(kmd.getPrimaryKeyColumnName());
            }
        }

        List<Attribute> attribList = new ArrayList<Attribute>();
        for (int i = 1; i <= metadata.getColumnCount(); i++)
        {
            ColumnMetaData column = metadata.getColumn(i);
            int type = column.getTupleType();

            boolean isPrimaryKey = column.isPrimaryKey() ? true
                    : keyColumnNameSet.contains(column.getName());

            attribList.add(new AttributeImpl(column.getName(), type, tableName,
                    isPrimaryKey));
        }

        return new HeadingImpl(attribList);
    }

    public TableSchema getTableSchema(String tableName)
            throws TableNotFoundException
    {
        TableSchema schema = mTableMetadata.get(tableName);
        if (schema == null)
        {
            throw new TableNotFoundException(tableName);
        }
        return schema;
    }

    /**
     * Sets the function repository of this data dictionary.
     * 
     * @param functionRepository
     *            repository
     */
    public void setFunctionRepository(FunctionRepository functionRepository)
    {
        mFunctionRepository = functionRepository;
    }

    public FunctionRepository getFunctionRepository()
    {
        return mFunctionRepository;
    }

    public void addEvaluationNodes(Set<EvaluationNode> evaluationNodes)
    {
        mEvaluationNodes = evaluationNodes;
    }

    public Set<EvaluationNode> getEvaluationNodes()
    {
        return mEvaluationNodes;
    }

}
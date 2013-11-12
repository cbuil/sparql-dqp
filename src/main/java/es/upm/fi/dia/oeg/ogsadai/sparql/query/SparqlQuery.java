package es.upm.fi.dia.oeg.ogsadai.sparql.query;

import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.CommonTree;

public abstract class SparqlQuery implements SparqlQueryInterface
{
    
    /** Copyright notice. */
    private static final String COPYRIGHT_NOTICE =
        "Copyright (c) Universidad Politecnica de Madrid, 2012";

    /** Query Prefixes. */
    protected List<Prefix> mQueryPrefixes;

    /** Parent operator. */
    protected List<Dataset> mQueryDatasets;

    /** Operator ID. */
    protected QueryType mQueryType;
    
    /** Query AST. */
    protected CommonTree mQueryAst;
    
    protected Map<String, CommonTree> mQueryStructure;
    
    protected String mDefaultDataset;

    /**
     * {@inheritDoc}
     */
    public List<Prefix> getPrefixes()
    {
        return mQueryPrefixes;
    }

    /**
     * {@inheritDoc}
     */
    public List<Dataset> getDatasets()
    {
        return mQueryDatasets;
    }
    
    /**
     * {@inheritDoc}
     */
    public QueryType getQueryType()
    {
        return mQueryType;
    }
    
    @Override
    public Map<String, CommonTree> getQueryStructure()
    {
        return mQueryStructure;
    }

    @Override
    public void setQueryStructure(Map<String, CommonTree> queryStructure)
    {
        mQueryStructure = queryStructure;
    }
    
    public void setDefaultDataset(String dataset)
    {
        mDefaultDataset = dataset;
    }

    public String getDefaultDataset()
    {
        return mDefaultDataset;
    }
}

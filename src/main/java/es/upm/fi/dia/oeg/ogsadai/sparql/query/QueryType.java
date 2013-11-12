package es.upm.fi.dia.oeg.ogsadai.sparql.query;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class QueryType
{
    /** Copyright notice. */
    private static final String COPYRIGHT_NOTICE =
        "Copyright (c) Universidad Politecnica de Madrid, 2012";

    /** String ID. */
    private final String mQueryType;
    
    /** Mapping of string OperatorID representations to OperatorID objects. */
    private static final Map<String, QueryType> NAMES =
        new ConcurrentHashMap<String, QueryType>();
    
    /** Types of SPARQL Query. */
    public static final QueryType SELECT_QUERY = new QueryType("SELECT_QUERY");
    
    /**
     * Constructs a new operator ID.
     * 
     * @param id
     *            id
     */
    private QueryType(String id)
    {
        mQueryType = id;
        NAMES.put(id, this);
    }
    
    /**
     * {@inheritDoc}
     */
    public String toString()
    {
        return mQueryType;
    }
}

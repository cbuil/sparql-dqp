package es.upm.fi.dia.oeg.ogsadai.sparql.federation;

public class QueryBuilderFactory
{
    // Suppress default constructor for noninstantiability
    private QueryBuilderFactory()
    {
        throw new AssertionError();
    }
    
    public static QueryBuilder create(QueryExecutionContext context)
    {
        return new QueryBuilder(context);
    }
}

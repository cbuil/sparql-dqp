package es.upm.fi.dia.oeg.ogsadai.sparql.query;

public class SparqlQueryFactory
{

    public SparqlQueryFactory()
    {

    }
    
    public static SparqlQuery createSparqlQuery(QueryType queryType){
        
        SparqlQuery sparqlQuery = null;
        
        if(queryType.equals(QueryType.SELECT_QUERY)){
            sparqlQuery = new SparqlSelectQuery();
        }
        return sparqlQuery;
    }
}

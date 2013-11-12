package es.upm.fi.dia.oeg.ogsadai.sparql.client.config;

public class Query
{
    private String name;
    private String sparql;
    
    public Query(String name, String sparql) {
            this.name = name;
            this.sparql = sparql;
    }
    
    public String getQuery() {
            return this.sparql;
    }
    
    public String getName() {
            return this.name;
    }

}

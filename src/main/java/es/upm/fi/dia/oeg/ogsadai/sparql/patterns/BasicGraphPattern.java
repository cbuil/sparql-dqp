package es.upm.fi.dia.oeg.ogsadai.sparql.patterns;

public interface BasicGraphPattern
{
    
    public boolean isSubjectIri();
    
    public boolean isPredicatetIri();
    
    public boolean isObjectIri();

    public String getSubject();
    
    public String getPredicate();
    
    public String getObject();
    
    public void setSubject(String subject);
    
    public void setPredicate(String predicate);
    
    public void setObject(String object);
}

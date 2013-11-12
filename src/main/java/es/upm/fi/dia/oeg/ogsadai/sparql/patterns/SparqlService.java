package es.upm.fi.dia.oeg.ogsadai.sparql.patterns;

import java.util.Set;

import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.Operator;

public interface SparqlService
{
    public String getServiceURI();
    
    public String getServiceVariable();
    
    public Set<Attribute> getServiceVariables();
    
    public void setServiceURI(String uri);
    
    public void setServiceVariable(String var);
    
    public void setServiceVariables(Set<Attribute> serviceVariables);
    
    public void setServiceOperator(Operator service);
    
    public Operator getServiceOperator();
    
    public void setServiceQuery(String query);
    
    public String getServiceQuery();
    
}

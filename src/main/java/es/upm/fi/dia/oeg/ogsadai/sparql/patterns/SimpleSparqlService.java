package es.upm.fi.dia.oeg.ogsadai.sparql.patterns;

import java.util.Set;

import uk.org.ogsadai.dqp.lqp.Attribute;
import uk.org.ogsadai.dqp.lqp.Operator;

public class SimpleSparqlService implements SparqlService
{
    
    private Set<Attribute> mServiceVariables;
    
    private String mServiceURI;
    
    private Operator mOperator;
    
    private String mQuery;
    
    private String mServiceVariable;
    
    public SimpleSparqlService(Operator service){
        mOperator = service;
        mServiceVariables = mOperator.getUsedAttributes();
    }

    @Override
    public String getServiceURI()
    {
        return mServiceURI;
    }

    @Override
    public Set<Attribute> getServiceVariables()
    {
        return mServiceVariables;
    }

    @Override
    public void setServiceURI(String uri)
    {
        mServiceURI = uri;
    }

    @Override
    public void setServiceVariables(Set<Attribute> serviceVariables)
    {
        mServiceVariables = serviceVariables;
    }

    @Override
    public void setServiceOperator(Operator service)
    {
        mOperator = service;
    }

    @Override
    public Operator getServiceOperator()
    {
        return mOperator.getChild(0);
    }

    @Override
    public void setServiceQuery(String query)
    {
        mQuery = query;
    }

    @Override
    public String getServiceQuery()
    {
        return mQuery;
    }

    @Override
    public String getServiceVariable()
    {
        return mServiceVariable;
    }

    @Override
    public void setServiceVariable(String var)
    {
        mServiceVariable = var;
    }

}

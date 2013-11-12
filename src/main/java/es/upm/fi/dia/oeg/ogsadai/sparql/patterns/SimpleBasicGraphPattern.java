package es.upm.fi.dia.oeg.ogsadai.sparql.patterns;


public class SimpleBasicGraphPattern implements BasicGraphPattern
{
    private String mSubject;
    private String mPredicate;
    private String mObject;

    public SimpleBasicGraphPattern(String subject, String predicate, String object)
    {
        mSubject = subject;
        mPredicate = predicate;
        mObject = object;
    }
    
    public SimpleBasicGraphPattern()
    {
        // empty triple pattern
    }


    public boolean isSubjectIri()
    {
        if (mSubject.contains("http"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isObjectIri()
    {
        if (mObject.contains("http"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isPredicatetIri()
    {
        if (mPredicate.contains("http"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getSubject()
    {
        return mSubject;
    }

    public void setSubject(String subject)
    {
        this.mSubject = subject;
    }

    public String getPredicate()
    {
        return mPredicate;
    }

    public void setPredicate(String predicate)
    {
        this.mPredicate = predicate;
    }

    public String getObject()
    {
        return mObject;
    }

    public void setObject(String object)
    {
        this.mObject = object;
    }
    
    @Override
    public String toString()
    {
        return mSubject + " " + mPredicate + " " + mObject;
    }

}

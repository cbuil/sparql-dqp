package es.upm.fi.dia.oeg.ogsadai.sparql.query;

public class PrefixImpl implements Prefix
{
    
    String[] mPrefix;

    @Override
    public String[] getPrefix()
    {
        return mPrefix;
    }


    @Override
    public void setPrefix(String[] prefix)
    {
        mPrefix = prefix;
    }
    
    @Override public String toString() {
        return mPrefix[0] + ": " + mPrefix[1];
        
    }


    @Override
    public String getPrefixName()
    {
        return mPrefix[0];
    }


    @Override
    public String getPrefixValue()
    {
        return mPrefix[1];
    }

}

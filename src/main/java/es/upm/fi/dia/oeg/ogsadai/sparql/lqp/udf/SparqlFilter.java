package es.upm.fi.dia.oeg.ogsadai.sparql.lqp.udf;

public abstract class SparqlFilter
{
    private String mBuiltInCall;

    private String mFunctionCall;

    private String mExpression = "";
    
    private String mFullFilterExpression = "";

    public SparqlFilter()
    {
        
    }

    /**
     * @return the mBuiltInCall
     */
    public String getBuiltInCall()
    {
        return mBuiltInCall;
    }

    /**
     * @param mBuiltInCall the mBuiltInCall to set
     */
    public void setBuiltInCall(String mBuiltInCall)
    {
        this.mBuiltInCall = mBuiltInCall;
    }

    /**
     * @return the mFunctionCall
     */
    public String getFunctionCall()
    {
        return mFunctionCall;
    }

    /**
     * @param mFunctionCall the mFunctionCall to set
     */
    public void setFunctionCall(String mFunctionCall)
    {
        this.mFunctionCall = mFunctionCall;
    }

    /**
     * @return the symbol
     */
    public String getExpression()
    {
        return mExpression;
    }

    /**
     * @param symbol the symbol to set
     */
    public void setExpression(String symbol)
    {
        this.mExpression = symbol;
    }

    /**
     * @return the mFullFilterExpression
     */
    public String getFullFilterExpression()
    {
        return mFullFilterExpression;
    }

    /**
     * @param mFullFilterExpression the mFullFilterExpression to set
     */
    public void setFullFilterExpression(String mFullFilterExpression)
    {
        this.mFullFilterExpression = mFullFilterExpression;
    }
}

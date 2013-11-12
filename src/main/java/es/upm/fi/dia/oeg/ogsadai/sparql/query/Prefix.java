package es.upm.fi.dia.oeg.ogsadai.sparql.query;

public interface Prefix
{

    /**
     * Gets a query prefix.
     * 
     * @return A String array of prefix name and the URI.
     */
    public String[] getPrefix();
    
    public String getPrefixName();
    
    public String getPrefixValue();
    
    /**
     * Sets a query prefix.
     * 
     * @return A String array of prefix name and the URI.
     */
    public void setPrefix(String[] prefix);
}

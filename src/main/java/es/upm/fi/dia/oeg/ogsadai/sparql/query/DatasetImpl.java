package es.upm.fi.dia.oeg.ogsadai.sparql.query;

public class DatasetImpl implements Dataset
{
    
    private String mDatasetName;

    @Override
    public String getDatasetName()
    {
        return mDatasetName;
    }

    @Override
    public void setDatasetName(String datasetName)
    {
        mDatasetName = datasetName;
    }

}

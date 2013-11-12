package es.upm.fi.dia.oeg.ogsadai.sparql.client;

import uk.org.ogsadai.activity.ActivityName;
import uk.org.ogsadai.client.toolkit.ActivityOutput;
import uk.org.ogsadai.client.toolkit.SingleActivityOutput;
import uk.org.ogsadai.client.toolkit.activity.ActivityInput;
import uk.org.ogsadai.client.toolkit.activity.BaseResourceActivity;
import uk.org.ogsadai.client.toolkit.activity.SimpleActivityInput;
import uk.org.ogsadai.client.toolkit.activity.SimpleActivityOutput;
import uk.org.ogsadai.client.toolkit.exception.ActivityIOIllegalStateException;
import uk.org.ogsadai.client.toolkit.exception.DataSourceUsageException;
import uk.org.ogsadai.client.toolkit.exception.DataStreamErrorException;
import uk.org.ogsadai.client.toolkit.exception.UnexpectedDataValueException;
import uk.org.ogsadai.data.StringData;

public class RDFActivity extends BaseResourceActivity {
	
	/** Activity output */
	private ActivityOutput mOutput;
	
	/** Activity input */
    private ActivityInput query;

	/** Default activity name */
    public final static ActivityName DEFAULT_ACTIVITY_NAME = 
        new ActivityName("uk.org.ogsadai.SQLQuery");

	public RDFActivity(String SPARQLquery) {
		super(DEFAULT_ACTIVITY_NAME);
		query = new SimpleActivityInput("expression");
		query.add(new StringData(SPARQLquery));
	    mOutput = new SimpleActivityOutput("data");
	    this.setResourceID("DQPResource");
	}

	@Override
	protected ActivityInput[] getInputs() {
		return new ActivityInput[]{query};
	}

	@Override
	protected ActivityOutput[] getOutputs() {
		return new ActivityOutput[]{mOutput};
	}

	@Override
	protected void validateIOState() throws ActivityIOIllegalStateException {
		// TODO Auto-generated method stub
		
	}
	
	/**
     * Gets the output so that it can be connected to the input of other
     * activities.
     * 
     * @return the activity output.
     */
    public SingleActivityOutput getDataOutput()
    {
        return mOutput.getSingleActivityOutputs()[0];
    }

	
	/**
     * Gets if the activity has a next output value.
     * 
     * @return trueif there is another output value, false otherwise.
     *         
     * @throws DataStreamErrorException 
     *             if there is an error on the data stream.
     * @throws UnexpectedDataValueException
     *             if there is an unexpected data value on the data stream.
     * @throws DataSourceUsageException
     *             if there is an error reading from a data source.
     */
    public boolean hasNextOutput()
        throws DataStreamErrorException, 
               UnexpectedDataValueException, 
               DataSourceUsageException
    {
        return mOutput.getDataValueIterator().hasNext();
    }

	
	/**
     * Gets the next output value.
     * 
     * @return the next output value.
     *         
     * @throws DataStreamErrorException 
     *             if there is an error on the data stream.
     * @throws UnexpectedDataValueException
     *             if there is an unexpected data value on the data stream.
     * @throws DataSourceUsageException
     *             if there is an error reading from a data source.
     */
    public StringData nextOutput()
        throws DataStreamErrorException, 
               UnexpectedDataValueException, 
               DataSourceUsageException
    {
        return new StringData((String) mOutput.getDataValueIterator().nextAsString());
    }
    /**
     * Connects the input to the given output.
     * 
     * @param output 
     *    Output to connect to.
     */
    public void connectInput(SingleActivityOutput output)
    {
        query.connect(output);
    }
    
    /**
     * Adds an value to the input.
     * 
     * @param name 
     *     Name to add to the input.
     */
    public void addInput(String name)
    {
    	query.add(new StringData(name));
    }



}

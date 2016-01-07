package student_poll;

public class Student_Poll {
	
	private int surveyResult;
	private int[] frequency = new int[ 11 ];
	
//-------------------------------------------------Constructors---------	
	public Student_Poll() {
		this(0);
	} //end no argument constructor
	
	public Student_Poll( int results ) {
		
		setPollResults( results );
		
	} //end overloaded constructor for results 
	
//-------------------------------------------------Set and Get Methods: Poll Results---------	
	public void setPollResults( int results ) {
		surveyResult = results;
	} //end set poll results 
	
	public int getPollResults() {
		return surveyResult;
	} //end get poll results 

//-------------------------------------------------Set and Get Methods: Frequency---------	
	public void setFrequency( int result ) {
		
		++frequency[result];
		
	} //set frequency 
	
	public int[] getFrequency() {
		return frequency;
	}
	
} //end class student poll

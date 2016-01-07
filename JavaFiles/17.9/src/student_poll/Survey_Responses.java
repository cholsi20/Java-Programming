package student_poll;

public class Survey_Responses {

	public static void main( String[] args ) {
		
		Create_Student_Poll_Text_File newPoll = new Create_Student_Poll_Text_File();
		
		newPoll.openFile();
		newPoll.addResults();
		newPoll.closeFile();
		
	} //end main method 

} //end class survey responses 

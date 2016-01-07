package student_poll;


public class Result_Frequency {

	public static void main( String[] args ) {
		
		Read_Poll_Text_File readResultsFile = new Read_Poll_Text_File();
		
		readResultsFile.openFile();
		readResultsFile.readResults();
		readResultsFile.closeFile();
		
	} //end main method 

} //end public class Result Frequency 

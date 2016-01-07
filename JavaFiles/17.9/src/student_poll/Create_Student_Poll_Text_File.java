package student_poll;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Create_Student_Poll_Text_File {
	
	private Formatter output; //object used to output text to file
	
//-------------------------------------------------Create File---------	
	public void openFile() {
		
		try {
			output = new Formatter( "numbers.txt" );
		} //end try 
		
		catch (SecurityException securityException) {
			System.err.println( "You do not have access to this file" );
			System.exit( 1 ); //terminates program 
		} //end security exception 
		
		catch ( FileNotFoundException fileNotFoundException ) {
			System.err.println( "Error opening or creating the file." );
			System.exit( 1 ); //terminates program 
		}
		
	} //end open file method 
	
//-------------------------------------------------Add Records to File---------	
	public void addResults() {
		//object to be written to file 
		Student_Poll result = new Student_Poll();
		
		Scanner input = new Scanner( System.in );
		
		System.out.printf( "%s\n%s\n%s\n%s\n\n",
			"To terminate input, type the EOF character ", 
			"when you are prompted to enter input.",
			"On Linux/UNIX/ Mac OS X type <ctrl> d then press enter.", 
			"On Windows type <ctrl> z then press enter." );
		
		System.out.printf( "%s\n", "Enter poll result number (between 1-10): " );
		
		while ( input.hasNext() ) {
			
			try  {// output values to file
				
				//retrieve data to be output
				result.setPollResults( input.nextInt() );
				
				if ( result.getPollResults() > 0 && result.getPollResults() < 11 ) {
					//write a new record 
					output.format( "%d\n", result.getPollResults() );
				} //end if there are results entered
				
				else {
					System.out.println( "You must enter a poll result between 1-10." );
				} //end else 
				
			} //end try 
			
			catch (FormatterClosedException formatterClosedException ) {
				System.err.println( "Error writing to file." );
				return;
			} //end catch
			
			catch ( NoSuchElementException noSuchElementException ) {
				System.err.println( "Invalid Input, please try again." );
				return;
			} //end catch
			
			System.out.printf( "%s\n", "Enter poll result number (between 1-10): " );
			
		} //end while 
		
		System.out.println( "You have ended recording the poll results." );
		
	} //end add results 
	
//-------------------------------------------------Add Records to File---------	
	//close the file 
	public void closeFile() {
		
		if ( output != null ) {
			output.close();
		} //end if statement to close file if it was ever opened
		
	} //end method close file 

} //end class create student poll text file 

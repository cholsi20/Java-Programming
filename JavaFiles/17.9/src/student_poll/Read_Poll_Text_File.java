package student_poll;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Read_Poll_Text_File {
	
	private Scanner input;
	

//-------------------------------------------------Open File---------	
	public void openFile() {
		
		try {
			input = new Scanner( new File( "numbers.txt" ) );
		} //end try 
		
		catch (FileNotFoundException fileNotFoundException ) {
			System.err.println( "Error opening file." );
			System.exit( 1 );
		} //end catch 
		
	} //end method open file 
	
//-------------------------------------------------Read Data from File---------	
	public void readResults() {
		
		//object to be written to screen
		Student_Poll results = new Student_Poll();
		//int counter = 0;
		
		System.out.printf( "%s\t%s\n\n", "Result", "Frequency" );
		
		try {
			
			while ( input.hasNext() ) {
				
				//add to frequency array 
				results.setFrequency( input.nextInt() );
				//++counter;
				 
			} //end while statement 
			
			int[] frequency = results.getFrequency();
			
			for ( int count = 0; count < frequency.length; count++ ) {
				
				if ( count > 0 ) {
					System.out.printf( "%d\t%d\n", count, frequency[count] );
				} //end if statement 
				
			} //end for statement 
			
		} //end try statement 
		
		catch ( NoSuchElementException noSuchElementException ) {
			
			System.err.println( "File imporperly formed." );
			input.close();
			System.exit( 1 ); 
			
		} //end catch 
		
	} //end method read results 
	
//-------------------------------------------------Print Data to Screen---------	
	public void closeFile() {
		
		if (input != null ) {
			
			input.close();
			
		} //end if 
		
	} //end close file 
	
	

} //end public class Read Poll Text File 

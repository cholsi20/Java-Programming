/*
 * Courtney Holsinger
 * 11/22/2015
 * Chapter 11
 * 11.18
 */

package catching_exceptions_2;

//import IO Exception
import java.io.IOException;

public class TestExceptions {

	public static void main( String[] args ){
		
		//---------------------------------------------------------Throwing Exception_A
		try {
			//create new Exception_A object to throw 
			throw new Exception_A ( "Exception A");
		} //end try block 
		
		catch( Exception exception ){
			exception.printStackTrace();
		} //end catching using Exception 
		
		//---------------------------------------------------------Throwing Exception_B
		try {
			//create new exception b object to throw 
			throw new Exception_B( "Exception B" );
		} //end try block 
		
		catch( Exception exception ) {
			exception.printStackTrace();
		} //end catch using Exception_A 
		
		//---------------------------------------------------------Throwing NullPointerException
		try {
			//create new NullPointerException
			throw new NullPointerException( "Null Pointer Exception" );
		} //end try block 
		
		catch( Exception exception ) {
			System.out.println( "Throwing Null Pointer Exception.\n" );
			exception.printStackTrace();
		} //end catch block
		
		//---------------------------------------------------------Throwing IOException
		try {
			//create new IO Exception 
			throw new IOException( "IO Exception" );
		} //end try block 
		
		catch( Exception exception ) {
			System.out.println( "Throwing IO Exception.\n" );
			exception.printStackTrace();
		}//end catch block 
		
		
	} //end main method

} //end TestExceptions class

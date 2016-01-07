/*
 * Courtney Holsinger
 * 11.15.2015
 * Chapter 11
 * 11.17
 */

package catching_exceptions;

public class Test_Exceptions {

	public static void main( String[] args ){
		
		try {
			//create new exception b object to throw 
			throw new Exception_B( "Exception_B" );
		} //end try block 
		
		catch( Exception_A exception_a ) {
			exception_a.printStackTrace();
		} //end catch using Exception_A 
		
		
		try {
			//create new exception c object to throw 
			throw new Exception_C( "Exception_C" );
		} //end try block to throw new exception c 
		
		//this catch is not the same as the previous catch
		catch( Exception_A exceptiona ) {
			exceptiona.printStackTrace();
		} //end catch block using superclass exception a 
		
		
		
	} //end main 

} //end class test exceptions 

/*
 * Courtney Holsinger
 * 11.15.2015
 * Chapter 11
 * 11.17
 */

package catching_exceptions;


//make sure all new exception classes extend the existing Exception class - section 11.9
public class Exception_A extends Exception {

	public Exception_A( String someMessage ) {
		
		//calls the superclass constructor of Exception with the parameter of some message to be displayed
		//or printed to the console.
		super( someMessage );
		
	} // end Exception_A constructor 

} //end super class exception A

/*
 * Courtney Holsinger
 * 11/22/2015
 * Chapter 11
 * 11.18
 */

package catching_exceptions_2;

public class Exception_B extends Exception_A {

	public Exception_B( String anotherMessage ) {
		super ( anotherMessage );
	} //end Exception B constructor
	
	@Override
	public String toString() {
		
		return String.format( "%s\n", "Throwing Exception B." );
		
	} //end toString override 
	
} //end class Exception_B 

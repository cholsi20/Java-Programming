/*
 * Courtney Holsinger
 * 11/22/2015
 * Chapter 11
 * 11.18
 */

package catching_exceptions_2;

public class Exception_A extends Exception {

		public Exception_A( String someMessage ) {
			
			//calls the superclass constructor of Exception with the parameter of some message to be displayed
			//or printed to the console.
			super( someMessage );
			System.out.println( toString() );
			
		} // end Exception_A constructor 

		@Override 
		public String toString() {
			return String.format( "%s\n", "Exception A has been thrown.");
		} //end toString override
		
		
} //end class Exception_A

/*
 * Courtney Holsinger
 * 11.15.2015
 * Chapter 11
 * 11.17
 */

package catching_exceptions;

public class Exception_C extends Exception_B {

	public Exception_C( String yetAnotherMessage ) {
		
		//in theory, this message would occur only if some sub-category of Exception B was needed.  
		//i.e. if Exception A handles arithmetic issues, and Exception B handles division issues, but 
		//Subclass C is necessary for handling specifically integer division issues.
		super( yetAnotherMessage );
		
	} //end Exception C constructor 
	
	//add toString

} //end Exception C subclass

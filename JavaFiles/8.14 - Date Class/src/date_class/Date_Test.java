/*
 * Courtney Holsinger
 * 11/1/2015
 * Chapter8
 * 8.14
 */

package date_class;

public class Date_Test {

	public static void main( String[] args ){
		
		System.out.println( "Date constructor 1: ");
		Date date1 = new Date( 2, 29, 1988 );
		
		System.out.println();
		
		System.out.println( "Date constructor 2: ");
		Date date2 = new Date( "October", 19, 2015 );

		System.out.println();
		
		System.out.println( "Date constructor 3: ");
		Date date3 = new Date( 360, 1995 );

		
	} //end main 

} //end date test 

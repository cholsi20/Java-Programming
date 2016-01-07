/*
 * copyright
 * Courtney Holsinger
 * 10.9.15
 * Chapter 6
 * 6.22
 */

package tempeture_conversion;

import java.util.Scanner;

public class Tempeture_Conversion {

	// celsius => fahrenheit conversion 
	public static double celsius( int fahrenheit ){
		
		double celsius = 5.0 / 9.0 * ( fahrenheit - 32 );
		return celsius;
		
	} // end c => f conversion method
	
	// fahrenheit to celsius conversion 
	public static double fahrenheit( int celsius ){
		
		double fahrenheit = 9.0 / 5.0 * celsius + 32;
		return fahrenheit;
		
	} //end f => c conversion
	
	//begin main method 
	public static void main( String[] args ){
		
		//declare variable for switch statement control 
		int choice = 0; 
		
		//create new scanner object 
		Scanner input = new Scanner( System.in );
		
		while ( choice != 3 ){
			
			System.out.printf( "1. Fahrenheit to Celsius\n"
					+ "2. Celsius to Fahrenheit\n"
					+ "3. Exit\n");
			choice = input.nextInt();
			
			switch ( choice ){
			case 1: 
				System.out.print( "Enter tempeture in fahrenheit: " );
				int fahrenheit = input.nextInt();
				System.out.printf( "The tempeture in degree celsius is: %.0f\n\n", celsius(fahrenheit) );
				break;
				
			case 2:
				System.out.print( "Enter tempeture in celsius: " );
				int celsius = input.nextInt();
				System.out.printf( "The tempeture in degree fahrenheit is: %.0f\n\n", fahrenheit(celsius) );
				break;
				
			case 3:
				System.out.println( "You have exited the program." );
				break;
				
			default:
				System.out.println( "This is not a valid entry, please try again." );
				break;
			
			} //end while 
			
		} //end while
		
		
	} //end main method 

} //end class Temp Conversion 

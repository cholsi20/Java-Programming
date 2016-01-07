/*
 * copyright
 * Courtney Holsinger
 * 9.30.2015
 * Chapter 5
 * 5.16
 */

package bar_Chart;

//import scanner object
import java.util.Scanner;

public class Bar_Chart {

	public static void main(String[] args){
		
		//create new scanner object 
		Scanner input = new Scanner(System.in);
		
		//enter initial user prompt 
		System.out.print( "Please enter a number between 1 and 30: " );
		int num = input.nextInt();
		System.out.print( "Please enter a number: " );
		int num1 = input.nextInt();
		System.out.print( "Please enter a number: " );
		int num2 = input.nextInt();
		System.out.print( "Please enter a number: " );
		int num3 = input.nextInt();
		System.out.print( "Please enter a number: " );
		int num4 = input.nextInt();
		System.out.println();

		for( int counter = 0; counter < 5; ++counter){
			int star = 0;
			switch ( counter ){
			case 0: 
				star = num;
				break;
			case 1:
				star = num1;
				break;
			case 2:
				star = num2;
				break;
			case 3:
				star = num3;
				break;
			case 4:
				star = num4;
				break;
			} //end switch 
			for( int asterick = 0; asterick < star; ++asterick ){
				
				if (star< 31 ){
				System.out.print( "*" ); 
				} //end if 
				
			} //end asterick for 
			
			//print new line 
			System.out.println(); 
			
		} //end counter for 
		
	} //end main method 

} //end main method 

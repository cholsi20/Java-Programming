/*
 * Copyright
 * Courtney Holsinger
 * 9.6.2015
 * Chapter 2 Homework 
 * 2.30
 */

package separating_Digits;

import java.util.Scanner; //program for class scanner 

public class Separating_Digits {
	
	public static void main( String[] args ){
		
		//create scanner to obtain input from console 
		Scanner input = new Scanner( System.in );
		
		//variable declaration 
		int digitImput;
		int digit2;
		int digit3;
		int digit4;
		int digit5;
		int digit6;
		int hold1;
		int hold2;
		int hold3;
		int hold4;
		
		
		//prompt user for five digit integer 
		System.out.print( "Please enter a five digit integer: "); 
		digitImput = input.nextInt(); 
		
		
		digit6 = digitImput % 10;
		hold1 = digitImput / 10;
		
		digit5 = hold1 % 10;
		hold2 = hold1 / 10;
		
		digit4 = hold2 % 10;
		hold3 = hold2 / 10; 
		
		digit3 = hold3 % 10; 
		hold4 = hold3 / 10;
		
		digit2 = hold4 % 10;
		
		//print formatted number 
		System.out.printf( "\nThe number %d separated by digits is: %d %d %d %d %d\n", digitImput, 
				digit2, digit3, digit4, digit5, digit6); 
		
} //end main 

} //end class 

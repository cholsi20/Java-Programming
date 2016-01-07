/*
 * Copyright
 * Courtney Holsinger
 * 9.26.2015
 * Chapter 4 Homework 
 * 4.37a
 */

package factorial;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args){
	
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		//declare variables
		int count = 0;
		int number = 1; 
		
		System.out.print( "Please enter the integer you would like the factorial for: ");
		int factorial = input.nextInt();
		
		while ( count < (factorial - 1) ){
			count++; 
			number = count * number; 
			} //end while 
	
		//calculates the factorial of the initial number entered 
		int solution = factorial * number;
		
		//print solution to standard input 
		System.out.printf( "The factorial of !%d is: %d\n", factorial, solution ); 
	
	} //end main method 
	
} //end class factorial 

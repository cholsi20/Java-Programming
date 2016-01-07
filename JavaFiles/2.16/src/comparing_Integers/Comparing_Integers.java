/*
 * Copyright
 * Courtney Holsinger
 * 9.6.2015
 * Chapter 2 Homework 
 * 2.16
 */


package comparing_Integers;

import java.util.Scanner; //program for class scanner 

public class Comparing_Integers {
	
	public static void main( String[] args ){
		
		//create scanner to obtain imput from console 
		Scanner input = new Scanner( System.in );
		
		//variable declaration 
		int number1; //first number for user input 
		int number2; //second number for user input 
		
		//begin prompts to user 
		System.out.print("Enter your first integer: ");
		number1 = input.nextInt(); //reads first number 
		
		System.out.print("Enter your second integer: ");
		number2 = input.nextInt(); //reads first number 
		
		//begin comparisons 
		if ( number1 == number2 )
			System.out.println( "These numbers are equal." );
		
		if ( number1 > number2 )
			System.out.printf( "%d is larger.\n", number1 );
		
		if ( number1 < number2 )
			System.out.printf( "%d is larger.\n", number2 );
		
	} //end main 

} //end class

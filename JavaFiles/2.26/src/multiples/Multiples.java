/*
 * Copyright
 * Courtney Holsinger
 * 9.6.2015
 * Chapter 2 Homework 
 * 2.26
 */

package multiples;

import java.util.Scanner; //program for class scanner 

public class Multiples {
	
public static void main( String[] args ){
		
		//create scanner to obtain imput from console 
		Scanner input = new Scanner( System.in );
		
		//variable declaration 
		int number1; //first number for user input 
		int number2; //second number for user input 
		int remainder; 
		
		//begin prompts to user 
		System.out.print("Enter your first integer: ");
		number1 = input.nextInt(); //reads first number 
		
		System.out.print("Enter your second integer: ");
		number2 = input.nextInt(); //reads first number 
		
		remainder = number1 % number2; 
		
		//begin comparisons 
		if ( remainder != 0 )
			System.out.printf( "%d is not a multiple of %d\n", number1, number2);
		
		if ( remainder == 0 )
			System.out.printf( "%d is a multiple of %d\n", number1, number2);
		
} //end main 

} //end class 

/*
 * Copyright
 * Courtney Holsinger
 * 9.26.2015
 * Chapter 4 Homework 
 * 4.21
 */

package largest_Number;

import java.util.Scanner;

public class Largest_Number {

	public static void main(String[] args){
		
		//find largest of 10 numbers entered by a user 
		//print the largest of the ten integers to standard output 
		
		//declare local variables 
		int counter = 0;
		int number = 0;
		int largest = 0; 
		
		//create new scanner object 
		Scanner input = new Scanner(System.in); 
		
		//asks a user to enter an integer 
		System.out.print( "Please enter an integer: ");
		
		//determines when 10 integers have been entered 
		while ( counter < 10 ){
			number = input.nextInt(); 
			
			//assigns largest number entered to largest
			if (number > largest ){
				
				largest = number; 
				
			} //end if 
			
			counter ++; 
			
			//asks a user to enter an integer 
			if (counter < 10 ){
			System.out.print( "Please enter an integer: ");
			} //end if 
			
		} //end while 
		
		//prints largest number 
		System.out.printf( "The Largest number entered was: %d", largest ); 
		
	} //end main method 

} // end class Largest_Number

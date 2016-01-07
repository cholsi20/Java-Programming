/*
 * copyright
 * Courtney Holsinger
 * 10.16.2015
 * Chapter 7
 * 7.29a
 */


package fibonacci_number;

import java.util.Scanner;

public class Fibonacci_Number {
//---------------------------------------------------------------Print Array---------------
	//begin method to print integer arrays
		public static void printArray( int[] array){
			
			System.out.println("Fibonacci sequence to chosen integer:");
			
			for (int counter = 0; counter < array.length; counter++){
				
				System.out.printf( "Iteration: %d\tFibonacci Number: %d\n", counter, array[counter] );
				
			} //end for statement 
			
		} //end print array int method
		
//---------------------------------------------------------------Fibonacci Number----------
	//begin method to calculate fibonacci number
		public static void fibonacci( int n ){
			
			//create new array
			int[] fibonacci = new int[ n + 1 ];
			
			//create for loop to calculate fibonacci and place values into array 
			for ( int counter = 0; counter < fibonacci.length; counter++ ){
				
				//if counter greater that 1
				if (counter > 1){
					fibonacci[counter] = fibonacci[counter - 1] + fibonacci[counter - 2];
				} //end greater than 1 if statement 
				
				//else counter less than 1
				else {
					fibonacci[counter] = counter; 
				} //end inner else statement to populate first two array index  
			} //end for loop
			
			printArray(fibonacci); 
			
		} //end fibonacci method
		

		
//---------------------------------------------------------------Main Method---------------
	public static void main( String[] args ){
		
		//initialized variables
		int number = 0; 
		
		//create new scanner object to read user input 
		Scanner input = new Scanner(System.in); 
		
		//prompt user to enter how many sequences of the Fibonacci sequence they would like to run
		System.out.print( "Please enter the number of times you would like the "
				+ "Fibonacci sequence to run: ");
		//scan for input 
		number = input.nextInt(); 
		
		//run fibonacci method
		fibonacci(number); 
		
		
	} //end main method 

} //end class fibonacci number

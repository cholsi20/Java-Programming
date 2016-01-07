/*
 * copyright
 * Courtney Holsinger 
 * 9.30.2015
 * Chapter 5 
 * Exercise 5.12
 */

package odd_Integers;

public class Odd_Integers {

	public static void main(String[] args){
		 
		int product = 1; 
		
		for( int counter = 1; counter < 16; counter += 2 ){
			
			product = product * counter; 
			
		} //end for 
		
		System.out.printf( "The product of the odd integers from 1 to 15 is: %d\n", product ); 
		
	} //end main method 

} //end class Odd Integers

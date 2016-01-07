/*
 * copyright
 * Courtney Holsinger
 * 10.9.2015
 * Chapter 6
 * 6.25ab
 */

package prime_numbers;

public class Prime_Numbers {

	public static boolean prime( int number ){
		
		//loop through all possible numbers that int number could be divisible by 
		for (int divisible = 2; divisible < number; divisible++ ){
			int possiblePrime = number % divisible;
			
			//if the number is divisible by some number other than one and itself 
			if ( possiblePrime == 0 ){
				return false;
			} //end  
			
		} //end for loop 
		
		return true;
		
	} //end prime method 
	
	//begin main method 
	public static void main( String[] args ){
		
		//create loop to print prime numbers 
		for ( int listCounter = 2; listCounter < 101; listCounter++ ){
			
			boolean primeTest = prime( listCounter );
			
			if ( primeTest == true ){
				
				System.out.printf( "%d\n", listCounter );
				
			} //end if statement 
			
		} //end for 
		
	} //end main method

} //end class Prime_Numbers 

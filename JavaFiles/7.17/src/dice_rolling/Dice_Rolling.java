/*
 * copyright
 * Courtney Holsinger
 * 10.16.2015
 * Chapter 7
 * 7.17
 */

package dice_rolling;

import java.util.Random;

public class Dice_Rolling {
//------------------------------------------------------Printing Method----------------	
	//begin method for printing integer arrays
	public static void printArray( int[] array){
		
		for (int counter = 0; counter < array.length; counter++){
			
			//as dice rolld will never be less than 2
			if ( counter > 1){
			System.out.printf( "Face: %2d\tFrequency: %,d\n", counter, array[counter] );
			}
			
		} //end for statement 
		
	} //end print array int method

//-------------------------------------------------------Main Method--------------------
	public static void main( String[] args ){
		
		//create new random dice objects
		Random dice_1 = new Random();
		Random dice_2 = new Random();
		
		//create new variables
		int sum = 0;
		int dice1 = 0;
		int dice2 = 0;
		
		//create new frequency array
		int[] frequency = new int[13];
		
		//roll the dice 36,000,000 times!
		for ( int roll = 1; roll < 36000001; roll++ ){
			
			//roll dice
			dice1 = 1 + dice_1.nextInt( 6 ); //dice 1
			dice2 = 1 + dice_2.nextInt( 6 ); //dice 2
			
			//calculate the sum 
			sum = dice1 + dice2;
			
			//calculate the frequency of the rolls, and add to array frequency
			++frequency[ sum ];
			
		} //end roll for loop 
		
		//output the final frequency count for each roll 
		printArray( frequency );
		
	} //end main method 

} //end Dice Rolling Class

/*
 * copyright
 * Courtney Holsinger
 * 10.9.2015
 * Chapter 6
 * 6.30
 */

package guess_number;

import java.util.Scanner;
import java.util.Random;

public class Number_Guessing_Game {

	public static void main( String[] args ){
		
		//variables
		int gameContinuation = 0;
		int guess = 0;
		
		//create new scanner object
		Scanner input = new Scanner(System.in);
		
		//create new random number generator
		Random randomNumbers = new Random();
		
		//introduction prompt to game
		System.out.println( "Welcome to the number guessing game!");
		
		//create while loop that allows user to play game multiple times 
		//and generates random number
		while( gameContinuation != 2 ){
			
			//create random number from 1 - 1000
			int computerChoice = 1 + randomNumbers.nextInt( 1000 ); 
			//prompt user for input 
			System.out.print( "Please enter your guess: " );
			
			//create while loop for guessing 
			while ( guess != computerChoice){
				//takes user guess
				guess = input.nextInt(); 
				
				//if guess is higher than number
				if ( guess > computerChoice ){
					System.out.println( "Too high, try again." );
				} //end higher than if statement 

				//if guess is lower than number
				if ( guess < computerChoice ){
					System.out.println( "Too low, try again." );
				} //end higher than if statement 				

				//if guess is equal to number
				if ( guess == computerChoice ){
					System.out.println( "Good Job!" );
				} //end higher than if statement 
			} //end guessing while loop 
			
			//prompt to keep playing to exit
			System.out.printf( "Would you like to keep playing?\n"
					+ "1. Go again!\n"
					+ "2. Exit\n");
			gameContinuation = input.nextInt(); 
			
		} //end game iteration while 
		
		
		//print statement to confirm game quit 
		System.out.println( "Thanks for playing!" );
		
		
		
	} //end main method 

} //end class 

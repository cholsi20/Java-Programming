package quiz_program;

//import utilities
import java.util.Scanner;
import java.util.Random;

public class Quiz {

	public static void main( String[] args ){
		
		//declare variables
		int rand1 = 0;
		int rand2 = 0; 
		int userAnswer = 0; 
		
		int scoreTotal = 0; 
		int correct = 0; 
		int incorrect = 0;  
		
		//create new scanner object 
		Scanner input = new Scanner(System.in);
		
		//create new random object
		Random randomNumbers1 = new Random(); 
		Random randomNumbers2 = new Random();
		
		//print instructions for quiz
		System.out.printf( "This is a multiplication quiz.\n"
				+ "You final score will be tallied and broken down to you at the end.\n"
				+ "You can end the program at any time by entering the EOF character.\n\n"); 

		//generate two new ints using random 
		rand1 = 1 + randomNumbers1.nextInt( 15 ); 
		rand2 = 1 + randomNumbers2.nextInt( 15 );
		
		//print the numbers to be multiplied to the standard output
		System.out.printf( "%d * %d = \n", rand1, rand2 ); 
		
		//create quiz while loop: terminates at EOF 
		while(input.hasNext()){
			
			//record user answer
			userAnswer = input.nextInt(); 
			
			//begin if else to determine and tally correct and incorrect scores
			if ( userAnswer == rand1 * rand2 ){
				System.out.println( "Good Job!" );
				correct++; 
			} //end if statement 
			
			else {
				System.out.println( "That is Incorrect." ); 
				incorrect++;
			} //end else statement 
			
			scoreTotal++;
			
			//generate two new ints using random 
			rand1 = 1 + randomNumbers1.nextInt( 15 ); 
			rand2 = 1 + randomNumbers2.nextInt( 15 );
			
			//print the numbers to be multiplied to the standard output
			System.out.printf( "%d * %d = \n", rand1, rand2 ); 			
			
		} //end while loop
		
		//begin breakdown statement 
		System.out.printf( "You quiz breakdown is as follows:\n"
				+ "Correct: %d\tIncorrect: %d\tTotal Questions: %d\n", correct, incorrect, 
				scoreTotal);
		
		double average = correct * 100 / scoreTotal;
		
		System.out.printf( "Your grade is: %.02f%\n\n", average ); 
		
		
		
	} //end main method

} //end Quiz class 

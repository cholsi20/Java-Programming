/*
 * Copyright 
 * Courtney Holsinger
 * 9.23.2015
 * Chapter 4 Exercise 4.17
 */

package gas_Mileage;

import java.util.Scanner;

public class Gas_Milage_Test {
	
	public static void main(String[] args){
	
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		int tripCounter = 0; 
		int gallons; 
		int miles = 0; 
		double MPG_counter = 0;
		
		//initilize the first trip 
		Gas_Mileage trips = new Gas_Mileage( tripCounter, miles ); 
		
		//set the miles driven 
		System.out.print( "Please enter the number of miles: ");
		
		
		//while loop continues until EOF character entered
		while ( input.hasNext() ) {
			
			
			//set the miles driven 
			miles = input.nextInt();
			trips.setMilesDriven(miles); //sets miles to user input 
			System.out.println(""); //create new line 
			
			//set gallons used
			System.out.print( "Please enter the number of gallons used this trip: " );
			gallons = input.nextInt();
			trips.setGallonsUsed(gallons); //sets gallons to gallons used this trip 
			System.out.println(""); //create new line 
			
			//calculate the MPG for this trip, and output result to console 
			System.out.printf( "The MPG for this trip is %.2f\n", 
					trips.milesPerGallon(miles, gallons) ); //calculates miles per gallon for this trip

			//creates counter to record number of trips 
			++tripCounter; 
			
			//creates counter to add MPG for each trip 
			MPG_counter += trips.milesPerGallon(miles, gallons); 
			
			//calculate the average for all trips 
			//print the average MPG to the console 
			System.out.printf( "The average for your %d trip(s) is: %.2f\n\n", 
					tripCounter, trips.tripsAverage(tripCounter, MPG_counter) ); 
			
			//begin new input 
			System.out.print( "Please enter the number of miles: "); // ends with beginning command
		} //end while loop 
		
		System.out.println( "\n\nThank you! You have ended the program." );

	
	} //end main method 

}

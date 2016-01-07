package circle_area;

import java.util.Scanner;

public class Circle_Area {

	public static double circleArea( double radius ){
		
		double area = radius * radius * Math.PI; //yay, constants and using the package!
		return area; //returns value of area to main method when called 
		
	} //end circle area method
	
	public static void main( String[] args ){
		
		//import scanner
		Scanner input = new Scanner( System.in );
		
		//inital prompt for user input 
		System.out.print( "Please enter a radius: ");
		
		//use sentinel controlled loop for user input 
		while( input.hasNext() ){
			
			//get input for radius and calculate circle area 
			double radius = input.nextDouble();
			double area = circleArea( radius );
			
			//print radius 
			System.out.printf("The area of a circle with %.2f radius is: %.2f\n", radius, area );
			
			//prompt for next input
			System.out.print( "Please enter a radius: ");
			
		} //end while loop 
		
	} //end main method

} //end class Circle_Area 

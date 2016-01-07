/*
 * Copyright
 * Courtney Holsinger
 * 9.7.2015
 * Chapter 2 Homework
 * 2.34
 */

package population_Calculator;

public class Population_Growth_Rate {
	
	public static void main( String[] args ){
		
		//declare variables 
		double totalPopulation; 
		double growthRate = 1.13; 
		int numberOfYears;
		double currentPopulation = 7.3;
		
		//display current population 
		System.out.printf( "%.1f is the current population \n\n", currentPopulation );
		
		//display population after one year 
		numberOfYears = 1;
		totalPopulation = currentPopulation * numberOfYears * growthRate; 
		System.out.printf( "After %d years,\n "
				+ "the total population will be: %.1f billion\n\n", numberOfYears, totalPopulation );
		
		//display population after two years 
		numberOfYears = 2;
		totalPopulation = currentPopulation * numberOfYears * growthRate; 
		System.out.printf( "After %d years,\n "
				+ "the total population will be: %.1f billion\n\n", numberOfYears, totalPopulation );
		
		//display population after three years 
		numberOfYears = 3;
		totalPopulation = currentPopulation * numberOfYears * growthRate; 
		System.out.printf( "After %d years,\n "
				+ "the total population will be: %.1f billion\n\n", numberOfYears, totalPopulation );
		
		//display population after four years 
		numberOfYears = 4;
		totalPopulation = currentPopulation * numberOfYears * growthRate; 
		System.out.printf( "After %d years,\n "
				+ "the total population will be: %.1f billion\n\n", numberOfYears, totalPopulation );
		
		//display population after five years 
		numberOfYears = 5;
		totalPopulation = currentPopulation * numberOfYears * growthRate; 
		System.out.printf( "After %d years,\n "
				+ "the total population will be: %.1f billion\n\n", numberOfYears, totalPopulation );
		
	} //end main 

} //end class

/*
 * Copyright
 * Courtney Holsinger
 * 9.26.2015
 * Chapter 4 Homework 
 * 4.20
 */

package salary_calculator;

import java.util.Scanner;

public class Salary_Calculator_Test {

	public static void main(String[] args){
		
		//create new scanner object 
		Scanner input = new Scanner(System.in); 
	
		//create new local variables 
		double hours = 0.00;
		double rate = 0.00; 
		int employeeNumber = 0;
		
		//create new salary calculator instance 
		Salary_Calculator calculator = new Salary_Calculator( rate, hours );
		
		//ask for employee rate 
		System.out.print( "Please enter a rate: " );
		
		while ( employeeNumber < 3 ){
			//set employee rate 
			rate = input.nextInt();
			calculator.setHourlyRate(rate);
			
			//set hours worked for the week 
			System.out.print( "Please enter the number of hours worked for the week: ");
			hours = input.nextInt();
			calculator.setHoursWorked(hours);

			//calculate gross pay for this employee and prints to standard output 
			calculator.setGrossPay( hours, rate ); 
			System.out.printf(" The gross pay for this employee is: %.2f\n", calculator.getGrossPay()); 
			
			//increment counter 
			employeeNumber ++; 
			
			//ask for employee rate 
			if (employeeNumber < 3 ) {
				
				System.out.print( "Please enter a rate: " );
			
			} //end if 
			
		} //end while 
		
		
	} //end main method 

} //end class salary calc test 

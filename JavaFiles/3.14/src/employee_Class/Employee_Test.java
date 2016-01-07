/*
 * Copyright Courtney Holsinger
 * Chapter 3 Homework 
 * Exercise 3.14
 * 9.20.2015
 */

package employee_Class;

import java.util.Scanner;

public class Employee_Test {
	
	public static void main(String[] args){
		
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		//create two employee objects 
		Employee employee1 = new Employee( "Conner", "Samantha", 2100.22 );
		Employee employee2 = new Employee( "Henry", "George", 1300.45 );
		
		//display each objects yearly salary
		employee1.getEmployeeInfo();
		employee2.getEmployeeInfo();
		
		//set raise for employee 1 
		System.out.println( "\n\nPlease enter a raise for employee 1: ");
		int raise = input.nextInt(); //gather user input 
		employee1.setRaise(raise); //set raise amount 
		System.out.println("\nThis the the employee information after adjustment for raise: ");
		employee1.getEmployeeInfo();
		
		//set raise for employee 2
		System.out.println( "\n\nPlease enter a raise for employee 2: ");
		int raise1 = input.nextInt(); //gather user input 
		employee2.setRaise(raise1); //set raise amount 
		System.out.println("\nThis the the employee information after adjustment for raise: ");
		employee2.getEmployeeInfo();
		   
		   
		
	} //end main method 

} //end Employee_Test class 

/*
 * Copyright Courtney Holsinger
 * Chapter 3 Homework 
 * Exercise 3.14
 * 9.20.2015
 */

package employee_Class;

public class Employee {
	
	//begin class instances
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	//begin Employee constructor 
	public Employee( String firstName, String lastName, double monthlySalary ){
		
		this.firstName = firstName;
		this.lastName = lastName;
		
		if ( monthlySalary >= 0.00 )
			this.monthlySalary = monthlySalary;
		
	} //end Employee constructor 
	
	//begin set first Name 
	public void setFirstName( String firstName ){
		
		this.firstName = firstName;
		
	} //end set first name 
	
	public String getFirstName(){
		
		return firstName;
		
	} //end get first name 
	
	//begin set last name 
	public void setLastName( String lastName ){
		
		this.lastName = lastName;
		
	} //end set last name 
	
	//begin get last name 
	public String getLastName(){
		
		return lastName;
		
	} //end get lastname 
	
	//begin set monthly salary 
	public void setMonthlySalary( double monthlySalary ){
		
		this.monthlySalary = monthlySalary;
		
	} //end set monthly salary 
	
	//begin get monthly salary 
	public double getMonthlySalary(){
		
		return monthlySalary;
		
	} //end get monthly salary 
	
	//set get employee info 
	public void getEmployeeInfo(){
		
		double yearlySalary = monthlySalary * 12; 
		
		System.out.printf("\n%s, %s\t%s: %.2f\t%s: %.2f", lastName, firstName, "Montly Salary",
				monthlySalary, "Yearly Salary", yearlySalary);
		
	} //end eget employee info 
	
	public void setRaise( int raise ){
		
		double yearlySalary = monthlySalary * 12; 
		this.monthlySalary = ((yearlySalary * raise) / 100) + yearlySalary;
		
		
	} // end set raise 

} //end class Employee 

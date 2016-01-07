/*
 * Copyright
 * Courtney Holsinger
 * 9.26.2015
 * Chapter 4 Homework 
 * 4.20
 */

package salary_calculator;

public class Salary_Calculator {
	//initiizer variables 
	private double hourlyRate;
	private double hoursWorked; 
	private double grossPay;
	
	//begin constructor method 
	public Salary_Calculator( double rate, double hours ){
		
		if (rate >= 0.00)
			this.hourlyRate = rate;
		
		if (hours >= 0.0)
			this.hoursWorked = hours; 
		
	} //end constructor 
	
	public void setHourlyRate( double rate ){
		
		this.hourlyRate = rate;
		
	} //end set hourly rate 
	
	public double getHourlyRate(){
		
		return hourlyRate; 
		
	} //end get hourly rate 
	
	public void setHoursWorked( double hours ){
		
		this.hoursWorked = hours; 
		
	} //end set hours worked 
	
	public double getHoursWorked(){
		
		return hoursWorked; 
		
	} //end get hours worked
	
	public void setGrossPay( double hours, double rate ){
		
		if ( hours <= 40 ){
			this.grossPay = hours * rate; 
		} //end if 
		
		else {
			double overTime = hours - 40;
			double basePay = 40 * rate;
			double timeAndAHalf = ( 1.5 * rate ) * overTime;
			this.grossPay = basePay + timeAndAHalf; 
		} //end else 
		
	} //end set gross pay 
	
	public double getGrossPay(){
		
		return grossPay; 
		
	} //end get gross pay 

} //end class salary calculator 

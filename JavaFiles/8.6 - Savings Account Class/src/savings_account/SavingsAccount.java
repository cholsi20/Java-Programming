/*
 * Courtney Holsinger
 * 11/1/2015
 * Chapter8
 * 8.6
 */

package savings_account;

public class SavingsAccount {

	//instance variables 
	private double savingsBalance; 
	static double annualInterestRate;
	
	//-------------------------------------------Begin Constructor Initialization---
	public SavingsAccount() {
		
		this( 0.00 );
		
	} //end empty default constructor 

	public SavingsAccount( double balance ) {
		
		//begin if statement 
		if ( balance >= 0.00 ) {
			savingsBalance = balance;
		} //end if 
		
		else {
			savingsBalance = 0.00;
		} //end else 
	
	} //end public savings account 
	
	//-------------------------------------------Get & Set: Balance---------------
	public void setBalance( double balance ) {
		if ( balance >= 0.00 ){
			savingsBalance = balance;
		} //end if 
		
		else {
			savingsBalance = 0.00;
		} //end else 

	} //end set 
	
	public double getBalance() {
		return savingsBalance;
	} //end get balance 
	
	//-------------------------------------------Get & Set: Interest Rate--------
	public void setInterestRate( double interestRate ) {
		
		if (interestRate >= 0 ) {
			annualInterestRate = interestRate;
		} //end if 
		
		else {
			annualInterestRate = 0;
		}
		
	} //end set interest rate 
	
	public double getInterestRate() {
		return annualInterestRate;
	} //end get interest rate
	
	//-------------------------------------------Monthly Interest Calculations----
	public double calculateInterestRate() {
		
		double newInterest = savingsBalance * annualInterestRate / 12;
		savingsBalance = newInterest + savingsBalance;
		return savingsBalance;
		
	} //end calculate interest rate 
	
	//-------------------------------------------Modify Interest Rate-------------
	public double modifyAnnualInterestRate( double interestRate ) {
		
		if (interestRate >= 0 ) {
			annualInterestRate = interestRate;
		} //end if 
		
		else {
			annualInterestRate = 0;
		} //end else
		
		return annualInterestRate;
	
	} //end modify annual interest rate 
	
	//-------------------------------------------Format String-------------------
	public String toString() {
		
		return String.format("%.2f\n", savingsBalance);
		
	} //end to string 
	
	
 } //end class Savings Account

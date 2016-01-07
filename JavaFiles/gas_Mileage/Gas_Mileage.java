/*
 * Copyright 
 * Courtney Holsinger
 * 9.23.2015
 * Chapter 4 Exercise 4.17
 */

package gas_Mileage;

public class Gas_Mileage {
	
	private int milesDriven;
	private int gallonsUsed;
	
	public Gas_Mileage( int miles, int gallons ){
		
		if( miles >= 0 )
			this.milesDriven = miles; 
		
		if ( gallons >= 0 )
			this.gallonsUsed = gallons;
		
	} //end constructor Gas_Milage 
	
	public void setMilesDriven( int miles ){
		
		this.milesDriven = miles; 
		
	} //end set miles driven 
	
	public int getMilesDriven(){
		
		return milesDriven; 
		
	} //end get miles
	
	public void setGallonsUsed( int gallons ){
		
		this.gallonsUsed = gallons;
		
	} //end set gallons 
	
	public int getGallonsUsed(){
		
		return gallonsUsed; 
		
	} //end get gallons used 
	
	
	public double milesPerGallon( int miles, int gallons ){
		
		double milesPerGallon = miles / gallons;
		return milesPerGallon; 
		
	} //end set MPG 
	
	public double tripsAverage( int tripCounter, double MPG_counter ){
		
		double average = MPG_counter / tripCounter; 
		return average;
	}
	//end tripsAverage method
	

} //end class Gas_Milage 

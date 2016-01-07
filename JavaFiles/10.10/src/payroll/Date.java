
/*
 * Courtney Holsinger
 * 11/8/2015
 * Chapter 9 & 10
 * Problems10.8 & 10.10
 */

package payroll;

public class Date {
	
	//----------------------------------------------------------Variables----------
	private int month; //between 1-12
	private static String monthString;
	private int day; //1-31 based on month
	private static int longDay;
	private int year; //any year 

	//----------------------------------------------------------Arrays-------------
	private static final int[] daysPerMonth = 
		{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final String[] monthNames = 
		{ "", "January", "February", "March", "April", "May", "June", "July",
			"August", "September", "October", "November", "December" }; 
	
	//-------------------------------------------------------Date Constructors-----
	public Date( int theMonth, int theDay, int theYear ) {
		
		month = checkMonth( theMonth ); 
		year = theYear;
		day = checkDay( theDay );
		
	} //end date constructor 
	
	public Date( String theMonth, int theDay, int theYear ) { 
		
		monthString = checkMonth( theMonth );
		year = theYear;
		day = checkDay( theDay );
		
	} //end constructor date 
	
	
	public Date( int theDay, int theYear ) {
		
		longDay = validateDay( theDay );
		year = theYear;
		
	} //end date 
	//----------------------------------------------------Check Month-------------
	private String checkMonth (String testMonth ){
		
		//to make month a int 
		for (int count = 0; count < monthNames.length; count++ ){
			
			if ( testMonth.equals(monthNames[count]) ) {
				month = count;
			} //end if 
			
		} //end for loop
		
		if (month == 0){
			throw new IllegalArgumentException( "You must enter a valid month name.");
		}
		
		return testMonth; 
		
	} //end string check month
	
	private int checkMonth( int testMonth ) {
		
		if ( testMonth > 0 && testMonth <= 12 ) {
			return testMonth;
			} //end if 
		
		else {
			throw new IllegalArgumentException( "Month must be 1-12" );
		} //end else 
		
	} //end check month 
	
	//------------------------------------------------------Check Day-------------
	private int checkDay( int testDay ) {
		
		if ( isLeapYear(testDay) == true ) {
			return testDay;
		} //end if
		
		//check if day in range for month 
		if ( testDay > 0 && testDay <= daysPerMonth[ month ] ){
		return testDay; 
		} //end if
		
		throw new IllegalArgumentException( "Day out of range for specified month and year");
		
	} //end check day 
	
	private int validateDay( int testDay ) {
		
		if (testDay > 0 && testDay <= 365 ){
			return testDay;
		} //end if 
		
		throw new IllegalArgumentException( "Day out of range.  Must be 365 or less.");
		
	} //end validate day 

	//-------------------------------------------------Day Conversions-----------
	public void toDoubleDigitDay( int threeDigitNumber ) {
		//conversion to number of months 
		month = (int) (threeDigitNumber * 0.0328767) + 1;
		
		day = (int) (((threeDigitNumber * 0.0328767) - (month - 1)) * daysPerMonth[month]);
		
		if ( isLeapYear (day) == true ){
			day = day + 1;
		}
		
	} //end to double digit conversion 
	
	public int toTripleDigitDay ( int aMonth, int aDay ) {
		
		int numberOfDays = 0;
		
		//for loop to add all days of months together
		for (int count = 0; count < aMonth; count++ ){
			numberOfDays += daysPerMonth[ count ];
		} //end for loop
		
		return longDay = numberOfDays + aDay;
		
	} //end int to triple digits 
	
	public int toTripleDigitDay ( String aMonth, int aDay ) {
			
			int numberOfDays = 0;
			
			//for loop to add all days of months together
			for (int count = 0; count < daysPerMonth[ month ]; count++ ){
				numberOfDays = daysPerMonth[ count ];
			} //end for loop 
			
			if ( isLeapYear( aDay ) == true ){
				return longDay = numberOfDays + aDay + 1;
			}
			
			return longDay = numberOfDays + aDay;
			
		} //end int to triple digits 

	
	//-------------------------------------------------Check if Leap Year---------
	public static boolean isLeapYear( int testDay ) {
		
		boolean leapYear = false;
		
		if (month== 2 && testDay == 29 && (year % 400 == 0 || 
				(year % 4 == 0 && year % 100 != 0))){
			leapYear = true;
			return leapYear;
		} //end if 
		
		return leapYear;
		
	} //end is leap year
	
	//---------------------------------------------------Get Month----------------
	public int getIntMonth() {
		return month;
	} //end get integer month
	
	public String getStringMonth() {
		return monthString;
	} //end get string month method
	
	//---------------------------------------------------Get Day------------------
	public int getDay() {
		return day;
	} //end get day method
	
	public int getLongFormatDay() {
		return longDay;
	} //get three digit day 
	
	//---------------------------------------------------Get Year-----------------
	public int getYear() {
		return year;
	} //end get year
	
	//---------------------------------------------------To String Formatting------	
	public String toString() {
		
		return String.format( "%d/%d/%d", month, day, year);
		
	} //end format to string 
	
	public String string_monthToString() {
		
		return String.format( "%s %d, %d", monthString, day, year);
		
	} //end formatted string month 
	
	public String longDayToString() {
		
		return String.format( "%d %d", longDay, year );
		
	} //end formatted long day 
	
	
	
} //end day class 

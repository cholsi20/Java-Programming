/*
 * Courtney Holsinger
 * 11/8/2015
 * Chapter 9 & 10
 * Problems10.8 & 10.10
 */

package payroll;

public class PieceworkerEmployee extends Employee {
	
	//------------------------------------------piece worker instance variables 
	private double wage;
	private int pieces;
	
	//------------------------------------------Constructors 
	/*******************************************How would I do this?
	public PieceworkerEmployee() {
		
		this( "Default", "Default", "Default", getBirthDay() , 0.00, 0 );
		
	} //end empty constructor 
	*/
	
	public PieceworkerEmployee( String firstName, String lastName,
   String socialSecurityNumber, Date birthDay, double wage, int pieces ) {
		
		super(firstName, lastName, socialSecurityNumber, birthDay);
		
		if (wage < 0.0) {// validate wage
		   throw new IllegalArgumentException(
		   "Wage per piece must be >= 0.0");
		} //end if for wage validation
		
		if (pieces < 0.0) { // validate wage
		   throw new IllegalArgumentException(
		   "Pieces must be >= 0");
		} //end if for pieces validation
		
		this.wage = wage;
		this.pieces = pieces;
		
	} //end constructor 

	//------------------------------------------Get & Set Wage
	public void setWage( double theWage ) {
		
		if (wage < 0.0) {// validate wage
			   throw new IllegalArgumentException(
			   "Wage per piece must be >= 0.0");
			} //end if for wage validation
		
		this.wage = theWage;
		
	} //end set wage method
	
	public double getWage() {
		
		return wage;
		
	} //end get wage method
	
	//------------------------------------------Get & Set Pieces
	public void setPieces( int numberOfPieces ) {
		
		if (pieces < 0.0) {// validate wage
			throw new IllegalArgumentException(
			"Pieces must be >= 0");
		}//end if for pieces validation
		
		this.pieces = numberOfPieces;
		
	} //end set pieces method 
	
	public int getPieces() {
		
		return pieces;
		
	} //end get pieces 
	
	//------------------------------------------Earnings Method
	public double earnings() {
		
		double grossEarnings = wage * pieces;
		
		if ( grossEarnings < 0 ) {
			throw new IllegalArgumentException(
			"Pieces must be >= 0 or Wage must be >= 0.");
		} //end if statement for validation of correct earnings amount 
		
		return grossEarnings;
		
	} //end method to calculate piece worker earnings 

	//------------------------------------------toString: Output Formatting 
	public String toString() {
		
		   return String.format("piece worker employee: %s\n%s: $%,.2f; %s: %,d",
				  super.toString(), "wage per piece", getWage(),                     
				  "pieces produced", getPieces());   
		   
	} //end to string formatting for piece worker 

	
} //end public class Pieceworker

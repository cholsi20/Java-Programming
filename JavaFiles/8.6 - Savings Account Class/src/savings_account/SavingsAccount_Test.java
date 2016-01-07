package savings_account;

public class SavingsAccount_Test {

	public static void main( String[] args ) {
		
		//create array for each month
		
		String[] months = { "January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December" };
		
		//create two new saver objects
		SavingsAccount saver1 = new SavingsAccount( 2000.00 );
		SavingsAccount saver2 = new SavingsAccount( 3000.00 );
		
		//set annual interest rate to 4% for both savers
		saver1.setInterestRate(.04);
		saver2.setInterestRate(.04);
		
		//calculate monthly interest for 12 months and print new balances 
		//for each month for both savers
		System.out.println( "Saver1 Account:" );
		for ( int count = 0; count < months.length; count++ ) {
			
			saver1.calculateInterestRate();
			
			System.out.printf( "%15s\t", months[count]);
			System.out.print( saver1.toString() );
			
		} //end for loop
		
		System.out.println();
		System.out.println( "Saver 2 Account: ");
		for ( int count = 0; count < months.length; count++ ) {
			
			saver2.calculateInterestRate();

			System.out.printf( "%15s\t", months[count] );
			System.out.print( saver2.toString() );
			
		} //end for loop	
		
		//set annual interest rate to 5%
		saver1.modifyAnnualInterestRate(.05);
		
		//calculate new interest rate for both savers
		saver1.calculateInterestRate();
		saver2.calculateInterestRate();
		System.out.println();
		
		System.out.println("Saver1 Account Balance at 5%");
		System.out.printf( "%15s\t", months[0] );
		System.out.print( saver1.toString() );
		
		System.out.println("Saver2 Account Balance at 5%");
		System.out.printf( "%15s\t", months[0] );
		System.out.print( saver2.toString() );
		
	} //end main 

} //end Savings accounts test 

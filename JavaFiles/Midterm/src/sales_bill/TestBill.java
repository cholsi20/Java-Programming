/*
 * Courtney Holsinger
 * 11.18.2015
 * Midterm II 
 * Class TestBill
 */

package sales_bill;

public class TestBill {
	
	public static void main( String[] args ) {
	

	//----------------------------------------------------------------New SalesBill Objects
	SalesBill salesBill1 = new SalesBill( "John Smith" );
	SalesBill salesBill2 = new SalesBill( "Joe Smith", 200.00, 8.5 );
	ServiceBill serviceBill = new ServiceBill( "Jane Smith", 60, 8.5, 15 );
	
	
	
	//----------------------------------------------------------------Set Methods for salesBill1
	salesBill1.setTotalSales( 80 );
	salesBill1.setTaxRate( 8.5 );
	
	//----------------------------------------------------------------Array for all Sales
	SalesBill[] sales = new SalesBill[3];
	
	sales[0] = salesBill1;
	sales[1] = salesBill2;
	sales[2] = serviceBill;
	
	//----------------------------------------------------------------All Sales Processed Polymorphically
	//variable for grand total
	double grandTotal = 0;
	
	//for (Employee currentEmployee : employees)
	for (SalesBill currentSale : sales ) {
		
		//calculates grand total
		grandTotal += currentSale.getTotalCharge();
		
		//grandTotal += total;
		
		System.out.println( currentSale ); //invokes toString
		
	} //end for statement to process polymorphically
	
	//print out grand total
	System.out.printf( "Grand Total Charge: $%,.2f", grandTotal );

	
	
	} //end method main 
	
} //end class test bill

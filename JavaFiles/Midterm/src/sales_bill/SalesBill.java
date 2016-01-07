/*
 * Courtney Holsinger
 * 11.18.2015
 * Midterm II 
 * Class SalesBill
 */

package sales_bill;

//begin superclass SalesBill
public class SalesBill {

	//----------------------------------------------------------------private instance variables
	private String customerName; 
	private double totalSales;
	private double taxRate;

	//----------------------------------------------------------------SalesBill Constructors
	//single argument constructor SalesBill calls three argument 
	//constructor to initialize other two variables
	public SalesBill( String customer ) {
		this( customer, 0, 0 );
	} //end single argument constructor SalesBill
	
	//begin three argument constructor
	public SalesBill( String customer, double total, double tax ) {
		
		setCustomerName( customer );
		setTotalSales( total );
		setTaxRate( tax );
		
	} //end three argument constructor 

	//----------------------------------------------------------------Get & Set Customer Name
	public void setCustomerName( String customer ) {
		
		if (customer != null ) {
			this.customerName = customer;
		} //end if statement 
		
		else {
			this.customerName = "";
		} //end else statement
		
	} //end set customer name
	
	//begin get method for Customer Name
	public String getCustomerName() {
		
		return customerName;
		
	} //end get customer name 

	//----------------------------------------------------------------Get & Set Total Sales
	//this calculates total sales before tax
	public void setTotalSales( double total ) {
		
		if ( total >= 0 ) {
			
			this.totalSales = total;
			
		} //end if statement 
		
		else {
			this.totalSales = 0; 
		} //end else statement 
		
	} //end set total sales 
	
	//begin get statement for total sales 
	public double getTotalSales() {
		
		return totalSales;
		
	} //end get total sales 

	//----------------------------------------------------------------Get & Set Sales Tax
	public void setTaxRate( double tax ) {
		
		if ( tax >= 0 ) {
			
			this.taxRate = tax;
			
		} //end if statement 
		
		else {
			
			this.taxRate = 0;
			
		} //end else 
		
	} //end set tax rate 
	
	//begin get tax rate method 
	public double getTaxRate() {
		
		return taxRate;
		
	} //end get tax rate 

	//----------------------------------------------------------------Get Total Sales Charge 
	public double getTotalCharge() {
		
		//begin calculation for sales tax 
		double totalCharge = ( (totalSales * taxRate ) / 100 ) + totalSales;
		
		return totalCharge;
		
	} //end get total charge 
	
	//----------------------------------------------------------------toString Override 
	@Override
	public String toString() {
		
		return String.format("Customer: %s\nSales: $%,.2f\tTax: %.1f%s\tTotal Charge: $%,.2f", 
				getCustomerName(), getTotalSales(), getTaxRate(), "%", getTotalCharge() );
		
	} //end toString override 


} //end class sales bill

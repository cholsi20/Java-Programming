/*
 * Courtney Holsinger
 * 11.18.2015
 * Midterm II 
 * Class ServiceBill
 */


package sales_bill;

public class ServiceBill extends SalesBill {

	//----------------------------------------------------------------private instance variables
	private double tip;
	
	//----------------------------------------------------------------ServiceBill Constructors
	public ServiceBill( String customer, double total, double tax, double serviceTip ) {
		
		super( customer, total, tax );
		
		setTip( serviceTip );
		
	} //end service bill constructor 
	
	//----------------------------------------------------------------Get & Set Tip
	public void setTip ( double serviceTip ) {
		
		if ( serviceTip >= 0 ) {
			this.tip = serviceTip;
		} //end if statement 
		
		else {
			this.tip = 0;
		} //end else 
		
	} //end set tip
	
	//begin get tip
	public double getTip() {
		
		return tip;
		
	} //end get tip 

	//----------------------------------------------------------------Override Get Total Sales Charge
	@Override
	public double getTotalCharge() {
		
		//super.getTotalCharge +
		//begin calculation for sales tax 
		double grossCharge = ( (getTotalSales() * getTaxRate() ) / 100 ) + getTotalSales();
		
		double withTip = ( ( grossCharge * tip ) / 100 ) + grossCharge;
		
		return withTip;

	} //end override of get total charge 
	
	//----------------------------------------------------------------Override Get Total Sales Charge
	@Override
	public String toString() {
		
		return String.format( "Customer: %s\nSales: $%,.2f\tTax: %.1f%s\tTip: %.1f%s\tTotal Charge: $%,.2f", 
				getCustomerName(), getTotalSales(), getTaxRate(), "%", getTip(), "%", getTotalCharge() );
		
	} //end toString override 
	
} //end class ServiceBill

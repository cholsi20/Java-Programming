/*
 * Copyright Courtney Holsinger
 * Chapter 3 Homework 
 * Exercise 3.13
 * 9.20.2015
 */

package invoice_Class;

public class Invoice {
	
	//begin class instances
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	
	//begin constructor for invoice
	public Invoice( String partNumber, String partDescription, int quantity, double price ){
		
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		//next two quantity must be >= 0 to be valid
		if (quantity >= 0)
			this.quantity = quantity;
		if (price >= 0.00)
			this.price = price;
		
	}//end constructor Invoice 
	
	public void setPartNumber( String partNumber ){
		
		this.partNumber = partNumber;
		
	} //end method set part number
	
	public String getPartNumber(){
		
		return partNumber;
		
	} //end get part Number 
	
	public void setPartDescription( String partDescription ){
		
		this.partDescription = partDescription; 
		
	} //end set part description
	
	public String getPartDescription(){
		
		return partDescription;
		
	} //end get part description 
	
	public void setItemQuantity( int itemQuantity ){
		
		this.quantity = itemQuantity;
		
	} // end quantity method
	
	public int getItemQuantity(){
		
		return quantity;
		
	} //end get quantity 
	
	public void setPrice( double itemPrice ){
		
		this.price = itemPrice;
		
	} //end set price
	
	public double getPrice(){
		
		return price;
		
	} //end get price 
	
	public void getInvoiceAmount(){
		
		double total = price * quantity;
		System.out.printf( "%s\t%s\t%d\t%.2f\n", partNumber, partDescription, quantity, total );
		
	} //end get invoice amount
	
} //end class Invoice

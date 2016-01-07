/*
 * Copyright Courtney Holsinger
 * Chapter 3 Homework 
 * Exercise 3.13
 * 9.20.2015
 */

package invoice_Class;

import java.util.Scanner;

public class Invoice_Test {
	
	public static void main( String[] args )
	   {
		
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
	    //create a new invoice called invoice1
		Invoice invoice1 = new Invoice( "#333D", "Wrench", 12, 12.99 );
	 
	      // display invoice1
		System.out.println( "Total: ");
		invoice1.getInvoiceAmount();
	    
	      // change invoice1's data using set methods
		System.out.println("\nEnter a part number:");
		String partNumber = input.nextLine();
		invoice1.setPartNumber( partNumber );
		System.out.printf("New Part Number: %s\n", invoice1.getPartNumber());
		
		System.out.println("\nEnter a part description:");
		String partDescription = input.nextLine();
		invoice1.setPartDescription( partDescription );
		System.out.printf("New Part Description: %s\n",invoice1.getPartDescription());
		
		System.out.println("\nEnter a quantity:");
		int quantity = input.nextInt();
		invoice1.setItemQuantity( quantity );
		System.out.printf("New Quantity: %d\n",invoice1.getItemQuantity());
		
		System.out.println("\nEnter a price:");
		double price = input.nextDouble();
		invoice1.setPrice( price );
		System.out.printf("New Price: %.2f\n",invoice1.getPrice());

	      // display invoice1 with new data
		System.out.println( "\nNew Total: ");
		invoice1.getInvoiceAmount();
		
	      //create a new invoice called invoice2
		Invoice invoice2 = new Invoice( "#111A", "100 Wood Screws", 14, 4.99 );
	 
	      // display invoice2
		System.out.println( "\n\nTotal: ");
		invoice2.getInvoiceAmount();
	    
	      // change invoice2's data using set methods
		System.out.println("\nDisplaying new invoice amounts:");
		invoice2.setPartNumber( "#555F" );
		System.out.printf("%s\n", invoice2.getPartNumber());
		
		invoice2.setPartDescription( "6\" Pine Side Molding" );
		System.out.printf("%s\n",invoice2.getPartDescription());
		
		invoice2.setItemQuantity( 6 );
		System.out.printf("%d\n",invoice2.getItemQuantity());
		
		invoice2.setPrice( 24.08 );
		System.out.printf("%.2f\n",invoice2.getPrice());

		  // display invoice2 with new data
		System.out.println( "\nNew Total: ");
		invoice2.getInvoiceAmount();
	      
	      
	   
	   } //end main method

} //end class Invoice_Test

/*
 * copyright
 * Courtney Holsinger
 * 10.4.2015
 * Chapter 5
 * 5.17
 */

package calculating_Sales;

import java.util.Scanner;

public class Sales_Calculator {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		//declare variables
		int productNumber; 
		int productNumber1 = 0;
		int productNumber2 = 0; 
		int productNumber3 = 0;
		
		int productNumber4 = 0; 
		int productNumber5 = 0; 
		double total = 0; 
		
		//prompt statement to user with directions 
		System.out.println("Please enter a product number between 1 and 5\n"
				+ "to select which item you would like to purchase.Enter the \n"
				+ "EOf character to end at any time.");
		while ( input.hasNext() ){
			//promot
			productNumber = input.nextInt(); 
			
			switch( productNumber ){
			
			case 1:
				total += 2.98;
				++productNumber1; 
				break;
				
			case 2:
				total += 4.50;
				++productNumber2; 
				break;
			
			case 3:
				total += 9.98;
				++productNumber3;
				break;
				
			case 4:
				total += 4.49;
				++productNumber4;
				break;
				
			case 5:
				total += 6.87;
				++productNumber5;
				break;
				
			default:
				System.out.println("This is not a valid entry.  Please enter a number between 1 and 5");
				break;
			
			} //end switch statement 
			
		} //end while 
		
		System.out.printf("Your total is: $%.2f\n", total);
		System.out.printf("You ordered: \n%d of Product 1\n"
				+ "%d of Product 2\n%d of Product 3\n%d of Product 4\n"
				+ "%d of Product 5", productNumber1, productNumber2, productNumber3, productNumber4, productNumber5);
		
		
		
	} //end main method 

		
} //end class sales calculator 

package discount;

public class Discount {

	//*********************************************************Final Price Method********
	//begin final price method
	public static double finalPrice( double grossTotal ){
		
		//apply 25% discount coupon for overall sale
		double couponApplied = grossTotal * .75;
		
		//if statements to determine further discount 
		if ( couponApplied >= 30 && couponApplied < 50 ){
			double fiveDollarDiscount = couponApplied - 5; 
			return fiveDollarDiscount;	
		} //end $30 - 49.99 discount 
		
		if ( couponApplied >= 50 ){
			double tenDollarDiscount = couponApplied - 10;
			return tenDollarDiscount;
		} //end discount for greater than $50
		
		return couponApplied;
		
	} //end final price method 

	
	//*********************************************************Main Method***************	
	public static void main( String[] args ){
		
		//print table header 
		System.out.printf( "Original Price\tFinal Price\n");
		double grossTotal = 19.99;
		
		//print table
		for (int count = 0; count < 6; count++ ){
			
			
			System.out.printf( "$%.2f\t\t$%.2f\n", grossTotal, finalPrice(grossTotal) ); 
			
			grossTotal += 10.00;
			
		} //end for statement 
		
	} //end main method

} //end class discount 


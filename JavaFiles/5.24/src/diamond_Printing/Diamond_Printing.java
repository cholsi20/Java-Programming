/*
 * copyright
 * Courtney Holsinger
 * 10.2.2015
 * Chapter 5 
 * 5.24
 */

package diamond_Printing;

public class Diamond_Printing {

	public static void main(String[] args){
		System.out.println();
		
		//number used to decrement for bottom half of triangle - this number needs to 
		//decrement by one in order for the equation to work.  Not pretty, but oh well. 
		int number = 13; 
		
		//create a counter for all 11 lines 
		for (int rows = 0; rows < 10; ++rows){
			
			//create if statement to account for first 6 rows 
			if (rows < 5){
				//create for loop to generate blanks for first 6 rows
				for (int blanks = 4 - rows; blanks > 0; --blanks){
					System.out.print(" "); 
				} //end blanks for loop 
				
				//create for loop to generate asterisks for each row 
				for (int asterisks = 0; asterisks < rows * 2 + 1; ++asterisks){
					System.out.print("*");
				} //end asterisks for statement
				System.out.println();
			} //end if statement for first 6 rows 
			
			
			if (rows > 5){
				//create loop to generate blanks on bottom half of triangle
				for ( int blanks = 0; blanks < rows % 5; ++blanks ){
					System.out.print(" ");
				}//end blanks for loop 
				
				//create loop to generate asterisks on lower half of triangle
				for ( int asterisks = number - rows; asterisks > 0; --asterisks){
					System.out.print("*");
					//System.out.printf("rows %d\t", rows);
					//System.out.printf("asterisks %d", asterisks);
				}
				--number;
				System.out.println();
			} //end if statement for last 6 rows 
			
		} //end rows for 
	} //end main method 

} //end 

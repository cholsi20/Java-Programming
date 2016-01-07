package string_compare;

import java.util.Scanner;

public class StringCompare {

	public static void main( String[] args ) {
		
		//create new scanner object
		Scanner input = new Scanner( System.in );
		
		//ask user to input two new strings 
		System.out.println( "Please enter your first string: " );
		String strg1 = input.nextLine();
		
		System.out.println( "Please enter your second string: " );
		String strg2 = input.nextLine();
		
		//prompt user for number of characters to compare 
		System.out.print( "Please enter the number of characters to compare: ");
		int compareCharacters = input.nextInt();
		
		//prompt user for starting index 
		System.out.print( "Please enter the index number you would like to start at: ");
		int startingIndexString1 = input.nextInt();
		int startingIndexString2 = startingIndexString1;
		
		//if else statements to determine if string portions match
		if ( strg1.regionMatches(startingIndexString1, strg2, startingIndexString2, compareCharacters) ) {
			
			System.out.printf( "The %d chracters of your two strings match.\n", compareCharacters );
			
		} //end if characters match 
		
		else {
			System.out.println( "The string portions do not match." );
		} //end else 
		
		String c = "a toyota";
		
		String i = c.replace("toyot", "TOYOT");
		
		//String i = c.substring(7);
		
		//String j = c.substring(4,15);
		
		System.out.printf( "%s\n%s\n", i);
		
	} //end main method 

} //end class string compare 

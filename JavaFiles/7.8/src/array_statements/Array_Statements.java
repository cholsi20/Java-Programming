package array_statements;

public class Array_Statements {
	//begin method to print integer arrays
	public static void printArray( int[] array){
		
		for (int counter = 0; counter < array.length; counter++){
			
			System.out.printf( "Index: %d\tValue: %d\n", counter, array[counter] );
			
		} //end for statement 
		
	} //end print array int method
	
   public static void printArray( float[] array){
		
		for (int counter = 0; counter < array.length; counter++){
			
			System.out.printf( "Index: %d\tValue: %.2f\n", counter, array[counter] );
			
		} //end for statement 
		
   } //end print array float method

	public static void main( String[] args ){
		
		//printing element 6 of array f
		System.out.println( "Question A" );
		int[] f = {1, 5, 8, 8, 2, 7, 9, 12 };
		System.out.printf( "Element 6 in array f is: %d\n\n", f[6]);
		
		//initialize all five elements of integer array g to 8
		System.out.println( "Question B" );
		int[] g = new int[5];
		for (int counter = 0; counter < g.length; counter++ ){
			g[counter] = 8;	
		} //end array g initializer 
		printArray( g );
		System.out.println();
		
		//total the 100 elements of floating point array c
		System.out.println( "Question C" );
		double total = 0;
		float[] c = new float[100];
		
		for (int counter = 0; counter < c.length; counter++){
			c[counter] = (float) (1.25 + counter);
			total += c[counter];
		} //end for statement 
		printArray( c );
		System.out.printf( "The total of these values is: %,.2f\n\n", total );
		
		//copy 11 element array a into the first portion of array b, which contains 34 elements
		System.out.println( "Question D" );
		int[] a = new int[11];
		int[] b = new int[34];
		
		for ( int counter = 0; counter < a.length; counter++ ){
			a[counter] = 1 + counter;
		} //end for loop to initialize a
		
		//copy elements from array a to array b
		for ( int counter = 0; counter < a.length; counter ++ ){
			b[counter] = a[counter];
		} //end copying for loop 
		printArray( b );
		System.out.println();
		
		//Determine and display the smallest and largest values in a 99 element floating point
		//array w
		System.out.println( "Question E" );
		float lowest = 99; 
		float highest = 0;
		float[] w = new float[99];
		for (int counter = 0; counter < w.length; counter++ ){
			w[counter] = (float) (counter * 0.3);
		} //end for to initialize w
		//loop to determine low and high values 
		for ( int counter = 0; counter < w.length; counter ++ ){
			//determine lowest value 
			if ( w[counter] < lowest ){
				lowest = w[counter];
			} //end lowest if
			
			//determine hightest value 
			if ( w[counter] > highest ) {
				highest = w[counter];
			} //end if statement to determine highest	
		} //end for loop to determine lowest and highest
		
		//print results 
		System.out.printf( "The lowest value is: %,.2f\n"
				+ "The highest value is: %,.2f", lowest, highest );
		
	} //end main method

} //end class Array Statements 

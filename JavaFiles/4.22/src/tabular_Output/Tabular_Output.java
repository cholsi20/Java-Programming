/*
 * Copyright
 * Courtney Holsinger
 * 9.26.2015
 * Chapter 4 Homework 
 * 4.22
 */

package tabular_Output;

public class Tabular_Output {

	public static void main(String[] args){
		
		int counter = 1; 
		int timesTen = 0; 
		int timesOneHundred = 0;
		int timesOneThousand = 0; 
		
		//print chart header
		System.out.printf( "N\t10*N\t100*N\t1000*N\n\n"); 
		
		//begin loop to generate table content 
		while ( counter < 6 ){
			
			timesTen = 10 * counter; //time ten value 
			timesOneHundred = 100 * counter; //100 value 
			timesOneThousand = 1000 * counter; //times 1000 
			
			//print to table 
			System.out.printf( "%d\t%d\t%d\t%d\n", counter, timesTen, timesOneHundred, 
					timesOneThousand ); 
			
			//increment counter 
			counter++; 
			
		} //end while 
		
	} //end main method 
	

} //end class Tabular Output 

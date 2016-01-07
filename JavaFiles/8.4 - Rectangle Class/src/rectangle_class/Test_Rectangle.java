/*
 * Courtney Holsinger
 * 11/1/2015
 * Chapter8
 * 8.4
 */

package rectangle_class;

public class Test_Rectangle {

	public static void main( String[] args ){
		
		//create two new rectangle objects
		Rectangle rectangle = new Rectangle( 4.5, 8.9 );
		Rectangle square = new Rectangle(); 
		
		//output current data about two objects
		System.out.println( "The rectangle object data is: " );
		System.out.println( rectangle.toString() );
		
		System.out.println( "The square object data is: " );
		System.out.println( square.toString() );
		
		//change the length and width of rectangle 
		rectangle.setLength( 12.5 ); 
		rectangle.setWidth( 14.2 );
		
		//print the new data for rectangle 
		System.out.println( "The new rectangle data is: " );
		System.out.println( rectangle.toString() );
		
	} //end main 

} //end Test Rectangle 

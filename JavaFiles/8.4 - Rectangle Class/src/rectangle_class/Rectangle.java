/*
 * Courtney Holsinger
 * 11/1/2015
 * Chapter8
 * 8.4
 */

package rectangle_class;

public class Rectangle {

	//declare variables 
	private double length; 
	private double width;
	
	//--------------------------------------------------Rectangle Constructors--------
	//initializes instance variables to 1
	public Rectangle() {
		
		this( 1.0, 1.0 ); 
		
	} //end empty constructor Rectangle 
	
	public Rectangle( double newLength, double newWidth ){
		
		//validation if length and width are between 0.0 and 20.0
		if( newLength >= 0.0 && newLength <= 20.0 && newWidth >= 0.0 && newWidth <= 20.0 ){
			this.length = newLength;
			this.width = newWidth; 
		} //end if 
		
		//else set values to default in empty Rectangle (do I need this?)***
		else {
			this.length = 1;
			this.width = 1;
		 } //end else 
		
	} //end Rectangle Constructor 

	//--------------------------------------------------Set & Get Width------------------
	public void setWidth ( double setWidth ){
		
		width = setWidth;
		
	} //end set width 

	public double getWidth() {
		
		return width;
		
	} //end get width 
	
	//--------------------------------------------------Set & Get Length---------------
	public void setLength( double setLength ) {
		
		length = setLength;
		
	} //end set length 
	
	public double getLength() {
		
		return length; 
		
	} //end get length 

	//--------------------------------------------------Get Perimeter------------------
	public double getPerimeter() {
		
		double perimeter = 2 * (length + width );
		return perimeter;
		
	} //end get perimeter method 
	
	//--------------------------------------------------Get Area----------------------
	public double getArea() {
		
		double area = length * width;
		return area;
		
	} //end get area method 

	
	//--------------------------------------------------Format Output----------------
	public String toString() {
		
		return String.format("%s: %.1f\n%s: %.1f\n%s: %.1f\n%s: %.1f\n", 
				"The length is", length,
				"The width is", width, 
				"The Perimeter is", getPerimeter(), 
				"The Area is", getArea() );
		
	} //end to String 
	
	
} //end class rectangle 

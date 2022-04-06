package Puck;
/*
Program: Circle      Date: April 5, 2022

Purpose: 
Create a Puck class that inherits the Disk class. The Puck class should include member variables weight,
standard, and youth. The standard and youth variables should be boolean variables that are set to either true
or false depending on the weight of the puck. A standard puck weighs between 5 and 5.5 ounces. A youth
puck weighs between 4 and 4.5 ounces. Official hockey pucks, regardless of weight, are one inch-thick with a
three-inch diameter. The Puck class should also contain member methods getWeight(), getDivision(), which
returns a string stating whether the puck is standard or youth, and equals() and toString(), which overrride
the same methods in the Disk class. The Puck constructor should require an argument for weight. Be sure
that the constructor initializes other variables to appropriate values as necessary.
	Create a Hockey application that tests the Puck class.


Author: Morsal Nory
School: CHHS
Course: Computer Science 30

*/

public class Circle {

	private static double PI = 3.14;
	private double radius;
		
	
	/**
	 * constructor
	 * pre: none
	 * post: A Circle object created. Radius initialized to 1.
	 */
	public Circle() {
		radius = 1;			//default radius
	}
	

	/**
	 * constructor
	 * pre: none
	 * post: A Circle object created with radius r.
	 */
	public Circle(double r) {
		radius = r;
	}


	/** 
	 * Changes the radius of the circle.
	 * pre: none
	 * post: Radius has been changed.
	 */
	public void setRadius(double newRadius) {
	 	radius = newRadius;
	}


	/** 
	 * Calcuates the area of the circle.
	 * pre: none
	 * post: The area of the circle has been returned.
	 */
	public double area() {
	 	double circleArea;
	 	
	 	circleArea = PI * radius * radius;
	 	return(circleArea);
	}

	
	/** 
	 * Returns the radius of the circle.
	 * pre: none
	 * post: The radius of the circle has been returned.
	 */
	public double getRadius() {
	 	return(radius);
	}
	
	/** 
	 * Displays the formula for the area of a circle.
	 * pre: none
	 * post: formula for area of a circle displayed.
	 */
	public static void displayAreaFormula() {
	 	System.out.println("The formula for the area of a circle is a=Pi*r*r");
	}
	

	/** 
	 * Determines if the object is equal to another
	 * Circle object.
	 * pre: none
	 * post: true has been returned if the objects have 
	 * the same radii. false has been returned otherwise.
	 */
	public boolean equals(Object obj) {
		Circle testObj = (Circle)obj;
		
	 	if (testObj.getRadius() == radius) {
			return(true);
		} else {
			return(false);
		}
	}


	/** 
	 * Returns a String that represents the Circle object.
	 * pre: none
	 * post: A string representing the Circle object has 
	 * been returned.
	 */
	public String toString() {
		String circleString;

		circleString = "Circle has radius " + radius;
	 	return(circleString);
	}
	
}
/* Screen Dump



*/

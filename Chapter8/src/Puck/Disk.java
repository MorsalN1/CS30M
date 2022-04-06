package Puck;

/*
Program: Disk      Date: April 5, 2022

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

public class Disk extends Circle {

double thickness;
	
	/**
	 * constructor
	 * pre: none
	 * post: A Disk object has been created with radius r
	 * and thickness t.
	 */
	public Disk(double r, double t) {
		super(r);
		thickness = t;
	}


	/** 
	 * Changes the thickness of the disc.
	 * pre: none
	 * post: Thickness has been changed.
	 */
	public void setThickness(double newThickness) {
	 	thickness = newThickness;
	}


	/** 
	 * Returns the thickness of the disc.
	 * pre: none
	 * post: The thickness of the disc has been returned.
	 */
	public double getThickness() {
	 	return(thickness);
	}
	
	
	/**
	 * Returns the volume of the disc.
	 * pre: none
	 * post: The volume of the disc has been returned.
	 */
	public double volume() {
		double v;
		
		v = super.area() * thickness;
		return(v);
	}

	
	/** 
	 * Determines if the object is equal to another
	 * Disk object.
	 * pre: none
	 * post: true has been returned if the objects have 
	 * the same radii and thickness. false has 
	 * been returned otherwise.
	 */
	public boolean equals(Object obj) {
		Disk testObj = (Disk)obj;
		
	 	if (testObj.getRadius() == super.getRadius() && 
	 		testObj.getThickness() == thickness) {
			return(true);
		} else {
			return(false);
		}
	}


	/** 
	 * Returns a String that represents the Disk object.
	 * pre: none
	 * post: A string representing the Disk object has 
	 * been returned.
	 */
	public String toString() {
		String diskString;

		diskString = "The disk has radius " + super.getRadius() +
					 " and thickness " + thickness + ".";
	 	return(diskString);
	}
	
}
/* Screen Dump



*/

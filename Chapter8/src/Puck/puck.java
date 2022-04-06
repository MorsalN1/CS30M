package Puck;
/*
Program: Puck      Date: April 5, 2022

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

Modify the Puck class to implement the Comparable interface. Two pucks are the equal when they have the 
same weight. Modify the existing client code to test the new method.



Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/

public class puck extends Disk {
	
	double weight;
	public puck(double r, double t, double w) {
		super(r, t);
		weight = w;
	}
	public double getweight() {
		return weight;
	}
	
	// figure out if the puck is standard or youth
	public String getDivision() {
		String ys = " ";
		//between 5 and 5.5: standard
		if( weight >= 5 && weight<= 5.5) {
			ys = " The puck is standard";
			//between 4 and 4.5: youth
		}else if(weight >=4 && weight <=4.5) {
			ys = "the puck is youth";
		}
		return ys;
			}
	
	//determines if an object is equal to another project
	public boolean equals(Object obj) {
		puck testObj = (puck)obj;
		
		if( testObj.getRadius() == super.getRadius() &&
			testObj.getThickness() == super.getThickness() &&
			testObj.getweight() == weight)
	{ 
		return(true);
	} else {
		return(false);
	}
	}
	
	// the text about the info of a puck
	public String toString() {
		String ps2;
		
		ps2 = " the puck has a radius of " + super.getRadius()+
		", a thickness of " + super.getThickness() + " and a weight of " +
				weight; 
		return ps2;
	}
	
	
// compares the weight of pucks	
	public int compareto( Object c)
	{
		puck testpuck = (puck)c;
		if(weight < testpuck.getweight())
		{
			return(-1);
		}else if ( weight == testpuck.getweight())
		{
			return(0);
		}else
		{
			return(1);
		}

}
}
/* Screen Dump



*/

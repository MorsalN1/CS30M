package Puck;
/*
Program: Hockey      Date: April 5, 2022

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

public class hockey {

	public static void main(String[] args) 
	 {
		// outputs the info of the puck
		puck puck = new puck(1.5, 1, 4); 
		System.out.println("The radius of the disk is:  " + puck.getRadius());
		System.out.println("The surface area of the disk is:  " + puck.area());
		System.out.println("The volume of the disk is:  " + puck.volume());
		System.out.println(puck.getDivision());
		System.out.println(puck);
		
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		// determines if puck 1 and 2 are equal or not, message is relayed wit the answer
		puck puck1 = new puck(1.5, 1,4.2); 
		puck puck2 = new puck(1.5, 1, 5); 
		 if(puck1 == puck2) {
			 System.out.println("objects are equal");
		 }else {
			 System.out.println("objects are not equal");
		 }
		
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//compares the weight of pucks 1 and 2
		if(puck1.compareto(puck2)==0) {
			 System.out.println("The pucks are equal");
		 } else if (puck1.compareto(puck2) < 0 ) {
			 System.out.println("Puck1 is lighter than puck2 ");
		 } else {
			 System.out.println("Puck1 is heavier than puck2 ");
		 }
		
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		 //outputs if the puck is youth or standard
		 System.out.println(puck1.getDivision());
		 System.out.println(puck2.getDivision());
		 //outputs measurments of the puck( radius, thickness, weight)
		 System.out.println(puck1);
		 System.out.println(puck2);
}
	
}
/* Screen Dump

The radius of the disk is:  1.5
The surface area of the disk is:  7.0649999999999995
The volume of the disk is:  7.0649999999999995
the puck is youth
 the puck has a radius of 1.5, a thickness of 1.0 and a weight of 4.0
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
objects are not equal
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Puck1 is lighter than puck2 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
the puck is youth
 The puck is standard
 the puck has a radius of 1.5, a thickness of 1.0 and a weight of 4.2
 the puck has a radius of 1.5, a thickness of 1.0 and a weight of 5.0



*/
package Excercise3;
/*
Program: truck      Date: April 5, 2022

Purpose: Create a Vehicle class that is an abstract class defining the general details and actions associated with
a vehicle. Create Car, Truck, and Minivan classes that inherit the Vehicle class. The Car, Truck, and
Minivan classes should include additional members specific to the type of vehicle being represented.
Create client code to test the classes.



Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
public class truck extends vehicle 

{
String tbrand; 

// uses the vehicle constructor
// new variable to truck brand is made
	public truck(int doors, String fuel, int seating, String colour, String brand) {
		super(doors, fuel, seating, colour);
		tbrand=  brand;
	}

	// returns the name of truck brand when told
	public String gettbrand() {
	 	return(tbrand);
	 }
	
}
/* Screen Dump



*/
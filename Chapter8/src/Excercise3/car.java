package Excercise3;
/*
Program: car      Date: April 5, 2022

Purpose: Create a Vehicle class that is an abstract class defining the general details and actions associated with
a vehicle. Create Car, Truck, and Minivan classes that inherit the Vehicle class. The Car, Truck, and
Minivan classes should include additional members specific to the type of vehicle being represented.
Create client code to test the classes.



Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/

public class car extends vehicle {
	
	int carage;

	// uses the vehicle constructor
	// new variable to cat age is made
	public car(int doors, String fuel, int seating, String colour, int age) {
		super(doors, fuel, seating, colour);
		carage =  age;
	}
// returns the age of the car when told
	public int getage() {
	 	return(carage);
	 }
	
}
/* Screen Dump



*/
package Excercise3;
/*
Program: minivan      Date: April 5, 2022

Purpose: Create a Vehicle class that is an abstract class defining the general details and actions associated with
a vehicle. Create Car, Truck, and Minivan classes that inherit the Vehicle class. The Car, Truck, and
Minivan classes should include additional members specific to the type of vehicle being represented.
Create client code to test the classes.



Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/

public class minivan extends vehicle {
	
	int modelyr;

	// uses the vehicle constructor
	// new variable to minivan year is made
	public minivan(int doors, String fuel, int seating, String colour, int yr) {
		super(doors, fuel, seating, colour);
		modelyr = yr;
	}
	
	//returns the model year when told to
	public int getmodelyr() {
	 	return(modelyr);
	 }
}
/* Screen Dump



*/
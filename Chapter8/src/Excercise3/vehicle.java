package Excercise3;
/*
Program: vehicle      Date: April 5, 2022

Purpose: Create a Vehicle class that is an abstract class defining the general details and actions associated with
a vehicle. Create Car, Truck, and Minivan classes that inherit the Vehicle class. The Car, Truck, and
Minivan classes should include additional members specific to the type of vehicle being represented.
Create client code to test the classes.



Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
public abstract class vehicle {
	
	private int numberdoors;
	private int seatingCapacity;
	private String carcolour,fueltype;

	/**
	 * constructor
	 * pre: none
	 * post: A vehicle has been created.
	 */
	public vehicle(int doors, String fuel, int seating, String colour) {
		numberdoors = doors;
		fueltype = fuel;
		seatingCapacity = seating;
		carcolour = colour;
	}
		
	/**
	 * Returns the fEHwy
	 * pre: none
	 * post: The highway fuel economy has been returned
	 */
	 public String getfuel() {
	 	return(fueltype);
	 }


	/**
	 * Returns the fECity
	 * pre: none
	 * post: The city fuel economy has been returned
	 */
	 public int getNumDoor() {
	 	return(numberdoors);
	 }


	/**
	 * Returns the seating capacity
	 * pre: none
	 * post: The seating capacity has been returned
	 */
	 public int getSeating() {
	 	return(seatingCapacity);
	 }


	/**
	 * Returns the cargo volume
	 * pre: none
	 * post: The cargo volume has been returned
	 */
	 public String getCarColour() {
	 	return(carcolour);
	 }
	}

/* Screen Dump



*/

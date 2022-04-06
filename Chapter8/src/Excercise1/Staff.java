package Excercise1;
/*
Program: Staff      Date: April 5, 2022

Purpose: Create a UEmployee class that contains member variables for the university employee name and salary.
The UEmployee class should contain member methods for returning the employee name and salary.
Create Faculty and Staff classes that inherit the UEmployee class. The Faculty class should include
members for storing and returning the department name. The Staff class should include members for
storing and returning the job title.



Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/

public class Staff extends UEmployee {
	
	String jobtit;
	
	// first, last name and salary are added aswell as a job title for the staff
	public Staff(String fName, String lName, double sal, String title) {
		super(fName, lName, sal);
		jobtit = title;
	}
	// object that returns the job title is created
	public String getjt() {
		return jobtit;
	}
	
	
}
/* Screen Dump



*/
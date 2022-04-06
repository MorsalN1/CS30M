package Excercise1;
/*
Program: Faculty      Date: April 5, 2022

Purpose: Create a UEmployee class that contains member variables for the university employee name and salary.
The UEmployee class should contain member methods for returning the employee name and salary.
Create Faculty and Staff classes that inherit the UEmployee class. The Faculty class should include
members for storing and returning the department name. The Staff class should include members for
storing and returning the job title.



Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/

public class Faculty extends UEmployee {

String dept;
	
// first, last name and salary are added aswell as the department name for the staff
	public Faculty(String fName, String lName, double sal, String deptname) {
		super(fName, lName, sal);
		dept = deptname;
	}
	
	//object returns the department name
	public String getdeptn() {
		return dept;
		
	}
	
	

}
/* Screen Dump



*/
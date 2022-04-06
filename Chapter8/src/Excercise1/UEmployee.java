package Excercise1;
/*
Program: UEmployee      Date: April 5, 2022

Purpose: 
Create a UEmployee class that contains member variables for the university employee name and salary.
The UEmployee class should contain member methods for returning the employee name and salary.
Create Faculty and Staff classes that inherit the UEmployee class. The Faculty class should include
members for storing and returning the department name. The Staff class should include members for
storing and returning the job title.



Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
public abstract class UEmployee {


	String firstName, lastName;
	double yearlysalary;
	    
	     //sets the salary and first and last name 
	    public UEmployee(String fName, String lName, double sal)
	    {
	        firstName = fName;
	        lastName = lName;
	        yearlysalary = sal;
	    }
	    
	    //object returning the full name
	    public String toString()
	    {
	        return(firstName+" "+lastName);
	    }
	    
	    // object returning the salary
	    public double getSal() {
	    	return yearlysalary;
	    }
	 
    
}
/* Screen Dump



*/
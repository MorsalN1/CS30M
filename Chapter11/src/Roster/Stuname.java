package Roster;
/*
Program: Stuname      Date: April 27, 2022

Purpose: Create a Roster application that prompts the user for the name of the file to store student names and then
prompts the user for the number of students in a class. The application should then prompt the user for
the first and last name of each student and write this data to a file. After all the data is written to a file, the
application display the class roster with one name after the other in a list. Create a StuName class that has
member variables firstName and lastName and a toString() member method.

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/

import java.io.Serializable;
import java.util.Scanner;

public class Stuname implements Serializable{
	//Initialize the variables
private String firstName;
private String LastName;

//creates a method for the students name
public Stuname(String FN, String LN) {
	firstName = FN;
	LastName = LN;
	
}
	
// a method fo the full name of the student
public String toString() {
	String Fullname;
	Fullname = " First and Last name: " + firstName + "  " + LastName;
	return(Fullname);
	
}
	
}
/*
 * Screen Dump
 * 
 * 
 * 
 */
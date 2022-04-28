package Roster;
/*
Program: Stuname      Date: April 27, 2022

Purpose: 


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/

import java.io.Serializable;
import java.util.Scanner;

public class Stuname implements Serializable{
private String firstName;
private String LastName;

public Stuname(String FN, String LN) {
	//Scanner input = new Scanner(System.in);
	firstName = FN;
	LastName = LN;
	
	//FN = input.next();
	//LN = input.next();
}
	
public String toString() {
	String Fullname;
	Fullname = " First and Last name: " + firstName + "  " + LastName;
	return(Fullname);
	
}
	
}

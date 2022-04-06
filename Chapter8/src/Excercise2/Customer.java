package Excercise2;
/*
Program: CustomerAct      Date: April 5, 2022

Purpose: Create PersonalAcct and BusinessAcct classes that inherit the Account class presented in Chapter 8.
A personal account requires a minimum balance of $100. If the balance falls below this amount, then
$2.00 is charged (withdrawn) to the account. A business account requires a minimum balance of $500,
otherwise the account is charged $10. Create client code to test the classes.



Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/

public class Customer {
private String firstName, lastName, street, city, state, zip;
		
	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String str, String c, String s, String z) {
		firstName = fName;
		lastName = lName;
		street = str;
		city = c;
		state = s;
		zip = z;
	}
	

	/**
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Account object has 
	 * been returned.
	 */
	 public String toString() {
		String custString;
	
		custString = firstName + " " + lastName + "\n";
		custString += street + "\n";
		custString += city + ", " + state + "  " + zip + "\n";
	 	return(custString);
	}
	
	
	
}

/* Screen Dump



*/

package Excercise2;
/*
Program: PersonalAct      Date: April 5, 2022

Purpose: Create PersonalAcct and BusinessAcct classes that inherit the Account class presented in Chapter 8.
A personal account requires a minimum balance of $100. If the balance falls below this amount, then
$2.00 is charged (withdrawn) to the account. A business account requires a minimum balance of $500,
otherwise the account is charged $10. Create client code to test the classes.



Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
public class PersonalAct extends Account{


	// Constructor is used in the Personal account
	public PersonalAct(double bal, String fName, String lName, String str, String city, String st, String zip) {
		super(bal, fName, lName, str, city, st, zip);
	}
	
}
/* Screen Dump



*/
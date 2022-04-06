package Excercise2;
import java.text.NumberFormat;
/*
Program: Account      Date: April 5, 2022

Purpose: Create PersonalAcct and BusinessAcct classes that inherit the Account class presented in Chapter 8.
A personal account requires a minimum balance of $100. If the balance falls below this amount, then
$2.00 is charged (withdrawn) to the account. A business account requires a minimum balance of $500,
otherwise the account is charged $10. Create client code to test the classes.



Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/

public class Account {
	

	private double balance;
	private Customer cust;
		
	
	/**
	 * constructor
	 * pre: none
	 * post: An account has been created. Balance and 
	 * customer data has been initialized with parameters.
	 */
	public Account(double bal, String fName, String lName, String str, String city, String st, String zip) {
		balance = bal;
		cust = new Customer(fName, lName, str, city, st, zip);
	}
	

	/** 
	 * Returns the current balance.
	 * pre: none
	 * post: The account balance has been returned.
	 */
	public double getBalance() {
	 	return(balance);
	}


	/** 
	 * A deposit is made to the account. 
	 * pre: none
	 * post: The balance has been increased by the amount of the deposit.
	 */
	public void deposit(double amt) { 
	 	balance += amt;
	}

	
	/** 
	 * A withdrawal is made from the account if there is enough money.
	 * pre: none
	 * post: The balance has been decreased by the amount withdrawn.
	 */
	public void withdrawal(double amt) {
	 	if (amt <= balance) {
	 		balance -= amt;
	 	}
	 	
	 	else {
	 		System.out.println("Not enough money in account.");
	 	}
	}
	
	
	/** 
	 * Returns a String that represents the Account object.
	 * pre: none
	 * post: A string representing the Account object has 
	 * been returned.
	 */
	public String toString() {
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();

		accountString = cust.toString();
		accountString += "Current balance is " + money.format(balance);
	 	return(accountString);
	}
	
}
/* Screen Dump



*/

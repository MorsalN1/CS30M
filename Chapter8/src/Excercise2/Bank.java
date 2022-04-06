package Excercise2;
/*
Program: Bank      Date: April 5, 2022

Purpose: Create PersonalAcct and BusinessAcct classes that inherit the Account class presented in Chapter 8.
A personal account requires a minimum balance of $100. If the balance falls below this amount, then
$2.00 is charged (withdrawn) to the account. A business account requires a minimum balance of $500,
otherwise the account is charged $10. Create client code to test the classes.



Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import java.util.Scanner;
import java.text.NumberFormat;

public class Bank {
	
	public static void act(Account emp) {
		System.out.println(emp);
	}
	
	public static void wt(Account drawl) {

	}
	
	
	 public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
		//information for each account is filled
			      PersonalAct emp1 = new PersonalAct(150, "Maria", "stor", "94 ave", "Calgary", "alberta", " T2M 2S2");  
			      BusinessAct emp2 = new BusinessAct(575, "damian", "trot", "84 ave", "edmonton", "alberta", " T2M 2S2");			      
			      
			      //variables declared
			      String action;
			      int empNum;
			      Account emp = emp1;
			      NumberFormat money = NumberFormat.getCurrencyInstance();
			      Double in;
			      do
			     { 
			    	  //user enters the option to continue
			      System.out.println("\nInfo\\Deposit\\Withdrawl\\Quit");
			      System.out.println("Enter choice:  \n (enter full words)");
			      action = input.next();
			     
			      if(!action.equalsIgnoreCase("Quit"))
			      {
			    	  //user decides on personal or business account
			          System.out.println("\n1.Personal Account \n2. Business Account ");
			         empNum = input.nextInt();
			         switch(empNum)
			         {
			             case 1: emp = emp1;break;
			             case 2: emp = emp2;break;
			         }
			         //information is released about the chosen account
			         if(action.equalsIgnoreCase("Info"))
			         {
			            System.out.println(emp);
			         }
			       // If user decides to Deposit money into the account
			         if(action.equalsIgnoreCase("Deposit"))
			        	 //personal account deposit
			         { if(empNum == 1) {
				            System.out.println("How much will you deposit: ");
				            in = input.nextDouble();
				            emp1.deposit(in);
				            System.out.println("balance is" + money.format(emp1.getBalance()) );
			         }
			         //business account deposit
			         if(empNum == 2) {
			        	 System.out.println("How much will you deposit: ");
				            in = input.nextDouble();
				            emp2.deposit(in);
				            System.out.println("balance is" + money.format(emp2.getBalance()) );
			          }
			          }		
			         //user chooses to Withdraw money
			         else if(action.equalsIgnoreCase("Withdrawl"))
			         { if(empNum == 1) {
			        	 //money withdrawn from personal account
				            System.out.println("How much will you withdrawl: ");
				            in = input.nextDouble();
				            emp1.withdrawal(in);
							if(emp1.getBalance()>=100)
				            System.out.println("balance is " + money.format(emp1.getBalance()) );
							//if account balance becomes less than $100.00, an extra $2.00 is withdrawn 
				            if (emp1.getBalance()<100)
				            System.out.println("balance is " + money.format(  (emp1.getBalance() - 2)) );
			         }
			         if(empNum == 2) {
			        	 System.out.println("How much will you withdrawl: ");
			        	 //money withdrawn from business account
				            in = input.nextDouble();
				            emp2.withdrawal(in);
				            if(emp2.getBalance()>=500)
					            System.out.println("balance is " + money.format(emp2.getBalance()) );
					            if (emp1.getBalance()<500)
					            	// if account balance becomes less than $500.00 than an extra $10.00 is withdrawn
					            System.out.println("balance is " + money.format(  (emp2.getBalance() - 10)) );
			          }
				          

			          }		
			         }
			     }while(!action.equalsIgnoreCase("Quit"));
			    }

}
/* Screen Dump

Info\Deposit\Withdrawl\Quit
Enter choice:  
 (enter full words)
Info

1.Personal Account 
2. Business Account 
1
Maria stor
94 ave
Calgary, alberta   T2M 2S2
Current balance is $150.00

Info\Deposit\Withdrawl\Quit
Enter choice:  
 (enter full words)
Withdrawl

1.Personal Account 
2. Business Account 
1
How much will you withdrawl: 
75
balance is $73.00

Info\Deposit\Withdrawl\Quit
Enter choice:  
 (enter full words)
quit




Info\Deposit\Withdrawl\Quit
Enter choice:  
 (enter full words)
Info

1.Personal Account 
2. Business Account 
2
damian trot
84 ave
edmonton, alberta   T2M 2S2
Current balance is $575.00

Info\Deposit\Withdrawl\Quit
Enter choice:  
 (enter full words)
Deposit

1.Personal Account 
2. Business Account 
2
How much will you deposit: 
65
balance is$640.00

Info\Deposit\Withdrawl\Quit
Enter choice:  
 (enter full words)
quit





*/

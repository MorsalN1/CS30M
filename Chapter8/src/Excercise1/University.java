package Excercise1;

import java.text.NumberFormat;
import java.util.Scanner;
/*
Program: University      Date: April 5, 2022

Purpose: Create a UEmployee class that contains member variables for the university employee name and salary.
The UEmployee class should contain member methods for returning the employee name and salary.
Create Faculty and Staff classes that inherit the UEmployee class. The Faculty class should include
members for storing and returning the department name. The Staff class should include members for
storing and returning the job title.



Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/

public class University {
	
 public static void payEmployee(UEmployee emp, double payR)
	    {
	        NumberFormat money = NumberFormat.getCurrencyInstance();
	        double pay;	        
	        System.out.println(emp);
	        //gets the employees salary
	        pay = emp.getSal();
	        System.out.println(money.format(pay));
	        
	    }
	// retrieves the department name from Faculty class
	 public static void Faculty(Faculty ult)
	    {
	        String jay = ult.getdeptn();
	        System.out.println(jay);
	        
	    }
	 // retrieve job title from staff class
	 public static void Staff(Staff ya)
	    {
	        String ray =ya.getjt();
	        System.out.println(ray);
	        
	    }
	 
	 public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			// name, salary and job or department are added
			    Faculty emp1 = new Faculty("Richard", " fleas", 50000, "science");  
			    Staff emp2 = new Staff("Storn", "John", 55000, "professor");			      
			      
			      String action;
			      int empNum;
			      double payR;
			      UEmployee emp = emp1;
			      Faculty ult = emp1;
			      Staff ya = emp2;

			      do
			     { 
			    	  // user chooses an option 
			      System.out.println("\nEmployee\\Salary\\Faculty\\Job Title\\Quit");
			      System.out.println("Enter choice:  \n(enter the full words)");
			      action = input.next();
			     
			      if(!action.equalsIgnoreCase("Quit"))
			      { 
			    	  // user chooses an employee
			          System.out.println("Enter Employee number (1 or 2):");
			         empNum = input.nextInt();
			         switch(empNum)
			         {
			             case 1: emp = emp1;break;
			             case 2: emp = emp2;break;
			         }
			         if(action.equalsIgnoreCase("Employee"))
			         {
			             System.out.println(emp);
			         }
			         if(action.equalsIgnoreCase("Faculty"))
			         {
			        	 // outputs department depending on the employee number
			        	 if(empNum == 1){
			        	    Faculty(ult);
			        	    }
			        	 if(empNum==2) {
				             System.out.println("is not Applicable");
			        	 }
			         }
			         if(action.equalsIgnoreCase("Job Title"))
			         {
			        	 // outputs job title depending on the employee number
			        	 if(empNum == 1){
			        		 System.out.println("is not Applicable");
			        	    }
			        	 if(empNum==2) {
			       	       Staff(ya);
			        	 }
			         }
			         
			         else if(action.equalsIgnoreCase("Salary"))
			         {
			        	 //outputs name and salary
			             payR=0;
			             payEmployee(emp, payR);
			          }			            
			         }
			     }while(!action.equalsIgnoreCase("Quit"));
			    }
	
}

/* Screen Dump

Employee\Salary\Faculty\Job Title\Quit
Enter choice:  
(enter the full words)
Salary
Enter Employee number (1 or 2):
2
Storn John
$55,000.00

Employee\Salary\Faculty\Job Title\Quit
Enter choice:  
(enter the full words)
Faculty
Enter Employee number (1 or 2):
1
science

Employee\Salary\Faculty\Job Title\Quit
Enter choice:  
(enter the full words)
Quit


*/

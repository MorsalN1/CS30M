package Excercise3;
/*
Program: Dealership      Date: April 5, 2022

Purpose: Create a Vehicle class that is an abstract class defining the general details and actions associated with
a vehicle. Create Car, Truck, and Minivan classes that inherit the Vehicle class. The Car, Truck, and
Minivan classes should include additional members specific to the type of vehicle being represented.
Create client code to test the classes.



Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/

import java.util.Scanner;
import java.text.NumberFormat;

public class Dealership {
	
// object made with the variable made for the return of each 
	public static void vhc(vehicle emp)
    {
		NumberFormat num = NumberFormat.getCompactNumberInstance();
        int st, dr;	      
        String fl,cl;
        fl = emp.getfuel();
        cl = emp.getCarColour();
        st = emp.getNumDoor();
        dr = emp.getSeating();
        System.out.println(num.format(dr)+" "+num.format(st)+" "+cl+" "+fl);

    }
	// Separate object made for car
	 public static void Car(car Cars)
	    {
	        int rac =Cars.getage();
	        System.out.println(rac);
	        
	    }
		// Separate object made for Minivan
	 public static void minivan(minivan Mvan)
	    {
	        int nav =Mvan.getmodelyr();
	        System.out.println(nav);
	        
	    }
		// Separate object made for truck
	 public static void truck(truck Truk)
	    {
	        String cur =Truk.gettbrand();
	        System.out.println(cur);
	        
	    }

    public static void main(String[] args) 
    {
    	Scanner input = new Scanner(System.in);
    	
    	//details of each car is made
    	truck emp1 = new truck(4, "diesel", 6, "blue", "chevrolet");  
        car emp2 = new car(2, "solar", 5, "red", 2);
        minivan emp3 = new minivan(4, "regular gasoline", 8, "silver", 2021);
        
        //variables are decalred 
        int action;
        int empNum;
        vehicle emp = emp1;
        truck Truk = emp1;
        car Cars = emp2;
        minivan Mvans = emp3;
        do
        { 
        	// user input decides on the overall details of car, extra, or to quit the program
         System.out.println("\n1. number of door, fuel type, number of seats, colour of vehicle\n2. extra fact\n3. Quit");
         System.out.println("Enter option:  ");
         action = input.nextInt();

	      if(action != 3)
	      {
	    	  //user chooses which vehicle to learn about
	          System.out.println("\n1. Truck\n2. Car\n3. MiniVan ");
	         empNum = input.nextInt();
	         switch(empNum)
	         {
	         case 1: emp = emp1;break;
	         case 2: emp = emp2;break;
	         case 3: emp = emp3;break;

	         }
	         //outputs overall details
	         if(action == 1)
	         {
	        	 vhc(emp);
	         }
	       
	         //outputs extra detail depending on which car was chosen
	         else if(action == 2)
	         {
	        	 if(empNum == 1){
	        		 System.out.println("The brand is:  "); 
	        		 truck(Truk);
		        	    }
		         if(empNum==2) {
	        		 System.out.println("The vehicle's age is:  "); 

		       	       Car(Cars);
		        	 }
		        if(empNum == 3){
	        		 System.out.println("The vehicle's year is:  "); 

			       minivan(Mvans);
			    	    }
	          }			            
	         }
	     }while(action != 3);
    	 }
	
 }
/* Screen Dump


1. number of door, fuel type, number of seats, colour of vehicle
2. extra fact
3. Quit
Enter option:  
1

1. Truck
2. Car
3. MiniVan 
2
5 2 red solar

1. number of door, fuel type, number of seats, colour of vehicle
2. extra fact
3. Quit
Enter option:  
2

1. Truck
2. Car
3. MiniVan 
3
The vehicle's year is:  
2021

1. number of door, fuel type, number of seats, colour of vehicle
2. extra fact
3. Quit



*/



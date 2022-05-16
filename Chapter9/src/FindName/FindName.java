package FindName;

import java.util.Scanner;

/*
Program: FindName      Date: May 3, 2022

Purpose: Add a static method to the Search class that performs a linear search on a String array. The linear() method
should overload the existing method, have parameters for accepting a String array and a String variable,
and return an int indicating the position of the String. Create a FindName application that uses the Search
class. FindName should prompt the user for names to fill an array and then prompt the user for the name
to find


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
public class FindName {
	public static void main(String[] args) {
		//max number of names that can be entered
		final int Max_Names = 10;
		String[] nameArray = new String[Max_Names];
		Scanner input = new Scanner(System.in);
		String Findname;
		int location;
		// user continuously inputs names until 10 names have been entered
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println("Enter a name:  ");
			//names are added to the array
			nameArray[i] = input.nextLine();
		}
		System.out.println("Enter a name to search for:  ");
		//user enter a name to be found
		Findname = input.nextLine();
		// system checks if the name entered is in the array
		location = Search.linear(nameArray, Findname);
		// if the name is not in the list
		if (location == -1) {
			System.out.println("name not found");
			// if the name is in it then a message is output
		} else {
			System.out.println( Findname + " is found");
		}
	
	}
}



/*
 * Screen Dump
 * 
 Enter a name:  
sam
Enter a name:  
alex
Enter a name:  
mark
Enter a name:  
liam
Enter a name:  
james
Enter a name:  
tyler
Enter a name:  
balen
Enter a name:  
james
Enter a name:  
tom
Enter a name:  
tim
Enter a name to search for:  
liam
liam is found
*
*
Enter a name:  
sam
Enter a name:  
alex
Enter a name:  
mark
Enter a name:  
liam
Enter a name:  
james
Enter a name:  
tyler
Enter a name:  
balen
Enter a name:  
jane
Enter a name:  
tom
Enter a name:  
tim
Enter a name to search for:  
mike
name not found
*
*/
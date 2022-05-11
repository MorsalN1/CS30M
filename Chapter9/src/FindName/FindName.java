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

		final int Max_Names = 10;
		String[] nameArray = new String[Max_Names];
		Scanner input = new Scanner(System.in);
		String Findname;
		int location;

		for (int i = 0; i < nameArray.length; i++) {
			System.out.println("Enter a name:  ");
			nameArray[i] = input.nextLine();
		}
		System.out.println("Enter a name to search for:  ");
		Findname = input.nextLine();

		location = Search.linear(nameArray, Findname);

		if (location == -1) {
			System.out.println("name not found");
		} else {
			System.out.println( Findname + " is found");
		}
	
	}
}



/* Screen Dump
 * Enter a name:  
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
*/
package FindName;

import java.util.Scanner;

/*
Program: Squares      Date: May 3, 2022

Purpose: 


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
			System.out.println("First occurance is element:  " + location);
		}
	
	}
}



/*
 * Enter a name:  
sam
Enter a name:  
alex
Enter a name:  
mark
Enter a name:  
marn
Enter a name:  
morry
Enter a name:  
liam
Enter a name:  
bale
Enter a name:  
james
Enter a name:  
tom
Enter a name:  
tim
Enter a name to search for:  
morry
First occurance is element:  4
*/
package FindName;

/*
Program: Search      Date: May 3, 2022

Purpose: Add a static method to the Search class that performs a linear search on a String array. The linear() method
should overload the existing method, have parameters for accepting a String array and a String variable,
and return an int indicating the position of the String. Create a FindName application that uses the Search
class. FindName should prompt the user for names to fill an array and then prompt the user for the name
to find


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
public class Search {
	

	public static int linear(String[] array, String findname) {
		int index = 0;
		// checks the elements of the array
		// index value increases whenever the loop completes without finding an element
		while (!(array[index].equals(findname)) && (index < array.length - 1)) {
			index = index + 1;
		}
		// if the names are the same then the index is returned
		if (array[index].equals(findname)) {
			return index;
		} else {
			return -1;
		}

	}

}

/*
 * Screen Dump
 *
 *
 */
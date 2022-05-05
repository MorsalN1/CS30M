package FindName;
/*
Program: Squares      Date: May 3, 2022

Purpose: 


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
public class Search {
	public static int linear(int[] array, int numToFind) {
		int index = 0;

		while ((array[index] != numToFind) && (index < array.length - 1)) {
			index += 1;
		}

		if (array[index] == numToFind) {
			return (index);
		} else {
			return (-1);
		}
	}

	public static int linear(String[] array, String findnaem) {
		int index = 0;

		while (!(array[index].equals(findnaem)) && (index < array.length - 1)) {
			index = index + 1;
		}
		if (array[index].equals(findnaem)) {
			return index;
		} else {
			return -1;
		}

	}

	public static int linear1(String[] nameArray, String findname) {
		// TODO Auto-generated method stub
		return 0;
	}
}

import java.util.ArrayList;
import java.util.Scanner;

/*
Program: HighestGrade      Date: May 9, 2022

Purpose: Create a HighestGrade application that prompts the user for five grades between 0 and 100 points and stores
the grades in an ArrayList. HighestGrade then traverses the grades to determine the highest grade and then
displays the grade along with an appropriate message.


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
public class HighestGrade {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Integer element, element2;
		final int MAX = 5;
		int[] numArray = new int[MAX];
		Scanner input = new Scanner(System.in);
		int max = Integer.MIN_VALUE;

		// user enters 5 grades continuously
		for (int i = 0; i < numArray.length; i++) {
			System.out.println("enter a grade between 0-100:  ");
			int grade = input.nextInt();
			// checks to find which of the grades entered are the highest
			if (max < grade) {
				// sets the max into a grade
				max = grade;
			}
			// the max is added
			nums.add(new Integer(max));
			// number 1 is added
			nums.add(new Integer(1));
		}
		// element takes in the max
		element = nums.get(0);
		// element2 takes in the number 1
		element2 = nums.get(1);
		// compares the 2 numbers to see if they are equal
		if (element.compareTo(element2) == 0) {
			System.out.println("the elements have the same value");
			// compares to see if element 1 is greater than element 2
		} else if (element.compareTo(element2) > 0) {
			// outputs the message for the highest grade
			System.out.println("the highest grade is:  " + max);
		}

	}
}

/*
 * Screen Dump
 * 
enter a grade between 0-100:  
83
enter a grade between 0-100:  
55
enter a grade between 0-100:  
67
enter a grade between 0-100:  
94
enter a grade between 0-100:  
78
the highest grade is:  94
 * 
 * 
 * 
 */
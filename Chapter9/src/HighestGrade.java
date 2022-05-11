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

		for (int i = 0; i < numArray.length; i++) {
			System.out.println("enter a grade between 0-100:  ");
			int grade = input.nextInt();
			if (max < grade) {
				max = grade;
				System.out.println(max);
			}
			nums.add(new Integer(max));
			nums.add(new Integer(1));
		}
		// System.out.println(max);
		element = nums.get(0);
		element2 = nums.get(1);
		if (element.compareTo(element2) == 0) {
			System.out.println("the elements have the same value");
		} else if (element.compareTo(element2) > 0) {
			System.out.println("the highest grade is:  " + max);
		}

	}
}

/*
 * Screen Dump
enter a grade between 0-100:  
83
83
enter a grade between 0-100:  
67
enter a grade between 0-100:  
72
enter a grade between 0-100:  
85
85
enter a grade between 0-100:  
92
92
the highest grade is:  92

 * 
 * 
 * 
 */
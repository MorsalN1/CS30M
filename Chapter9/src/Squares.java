/*
Program: Squares      Date: May 3, 2022

Purpose: Create a Squares application that stores the square of an element’s index in an integer array of 5 elements.
For example, the third element, which has index 2, should store 4. The application should then display the
value of each element in the array


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
public class Squares {
	
	public static void main(String[] args) {

		int[] sq1 = { 0, 1, 4, 9, 16 };

		System.out.println(" The squares of 0-4:  ");

		for (int i = 0; i < 5; i++) {
			System.out.println(sq1[i]);

		}
	}
}
/* Screen Dump
 * The squares of 0-4:  
0
1
4
9
16
 *
*/
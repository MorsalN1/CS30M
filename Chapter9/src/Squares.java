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
		// the squares of 0-4 is stored in here.
		int[] sq = { 0, 1, 4, 9, 16 };
		// outputs a title of which squares
		System.out.println(" The squares of 0-4:  ");
		// outputs the squares of each number until it hits the fifth integer in the element (4)
		for (int i = 0; i < 5; i++) {
			//the output
			System.out.println(sq[i]);

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
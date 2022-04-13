package Files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
Program: MyFilept2      Date: April 11, 2022

Purpose: Create a MyFile application that creates a file named zzz.txt and then displays a message indicating that the 
file has been created. The application should prompt the user to either keep or delete the file. If the file is 
deleted, a message should notify the user when the file has been successfully deleted.

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
public class MyFilept2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		File textFile = new File("C:\\Users\\904354510\\git\\CS30M\\Chapter11\\src\\Files\\zzz.txt"); 
		System.out.println(textFile.getName());
		if (textFile.exists()) {
			System.out.println("File already exists.");
		} else {
			try {
				textFile.createNewFile();
				System.out.println("New file created.");
			} catch (IOException e) {
				System.out.println("File could not be created.");
				System.err.println("IOException: " + e.getMessage());
			}
		}
		 System.out.println("Delete or keep file:  "); 
		 String choice = input.nextLine();

		if (choice.equals("keep")) {
			System.out.println("File still exists.");
		} else {
			textFile.delete();
			System.out.println("The file has been deleted");
		}
	}
}
/*
 * Screen Dump
 * zzz.txt
New file created.
Delete or keep file:  
keep
File still exists.
 * 
 * zzz.txt
File already exists.
Delete or keep file:  
delete
The file has been deleted
 * 
 */


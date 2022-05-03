package Files;

/*
Program: MyFilespt1      Date: April 11, 2022

Purpose: Create a MyFile application that prompts the user for the name of a file and then displays a message that
indicates whether the files exists or not. Note that if the user types in a full path, any single backslashes (\)
will need to be replaced with an escape sequence(\\) in order to create a new File object.




Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import java.io.File;

public class MyFilespt1 {
	public static void main(String[] args) {

		//File name testanswer
		File textFile = new File("C:\\Users\\904354510\\git\\CS30M\\Chapter11\\src\\Files\\TestAnswer");
		//outputs the name of the file
		System.out.println(textFile.getName());
		//checks if the file exists 
		if (textFile.exists()) {
			//outputs if it exists
			System.out.println("file already exists");
		} else {
			//outputs if it doesn't exists
			System.out.println("file does not exists");
		}

		//File name notreal
		File textFile2 = new File("C:\\Users\\904354510\\git\\CS30M\\Chapter11\\src\\Files\\notreal");
		//outputs the name of the file
		System.out.println(textFile2.getName());
		if (textFile2.exists()) {
			//outputs if it exists
			System.out.println("file already exists");
		} else {
			//outputs if it doesn't exists
			System.out.println("file does not exists");

		}
	}

}
/*
 * Screen Dump
 * 
 * TestAnswer 
 * file already exists 
 * notreal 
 * file does not exists
 * 
 * 
 */

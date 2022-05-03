package Roster;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.util.Scanner;

/*
Program: Roster      Date: April 27, 2022

Purpose: Create a Roster application that prompts the user for the name of the file to store student names and then
prompts the user for the number of students in a class. The application should then prompt the user for
the first and last name of each student and write this data to a file. After all the data is written to a file, the
application display the class roster with one name after the other in a list. Create a StuName class that has
member variables firstName and lastName and a toString() member method.


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/

public class Roster {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String Fname;
		String Lname;

		System.out.println("what would you like to name the file");
		//user chooses a name for the file
		String Filen = input.nextLine();
		//creates a file with the new file name
		File name = new File(Filen + ".dat");
		try {
			FileOutputStream out = new FileOutputStream(name);
			ObjectOutputStream writeStu = new ObjectOutputStream(out);
			System.out.println("the name of the file is:  " + name.getName());
			System.out.println("there are 5 students in this class  ");
			// user continuously enters the full names of the students until 5 names are
			// entered
			for (int i = 0; i < 5; i++) {
				System.out.println("enter the students First name:  ");
				Fname = input.next();
				System.out.println("enter the students Last name:  ");
				Lname = input.next();
				// writes the names onto a file
				writeStu.writeObject(new Stuname(Fname, Lname));

			}
			// lets user know that the data of names is written
			System.out.println("Data written to file.");

			FileInputStream in = new FileInputStream(name);
			ObjectInputStream readstu = new ObjectInputStream(in);
			// reads each of the students names
			Stuname stu1 = (Stuname) readstu.readObject();
			Stuname stu2 = (Stuname) readstu.readObject();
			Stuname stu3 = (Stuname) readstu.readObject();
			Stuname stu4 = (Stuname) readstu.readObject();
			Stuname stu5 = (Stuname) readstu.readObject();
			readstu.close();
			// outputs everyones names
			writeStu.writeObject(stu1 + "\n" + stu2 + "\n" + stu3 + "\n" + stu4 + "\n" + stu5);
			writeStu.close();

		} catch (FileNotFoundException e) {
			System.out.println("File could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem with input/output.");
			System.err.println("IOException: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Class could not be used to cast object.");
			System.err.println("ClassNotFoundException: " + e.getMessage());

		}

	}
}
/*
 * Screen Dump
 * 
what would you like to name the file
Studentname
the name of the file is:  Studentname.dat
there are 5 students in this class  
enter the students First name:  
Alex
enter the students Last name:  
Dill
enter the students First name:  
James
enter the students Last name:  
Long
enter the students First name:  
Timmy
enter the students Last name:  
Smo
enter the students First name:  
Marry
enter the students Last name:  
Lam
enter the students First name:  
Sara
enter the students Last name:  
James
Data written to file.
 * 
 * 
 */
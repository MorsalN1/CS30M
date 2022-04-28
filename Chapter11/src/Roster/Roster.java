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

Purpose: 


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/

public class Roster {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		File stuFile = new File("C:\\Users\\904354510\\git\\CS30M\\Chapter11\\src\\Roster\\stuFile.dat");
		String Fname;
		String Lname;

		try {
			FileOutputStream out = new FileOutputStream(stuFile);
			ObjectOutputStream writeStu = new ObjectOutputStream(out);
			System.out.println(stuFile.getName());
			System.out.println("there are 5 students in this class  ");
			for (int i = 0; i < 5; i++) {
				System.out.println("enter the students First name:  ");
				Fname = input.next();
				System.out.println("enter the students Last name:  ");
				Lname = input.next();
				writeStu.writeObject(new Stuname(Fname, Lname));

			}

			System.out.println("Data written to file.");

			FileInputStream in = new FileInputStream(stuFile);
			ObjectInputStream readstu = new ObjectInputStream(in);
			Stuname stu1 = (Stuname) readstu.readObject();
			Stuname stu2 = (Stuname) readstu.readObject();
			Stuname stu3 = (Stuname) readstu.readObject();
			Stuname stu4 = (Stuname) readstu.readObject();
			Stuname stu5 = (Stuname) readstu.readObject();
			readstu.close();

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

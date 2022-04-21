package Stats;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/*
Program: Statspt1      Date: April 13, 2022

Purpose: 


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/

public class Statspt1 {


	
	
	public static void main(String[] args) {

		File textFile = new File("C:\\Users\\904354510\\git\\CS30M\\Chapter11\\src\\Stats\\test1.dat");
		FileReader in;
		BufferedReader readFile;
		String lineOfText;
		String score;
		double avg;
		double totalscore = 0;
		int numscore = 0, low, high;

		try {
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			while ((lineOfText = readFile.readLine()) != null) {
				System.out.println(lineOfText);
			 
				
				
				
				
				
				
			}
			readFile.close();
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
		}

	}
}

/*
 * Screen Dump
 * 
 * 
 * 
 * 
 */
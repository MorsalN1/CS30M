package Stats;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
Program: Statspt1      Date: April 13, 2022

Purpose: 


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/

public class Statspt1 {
	public static void main(String[] args) {

	File dataFile = new File("C:\\Users\\904354510\\git\\CS30M\\Chapter11\\src\\Stats\\test1.dat");
	FileReader in;
	BufferedReader readFile;
	String score;
	double avgscore;
	double totalscores = 0;
	int NumScores = 0;
	
	/*
	try {
		 in = new FileReader(dataFile);
		 readFile = new BufferedReader(in);
		 while ((score = readFile.readLine()) != null ) {
			 NumScores += 1;
			 System.out.println(score);
			 totalscores += Double.parseDouble(score);}
	
		 avgscore = totalscores / NumScores;
		 System.out.println("Average = " + avgscore);
		 readFile.close();
		 in.close();
		 } catch (FileNotFoundException e) {
		 System.out.println("File does not exist or could not be found.");
		 System.err.println("FileNotFoundException: "
		 + e.getMessage());
		 } catch (IOException e) {
		 System.out.println("Problem reading file.");
		 System.err.println("IOException: " + e.getMessage());
	
	}
	*/
	
}
}

/*
 * Screen Dump
 * 
 * 
 * 
 * 
 */
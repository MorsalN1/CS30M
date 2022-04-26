package Stats;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

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
		String name;
		String score = null;
		double avg;
		double totalscore = 0;
		int numscore = 0;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		try {
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			while ((name = readFile.readLine()) != null) {
				score = readFile.readLine();
				numscore += 1;
				totalscore += Double.parseDouble(score);
				System.out.println(name);
				
				System.out.println(score);
				int Score = Integer.parseInt(score);
				if (max < Score) {
					max = Score;
				}
				

				if (min > Score) {
					min = Score;
				}
			}
			avg = totalscore / numscore;
			System.out.println("the average is:  " + avg);
			
			System.out.println(max);
			System.out.println(min);
		
		
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
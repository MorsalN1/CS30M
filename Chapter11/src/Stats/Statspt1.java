package Stats;

/*
Program: Statspt1      Date: April 13, 2022

Purpose: Create a Stats application that reads names and scores from a data file named test1.dat, supplied with this
text. The file contains a student name on one line followed by the student’s test score on the next line. The
Stats application should read and display each name and score. After all the scores have been displayed, the
lowest score, highest score, and average score should be displayed.


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
			// reads the contents of the file
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			// read the names in the file
			while ((name = readFile.readLine()) != null) {
				// reads the grades of the file
				score = readFile.readLine();
				numscore += 1;
				totalscore += Double.parseDouble(score);
				// outputs the name
				System.out.println(name);
				// outputs the grade
				System.out.println(score);
				int Score = Integer.parseInt(score);
				// checks for the max grade from each repeatedly
				if (max < Score) {
					max = Score;
				}

				// checks for the min grade from each repeatedly
				if (min > Score) {
					min = Score;
				}
			}
			// calculates the average
			avg = totalscore / numscore;
			// outputs the average, maximum and minimum
			System.out.println("the average is:  " + avg);
			System.out.println("the maximum is:" + max);
			System.out.println("the minimum is:" + min);

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
Tyler
67
james
96
Sam
78
Alex
82
the average is:  80.75
the maximum is:96
the minimum is:67

 * 
 * 
 * 
 */
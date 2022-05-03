package Stats;

/*
Program: Statspt2      Date: April 26, 2022

Purpose: Modify the Stats application to allow the user to enter the names and grades of the students. The user should
be prompted for the name of the file to create and for the number of student grades that will be entered.
After the data has been entered and the written to a file, the file should be read and the lowest, highest, and
average score displayed.


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Statspt2 {

	public static void main(String[] args) {

		File dataFile = new File("C:\\Users\\904354510\\git\\CS30M\\Chapter11\\src\\Stats\\stuscore.dat");
		FileWriter out;
		BufferedWriter writeFile;
		Scanner input = new Scanner(System.in);
		double score, totalscore = 0;
		String name;
		double max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

		try {
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);

			for (int i = 0; i < 5; i++) {
				// user continues to input students names until 5 are entered
				System.out.println(":Enter Student name: ");
				name = input.next();
				// user inputs a text score for each student
				System.out.println(":Enter test scores: ");
				score = input.nextDouble();
				// writes the name of students onto a file
				writeFile.write(name);
				writeFile.newLine();
				// writes the grades of students on a new file
				writeFile.write(String.valueOf(score));
				writeFile.newLine();

				totalscore += score;
				// continuously checks for the max grade
				if (max < score) {
					max = score;

				}
				// continuously checks for the min grade
				if (min > score) {
					min = score;

				}
			}
			// average is calculated
			double avg = totalscore / 5;
			// outputs the average
			writeFile.write(String.valueOf(avg));
			writeFile.newLine();
			// outputs the maximum
			writeFile.write(String.valueOf(max));
			writeFile.newLine();
			// outputs the minimum
			writeFile.write(String.valueOf(min));

			writeFile.close();
			out.close();
			System.out.println("Data written to file.");
		} catch (IOException e) {
			System.out.println("Problem writing to file.");
			System.err.println("IOException: " + e.getMessage());
		}

	}
}

/*
 * :Enter Student name: Alex :Enter test scores: 65 :Enter Student name: milly
 * :Enter test scores: 78 :Enter Student name: tim :Enter test scores: 71 :Enter
 * Student name: mark :Enter test scores: 96 :Enter Student name: carl :Enter
 * test scores: 84 Data written to file.
 */

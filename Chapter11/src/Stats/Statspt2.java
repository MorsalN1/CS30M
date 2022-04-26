package Stats;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Statspt2 {

	public static void main(String[] args) {

		File dataFile = new File("stuScore.dat");
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
				System.out.println(":Enter Student name: ");
				name = input.next();
				System.out.println(":Enter test scores: ");
				score = input.nextDouble();
				writeFile.write(name);
				writeFile.newLine();
				writeFile.write(String.valueOf(score));
				writeFile.newLine();

				totalscore += score;
				
				if (max < score) {
					max = score;
				}
				

				if (min > score) {
					min = score;
				}
			}
			double avg = totalscore/ 5;
			System.out.println(avg);
			
			System.out.println(max);
			System.out.println(min);

			writeFile.close();
			out.close();
			System.out.println("Data written to file.");
		} catch (IOException e) {
			System.out.println("Problem writing to file.");
			System.err.println("IOException: " + e.getMessage());
		}

	}
}

package Files;/*
Program: MyFilespt1      Date: April 11, 2022

Purpose: 


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import java.util.Scanner;
import java.io.*;
import java.text.NumberFormat;

public class MyFilespt1 {
	public static void main(String[] args) {
		File textFile;
		String fileName;
		Scanner input = new Scanner(System.in);
		FileReader in;
		BufferedReader readFile;
		String masterAnswers, stuAnswers, stuName;
		int numCorrect;
		double percentCorrect;
		NumberFormat percent = NumberFormat.getPercentInstance();

		/* obtain filename from user */
		System.out.print("Enter the name of the test file: ");
		fileName = input.nextLine();

		/* read file, display student name, and statistics */
		textFile = new File(fileName);
		try {
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			masterAnswers = (String)readFile.readLine();
    		while ((stuName = readFile.readLine()) != null) {
    			stuAnswers = readFile.readLine();
    			numCorrect = 0;
    			for (int grade = 0; grade < masterAnswers.length(); grade++) {
    				if (stuAnswers.charAt(grade) == masterAnswers.charAt(grade)) {
    					numCorrect += 1;
    				}
    			}
    			percentCorrect = (double)numCorrect/masterAnswers.length();
    			System.out.println(stuName + "\t" + percent.format(percentCorrect));
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

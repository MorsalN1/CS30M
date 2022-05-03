package Exercise10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Program: FindAndReplace      Date: April 28, 2022

Purpose: Create a FindAndReplace application that prompts the user for a file name, a search word or phrase,
and a replacement word or phrase. After entering the replacement word or phrase, FindAndReplace
finds all occurrences of the search word or phrase in a file and replaces them with the specified replacement word or phrase


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
public class FindAndReplace {

	public static void main(String[] args) {
		File Story = new File("C:\\Users\\904354510\\git\\CS30M\\Chapter11\\src\\Exercise10\\Story");
		File Story2 = new File("C:\\Users\\904354510\\git\\CS30M\\Chapter11\\src\\Exercise10\\Story2");
		File Story3 = new File("C:\\Users\\904354510\\git\\CS30M\\Chapter11\\src\\Exercise10\\Story3");
		String name;
		Scanner input = new Scanner(System.in);
		FileReader in, ins;
		BufferedReader readStory, readFile;
		String storyLine;

		System.out.println("which file do you want to change:" + "\n-Story   -Story2    -Story3");
		String choice = input.next();

		if (choice.equals("Story")) {
			try {
				// system reads the content of a file
				ins = new FileReader(Story);
				readFile = new BufferedReader(ins);
				while ((name = readFile.readLine()) != null) {
					// outputs the contents of the file
					System.out.println(name);

				}
				// user chooses which word or phrase to replace
				System.out.println("\nwhat word would you like to change");
				String word1 = input.next();
				// user chooses what to replace it with
				System.out.println("\nwhat would You like to repace it with");
				String replacement = input.next();

				in = new FileReader(Story);
				readStory = new BufferedReader(in);
				while ((storyLine = readStory.readLine()) != null) {
					while (storyLine.indexOf(word1) != -1) {
						// system replaces the words
						storyLine = storyLine.replaceFirst(word1, replacement);
					}
					// system outputs the new file with the different word
					System.out.println(storyLine);
				}
				readStory.close();
				in.close();
			} catch (FileNotFoundException e) {
				System.out.println("File does not exist or could not be found.");
				System.err.println("FileNotFoundException: " + e.getMessage());
			} catch (IOException e) {
				System.out.println("Problem reading file.");
				System.err.println("IOException: " + e.getMessage());
			}

		}
		if (choice.equals("Story2")) {
			try {
				// system reads the content of a file
				ins = new FileReader(Story2);
				readFile = new BufferedReader(ins);
				while ((name = readFile.readLine()) != null) {
					// outputs the contents of the file
					System.out.println(name);

				}
				// user chooses which word or phrase to replace
				System.out.println("\nwhat word would you like to change");
				String word1 = input.next();
				// user chooses what to replace it with
				System.out.println("\nwhat would You like to repace it with");
				String replacement = input.next();

				in = new FileReader(Story2);
				readStory = new BufferedReader(in);
				while ((storyLine = readStory.readLine()) != null) {
					while (storyLine.indexOf(word1) != -1) {
						// system replaces the words
						storyLine = storyLine.replaceFirst(word1, replacement);
					}
					// system outputs the new file with the different word
					System.out.println(storyLine);
				}
				readStory.close();
				in.close();
			} catch (FileNotFoundException e) {
				System.out.println("File does not exist or could not be found.");
				System.err.println("FileNotFoundException: " + e.getMessage());
			} catch (IOException e) {
				System.out.println("Problem reading file.");
				System.err.println("IOException: " + e.getMessage());
			}


		}

		else if (choice.equals("Story3")) {
			try {
				// system reads the content of a file
				ins = new FileReader(Story3);
				readFile = new BufferedReader(ins);
				while ((name = readFile.readLine()) != null) {
					// outputs the contents of the file
					System.out.println(name);

				}
				// user chooses which word or phrase to replace
				System.out.println("\nwhat word would you like to change");
				String word1 = input.next();
				// user chooses what to replace it with
				System.out.println("\nwhat would You like to repace it with");
				String replacement = input.next();

				in = new FileReader(Story3);
				readStory = new BufferedReader(in);
				while ((storyLine = readStory.readLine()) != null) {
					while (storyLine.indexOf(word1) != -1) {
						// system replaces the words
						storyLine = storyLine.replaceFirst(word1, replacement);
					}
					// system outputs the new file with the different word
					System.out.println(storyLine);
				}
				readStory.close();
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

	}
/*
 * Screen Dump
 * 
 which file do you want to change:
-Story   -Story2    -Story3
Story2
Hakuna Matata!
What a wonderful phrase
Hakuna Matata!
Ain't no passing craze
It means no worries
For the rest of your days
Yeah, sing it, kid!
It's our problem-free philosophy
Hakuna Matata!
Hakuna Matata
Hakuna Matata
Hakuna Matata
Hakuna
It means no worries
For the rest of your days
It's our problem-free philosophy
Hakuna Matata

what word would you like to change
Hakuna

what would You like to repace it with
hala
hala Matata!
What a wonderful phrase
hala Matata!
Ain't no passing craze
It means no worries
For the rest of your days
Yeah, sing it, kid!
It's our problem-free philosophy
hala Matata!
hala Matata
hala Matata
hala Matata
hala
It means no worries
For the rest of your days
It's our problem-free philosophy
hala Matata












which file do you want to change:
-Story   -Story2    -Story3
Story
We don't talk about Bruno, no, no, no!
We don't talk about Bruno... but
It was my wedding day
It was our wedding day
We were getting ready, and there wasn't a cloud in the sky
No clouds allowed in the sky
Bruno walks in with a mischievous grin-
Thunder!
You telling this story, or am I?
I'm sorry, mi vida, go on

what word would you like to change
Bruno

what would You like to repace it with
jame
We don't talk about jame, no, no, no!
We don't talk about jame... but
It was my wedding day
It was our wedding day
We were getting ready, and there wasn't a cloud in the sky
No clouds allowed in the sky
jame walks in with a mischievous grin-
Thunder!
You telling this story, or am I?
I'm sorry, mi vida, go on

 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * which file do you want to change:
-Story   -Story2    -Story3
Story3
Prince Ali, fabulous he, Ali Ababwa
Show some respect, boy, genuflect, down on one knee
Now, try your best to stay calm
Brush up your Friday salaam
Then come and meet his spectacular coterie
Prince Ali, mighty is he, Ali Ababwa
Strong as ten regular men, definitely
He's faced the galloping hordes
A hundred bad guys with swords
Who sent those goons to their lords? Why, Prince Ali

what word would you like to change
Ali

what would You like to repace it with
mali
Prince mali, fabulous he, mali Ababwa
Show some respect, boy, genuflect, down on one knee
Now, try your best to stay calm
Brush up your Friday salaam
Then come and meet his spectacular coterie
Prince mali, mighty is he, mali Ababwa
Strong as ten regular men, definitely
He's faced the galloping hordes
A hundred bad guys with swords
Who sent those goons to their lords? Why, Prince mali
 */
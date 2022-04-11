package Files;

import java.io.File;

public class TestFiles {
	public static void main(String[] args) {
		File textFile= new File("c:\\temp\\supplies.txt");
		if(textFile.exists()) {
			System.out.println("file already exists");
		} else {
			System.out.println("file does not exists");

		}
		}
	
	
	
}

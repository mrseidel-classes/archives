package filesExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This file is used as an example of how to run open a file
 * and display the input, as well as some basic parsing 
 * 
 * @author Mr. Seidel
 * @since October 7th, 2015
 * @since JDK 8
 * @version 1.0
 * 
 */
public class MainFile {

	/**
	 * The main runnable area of the whole program 
	 * (like the "setup()" and "draw()" functions in Processing)
	 * 
	 * @param args Command-line arguments (not used in this case)
	 */
	public static void main(String[] args) {
		
		File file = new File("inputExample.txt"); //in main folder above the packages, src, and bin folder

		try {
			
			Scanner scan = new Scanner(file);
			
			while (scan.hasNextLine()) {
				String s = scan.nextLine(); //scan.nextLine gives back a String
				if (s.equals("*")) {
					System.out.println(""); //like pressing enter
					continue; //skip printing the *
				}
				System.out.print(s + " ");
			}
			
			scan.close(); //close Scanner when done with files
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

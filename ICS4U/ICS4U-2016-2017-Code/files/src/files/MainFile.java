package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This file is used as an example of how to run open a file
 * and display the input, as well as some basic parsing 
 * 
 * @author <yourNameHere>
 * @since <dateOfCompletionHere>
 * @since JDK 8
 * @version 1.0
 * 
 */
public class MainFile {

	public static void main(String[] args) {

		/* Your task it to:
		 *  1) Read in the input.txt file and create a single ArrayList that holds all of the information
		 *  2) Then you are to output the information using System.out.println statements.
		 *  3) Have your program analyze how many Circles are overlapping (each pairing counts as 1 collision).
		 * 
		 * To generate your input.txt file, go to the main directory of this work and double-click
		 * on the "generateInputText.py" file.
		 * 
		 * The input file is broken down as follows
		 * 			-The first line of the file tells you how many Circles and Spheres (cumulative) are within the file 
		 * 			-The next set of lines are set with a class name, radius, and SVector, e.g. "Sphere:5:0,0,0" or "Circle:5:50,50,0"
		 * 			-When you hit an asterisk (*) then you are done
		 * 
		 * You will need to use the String.split() function to help you break apart the string as it comes in.
		 */
		
		//Declare your ArrayList here 
		
		try {
		
			//Fill your ArrayList here using Scanner as in the Example file.
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		//System.out.println your Circle and Sphere information and analysis
		
	}

}

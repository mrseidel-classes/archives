package arrays2Dpkg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

/**
 * This file is for your Magic Squares assignment
 * 
 * @author <yourNameHere>
 * @since <dateOfCompletionHere>
 * @since JDK 8
 * @version 1.0
 * 
 */
public class MainFile {


	
	/* ******************************************************************************************************* */
	/* ******************************************************************************************************* */
	/* ******************************************************************************************************* */
	/* **************There are multiple block comments below, ensure you read them ALL************************ */
	/* ******************************************************************************************************* */
	/* ******************************************************************************************************* */
	/* ******************************************************************************************************* */

	public static void main(String[] args) {

		/* 
		 * 0. Run the magicSquareGenerator.py file
		 * 1. Complete the reading and construction of 2D arrays in the Files section
		 * 2. Complete the function that checks to see if the input is a magic square
		 * 3. Your output should accurately output the answer to each of the possible magic squares
		 * 
		 */

		ArrayList<int [] []> magicSquares;   //ArrayList to hold 2D int arrays.  
											 //This array will hold all 2D arrays gathered from the file reading
		magicSquares = new ArrayList<int [] []>();
		
		final JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 100);
		frame.setVisible(true);
		frame.setTitle("Reading file...");
		final DefaultBoundedRangeModel model = new DefaultBoundedRangeModel();
		final JProgressBar progressBar = new JProgressBar(model);
		progressBar.setStringPainted(true);
		frame.add(progressBar);
		progressBar.setValue(0);
		int progressValue = 0;
		try (BufferedReader br = new BufferedReader(
						new InputStreamReader(
						new FileInputStream("g:\\magicSquares.txt")))) {
			String thisLine = null;

			int lines = Integer.parseInt(br.readLine()); //read in the first line, used for Progress Bar

			
			while ((thisLine = br.readLine()) != null) {
				if (thisLine.equals("*")) { 
					try {
						SwingUtilities.invokeLater(new Runnable() {		//this is used to update the Progress bar
							public void run() {							//when at 100%.  It also closes the window
								progressBar.setValue(100);
							}
						});
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
				try {
					progressValue++;
					final int setValue = (int)((1.0 * progressValue)/(lines * 1.0)*100.0);	//updates progress bar and shows
					SwingUtilities.invokeLater(new Runnable() {								//the text.  This runs in another 
						public void run() {													//Thread.
							progressBar.setValue(setValue);
							progressBar.setString("Reading in file... " + setValue + "%");
						}
					});
				} catch (Exception e) {
					e.printStackTrace();
				}

				/* **************************************************************************** */
				/* **************************************************************************** */
				/* ********************Complete the reading of the file here******************* */
				/* ********************                                     ******************* */
				/* ********************You need to create 2D int arrays,    ******************* */
				/* ********************after reading in and parsing the data******************* */
				/* ********************Then add them to the magicSquares    ******************* */
				/* ********************ArrayList                            ******************* */
				/* **************************************************************************** */
				/* **************************************************************************** */
				
				
				
//				magicSquares.add(/*2D array goes in here*/);
				
				
				
			}       
		} catch(IOException e) {
			System.out.println("Error with the file");
			e.printStackTrace();
		} 

		frame.setTitle("Calculating all magic squares...");
		progressBar.setValue(0);
		progressBar.setString("Calculating... 0%");

		/*This prints out if the magic square tested is one or not */
		for (int i = 0; i < magicSquares.size(); i++) {
			final int setValue = (int)((1.0 * i)/(magicSquares.size() * 1.0)*100.0);	//updates progress bar and shows
			progressBar.setValue(0);
			progressBar.setString("Calculating... " + setValue + "%");
			System.out.println(magicSquares.get(i));
			System.out.println(isMagicSquare(magicSquares.get(i)));
		}


	}
	
	private static boolean isMagicSquare(int [] [] square) {
		/*
		 * Create this function.  You take in a 2D int array, and then check to see if it is a "magic square"
		 * A magic square has the characteristic that if you add all horizontal, vertical, and the 2 diagonals
		 * they should add up to the same value.
		 * 
		 * Return a true or false value depending on whether the square is a "magic square" or not.
		 * 
		 * Create the documentation for this function.
		 */
		
		return true;
	}
}
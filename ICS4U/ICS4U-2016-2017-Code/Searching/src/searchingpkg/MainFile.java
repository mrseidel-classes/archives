package searchingpkg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.zip.GZIPInputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

/**
 * This file is for your searching assignment
 * 
 * @author <yourNameHere>
 * @since <dateOfCompletionHere>
 * @since JDK 8
 * @version 1.0
 * 
 */
public class MainFile {

	/*********************************************************************************************************/
	/*********************************************************************************************************/
	/*********************************************************************************************************/
	/***************There are multiple block comments below, ensure you read them ALL*************************/
	/*********************************************************************************************************/
	/*********************************************************************************************************/
	/*********************************************************************************************************/

	public static void main(String[] args) {

		/* Copy paste your 3 Sorting Algorithms from the Sorting assignment into this assignment
		 * 
		 * 0. Run the new fileGenerator_Searching.py to get a new file.  This will take longer to generate than
		 *    the Sorting fileGenerator.
		 * 1. Create a linear search function (templated below ~line 205)
		 * 2. Create a binary search function (templated below ~line 215 and 225)
		 * 3. Using the helper functions given (way down in the file (~line 265) - examples below (~line 181)),
		 *    take in a value from the user in order to test your search functions that you created.
		 *    i.e. - this time you are creating your own output to ensure functionality.
		 * 
		 */


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

		ArrayList<Circle> objects = new ArrayList<Circle>();
		
		
		int progressValue = 0;
		try (BufferedReader br = new BufferedReader(
								 new InputStreamReader(
								 new GZIPInputStream(
								 new FileInputStream("g:\\SearchingAssignment.txt.gz"))))) {
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

				//Create radius from file input
				String [] radiusAndVertex = thisLine.split(":");
				double radius = 0;
				try {
					radius = Double.parseDouble(radiusAndVertex[1]);	
				} catch (Exception e) {
					System.out.println("Could not create double for radius from: " + radiusAndVertex[0]);
					e.printStackTrace();
				}

				//Create vertex from file input
				String [] vertices = radiusAndVertex[2].split(",");
				double x = 0, y = 0, z = 0;
				try {
					x = Double.parseDouble(vertices[0]);
					y = Double.parseDouble(vertices[1]);
					z = Double.parseDouble(vertices[2]);
				} catch (Exception e) {
					System.out.println("Could not create doubles for vertex from: " + radiusAndVertex[0]);
					e.printStackTrace();
				}
				SVector vertex = new SVector(x, y, z);

				//Figure out if this line is a Circle or a Sphere and input
				//the correct object into the array
				if (thisLine.toLowerCase().charAt(0) == 's') { //Spheres
					objects.add(new Sphere(radius, vertex));	
				} else if (thisLine.toLowerCase().charAt(0) == 'c') { //Circles
					objects.add(new Circle(radius, vertex));
				}

			}       
		} catch(IOException e) {
			System.out.println("Error with the file");
			e.printStackTrace();
		} 

		frame.setTitle("Copying data...");
		progressBar.setValue(0);
		progressBar.setString("Copying values to individual arrays... 0%");

		/*
		 * Generating and filling arrays for sorting.  We need different ones, 
		 * otherwise you are sorting the same list multiple times.
		 */

		ArrayList<Circle> selectedCirclesArray = new ArrayList<Circle>();
		ArrayList<Circle> insertedCirclesArray = new ArrayList<Circle>();
		ArrayList<Circle> bubbledXCirclesArray = new ArrayList<Circle>();
		ArrayList<Circle> bubbledYCirclesArray = new ArrayList<Circle>();
		ArrayList<Circle> bubbledZCirclesArray = new ArrayList<Circle>();

		frame.setVisible(true);
		
		for (int i = 0; i < objects.size(); i++) {
			Circle c = objects.get(i);
			selectedCirclesArray.add(c);
			insertedCirclesArray.add(c);
			bubbledXCirclesArray.add(c);
			bubbledYCirclesArray.add(c);
			bubbledZCirclesArray.add(c);
			
			
			final int setValue = (int)((i * 1.0 / objects.size() * 1.0) * 100.0);
			progressBar.setValue(setValue);
			progressBar.setString("Copying values to individual arrays... " + setValue + "%");
		}
		objects.clear(); //destroying the original array to make space in memory
		
		frame.setVisible(false);
		/*
		 * This is where the magical sorting happens
		 */

		ArrayList<Circle> selectedCircles = selectionSort(selectedCirclesArray);
		ArrayList<Circle> insertedCircles = insertionSort(insertedCirclesArray);
		ArrayList<Circle> bubbledXCircles = bubbleSort(bubbledXCirclesArray, "x");
		ArrayList<Circle> bubbledYCircles = bubbleSort(bubbledYCirclesArray, "y");
		ArrayList<Circle> bubbledZCircles = bubbleSort(bubbledZCirclesArray, "z");


		/*************************************************************/
		/*********** New area of code here.  Everything above ********/
		/*********** is similar to the Sorting assignment.  **********/
		/*********** You will need some of the arrays above **********/
		/*********** to search through.                     **********/
		/*************************************************************/
		
		//Sample uses of the helper functions
		/*
		String inputString = getString("Enter a string"); 
		int inputInt = getInt("Enter an integer value");
		long inputLong = getLong("Enter a long value");
		float inputFloat = getFloat("Enter a float value");
		double inputDouble = getDouble("Enter a double value");
		char inputChar = getChar("Enter a single character (if you enter more, the 1st char will be taken)");

		System.out.println("String: " + inputString);
		System.out.println("Integer: " + inputInt);
		System.out.println("Long: " + inputLong);
		System.out.println("Float: " + inputFloat);
		System.out.println("Double: " + inputDouble);
		System.out.println("Char: " + inputChar);
		*/
		
		/************************* 
		 * You'll have to put in your own Input/Output here to
		 * Ensure that your code is working properly. 
		 *************************/
		
		
	}
	
	



	public static int binarySearch(ArrayList<Circle> array, int radius) {
		/*
		 * Create your own binary search algorithm here.  You will be searching for information regarding the radius.
		 * Do not use the built-in function for searching your data.  
		 * 
		 * Return -1 if you cannot find the item in the array
		 */
		return -1;
	}

	public static int linearSearch(ArrayList<Circle> array, Circle circle) {
		/*
		 * Create your own linear search algorithm here.  You will be searching for a particular Circle object (passed as parameter).
		 * Do not use the built-in function for searching your data.
		 * 
		 * Return -1 if you cannot find the item in the array
		 */
		return -1;
	}

	public static int linearSearch(ArrayList<Circle> array, Sphere sphere) {

		/*
		 * Create your own linear search algorithm here.  You will be searching for a particular Sphere object (passed as parameter).
		 * Do not use the built-in function for searching your data.  
		 * 
		 * Return -1 if you cannot find the item in the array
		 */
		return -1;
	}
	

	/*
	 * Block comment task (add to this block comment to answer the questions below):
	 *  In which situation would it be better to use "sort+search" rather than "search"?
	 */
	
	
	public static ArrayList<Circle> selectionSort(ArrayList<Circle> array) {
		/*************************************************************/
		/*********** COPY PASTE YOUR CODE INTO HERE ******************/
		/*************************************************************/
		return new ArrayList<Circle>();
	}

	public static ArrayList<Circle> insertionSort(ArrayList<Circle> array) {
		/*************************************************************/
		/*********** COPY PASTE YOUR CODE INTO HERE ******************/
		/*************************************************************/
		return new ArrayList<Circle>();
	}

	public static ArrayList<Circle> bubbleSort(ArrayList<Circle> array, String coordinate) {
		/*************************************************************/
		/*********** COPY PASTE YOUR CODE INTO HERE ******************/
		/*************************************************************/
		return new ArrayList<Circle>();
	}

	/**************************************************************************************/
	/*****************************BELOW ARE HELPER FUNCTIONS*******************************/
	/**************************************************************************************/
	/*********************         These will help with the       *************************/
	/*********************        development of your program     *************************/
	/*********************       You won't need to change any,    *************************/
	/*********************         but feel free to use them      *************************/
	/**************************************************************************************/
	/**************************************************************************************/

	/**
	 * This function will assist in getting input into your program.  If nothing is entered, a null value is returned
	 * 
	 * @param s is the string value that shows in the dialog window which is typically guides the user into what to type into the textbox.
	 * @return The input value.  If nothing is entered, then the value returned is null.
	 */
	public static String prompt(String s) {
		String entry = JOptionPane.showInputDialog(s);
		if (entry == null)
			return null;
		return entry;
	}

	/**
	 * This function uses the prompt() function to return a String.
	 * 
	 * @param s The prompt string for the dialog window.
	 * @return a string value obtained by the input
	 */
	public static String getString(String s) {
		return prompt(s);
	}

	/**
	 * This function asks for an integer, and forces proper values to be entered
	 * --This function uses the getString() function
	 * 
	 * @param s The prompt string for the dialog window.
	 * @return a integer value obtained by the input
	 */
	public static int getInt(String s) {
		while (true) {
			int returnValue = 0;

			String in = getString(s);
			try {
				if (in == null) throw new NumberFormatException(); //if "X" clicked, or nothing entered

				returnValue = Integer.parseInt(in); //try to convert the value into an integer
				return returnValue;				    //if successful, return the integer value
			}
			catch (NumberFormatException nfe) {		//if unsuccessful, advise user to input proper values
				JOptionPane.showMessageDialog(new JFrame(),
						"Invalid number format",
						"Input Error!",
						JOptionPane.ERROR_MESSAGE);
				//continue;
			}
		}
	}

	/**
	 * This function asks for a long value, and forces proper values to be entered
	 * --This function uses the getString() function
	 * 
	 * @param s The prompt string for the dialog window.
	 * @return a long value obtained by the input
	 */
	public static long getLong(String s) {
		while (true) {
			long returnValue = 0;

			String in = getString(s);
			try {
				if (in == null) throw new NumberFormatException(); //if "X" clicked, or nothing entered

				returnValue = Long.parseLong(in); //try to convert the value into an long
				return returnValue;				  //if successful, return the long value
			}
			catch (NumberFormatException nfe) {		//if unsuccessful, advise user to input proper values
				JOptionPane.showMessageDialog(new JFrame(),
						"Invalid number format",
						"Input Error!",
						JOptionPane.ERROR_MESSAGE);
				continue;
			}
		}
	}

	/**
	 * This function asks for a float value, and forces proper values to be entered
	 * --This function uses the getString() function
	 * 
	 * @param s The prompt string for the dialog window.
	 * @return a float value obtained by the input
	 */
	public static float getFloat(String s) {
		while (true) {
			float returnValue = 0.0f;

			String in = getString(s);
			try {
				if (in == null) throw new NumberFormatException(); //if "X" clicked, or nothing entered

				returnValue = Float.parseFloat(in); //try to convert the value into a float
				return returnValue;					//if successful, return the float value
			}
			catch (NumberFormatException nfe) {		//if unsuccessful, advise user to input proper values
				JOptionPane.showMessageDialog(new JFrame(),
						"Invalid number format",
						"Input Error!",
						JOptionPane.ERROR_MESSAGE);
				continue;
			}
		}
	}

	/**
	 * This function asks for a double value, and forces proper values to be entered
	 * --This function uses the getString() function
	 * 
	 * @param s The prompt string for the dialog window.
	 * @return a double value obtained by the input
	 */
	public static double getDouble(String s) {
		while (true) {
			double returnValue = 0.0;

			String in = getString(s);
			try {
				if (in == null) throw new NumberFormatException(); //if "X" clicked, or nothing entered

				returnValue = Double.parseDouble(in); //try to convert the value into a double
				return returnValue;				  	  //if successful, return the double value
			}
			catch (NumberFormatException nfe) {		//if unsuccessful, advise user to input proper values
				JOptionPane.showMessageDialog(new JFrame(),
						"Invalid number format",
						"Input Error!",
						JOptionPane.ERROR_MESSAGE);
				continue;
			}
		}
	}

	/**
	 * This function asks for a single character. If more than 1 is entered, it takes the 1st. 
	 * If nothing is entered, then the newline character is returned.
	 * --This function uses the getString() function
	 * 
	 * @param s The prompt string for the dialog window.
	 * @return a character value obtained by the input
	 */
	public static char getChar(String s) {
		String entry = getString(s);
		if (entry == null)
			return '\n';
		if (entry.length() >= 1)
			return entry.charAt(0);
		else
			return '\n';
	}
}




















package sortingpkg;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

/**
 * This file is for your sorting assignment
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

		/* 
		 * Using the Circle, Sphere, Shape and SVector classes that are included with this program, you are going
		 * to create various sorting algorithms.
		 * 
		 * Each person will have to run the fileGenerator Python script in order to generate their own personal file
		 * to work with
		 * 
		 * Once you have run the fileGenerator.py script, you can go ahead and create the sorting algorithms below
		 * Remember that a Circle array can hold Spheres as well.  The file reading part has been done for you.
		 *
		 * There is also a block comment for you to fill out at the bottom of the file.
		 * Also remember to modify/add documentation where required (not required for "public static void main")
		 */

		/**********************************************************************************************/
		/************  No need to modify code in this area - you will be modifying    *****************/
		/************  only the sorting algorithm functions (starts around line 210). *****************/
		/************  Feel free to read through this section if you want.   	      *****************/
		/**********************************************************************************************/
		/*
		 * Create a window that will display a progress bar while reading in the data (because it might take a while)
		 * This window will auto-close after the program gets through the file reading
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
		try (BufferedReader br = new BufferedReader(new FileReader("g:\\SortingAssignment.txt"))) {
			String thisLine = null;

			int lines = Integer.parseInt(br.readLine()); //read in the first line, used for Progress Bar

			while ((thisLine = br.readLine()) != null) {
				if (thisLine.equals("*")) { 
					try {
						SwingUtilities.invokeLater(new Runnable() {		//this is used to update the Progress bar
							public void run() {							//when at 100%.  It also closes the window
								progressBar.setValue(100);
								frame.setVisible(false);
								frame.dispose();
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


		/*
		 * Generating and filling arrays for sorting.  We need different ones, 
		 * otherwise you are sorting the same list multiple times.
		 */

		ArrayList<Circle> selectedCirclesArray = new ArrayList<Circle>();
		ArrayList<Circle> insertedCirclesArray = new ArrayList<Circle>();
		ArrayList<Circle> bubbledXCirclesArray = new ArrayList<Circle>();
		ArrayList<Circle> bubbledYCirclesArray = new ArrayList<Circle>();
		ArrayList<Circle> bubbledZCirclesArray = new ArrayList<Circle>();

		for (Circle c : objects) {
			selectedCirclesArray.add(c);
			insertedCirclesArray.add(c);
			bubbledXCirclesArray.add(c);
			bubbledYCirclesArray.add(c);
			bubbledZCirclesArray.add(c);
		}
		objects.clear(); //destroying the original array to make space in memory

		/*
		 * This is where the magical sorting happens
		 */

		ArrayList<Circle> selectedCircles = selectionSort(selectedCirclesArray);
		ArrayList<Circle> insertedCircles = insertionSort(insertedCirclesArray);
		ArrayList<Circle> bubbledXCircles = bubbleSort(bubbledXCirclesArray, "x");
		ArrayList<Circle> bubbledYCircles = bubbleSort(bubbledYCirclesArray, "y");
		ArrayList<Circle> bubbledZCircles = bubbleSort(bubbledZCirclesArray, "z");

		/*
		 * This is where the output is to show how your magical sorting algorithms work
		 */

		System.out.println("***********************************************");
		System.out.println("*********Selection Sort Check Below************");
		System.out.println("***********************************************");
		for (int i = 0; i < selectedCircles.size(); i++) {
			System.out.println(selectedCircles.get(i).radius());  //This should print out everything in order of radius
		}
		System.out.println("***********************************************");
		System.out.println("*********Insertion Sort Check Below************");
		System.out.println("***********************************************");
		for (int i = 0; i < insertedCircles.size(); i++) {
			System.out.println(insertedCircles.get(i).getClass().getSimpleName()); //This should print out Circles first, then Spheres
		}

		System.out.println("***********************************************");
		System.out.println("**********Bubble X Sort Check Below************");
		System.out.println("***********************************************");
		for (int i = 0; i < bubbledXCircles.size(); i++) {
			System.out.println(bubbledXCircles.get(i).centre().getX());	//This should print out everything in order by X value
		}

		System.out.println("***********************************************");
		System.out.println("**********Bubble Y Sort Check Below************");
		System.out.println("***********************************************");
		for (int i = 0; i < bubbledYCircles.size(); i++) {
			System.out.println(bubbledYCircles.get(i).centre().getY());	//This should print out everything in order by Y value
		}

		System.out.println("***********************************************");
		System.out.println("**********Bubble Z Sort Check Below************");
		System.out.println("***********************************************");
		for (int i = 0; i < bubbledZCircles.size(); i++) {
			System.out.println(bubbledZCircles.get(i).centre().getZ());	//This should print out everything in order by Z value
		}
	}

	public static ArrayList<Circle> selectionSort(ArrayList<Circle> array) {
		/*
		 * Create your own selection sort algorithm here.  Do not use the built-in function for
		 * sorting your data.  You will be be sorting your "array" so that it is in ascending order
		 * based on the radius value of the object
		 */
		return new ArrayList<Circle>();
	}

	public static ArrayList<Circle> insertionSort(ArrayList<Circle> array) {
		/*
		 * Create your own insertion sort algorithm here.  Do not use the built-in function for
		 * sorting your data.  You will be be sorting your "array" so that it is in ascending order
		 * alphabetically.  i.e. all Circles will be first in the array, followed by all Spheres.
		 */
		return new ArrayList<Circle>();
	}

	public static ArrayList<Circle> bubbleSort(ArrayList<Circle> array, String coordinate) {
		/*
		 * Create your own selection sort algorithm here.  Do not use the built-in function for
		 * sorting your data.  You will be be sorting your "array" so that it is in ascending order
		 * based on the value given in "coordinate" above (either "x", "y", or "z") value of the object
		 */
		return new ArrayList<Circle>();
	}

	/*
	 * Block comment task (add to this block comment to answer the questions below):
	 *  Which algorithm would you use out of a selection sort, insertion sort, and bubble sort algorithm if we 
	 *  know the worst case run time is O(n^2) [read as "Oh n squared"]?  Why would you use that algorithm over the others?
	 *  Are there scenarios where you would want to use one of these 3 algorithms over the other?
	 */

}

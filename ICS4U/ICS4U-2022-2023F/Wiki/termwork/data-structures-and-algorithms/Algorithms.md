## Task(s)

This is a multi-step assignment, take your time to ensure you are completing them properly.

### Task 1 (Research - Sorting)

Complete research on `insertion sort` (one of few O(n<sup>2</sup>) sorting algorithms):

<!--
A different O(n<sup>2</sup>) algorithm is `bubble sort`. Some resources related to `bubble sort` are below:
* [tutorial](https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/tutorial/), 
* [visualizer (set size = 6, layout = array, click run)](https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/visualize/), and 
* [an alternative visualizer](https://visual-tracer-ag.herokuapp.com/home). 
* Video explanation (from Quad 4 last year) available [here](https://youtu.be/tWq4xNHHUWc).

-->

### Task 2 (Research - Searching)

Complete research on **both** of the following searching algorithms:
* `linear search`, and 
* `binary search`.

<!--
For `linear search`, some resources include:
* [tutorial](https://www.hackerearth.com/practice/algorithms/searching/linear-search/tutorial/), and 
* [visualizer](https://visual-tracer-ag.herokuapp.com/home)
* [alternate visualizer](https://www.cs.usfca.edu/~galles/visualization/Search.html)
* Video explanation (from Quad 4 last year) available [here](https://youtu.be/j8dXiSmcJTg)

For `binary search`, some resources include:
* [tutorial](https://www.hackerearth.com/practice/algorithms/searching/binary-search/tutorial/), and 
* [visualizer](https://visual-tracer-ag.herokuapp.com/home)
* [alternate visualizer](https://www.cs.usfca.edu/~galles/visualization/Search.html)
* Video explanation (from Quad 4 last year, same as linear search video) available [here](https://youtu.be/j8dXiSmcJTg)
-->

### Task 3 (Research - Computational Complexity)

Calculating computational complexity can become very complicated; however, we are only going to focus on the basics of it here.  Some resources to help understand the basics of computational complexity include:
* [general paper](https://mrseidel.com/pdsb/ics4u/algorithm_runtime_analysis.pdf) on computational complexity, 
* [bubble sort](https://mrseidel.com/pdsb/ics4u/bubble_sort_complexity.pdf), and 
* [selection sort](https://mrseidel.com/pdsb/ics4u/selection_sort_complexity.pdf) 

These resources were created by [Michael Guerzhoy](https://www.cs.toronto.edu/~guerzhoy/) at UTM.

### Task 4 (Coding)

Create a program with a simple class copied from your Data Structures or Extending Data Structures. The class should have a constructor, two instance variables of different data types, and at least two methods to access those instance variables.

In the main part of the program, complete the following programming tasks:
* Find an `insertion sort` online and modify it slightly to work with your objects.  
  * This sort needs to be able to sort a very large list/array of **objects** (at least 75,000 objects).
  * For debugging, only output the first and last 20 items in the array. This should give you enough information about whether your sort works or not.
* Find `linear search` **and** `binary search` algorithms online and modify them slightly so that they can search through the data you sorted above (the very large list/array of objects).

### Task 5 (Supplemental Text)

This is the main portion of this assignment that will be assessed/evaluated. We will be testing to see if the theoretical computational complexity values for sorting and searching mathelogically align with real world empirical testing data collected. Think of this like a science experiment where you are collecting data.

#### Estimating Computational Complexity

* Collect the following data:
  * **Before sorting**, how long a `linear search` takes to:
    * Find an element that exists in the array, and
    * Attempt to find an element that does **not** exist in the array.
  * How long your `insertion sort` algorithm takes to run.
  * How long the built-in sorting algorithm takes to run.
  * **After sorting**, how long a `linear search` takes to:
    * Find an element that exists in the array, and
    * Attempt to find an element that does **not** exist in the array.
  * **After sorting**, how long a `binary search` takes to:
   * Find an element that exists in the array, and
   * Attempt to find an element that does **not** exist in the array.
* Run each of the above tests at least 10 times for the following amount of objects:
  * 5
  * 10
  * 100
  * 1000
  * 10000
  * 30000
  * 50000
  * 75000
* Record your data into a table (example available [here](https://docs.google.com/spreadsheets/d/1jOYB-K0Nsuvl2Lk4MNPLdrjxLoTCiL8zNntJHUNb54Q/edit?usp=sharing)).
* Calculate the average times.
* Graph the average times (vs. quantity of objects).
* Graph the theoretical worst-case Big-Oh computational complexity.
* Compare the two graphs.
  * Does your data align with the expected theoretical versions? Why or why not?
  * If your graph has anomalies, explain those.
* Cite your work using IEEE format.  

## Due Dates and Submission Details

**This project is only evaluated once.**

Submit the following:  
* Code, and
* Raw data collected, and 
* Document with graphs and conclusions.

Please see the [due dates](./Due-Dates-and-Submission-Details) page for more details on when this is due.

## Learning Goals and Success Criteria

The [Overarching Learning Goal(s)](./images/ICS4U.jpg) for this include _Data Structures and Algorithms_.
The specific Learning Goal(s) for this include:

  * _We are learning to work with data types and proper code maintenance techniques._ &#x1F4D9;
  * _We are learning to design, write and analyze complex algorithms and subprograms._ &#x1F4D9;&#x1F4D9;&#x1F4D9;

| Learning Goal | Success Criteria  | Reevaluation Opportunity |
| ------------- | ----------------- | ------------------------ |
| &#x1F4D9; | I can use one-dimensional arrays of compound data types (i.e. objects) | None, [was previously assessed](./Extending-Data-Structures)|
| &#x1F4D9;&#x1F4D9;&#x1F4D9;  | I can compare the efficiency of **sorting** algorithms, using run times and computational complexity analysis. | None. |
| &#x1F4D9;&#x1F4D9;&#x1F4D9; | I can compare the efficiency of **linear** and **binary searches**, using run times and computational complexity analysis. | None. |
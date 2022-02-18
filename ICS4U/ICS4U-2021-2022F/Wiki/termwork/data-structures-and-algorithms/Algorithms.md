## Task(s)

This is a multi-step assignment, take your time to ensure you are completing them properly.

### Task 1 (Research - Sorting, [Spring 2021 Q4 - Lesson Video](https://youtu.be/tWq4xNHHUWc))
Complete research on simple O(n<sup>2</sup>) sorting algorithms (you'll be using **_either_** `insertion sort` **_or_** `selection sort` for _Task 4_ below). An example of such an algorithm is `bubble sort`. Bubble sort resources include a [tutorial](https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/tutorial/), a [visualizer (set size = 6, layout = array, click run)](https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/visualize/), and an [alternative visualizer](https://visual-tracer-ag.herokuapp.com/home)

### Task 2 (Research - Searching, [Spring 2021 Q4 - Lesson Video](https://youtu.be/j8dXiSmcJTg))
Complete research on `linear search` and `binary search` algorithms. You will need to work with `binary search` for _Task 4_ below.  Some resources for `linear search` include a [tutorial](https://www.hackerearth.com/practice/algorithms/searching/linear-search/tutorial/), and a [visualizer](https://visual-tracer-ag.herokuapp.com/home).  For `binary search`, some resources include a [tutorial](https://www.hackerearth.com/practice/algorithms/searching/binary-search/tutorial/), and a [visualizer)](https://visual-tracer-ag.herokuapp.com/home).

Another visualization simulation for searching can be found [here](https://www.cs.usfca.edu/~galles/visualization/Search.html) for both linear and binary search.

### Task 3 (Research - Computational Complexity)
Calculating computational complexity can become very complicated; however, we are only going to focus on the basics of it here.  Some resources to help understand the basics of computational complexity include a [general paper](https://mrseidel.com/pdsb/ics4u/algorithm_runtime_analysis.pdf) on computational complexity, [bubble sort](https://mrseidel.com/pdsb/ics4u/bubble_sort_complexity.pdf), and [selection sort](https://mrseidel.com/pdsb/ics4u/selection_sort_complexity.pdf). These resources were created by [Michael Guerzhoy](https://www.cs.toronto.edu/~guerzhoy/) at UTM.

### Task 4 (Coding)
Either update your [Data Structures](./Data-Structures) assignment, or create a new program, and include the concepts as requested below:

* Create your own `selection sort` **or** `insertion sort` algorithm.  The sorting algorithm should be able to sort through a very large list/array of **objects** (at least 25,000 objects).
* Create output that shows a portion of the list/array (for example, you can show the first 20 and last 20 objects before and after the sorting algorithm processes the list/array).  You do not want to show the entirety of the list/array as this would take too long to process.
* Create your own `linear search` **and** `binary search` algorithms that search through the data you sorted above.  
* For each of the above items, you will need to collect empirical data of how long each sort and search took to complete. This will be required information for later and will let you check to see if your work aligns with the theoretical Big-Oh worst-case scenarios. 

### Task 5 (Walk-through)
Similar to the [Data Structures](./Data-Structures) assignment, you will be creating a product that walks someone through your program by describing/showing the following:  

Sorting:  
* How your sorting algorithm works with your particular objects,
* Show the array before it was sorted and after it was sorted (the first/last 20 items are sufficient),
* What the computational complexity is of the algorithm you created,
* How you calculated the computational complexity of this sorting algorithm using empirical data,
* Which sorting algorithm is faster, why, when, etc. (the sort you created versus `.sort()`)

Searching:  
* How binary search works with your particular objects,
* When it is worth the extra time to complete a `.sort()` in order to make use of binary search,
* What use case exists that would use `.sort() + binary search()` over just using `linear search`,
* What the computational complexity is of `linear search` and `binary search`,
* How you calculated the computational complexity of these searching algorithms using empirical data,
* Which searching algorithm is faster, why, when, etc.,

## Due Dates and Submission Details
In the Google Classroom assignment submit the following:

* Code, and
* Walk-through product 

Please see the [due dates](./Due-Dates-and-Submission-Details) page for more details on when this is due.

## Learning Goals and Success Criteria

The [Overarching Learning Goal(s)](./images/ICS4U.jpg) for this include _Data Structures and Algorithms_.
The specific Learning Goal(s) for this include:

  * _We are learning to design, write and analyze complex algorithms and subprograms_&#x1F4D9;&#x1F4D9;&#x1F4D9;

| Learning Goal | Success Criteria | Learning and Improvement Comments |
| ------------- | ---------------- | --------------------------------- |
| &#x1F4D9;&#x1F4D9;&#x1F4D9; | I can use one-dimensional arrays of compound data types (i.e. objects, structures, etc.) | |
| &#x1F4D9;&#x1F4D9;&#x1F4D9; | I can create a **sorting** algorithm (selection or insertion) to sort data in an array. | |
| &#x1F4D9;&#x1F4D9;&#x1F4D9; | I can compare the efficiency of **sorting** algorithms, using run times and computational complexity analysis. | |
| &#x1F4D9;&#x1F4D9;&#x1F4D9; | I can create a **binary search** algorithm to find data in an array. | |
| &#x1F4D9;&#x1F4D9;&#x1F4D9; | I can compare the efficiency of **linear** and **binary** **searches**, using run times and computational complexity analysis. | |
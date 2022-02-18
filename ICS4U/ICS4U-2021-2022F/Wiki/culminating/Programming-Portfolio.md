# Task(s)

This is a culminating project worth 10% out of the 30% final.  

## Gather Information
You'll want to gather up the _Walk-through_ portions of your submissions for [Data Structures][DS] and [Algorithms][ALGO]. You'll also need your [Recursion][RECUR] submission to complete the following work.  Within that information, you'll want to find specific examples on:

* Documentation for classes and extending objects concepts
* UML diagrams
* Classes and Objects
* Extending Objects
* File input/output
* Sorting algorithms
* Searching algorithms
* Recursion

## Product(s)
### Day 1

Day 1 will focus on your [Data Structures][DS] assignment.

Using the examples that you found above for classes, objects, extending objects, and file input/output, complete the following using any medium of your choice (e.g. word-processing document, slideshow, etc.):

#### Documentation & UML
1. Reading through the documentation that you created for your classes and extending objects work, if someone else were reading through your documentation, what ambiguities exist? Where could you have been clearer in your descriptions/parameters/return value information?
2. What makes the documentation example that you chose an exemplary one?
3. How comfortable would you be if someone provided you with a UML class diagram and told you to implement the work? Why? Explain your response.
4. There are a lot of different types of UML diagram out there. Another one that is used frequently is a UML Sequence Diagram [example here](https://en.wikipedia.org/wiki/Sequence_diagram#/media/File:CheckEmail.svg). How might such a diagram have proven useful for the planning stages of your [Data Structures][DS] program?

#### Classes and objects
1. What difficulties did you encounter when creating classes and objects?
2. How did you overcome those difficulties?
3. What more do you have to learn about classes and objects?

#### Extending objects
1. Will you ever use these concepts? Why or why not? Explain your reasoning.
2. Which concept did you **not** use in your submission? How could you implement it into your program now?

#### File input/output
1. How might you connect an API to your program? Which API would you choose? Why?
2. If you were receiving data from someone, would you prefer to receive it as a database query response, in JSON format, or in XML format? Why?
3. In industry, when might people output data to text files?

You are expected to make use of this period to start, finish, and submit the work by the end of the period. 

### Day 2
Day 2 will focus on both your [Algorithms][ALGO] and [Recursion][RECUR] assignments.

Using the examples that you found above for sorting, searching, and recursion, complete the following using any medium of your choice (e.g. word-processing document, slideshow, etc.):

#### Sorting
1. There is a bin full of spherical candies. Each candy is one of ten colours. There is an equal amount of each colour in the bin. If you had to follow a sorting algorithm to complete the sort, which sorting algorithm would you use to sort by colour? Why? Justify your response. Here is a [list of sorting algorithms](https://en.wikipedia.org/wiki/Sorting_algorithm) to help guide your thinking.
2. Bitonic Sort is a specific sorting algorithm that takes O(nlog<sup>2</sup>n) time to complete (worst-case complexity). Under what circumstances would we use this over an O(nlogn) algorithm like Quicksort or Merge Sort? Justify your response.

#### Searching
1. There is another search called [`ternary search`](https://www.geeksforgeeks.org/ternary-search/). When might you use this algorithm over binary search or linear search? If you do not think you would, why not? Justify your response.
2. You've lost a personal item (i.e. phone, book, etc.). Describe your personal searching algorithm to find the item. If you had to write out the algorithm in programming terms, what would it look like? What would be the Big-Oh worse-case scenario of your algorithm.

#### Recursion
1. Out of the sorting and searching algorithms **you** developed, which one might you use a recursive algorithm for instead? Justify your response.
2. A problem with recursion is the stack overflowing (or maximum recursion depth being reached). How might you work around this problem while still using recursion?
3. Using the following recursive function, edit the code to display the answer in the console as a visual representation of the triangle number followed by the numerical value. Example below.

```python

def recursiveCalculateTriangleNumber(n):
    if n == 1: return 1
    return n + recursiveCalculateTriangleNumber(n - 1)

print(recursiveCalculateTriangleNumber(3))

Output:
*
**
***
6
```

You are expected to make use of this period to start, finish, and submit the work by the end of the period. 


## Goals and Success Criteria

The specific goal(s) for this _Data Structures and Algorithms_ culminating task include:
* _Use proper code maintenance techniques_. &#x1F4D9;
* _Design and apply modular programming concepts including complex data types._ &#x1F4D9;&#x1F4D9;
* _Design, write and analyze complex algorithms and subprograms_ &#x1F4D9;&#x1F4D9;&#x1F4D9;

| Goal | Success Criteria  | Level |
| ---- | ----------------- | ----- |
| &#x1F4D9;          | I can create fully documented program code according to industry standards. (Day 1) | |
| &#x1F4D9;&#x1F4D9; | I can reflect and synthesize the use of UML diagram. (Day 1) | |
| &#x1F4D9;&#x1F4D9; | I can apply the principle of reusability in program design (i.e. in modules, methods, classes, inheritance, polymorphism, etc.). (Day 1) | |
| &#x1F4D9;&#x1F4D9; | I can read from, and write to, an external file (i.e. database, API, text file, binary file, etc.). (Day 1) | |
| &#x1F4D9;&#x1F4D9;&#x1F4D9; | I can create a sorting algorithm to sort data. (Day 2) | |
| &#x1F4D9;&#x1F4D9;&#x1F4D9; | I can compare the efficiency of sorting algorithms, using run times and computational complexity analysis. (Day 2) | |
| &#x1F4D9;&#x1F4D9;&#x1F4D9; | I can create a search algorithm to find data. (Day 2) | |
| &#x1F4D9;&#x1F4D9;&#x1F4D9; | I can compare the efficiency of a search algorithm using run times and computational complexity analysis. (Day 2) | |
| &#x1F4D9;&#x1F4D9;&#x1F4D9; | I can design a simple and efficient recursive algorithm. (Day 2) | |
| &#x1F4D9;&#x1F4D9;&#x1F4D9; | I can identify common pitfalls in recursive functions. (Day 2) | |

[DS]: ./Data-Structures
[ALGO]: ./Algorithms
[RECUR]: ./Recursion
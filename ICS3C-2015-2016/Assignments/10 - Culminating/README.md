**The culminating is worth 30% of your final mark.**

Task(s)
-------


###Part 1

The following [survey](http://goo.gl/forms/uIn1REwRkwb0nUft1) was conducted in class on May 25 by the teacher to you and your ICS 3C and 3U peers. 

  1. On a scale from 0 to 10, how fun is programming?
  2. What percentage of the software development process would you estimate is spent writing code?
  3. Name one aspect of being a good digital citizen.
  4. Name one job that you can pursue with a background in computer science.
  5. Briefly explain why programming is a useful skill.


The results of the survey are found in *Survey_Results.csv*. Using the knowledge you've acquired from this course, store these results in **two different ways** (other than a spreadsheet).


Write Python programs to determine at least **five** of the following:

* The median result in response to the first question.
* The mode (i.e., most common) result in response to the first question.
* The average result in response to the second question.
* The most common word with at least 6 letters in response to the third question.
* The most common word in response to the fourth question.
* The student who wrote the highest total number of characters (excluding digits) in their responses.
* The student who wrote the lowest total number of characters (excluding digits) in their responses.

You may assume that there is only one answer to each (i.e., no ties).


You may find some of these built-in functions useful:

```python

list1 = [1, 2, 4, 3, 2, 6, 3]
list2 = ['also', 'what', 'dog', 'quest']

print sum(list1) # prints the sum of all the ints in list1

print min(list1) # prints the lowest int in list1

print max(list1) # prints the highest int in list1

print " ".join(list2) # prints all the strings in list2, separated by one space (it's the "opposite" of .split())

print list1.count(2) # prints the number of times 2 appears in list1

print list1.index(2) # prints the index of the first 2 in list1

list1.sort() # puts list1 into ascending order

list2.sort() # puts list2 into alphabetical order (if they are all the same case)

print list1

print list2

>>>21
>>>1
>>>6
>>>also what dog quest
>>>2
>>>1
>>>[1, 2, 2, 3, 3, 4, 6]
>>>['also', 'dog', 'quest', 'what']

```


###Part 2


Write a reflection paper about your process in Part 1. In fewer than 200 words total, respond to **all** the following:

  1. Which way of storing data allowed for easiest access? Why?
  2. Which of the five (or more) tasks was the most challenging? Why?
  3. Discuss some of the planning and debugging strategies you used to overcome challenges when writing your programs.


###Part 3

In fewer than 300 words total, respond to **all** of the following:

  1. Which computer peripheral device do you use the most? Find three computer tasks that cannot be accomplished without this device. Why can't these three tasks be done without this device?
  2. What are the stages in the software development life cycle "waterfall model"? Which stage do you think would take the most time in a software project? Why?
  3. Name two negative effects of computer use on the environment. Select one of the negative effects and explain what you can do to reduce this effect. (Do not choose paper waste as a negative effect.)
  4. Name two negative effects of computer use on human health. Select one of the negative effects and explain what you can do to avoid it. 

	
###Submissables

Hand in your programs and written responses to the /IN folder.


###Due Date(s)

All three parts of the culminating are due on June 17th, 2016 by 4:00 PM.


Rubric and Expectations
-----------------------

The rubric below will be used to evaluate part 1.

| | 0 <br> (non-existent) | 1 <br> (not effective) | 2 <br> (somewhat effective) | 3 <br> (effective) | 4 <br> (very effective) |
| --- | --- | --- | --- | --- | --- |
| K: Use of constants and/or variables | | | | | |
| K: Use of conditional statements (if statements)  | | | | | |
| K: Use of arithmetic operators (+, -, *, etc.) and/or comparison operators (==, <, etc.) | | | | | |
| A: Use of loops (for, while, etc.) | | | | | |
| A: Use of mathematical equations and/or formulae | | | | | |
| A: Use of functions (```def xyz()```) | | | | | |
| T: Storing data with appropriate data types (files, dictionaries, lists, strings, etc. and choosing the right one(s) for the job) | | | | | |
| T: Algorithm development (easy to follow code that works properly) | | | | | |
| C: Readability of code | | | | | |
| C: Use of conventions in documentation (include header, in-line documentation, etc.) | | | | | |

The rubric below will be used to evaluate part 2.

| | 0 <br> (non-existent) | 1 <br> (limited) | 2 <br> (some) | 3 <br> (expected quality) | 4 <br> (outstanding quality) |
| --- | --- | --- | --- | --- | --- |
| K: Knowledge of data storage in Python | | | | | |
| A: Debugging and planning strategies | | | | | |
| T: Amount of insight and thought put into reflection | | | | | |
| C: Appropriateness of written language for target audience (teacher) | | | | | |

The rubric below will be used to evaluate part 3.

| | 0 <br> (non-existent) | 1 <br> (limited) | 2 <br> (some) | 3 <br> (expected quality) | 4 <br> (outstanding quality) |
| --- | --- | --- | --- | --- | --- |
| K: Knowledge of peripheral devices, environmental stewardship, and safe computing | | | | | |
| A: Connection to everyday use of computers | | | | | |
| T: Amount of insight and thought put into responses | | | | | |
| C: Appropriateness of written language for target audience (teacher) | | | | | |
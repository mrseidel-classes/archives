# Exercise Set (A)

For all of these exercises, do **not** hand them in, just ensure your teacher sees the work, and that you can communicate your understanding of the work related to the learning goals.

It is highly suggested that you complete these exercises **prior** to attempting [Python - Assignment 1](./Python-Assignment-1)

## Exercise 0
_Estimated time to complete: < 1 class_

Create an ```emptySketch.py``` file that includes the information below.  You are expected to include this information in **all** of your future exercises and assignments.  This is the creation of a **header**, and should be the first thing found in all of your programs.  See [these notes](https://github.com/mrseidel-classes/ICS3U/tree/master/notes/00%20-%20newFile/) for an example.

```python
#-----------------------------------------------------------------------------
# Name:        <title of the program> (nameOfFile.py)
# Purpose:     <Full description of what the program does>
#
# Author:      <your name goes here>
# Created:     <date the file was made>
# Updated:     <date the last time the file was updated>
#-----------------------------------------------------------------------------

```

## Exercise 1
_Estimated time to complete: 1-2 classes_

Include a header in this program.
Create a simple Python program that shows your understanding of the following:
* ```print()```
* Addition of integers ```+```
* Subtraction of float values ```-```
* Multiplication of float values ```*```
* Division of integers ```/```
* Using integer division ```//```
* Modulo using integers ```%```
* Converting between floats and integers ```int()``` and ```float()```
* How the order of operations works (i.e. create an equation that uses all of the operators above)

## Exercise 2
_Estimated time to complete: 1 class_

Create a copy of _Exercise 1_.
Modify the header of the new exercise.
Modify the new copy of your program to make use of variables.  

## Exercise 3
_Estimated time to complete: 1-2 classes_

Include a header in this program.
Create a simple Python program that shows your understanding of the following:
* Using ```input()```.
* String concatenation.
* Converting to strings ```str()```

## Exercise 4
_Estimated time to complete: 1-2 classes_

Include a header in this program.
Create a simple Python program using ```input()``` that shows your understanding of the following:
* ```if```
* ```elif```
* ```else```
* Three of the following: ```<, <=, >, >=, ==, !=```

## Exercise 5
_Estimated time to complete: 1-2 classes_

Include a header in this program.
Create a simple Python program using ```if```, ```print()```, ```input()```, and variables that shows your understanding of the following:
* ```while```
* ```for```

## Exercise 6
_Estimated time to complete: 2-3 classes_

Include a header in this program
Create a simple Python program shows your understanding of functions.  **Do not** use ```input()```, as this will cause your program to not pass any tests (if using the repl.it program).  You are only expected to create the functions portion.  Your program should include the following functions:
1. ```convertCToF(temperature) -> int(F)``` This function should only accept values between -100C to +100C.  It should return the Fahrenheit value as an integer.
2. ```convertFToC(temperature) -> int(C)``` This function should only accept values between -100F to +100F.  It should return the Celsius value as an integer.
3. ```hypotenuse(a, b) -> float(h)``` This function should accept values a and b, and return the float value of the hypotenuse.
4. ```convertCToFEveryFive(lowC, highC)``` This function should output a chart of values between ```lowC``` and ```highC```.  You should check to ensure that ```lowC``` is less than ```highC```.  If it isn't, then it should output ```Unacceptable input values``` rather than outputting a chart.  An example of how this function should work is below:

```
>>> convertCToFEveryFive(-10, 20)

-10C = 14F
-5C = 23F
0C = 32F
5C = 41F
10C = 50F
15C = 59F
20C = 68F
```

## Exercise 7
_Estimated time to complete: 1-2 classes_

Create a copy of _Exercise 6_
Add documentation to all of the functions in your program using the documentation standards as discussed in class (aka docstrings).

## Exercise 8
_Estimated time to complete: 1-2 classes_

Create a copy of _Exercise 7_
Add in assertions to your functions that have return values as discussed in class.
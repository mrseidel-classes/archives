Task(s)
-------
You have been using functions the majority of the time in this course already.  A function is a grouping of similar tasks, a single calculation, or a single task on it's own.  You have been using the following functions for the previous assignments.

```python
raw_input() #a function that gets information from the user
print() #displays information to the user
str() #converts the information given into a string
int() #converts the information given into an integer
float() #converts the information give into a floating point number
```

We can make our own functions that complete tasks as well.  Below is an example of a function that has no parameters to give it.

```python
def printMyInfo():
  print 'Mr. Seidel'
  print 'John Fraser Secondary School Teacher'
  print '905-858-5910'

printMyInfo()

>>> Mr. Seidel
>>> John Fraser Secondary School Teacher
>>> 905-858-5910
```

We can also make functions that take in information, process it, then give it back to the user.  Below is an example of a function that takes in 3 parameters and returns the volume of a box.

```python
def volumeOfABox(length, width, height):
  volume = length * width * height
  return volume
  
a = float(raw_input("Enter the length of the box: "))
b = float(raw_input("Enter the width of the box: "))
c = float(raw_input("Enter the height of the box: "))

print 'The volume of the box is: ' + str(volumeOfABox(a, b, c)) + ' units'

>>>Enter the length of the box: 5
>>>Enter the width of the box: 5
>>>Enter the height of the box: 5
>>>The volume of the box is: 125 units
```

* Modify 'if001.py' so that the comparison is done in a function.  Save the file as 'fun001.py'
* Modify 'if002.py' so that the average mark is calculated using a function.  Save the file as 'fun002.py'
* Create a program that takes in the values of a and b, and then calculates the hypotenuse of a triangle (c^2 = a^2 + b^2).  Use a function to calculate the hypotenuse. Save the file as 'fun003.py'
* Create a program that takes in one float value for Celsius.  The program should then use a function to convert the temperature to Fahrenheit, and then display the answer. Save the file as 'fun004.py'
* Modify 'fun004.py' so that you enter Fahrenheit, and your function converts the value into Celsius instead. Save the file as 'fun005.py'


Submissables
------------
Do **not** submit any of the work from this section.  Your teacher will randomly choose a few programs to evaluate.  There will also be a quiz/test on this section of work to ensure understanding.

Due Date(s)
----------
To be announced in-class as we get closer to completion of the tasks above.

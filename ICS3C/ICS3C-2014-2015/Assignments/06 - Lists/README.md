Task(s)
-------
Lists are a variable type that can **hold** almost anything as an option.  A list is a single variable that can hold multiple values within them.

```python
fruit = ['apple', 'pear', 'peach', 'banana', 'pineapple']

print fruit

#Example input/output
>>> ['apple', 'pear', 'peach', 'banana', 'pineapple']
```

A list is structured using square brackets, and each item is held within it separated by commas.  Since we know how to work with strings, we can use similar notation to work with lists (as well as some new items!).  See below for examples:

```python
fruit = ['apple', 'pear', 'peach', 'banana', 'pineapple']

print fruit.count('apple')
print fruit[1]
print fruit.index('banana') #prints the _first_ index where 'banana' occurs

fruit.reverse() #reverses the list
print fruit

fruit.sort() #sorts the list alphabetically (in this case)
             #sort can also sort numerically, depending on the list
print fruit

#Example input/output
>>>1
>>>pear
>>>3
>>>['pineapple', 'banana', 'peach', 'pear', 'apple']
>>>['apple', 'banana', 'peach', 'pear', 'pineapple']

```

Another example using for loops, indexing, and strings:

```python

fruit = ['apple', 'pear', 'peach', 'banana', 'pineapple']

for i in range(0, len(fruit), 1):
    print fruit[i]

fruitString = ''
for i in range(0, len(fruit)-1, 1): #exclude the last item in the list (len - 1)
    fruitString = fruitString + fruit[i] + ', '
fruitString = fruitString + 'and ' + fruit[-1]	 #now add in the last item!

print 'My favourite fruits are: ' + fruitString

#Example input/output
>>>apple
>>>pear
>>>peach
>>>banana
>>>pineapple
>>>My favourite fruits are: apple, pear, peach, banana, and pineapple 
```

Now, using a list that has already been pre-generated can only get us so far.  We will want to create our own lists depending on the information given from the user.  Then we can manipulate the data as needed!

```python

fruitList = []

for i in range(0, 5, 1):
	fruit = raw_input("Enter your favourite fruit (" + str(i + 1) + " of 5): ")
	fruitList.append(fruit)	#this adds the fruit to the end of the list 

fruitString = ''
for i in range(0, len(fruitList)-1, 1): #exclude the last item in the list (len - 1)
    fruitString = fruitString + fruitList[i] + ', '
fruitString = fruitString + 'and ' + fruitList[-1]	#now add in the last item!

print 'Your favourite fruits are: ' + fruitString

#Example input/output
>>>Enter your favourite fruit (1 of 5): apple
>>>Enter your favourite fruit (2 of 5): pear
>>>Enter your favourite fruit (3 of 5): peach
>>>Enter your favourite fruit (4 of 5): banana
>>>Enter your favourite fruit (5 of 5): pineapple
>>>Your favourite fruits are: apple, pear, peach, banana, and pineapple 
```

Here's another example using numbers instead of strings 

```python

gradeList = []
while (True):
  grade = float(raw_input("Enter a number between 0 and 100 (" + str(len(gradeList) + 1) + " of 5): "))
  if (grade >= 0 and grade <= 100):
	gradeList.append(grade)		#add the grade to the gradeList
	if (len(gradeList) == 5):	#if we have 5 grades, we're done with input
		break
  else:
    print 'Please enter a valid value'

gradeList.sort()

gradeListString = []
for item in gradeList:			#enhanced for loop
    gradeListString.append(str(item))

gradeOutputString = ', '.join(gradeListString)	#new function!

print 'The grades you entered (in ascending order) are: ' + gradeOutputString

#Example input/output
>>>Enter a number between 0 and 100 (1 of 5): 70
>>>Enter a number between 0 and 100 (2 of 5): 80
>>>Enter a number between 0 and 100 (3 of 5): 90
>>>Enter a number between 0 and 100 (4 of 5): 80
>>>Enter a number between 0 and 100 (5 of 5): 70
>>>The grades you entered (in ascending order) are: 70.0, 70.0, 80.0, 80.0, 90.0
```

In the above example we used two new things: an **enhanced for loop**, and the **join** function.  The enhanced for loop does not use _range_ and indexing, but instead grabs the item directly from the list.  This can be advantageous in some situations, but it is not useful for all situations - so keep this in mind if you are using this type of for loop.

The **join** function is set up a little differently than any other function you've used.  See below for the general setup for the join function.

```python
'separator'.join(list of strings)
```

The _separator_ is a string that is used to separate each item in the list that you are joining together.  In our example above, we had a list of strings in _gradeListString_ that had the values ['70.0', '70.0', '80.0', '80.0', '90.0'].  After using the ', '.join() function on it we had the string "70.0, 70.0, 80.0, 80.0, 90.0" where each number was separated by the **', '** portion of the join function.  This new string was then stored in the _gradeOutputString_ variable for further use.


* Create a program that reads in 10 numbers between 0 and 100 (stored into a list) from the user then outputs how many numbers were entered in properly, what the highest number was, the lowest number was, the list of all numbers, and the average of all the numbers.  Save this file as 'lists001.py'.
* Create a program that reads in 10 names (stored into a list) from the user and counts all the consonants from all the strings entered.  Use a function to count the consonants.  Save this file as 'lists002.py'
* Create a program that reads in 10 sentences (stored into a list) from the user and then prints out the **first** vowel in **each** sentence entered.  If there are **no** vowels in the particular string entered, then have the program say that.  Save this file as 'lists003.py'
* Create a program that takes in 10 numbers (stored into a list), and 1 string.  Depending on the string input, have your program convert all of the numbers input from either Celsius to Fahrenheit, or Fahrenheit to Celsius.  Use functions for your conversions (a function from CtoF, and another for FtoC).  Save this file as 'lists004.py'
* Create a program that takes in 10 numbers and then displays a menu of options.  Your menu will have 5 choices to choose from: addition, subtraction, multiplication, sorted in **descending** order, or exit.  Based on the user's choice, have the computer compute the result, display it to the screen, and then loop around to get a new set of numbers and display the menu again.  If the user chooses exit, have the program end.  Save this file as 'lists005.py'
* Create a program that reads in 10 pieces of text from the user and then calculate which string is the longest, which string has the most vowels in it, and which string has the most consonants in it.  Have your program display the string associated with each of the calculations.  If there are multiple answers for this, have the program display whichever one you want.  Save this file as 'lists006.py'

Submissables
------------
Do **not** submit any of the work from this section.  Your teacher will randomly choose a few programs to evaluate.  There will also be a quiz/test on this section of work to ensure understanding.

Due Date(s)
----------
To be announced in-class as we get closer to completion of the tasks above.

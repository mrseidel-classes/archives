Task(s)
-------
Strings are a variable type that can take in almost anything as an option.  You have been using them in your code all over the place - mainly when you print out information to the console.

Now, we are going to bring in information and play around with the text that is given.  One of the **important** things to note about strings is that they are a list characters.  We are going to use that to our advantage as we go step by step through building a program that will read in and analyze a bunch of text given by the user.

```python

name = raw_input("Enter your name: ")

print name[0]
print name.lower()
print name.upper()
print name.lower().count('e')

#Example input/output
>>>Enter your name: Mr. Seidel
>>>M
>>>mr. seidel
>>>MR. SEIDEL
>>>2

```
In the above example, we take in the name 'Mr. Seidel' and we can then access and modify the string as it is.  Each section of the name can be accessed using a [number] afterwards starting at 0.  So, name[0] will print out the first letter in the string, name[1] will print out the second letter, etc. The .lower() function will change all the letters to lowercase, and .upper() all to uppercase.  You can string together multiple functions as shown with .lower() and .count('e') so that it changes the string to a lowercase version and then counts the amount of times the letter 'e' shows up in that string.  There are many other string related functions that are used.  We will bring them up as they are required for use in the class.

```python
sentence = raw_input("Enter a sentence: ")

sentenceLower = sentence.lower()

countA = 0
for i in range(0, len(sentenceLower), 1):
	if (sentenceLower[i] == 'a'):
		countA = countA + 1

print 'The number of times "A" showed up is: ' + str(countA)

#Example input/output
>>>Enter a sentence: My name is Mr. Seidel
>>>The number of times "A" showed up is:  1

```

The above program uses a for loop to our advantage to cycle through all the letters in the sentence given, and then using an if statement checks each individual letter for a particular letter.  There is an advanced for loop that we can use to do the same thing, but we won't look at those until we get to the _Lists_ section of the course.

When we index a string in Python, we can ask for just a portion of the string rather than just a single letter.  This is called **slicing**  For example, we can ask for "letter pairs" or more of a string with the following notation:

```python
name[start:end]
```
where "start" is the index of the first letter we want to start the substring at, and "end" is the last index to end the substring at (minus one, just like a for loop).  If there is no number put in, it is either assumed that you are starting from the beginning, or going all the way to the end of the string.  You can also include negative values, which will start it's count from the end of the string.  Here are some examples to clarify:

```python
name = raw_input("Enter your full name: ")

print name[4:8]
print name[4:-1]
print name[4:]
print name[:3]

#Example input/output
>>>Enter your name: Mr. Seidel
>>>Seid		#name[4:8]
>>>Seide	#name[4:-1]
>>>Seidel	#name[4:]
>>>Mr.		#name[:3]
```

Using this knowledge, we can modify the program we created earlier to look for letter pairs.  Here is an example:

```python
sentence = raw_input("Enter a sentence: ")

sentenceLower = sentence.lower()

countEI = 0
for i in range(0, len(sentenceLower), 1):
	if (sentenceLower[i:i+2] == 'ei'):	#we use i+2 because it subtracts one
		countEI = countEI + 1		    #so it actually goes to i+1

print 'The number of times "ei" showed up is: ' + str(countEI)

#Example input/output
>>>Enter a sentence: My name is Mr. Seidel
>>>The number of times "ei" showed up is:  1

```

* Create a program that reads in text from the user and counts how many vowels are in the string entered.  Save this file as 'string001.py'.
* Create a program that reads in text from the user and counts all the consonants from the string entered.  Save this file as 'string002.py'
* Create a program that prints out the **first** vowel in the string entered.  If there are **no** vowels in the string entered, then have the program say that.  Save this file as 'string003.py'
* Create a program that takes in 1 number, and 1 string.  Depending on the string input, have your program convert the number input from either Celsius to Fahrenheit, or Fahrenheit to Celsius.  Use functions for your conversions (a function from CtoF, and another for FtoC).  Save this file as 'string004.py'
* Create a program that takes in a string and then displays a menu of options.  Your menu will have 5 choices to choose from: lowercase, uppercase, count vowels, count consonants, or exit.  Based on the user's choice, have the computer compute the result, display it to the screen, and then loop around to get a new string and display the menu again.  If the user chooses exit, have the program end.  Save this file as 'string005.py'
* Create a program that reads in text from the user and counts how many "double vowels" there are in the string entered.  For example, any "ea", or "ei", or "ou", etc. would count towards the total.  Save this file as 'string006.py'

Submissables
------------
Do **not** submit any of the work from this section.  Your teacher will randomly choose a few programs to evaluate.  There will also be a quiz/test on this section of work to ensure understanding.

Due Date(s)
----------
To be announced in-class as we get closer to completion of the tasks above.

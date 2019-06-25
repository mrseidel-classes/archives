Task(s)
-------
Dictionaries are used to store and quickly look up "pairs" of information.

For example, we could store a grocery list like this.

```python
groceryList = {'banana': 2, 'apple': 5, 'orange': 3, 'strawberry': 12}
```

Each pair has a *key* and a *value*. For example, the key *banana* has the value 2, which tells us that the grocery list says to buy two bananas. 

The keys must be unique and can be almost any data type, except lists.

Each key and its associated value are separated by a colon.

Unlike lists, dictionaries have curly braces ```{}``` as delimiters instead of square brackets ```[]```.

Like lists, dictionaries can be iterated through using an enhanced for loop.

```python
groceryList = {'banana': 2, 'apple': 5, 'orange': 3, 'strawberry': 12}

for item in groceryList:
  print item

>>>strawberry
>>>banana
>>>apple
>>>orange
```

Note that the order of the keys may not be the same order as you would expect. This is because dictionaries do not have indices like lists do. The order the keys in which are outputted depends on where they are stored in memory, which may be different every time the program is run.

We can add information to dictionaries using the following syntax.

```python
groceryList = {'banana': 2, 'apple': 5, 'orange': 3, 'strawberry': 12}

groceryList['kiwi'] = 3         #Adds 'kiwi':3 to the dictionary
groceryList['grapefruit'] = 1   #Adds 'grapefruit':1 to the dictionary

print groceryList

>>>{'kiwi': 3, 'apple': 5, 'orange': 3, 'strawberry': 12, 'banana': 2, 'grapefruit': 1}
```

Again, the order in which the key:value pairs are printed may not be the same order as you would expect. 

We look up information in dictionaries using the following syntax.

```python
groceryList = {'banana': 2, 'apple': 5, 'orange': 3, 'strawberry': 12}

print groceryList['apple']         #Prints the value of the key apple
print groceryList['strawberry']    #Prints the value of the key strawberry

>>>5
>>>12
```

If we try to print the value of a key that does not exist, we will get a ```KeyError```.

Here are some other things we can do to dictionaries.


```python
groceryList = {'banana': 2, 'apple': 5, 'orange': 3, 'strawberry': 12}

print len(groceryList)                #Prints the length of groceryList, which is the number of key:value pairs
print groceryList.has_key('banana')   #Prints true, since 'banana' is a key in groceryList
print groceryList.has_key('potato')   #Prints false, since 'potato' is not a key in groceryList
del groceryList['orange']             #Removes 'orange':3 from groceryList
print groceryList

>>>4
>>>True
>>>False
>>>{'strawberry': 12, 'banana': 2, 'apple': 5} #The order of the key:value pairs may be different
```

* Create a program that has the function commonKeys. The function takes two dictionaries and prints every key that occurs in both dictionaries. See below for an example. Save this file as 'dict001.py'.

```python
groceryList = {'banana': 2, 'apple': 5, 'orange': 3, 'strawberry': 12}
fruitScores = {'kiwi': 'okay', 'banana': 'nom', 'cherry': 'alright' , 'orange': 'delicious', 'blueberry': 'yuck'}

commonKeys(groceryList, fruitScores)

>>>banana  #The order in which the keys are printed may be different
>>>orange
```

* Create a program that has the function numberOfChars. The function takes a string and prints a dictionary showing each character's number of occurrences in the string. See below for an example. Save this file as 'dict002.py'.

```python
numberOfChars('potato')

>>>{'p':1, 'o':2, 't':2, 'a':1}  #The order of the key:value pairs may be different
```

Submissables
------------
Do **not** submit any of the work from this section. Your teacher will choose at least one of the programs to evaluate. There will also be a quiz/test on this section of work on May 20, 2016, to ensure understanding.

Due Date(s)
----------
The due date for this assignment is May 20th, 2016.

Task(s)
-------
The syntax for writing to files is very similar to that of reading files. Compare the two pieces of code below.

```python
#Reading a file
file = open('document.txt', 'r')
fileContent = file.readlines()
file.close()
...
```

```python
#Writing to a file
file = open('document.txt', 'w')
file.writelines("content")
file.close()
...
```

In the second line of both versions, the file "document.txt" is opened and stored in the variable ```file```. The only difference between the reading version and writing version is that when you're reading a file, you use ```'r'```, and when you're writing, you use ```'w'```. 

Now that "document.txt" is stored in a variable and Python knows that we plan to be writing to it, we can tell it what to write. In the writing example, the word "content" will be written to the file. If "document.txt" already has data, it will be overwritten with just the word "content". If we want to simply add the word "content" at the very end of "document.txt" without affecting what is already in the file, we would replace the ```'w'``` in line 2 with ```'a'```, where ```'a'``` stands for *append*.

Now that we are done with the file, we close it with ```file.close()```, for good housekeeping.


For this assignment, you will need some extra information. Here is an example of a substitution cipher, which decodes an encrypted text.

```python
f = open('mysteryText.txt', 'r')
fileContent = f.readlines()
f.close()

alphabet = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'
key = 'yblavdnrwexizgqskujhcftmopYBLAVDNRWEXIZGQSKUJHCFTMOP' #'a' gets decoded to 'y', 'b' gets decoded to 'b', and so on.

def decode(line):
  decodedLine = ""
  for character in line:                        #"character" is a string of length 1.
    if character in alphabet:
      position = alphabet.find(character)		#NEW: this finds the index of character in alphabet. For example, alphabet.find(a) would return 0.
      decodedLine = decodedLine + key[position]
    else:
      decodedLine = decodedLine + character 
  return decodedLine	

g = open('mysteryTextDecoded.txt', 'w')

for line in fileContent:
  g.writelines(decode(line))

g.close()
```

For the last question, you will also need to know a few quick things about ASCII. ASCII is a scheme that assigns characters to numerical values. For example, the ASCII value of "A" is 65 and the ASCII value of "a" is 97. 

```python
print ord('A')		#NEW: this prints the ASCII value of the character "A".
print ord('a')
print chr(43)		#NEW: this prints the character that has the ASCII value 43.
print chr(82)
```

The code above will give the following output:

```python
>>>65
>>>97
>>>+
>>>R
```

* Create a program that creates the file 'pyramid.txt' with the following content. Save this file as 'wFiles001.py'.
```
     *     
    *^*    
   *^*^*   
  *^*^*^*  
 *^*^*^*^* 
*^*^*^*^*^*
```

* Create a program that reads in 'unusualParagraph.txt' file and writes its content to 'eneseelPeregreph.txt' while replacing every vowel with an 'e'. Save this file as 'wFiles002.py'.

* Create a program that reads in 'loremIpsum.txt' file and writes its content to 'newLoremIpsum.txt' while replacing every lowercase letter with its respective uppercase letter, and vice versa. Save this file as 'wFiles003.py'.

* Create a program that reads in 'mysteryText.txt' and writes its content to 'mysteryTextDecoded.txt' while replacing every character with its subsequent ASCII character. For example, every 'a' changes to 'b', every '#' changes to '$', and every 'z' changes to '{'. Save this file as 'wFiles004.py'.

Submissables
------------
Do **not** submit any of the work from this section.  Your teacher will randomly choose a few programs to evaluate.  There will also be a quiz/test on this section of work on May 16, 2016, to ensure understanding.

Due Date(s)
----------
The due date for this assignment is May 16th, 2016.

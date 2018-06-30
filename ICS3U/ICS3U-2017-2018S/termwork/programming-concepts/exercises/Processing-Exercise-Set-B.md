# Exercise Set (B)

For all of these exercises, do **not** hand them in, just ensure your teacher sees the work, and that you can communicate your understanding of the work related to the learning goals.

It is highly suggested that you complete these 3 exercises **prior** to attempting [Processing - Assignment 2](Processing-Assignment-2)

## Exercise 8
_Estimated time to complete: 1 class_

1. Create a copy of Assignment #1.
2. In your new copy, change the flow of your program into separate functions.
3. Document your program according to the commenting and documentation learned in class (header, in-line commenting, etc.)

## Exercise 9
_Estimated time to complete: 1-2 classes_

1. In ```setup()```: Generate 50 float values and store them in an array.
2. In ```draw()```: Draw lines from the top and bottom of the screen to the points given.  You will draw the lines to the nearest wall (top or bottom).

## Exercise 10 (String Manipulation)
_Estimated time to complete: 1-4 classes_

```java
String sentence;

void settings() {
    size(300, 300);
}

void setup() {
    sentence = "Whatever you put here, it must always be school appropriate.";

    //rest of program here
}

void draw() {
  noLoop(); //draw doesn't need to happen for this exercise
}
```
Using the above block of text as a starting point, create a program that displays the following:
* The length (in characters) of the sentence (e.g. ```60 characters```)
* The number of capital letters in the sentence (e.g. ```1```)
* The number of vowels in the sentence (always exclude 'y') (e.g. ```20```)
* The number of words in the sentence (e.g. ```10```)
* The number of punctuation marks in the sentence (count ```'```, ```:```, ```;```, ```.```, ```,```, ```!```, ```?``` only) (e.g. ```2```)
* The most used letter in the sentence (e.g. ```e : 6```)

You can either have the answers printed to the screen using ```text()``` or to the console using ```println()```.

## Exercise 11 (Strings with Functions)
_Estimated time to complete: 2-3 classes_

Modify _Exercise 10_ by creating separate functions for each of the tasks.  Some example code is below as if you are to count the number of times the letter ```t``` was in a sentence:

```java
void settings() {
    size(300, 300);
}

void setup() {
    sentence = "Whatever you put here, it must always be school appropriate.";

    println("The number of times the letter 't' shows up is: " + numberOfLetterT(sentence));

    //rest of program here
}

void draw() {
  noLoop(); //draw doesn't need to happen for this exercise
}

int numberOfLetterT(String sentenceToCheck) {
    int amountOfTs = 0;
    char [] letters = sentenceToCheck.toCharArray();
    for (int i = 0; i < letters.length; i++) {
        if (letters[i] == 't' || letters[i] == 'T') {
            amountOfTs += 1;
        }
    }
    return amountOfTs;
}
```

## Exercise 12 (Reading from Files)
_Estimated time to complete: 1-3 classes_

Modify _Exercise 11_ to read from a file.  Rather than having a static ```String``` variable at the top of the program, you will need to use ```loadStrings("filename.txt")``` to read from a file instead.  This exercise will test your knowledge of arrays and String manipulation.

The files you are to use is found at ```OUT\SEIDEL\ICS3U\PROCESSING\EXERCISE_11``` and use them as follows:
* Use ```othello.txt``` for counting the total number of characters in the file
* Use ```illiad.txt``` for counting the number of capital letters in the file
* Use ```romeoAndJuliet.txt``` for counting the number of vowels in the file
* Use ```theOdyssey.txt``` for counting the number of words in the file
* Use ```hamlet.txt``` for counting the number of punctuation marks in the file
* Use ```macbeth.txt``` for finding out the most used letter in the file

Run this program and compare with others in the class to see if people are getting the same answers.

## Learning Goals and Success Criteria

The [Overarching Learning Goal](./images/ICS3U.jpg) for this is _Programming Concepts_.
The specific Learning Goal(s) for this include:
  * We are learning to design and organize a computer program.
  * We are learning to create simple computer programs.


| Success Criteria for <br/> _We are learning to design and organize a computer program_ | Learning and Improvement Comments |
| ----------- | ------- |
| I can use workplace and professional conventions correctly to write programs and internal documentation | |
| I can interpret error messages at different times during the software development process | |

| Success Criteria for <br/> _We are learning to create computer programs_  | Learning and Improvement Comments |
| ----------- | ------- |
| I can use arithmetic operators in a program | |
| I can write custom subprograms that use parameter passing and appropriate scope to perform specific tasks in a program  | |
| I can describe the structure and related concepts for one-dimensional arrays  | |
| I can write programs that declare, initialize, modify, and access one-dimensional arrays  | |
| I can work independently using support documentation to write functioning computer programs | |
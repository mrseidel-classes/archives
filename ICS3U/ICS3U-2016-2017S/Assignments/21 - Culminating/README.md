**The culminating is worth 20% of your final mark. The remaining 10% will be the exam.**


Task(s)
-------

Using the knowledge you've acquired from this course, create a one-minute game for each of your classmates to play. After your program has been finished and everyone has played each other's games, write a reflection paper about the process.  You will also be required to **submit a plan and flowchart before coding**.



### Plan and Flowchart Criteria

A plan must be written out ahead of time.  Your plan must include screenshots of what your program will look like - these can be hand-drawn.  The idea is to have a flow to your program based on your screenshots (there is a lot of G.O.O.S. paper on the front desk).  This includes any key presses, screen changes, etc.

Once you are done the plan, create a flowchart from this plan.  If you completed your plan thoroughly enough, the flowchart should be quick and easy to create.

After showing your teacher your plan and flowchart, you will be allowed to start coding your program.  If you do not show your plan or flowchart, your program will be rejected, and you will be required to start over.



### Game Criteria

When your program is run, the instructions of your game will show up. Your instruction page will include a button with the label "Start Game". When "Start Game" is clicked, the game will begin.

Here are the criteria for your game:
* Has your name displayed on the instruction page.

* Is designed to be played in full screen mode (use *Ctrl+Shift+R* to run the program).

* Is not similar to any exercises or assignments from this course.

* Includes a scoring system (e.g., score as many points as you can, complete a task as quickly as you can, etc.).

* Includes both mouse and keyboard interaction.

* Lasts one minute or *less*.



### Concept Coverage Criteria

You will be expected to cover the following concepts learned in the class.

* Proper variable names
* Conditional statements (```if```)
* Arithmetic operators and/or comparison operators (+, -, /, \*, %, etc.)
* Looping (```for``` and ```while```)
* Functions (including ```random()```, and your own)
* Arrays and/or ArrayLists
* Strings/Characters
* Documentation


### Additional Game Information

#### Screen Size
To make your game take up the full screen, you can use ```size(displayWidth, displayHeight);```, or ```fullScreen()```.

#### Timer
Here is an example of how to create a running timer that will run based on the ```frameCount``` variable which has the information about how many frames have been drawn.  Feel free to use (and modify) this code in your program:

```processing
int startTime;

void setup() {
  size(500, 500);
  startTime = frameCount;
}

void draw() {
  background(255);
  int timer = (frameCount-startTime)/60; //this is /60 because Processing defaults to 60 frames per second
  textSize(50);
  fill(0);
  text(timer, 0, 40);
}

//You can reset the timer by updating the startTime information - example below
void keyPressed() {
  startTime = frameCount;
}

```


### Play Day

The Play Day will be **June 19th, 2017**.

At the beginning of class, you are going to log in and open your program. After everyone has logged in, you will have time to try all your classmates' games. Specific instructions for how to progress through the room will be given.


### Reflection Paper

In a Markdown file, using fewer than 500 words total, respond to the following:

* Describe any differences between your final program and what you envisioned when you first started planning your game. What caused some of these differences?
* Describe some of the strategies you used to overcome challenges and difficulties when writing your program.
* Choose one of the games you played (other than your own) and describe what impressed you the most about it.
* Choose one of the games you played (other than your own, and the one you previously wrote about) and describe how you would change it if you were the programmer.


### Submissables

Hand in your program and reflection paper to the /IN folder by the times listed below.


### Due Date(s)

Program due **June 16th, 2017 by 2:46 PM.**

Reflection due **June 19th, 2017 by 4:00 PM.**



Rubric and Expectations
-----------------------

The rubric below will be used to evaluate your program and reflection paper.

|                                          | R    | 1    | 2    | 3    | 4    |
| ---------------------------------------- | ---- | ---- | ---- | ---- | ---- |
| **A1: Demonstrate the ability to use different data types in computer programs;** |      |      |      |      |      |
| A1.1: Use constants and variables, including integers, floats, Boolean values (if necessary) correctly |      |      |      |      |      |
| A1.1: Use Strings correctly              |      |      |      |      |      |
| A1.3: Use assignment statements correctly (e.g. x = 5;) |      |      |      |      |      |
| A1.4: Use Boolean operators (AND, OR, and NOT) and comparison operators (>=, ==, <=, <, etc.) |      |      |      |      |      |
| A1.5: Effectively use one-dimensional arrays/ArrayLists in your program |      |      |      |      |      |
| **A2: Demonstrate the ability to use control structures (if statements) and simple algorithms in computer programs** |      |      |      |      |      |
| A2.1: Incorporates useful keyboard or mouse-driven inputs and displays an appropriate output |      |      |      |      |      |
| A2.2: Proper use of if statements        |      |      |      |      |      |
| A2.2: Proper use of looping structures   |      |      |      |      |      |
| A2.3: Write an algorithm with nested structures |      |      |      |      |      |
| **A3: Can create/use subprograms (functions) effectively** |      |      |      |      |      |
| A3.1: Can use built-in functions effectively |      |      |      |      |      |
| A3.2: Can effectively create your own functions |      |      |      |      |      |
| **A4: Use proper code maintenance techniques and conventions when creating computer programs** |      |      |      |      |      |
| A4.1: Identify and correct syntax, logic, and run-time errors |      |      |      |      |      |
| A4.2: Use workplace conventions (naming, indenting, etc.) |      |      |      |      |      |
| A4.3: Demonstrate the ability to interpret error messages |      |      |      |      |      |
| **B1: Use a variety of problem-solving strategies to solve different types of problems independently** |      |      |      |      |      |
| B1.2: Demonstrate ability to solve the problem independently |      |      |      |      |      |
| **B2: Design software solutions to meet a variety of challenges** |      |      |      |      |      |
| B2.2: Use appropriate vocabulary to explain the structure of a program (when being marked) |      |      |      |      |      |
| B2.3: Creates modular, reusable functions |      |      |      |      |      |
| B2.4: Represent your program in a properly generated flowchart |      |      |      |      |      |
| B2.5: Design a user-friendly interface to your program |      |      |      |      |      |
| **B3: Design software solutions to meet a variety of challenges** |      |      |      |      |      |
| B3.1: Design a simple algorithm to solve the chosen problem |      |      |      |      |      |
| B3.2: Solve the problem in a visually pleasing manner |      |      |      |      |      |
| B3.3: Your algorithm detects and handles exceptions (e.g. divide by zero errors) |      |      |      |      |      |
| **B4: apply the software development life-cycle to a software project** |      |      |      |      |      |
| B4.1: Create a written/drawn plan **before** coding the project |      |      |      |      |      |
| B4.1: Create a flowchart **before** the program is written |      |      |      |      |      |
| B4.2: Create the program **based on** the flowchart/plan |      |      |      |      |      |
| B4.6: Communicate information about your project, through your reflection and through one-on-one discussions |      |      |      |      |      |

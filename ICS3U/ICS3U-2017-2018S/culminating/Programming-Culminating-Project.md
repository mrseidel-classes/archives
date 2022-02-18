Task(s) (worth 20% of the 30% final evaluation)
-------
Using the knowledge you've acquired from this course, **create a one-minute game** for each of your classmates to play. After your program has been finished and everyone has played each other's games, write a reflection paper about the process.  

### Plan and Flowchart Criteria
A plan must be written out ahead of time.  Your plan must include screenshots of what your program will look like - these can be hand-drawn.  The idea is to have a flow to your program based on your screenshots (there is a lot of G.O.O.S. paper at the front desk).  This includes any key presses, screen changes, etc.

Once you are done the plan, create a flowchart from this plan.  If you completed your plan thoroughly enough, the flowchart should be quick and easy to create.

### Game Criteria
When your program is run, the instructions of your game will show up. Your instruction page will include a button with the label "Start Game". When "Start Game" is clicked, the game will begin.

Here are the criteria for your game:
* Has your name displayed on the instruction page.
* Is designed to be played in full screen mode.
* Is not similar to any exercises or assignments from this course.
* Includes a scoring system (e.g., score as many points as you can, complete a task as quickly as you can, etc.).
* Includes both mouse and keyboard interaction.
* Lasts between 30 and 60 seconds **total**.
* _**Can**_ include a high score board that saves high scores to a file (and loads the information at program runtime).

### Concept Coverage Criteria
You will be expected to cover the following concepts learned in the class.
* Proper variable names
* Conditional statements (```if```)
* Arithmetic operators and/or comparison operators (+, -, /, \*, %, etc.)
* Looping (```for``` and/or ```while```)
* Functions (Will need to **either** use parameters **or** have a return value).
* Arrays and/or ArrayLists
* Documentation
* _**If**_ including the high score board (not necessary), then this would cover Strings and File Input/Output


### Additional Game Information
#### Screen Size
To make your game take up the full screen, you can use ```fullScreen();``` inside of ```settings()``` to make your game take up the entire screen.

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


### Close Out of Project: Game Day & Reflection
#### Game Day
At the beginning of class, you are going to log in and open your program. After everyone has logged in, you will have time to try all your classmates' games. Specific instructions for how to progress through the room will be given.

#### Reflection
In a word processing or text file, using fewer than 500 words total, respond to the following:

* Describe any differences between your final program and what you envisioned when you first started planning your game. What caused some of these differences?
* Describe some of the strategies you used to overcome challenges and difficulties when writing your program.
* Choose one of the games you played (other than your own) and describe what impressed you the most about it.
* Choose one of the games you played (other than your own, and the one you previously wrote about) and describe how you would change it if you were the programmer.


## Due Dates and Submission Details
Please see the [due dates](./Due-Dates-and-Submission-Details) page for more details on when this is due and how to submit your work.

## Goals and Success Criteria
The specific for this [_Programming Concepts (PC)_ and _Computational Analysis and Design (CAD)_](./images/ICS3U.jpg) culminating task include:
  * Design and analyze algorithms for software solutions (CAD). 
  * Design and organize a computer program (PC).
  * Create a simple computer program (PC).

| Success Criteria for <br/> _Design and analyze algorithms for software solutions_ |  Comments |
| ----------- |  ------- |
| I can represent the structure and components of a program using industry-standard tools (i.e. flow charts, pseudocode, etc.) | |
| I can design user-friendly software interfaces (i.e. screens, messages, forms, etc.)  | |

| Success Criteria for <br/> _Design and organize a computer program_ |  Comments |
| ----------- | --- |
| I can use workplace and professional conventions correctly to write programs and internal documentation | | 
| I can interpret error messages at different times during the software development process | | 

| Success Criteria for <br/> _Create a simple computer program_ | Comments |
| ----------- | --- |
| I can use constants and variables correctly in my programs | | 
| I can use selection control structures appropriately in a program | | 
| I can use repetition control structures appropriately in a program | | 
| I can write custom subprograms that use parameter passing and appropriate scope to perform specific tasks in a program | | 
| I can write programs that declare, initialize, modify, and access arrays | | 
| I can work independently using support documentation to write functioning computer programs | | 
String sentence;
String numberSequence;
String [] words;
String [] numbersString; //["10", "1", "2", ...]
float [] numbers;        //[10, 1, 2, ...]

float totalOfNumbers = 0;
int fontSize = 24;

void settings() {
  size(600, 600);
}

void setup() {
  String [] file = loadStrings("data.txt");
  
  //file: ["Hello everyone my name is Mr. Seidel", 
  //       "10:34:24:34:413:2:43:54:45:3"]
  
  sentence = file[0];

  numbersString = new String[file.length - 1];
  for (int i = 1; i < file.length; i++) {
    //new array
    //indices:   0   1    2    3   4   5 
    //         [ 10, 60 , 81 ,   ,   ,  ]
    numbersString[i - 1] = file[i];
  }
 
  
  
  
  //sentence: "Hello everyone";
  words = sentence.split(" "); //split on a space
  //words: ["Hello", "everyone"];

  //numberSequence: "0:1:2:...8:9"
  //numbersString = numberSequence.split(":"); //split on colon
  
  
  
  
  //numbersString: ["10", "1", "2", ..., "8", "9"]
  numbers = new float [numbersString.length];

  //convert the Strings to floats
  for (int i = 0; i < numbersString.length; i++) {
    numbers[i] = float(numbersString[i]); //convert a String to a float
  }
  //index      0  1  2  ...  8  9
  //numbers: [10, 1, 2, ..., 8, 9]
  
  for (int i = 0; i < numbers.length; i++) {
    totalOfNumbers += numbers[i];
  }

  textSize(fontSize);
}

void draw() {
  background(0);
  for (int i = 0; i < words.length; i++) {
    text(words[i], mouseX + 50, mouseY + i * fontSize);
  }
  text(totalOfNumbers, 50, 50);
}













/*
Strings are special variables that hold any character.  They have special characteristics and
things that you can do to them.
For example: you can split a String by any particular character you want: and it will
create an array of Strings.
  String str = "Hello world!";
  String [] catchingString = str.split(" ");
  catchingString has the following array values: ["Hello"]["world!"]: because it has
  broken the str variable at the space
Converting a String into a number value has syntax as shown below:
  String str = "5.0";
  int intValue = int(str);     //intValue will be 5
  float floatValue = float(str); //floatValue will be 5.0
*/
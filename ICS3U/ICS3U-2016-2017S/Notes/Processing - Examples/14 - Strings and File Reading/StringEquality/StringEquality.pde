String words = "a bunch of words";
String letters = "abcdefghijklm";














void settings() { size(100, 100); }
void setup() {
  
  //converts a String to a character array
  char [] wordsChars = words.toCharArray();
  char [] individualLetters = letters.toCharArray();
  
  
  //compares characters
  print("Matching Letters: ");
  for (int i = 0; i < wordsChars.length; i++) {
    for (int j = 0; j < individualLetters.length; j++) {
      if (wordsChars[i] == individualLetters[j]) {
        print(individualLetters[j]);
      }
    }
  }
  println("");
  
  
  
  
  String first = "a";
  String second = "a";
  String third = "b";
    
  //checks if first == second
  if (first.equals(second)) {
    println("Equal!");
  }
  
  
  
  
  
  //checks if second != third
  if (!second.equals(third)) {
    println("Not Equal!");
  }
  
  
  
  
  
  
  
}
String [] information;
String sentence = "Hello woRld! What do?";
void settings() { size(300, 300); }
void draw() { noLoop(); }
void setup() {
  background(0);
  fill(255);
  //information = sentence.split("");
  information = loadStrings("caps.txt");
  textSize(50);
  text(displayCapitals(information), 50, height/2);
}

String displayCapitals(String [] lines) {
  String letters = "";
  for (int i = 0; i < lines.length; i++) {
    letters += findCaps(lines[i].toCharArray());
  }
  return letters;
}

String findCaps(char [] lettersToCheck) {
  String lettersThatMatch = "";
  char [] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
  for (int i = 0; i < lettersToCheck.length; i++) {
    for (int j = 0; j < letters.length; j++) {
      if (letters[j] == lettersToCheck[i]) {
        lettersThatMatch += letters[j];
      }
    }
  }
  return lettersThatMatch;
}

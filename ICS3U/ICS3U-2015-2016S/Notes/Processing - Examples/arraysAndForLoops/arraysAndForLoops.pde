float [] randomXValues;
float [] randomYValues;

void settings() {
  size(600, 600);
}

void setup() {
  randomXValues = new float[50];
  randomYValues = new float[50];

  //since we know the X and Y values arrays are the same length, we can
  //combine the two for loops into one
  for (int i = 0; i < randomXValues.length; i++) {
    randomXValues[i] = random(0, width);
    randomYValues[i] = random(0, height);
  }
}

void draw() {
  background(0);
  for (int i = 0; i < randomXValues.length; i++) {
    fill(3*i); //pick a random fill based on the number of items in the randomXValues array
    ellipse(randomXValues[i], randomYValues[i], 10, 10);
  }
}

void mousePressed() {
  //set new random values
  for (int i = 0; i < randomXValues.length; i++) {
    randomXValues[i] = random(0, width);
    randomYValues[i] = random(0, height);
  }
}


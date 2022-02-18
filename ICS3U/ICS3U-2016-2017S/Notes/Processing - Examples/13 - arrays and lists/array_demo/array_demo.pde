float [] xValues;
float [] yValues;

float [] xSpeeds;
float [] ySpeeds;

color [] rgb;

int amountOfCircles = 100;

//float x1, x2, y1, y2;

void settings() {
  size(600, 600);
}

void setup() {
  //x1 = x2 = y1 = y2 = 0;
  xValues = new float[amountOfCircles];
  yValues = new float[amountOfCircles];
  xSpeeds = new float[amountOfCircles];
  ySpeeds = new float[amountOfCircles];

  rgb = new color[amountOfCircles];

  for (int i = 0; i < rgb.length; i++) {
    rgb[i] = color(random(255), random(255), random(255));
  }

  for (int i = 0; i < xValues.length; i++) {
    xValues[i] = random(width/4, width * 3/4);
  }


  for (int i = 0; i < yValues.length; i++) {
    yValues[i] = random(height/4, height * 3/4);
  }
  for (int i = 0; i < xSpeeds.length; i++) {
    if (i % 2 == 0) {
      xSpeeds[i] = random(0, 2);
    } else {
      xSpeeds[i] = random(-2, 0);
    }
  }
  for (int i = 0; i < ySpeeds.length; i++) {
    ySpeeds[i] = random(-2, 2);
  }
}

void draw() {
  background(0);
  fill(255);
  //x = x + xSpeed;
  for (int i = 0; i < xValues.length; i++) {
    fill(rgb[i]);
    xValues[i] += xSpeeds[i];
    yValues[i] += ySpeeds[i];
    ellipse(xValues[i], yValues[i], 10, 10);

    if (xValues[i] > width || xValues[i] < 0) {
      xSpeeds[i] = xSpeeds[i] * -1;
    }
    if (yValues[i] > height || yValues[i] < 0) {
      ySpeeds[i] = ySpeeds[i] * -1;
    }
  }
}

/*
An array can be of any data type (int, float, String, etc.)
To set up an array, you have an example below (using floats):

float [] array;
void setup() {
  array = new float[50];  //creates space for 50 float values to be held in the array.
}

or, you can always set up an array directly at creation.

float [] array = {5, 4, 2.3, 3, 2.3, 5.2, 3};

This will create an array on the spot with given values.

The only issue with arrays is that they cannot change in size.  Once you set a
size at the beginning of the program, that is the size it is going to be.

There will be special arrays that we use later in the course that can change size.
*/
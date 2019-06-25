ArrayList<Float> xValues;
ArrayList<Float> yValues;

void settings() { 
  size(600, 600);
}

void setup() {
  xValues = new ArrayList<Float>();
  yValues = new ArrayList<Float>();
}

void draw() {
  background(0);
  fill(255);
  noStroke();
  //     xValues.length
  beginShape();
  for (int i = 0; i < xValues.size(); i++) {
    //      xValues[i]      yValues[i]
    vertex(xValues.get(i), yValues.get(i));
  }
  endShape(CLOSE);
}

void mousePressed() {
  for (int i = 0; i < 5; i++) {
    xValues.add(random(0, width));
    yValues.add(random(0, height));
  }
}

void keyPressed() {
  //if (xValues.size() > 0) {
  //  xValues.remove(0);
  //  yValues.remove(0);
  //}
  xValues.clear();
  yValues.clear();
}


/*
An arraylist is a malleable array.  It can change
size, whereas a basic array cannot.  This can prove
useful if we don't know how many items we are planning
to put in an array, or we want to save memory by
not having empty array elements.

The general way to set up and use an arraylist is 
shown below.

ArrayList<DataType> variable;
variable = new ArrayList<DataType>();

For the second line, if you don't put a value in the
() portion of the code, then it will give you an
empty arraylist to start.  This is generally how we 
use arraylists, so that we can grow them as needed.

Arraylists have a bunch of functions you can do on
them:

.size() //will return the size of the arraylist currently
.add(___) //will add an item to the arraylist
.remove(index) //will remove an item at the index given
.clear() //will empty the array entirely
.get(index) //will retrieve the item at the index given so that you can use it
.set(index, ___) //will overwrite an item at index with a new item
.isEmpty() //will return if the arraylist is empty

*/
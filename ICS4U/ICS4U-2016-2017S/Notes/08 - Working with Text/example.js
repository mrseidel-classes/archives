var txt;
var textArray;
var eCount = 0;

function preload() {
  textArray = loadStrings("euripides-bacchae.txt", doneLoadingText);
}

function doneLoadingText() {
  var words;
  for (var i = 0; i < textArray.length; i++) {
    words = textArray[i].split(" ");
    for (var j = 0; j < words.length; j++) {
      if (words[j][0] === 'e' || words[j][0] === 'E') {
          eCount += 1;
      }
    }
  }
}

function setup() {
  createCanvas(600, 600);
  textSize(100);
  text(eCount, width/2, height/2);
}

function draw() {
  
}

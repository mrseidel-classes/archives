var txt;
var textArray;

function preload() {
  textArray = loadStrings("euripides-bacchae.txt", doneLoadingText);
}

function doneLoadingText() {
  txt = textArray.join("\n");
}

function setup() {
  noCanvas();
  var countCheckBox = createCheckbox('Display Answer', false)
  countCheckBox.changed(displayAnswer);
}

function displayAnswer() {
  var regex = /\b\w{3}\b/g;
  var answers = txt.match(regex);
  var total = answers.length;
  createP(total);
}

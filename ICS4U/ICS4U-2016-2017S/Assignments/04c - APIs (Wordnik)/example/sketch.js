var apiStart = "http://api.wordnik.com:80/v4/word.json/";
var word = "color";
var apiEnd = "/definitions?limit=200&includeRelated=true&useCanonical=false&includeTags=false&";
var apiKey = "api_key=********PUT KEY HERE**********";

function preload() {
  loadJSON(apiStart + word + apiEnd + apiKey, doneLoading);
}

function doneLoading(data) {
  //console.log(data);
  for (var i = 0; i < data.length; i++) {
      createP(data[i].partOfSpeech);
  }
}

function setup() {
  noCanvas();
}

function draw() {
  noLoop();
}

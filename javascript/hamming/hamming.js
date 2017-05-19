//
// This is a stub file for the 'Hello World' exercise. It's been provided as a
// convenience to get you started writing code faster.
// Make sure to look at hello-world.spec.js--that should give you some hints about what is
// expected here.

var Hamming = function() {};

Hamming.prototype.compute = function(inputOne, inputTwo) {
var first = inputOne;
var second = inputTwo;
var distance = 0;
//var second = input[1];
console.log(first.concat(second));
//console.log(second);
if (first.length != second.length) {
  throw new Error('DNA strands must be of equal length.');
}
for (var i = 0; i < first.length; i++) {
    if (first[i] != second[i]) {
      distance++;
    }
}
return distance;
};

module.exports = Hamming;

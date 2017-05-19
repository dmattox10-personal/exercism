//
// This is a stub file for the 'Hello World' exercise. It's been provided as a
// convenience to get you started writing code faster.
// Make sure to look at hello-world.spec.js--that should give you some hints about what is
// expected here.

var HelloWorld = function() {};

HelloWorld.prototype.hello = function(input) {
var name = input;
var hello = "Hello, ";
var end = "!"
var res = "";
if (!name) {
  return "Hello, World!";
}
else {
  res = hello.concat(name);
  return res.concat(end);
}
};

module.exports = HelloWorld;

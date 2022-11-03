//console.log("Hello World");

// Demonstrating using var 'Not used nowadays'
var myIntegerVariable = 10;
var myStringVariable = "10";
myIntegerVariable = myIntegerVariable + 1; 

/* (Multiple line comment example)
Now demostrating using let
*/
//let x = 10;
let y = "10";
//declare a variable
let declaredVariable;
//assign variable to 11
declaredVariable = 11;
//reassign variable to 1
declaredVariable = 1;

//const example
const my_fave_number = 7; // this variable cannot be changed
console.log(my_fave_number); // prints 7
//my_fave_number = 9; // error, this cannot be changed

//Common Datatypes (slide 13)
//strings
let a = "Hello, World!"; // <-- Had to get that one out of the way!
let b ='This is JavaScript!'; // Can use single or double quotes
let c = "7"; //includes numbers, but not read as numbers 
let d = "It's Seven"; //To include quotation marks in a string, you must use a different quotation inside and outside
let e = 'It\'s Seven'; //alternatively, you can use backslashes to ignore special characters in strings
//numbers
let f = 7;
let g = 7.8;
let h = 0.45;
//booleans
let i = true;
let j = false;

//loose typing demonstration
let z = 'abc';
console.log(typeof z); //string

z = 1 //would throw an error in strong typed languages
console.log(typeof z); //number

//example
let haley = "confused";
console.log(haley);
haley = 3;
console.log(haley);

//implicit Coercion
// let x = 7 + 7 + 7 ;
//         // Straight arithmetic resulting in a Number value.
// console.log(x); //number 21
// x = 7 + 7 + "7";
//         // The first two 7's are calculated (14), the last 7
//         // is concatenated onto the 14 as a string.
//         // resulting in a string value
//         // "14" + "7" = "147"

// x = "7" + 7 + 7;
//         // The entire expression is implicitly converted
//         // into a string and concatenated.
//         // "7" + 7 = "77"; "77" + 7 = "777"
//         // "7"+ number = "number appended after string"

//Explicit Coercion
// let amountRaisedSoFar = 1000;

// let donation = prompt("How much would you like to donate?"); 

// amountRaisedSoFar = Number(donation) + amountRaisedSoFar;

// console.log("We have now raised: " + amountRaisedSoFar + "!");

//int
//let variableX = parseInt("10");
let variableX = "10";
variableX = parseInt(variableX);
console.log(variableX)
variableX = variableX + 10;
console.log(variableX)
//float
//let variableY = parseFloat("10.55");
let variableY = "10.55";
variableY = variableY + 10;
console.log(variableY);
//String-to-float/int
let variableZ = 10.33;
console.log(variableZ);
let value = toString(variableZ); //"10.33"
value = value + 10; //"10.3310"
console.log(value);

//String Concatenation
let greeting = "Hello,"; 
let greeting_end = "World";
let ageNumber = 25;
console.log(greeting  + greeting_end + "!" + (ageNumber+1)); //output "Hello, World!"" 
//template literal
let nameShane = "Shane"; 
let age = 25;
console.log(`Happy Birthday ${nameShane}! How is ${age+1} treating you?`);

//Null & Undefined
let something; // undefined variable declaration
console.log(typeof something) // "undefined"
//null error
// foo does not exist, it is not defined and has never been initialized:
//console.log(foo); // "ReferenceError: foo is not defined"

// foo is known to exist now but it has no type or value:
let foo = null; 
console.log(foo);// "null"

console.log(typeof nothing);//undefined

//in short (slide 21)
let onething;
console.log(typeof onething); //undefined
console.log(onething); //undefined

onething = null;
console.log(typeof onething); //"object"
console.log(onething); //"null"

//Flow Control
//Simple if statement
let x = false;
if(x) {
	console.log(true);
}
 else if (x == true) {
	console.log("this won't run");
}
else {
	console.log(false);
}
//comparison if statement
let temp = 60;

if (temp > 45) {
    console.log("I'm going hiking!");
} else {
    console.log("It's too cold to go hiking);
}
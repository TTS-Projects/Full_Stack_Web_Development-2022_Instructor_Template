// function functionName(var1){
//     console.log("I am printing out to the console " + var1);
// }
// function function2(){
//     console.log("this is function 2")
// }





// function myDisplayer(some) {
//     console.log(some);
//   }
  
//   function myCalculator(num1, num2, myCallback) {
//     let sum = num1 + num2;
//     myCallback(sum);
//     // return sum;
//   }
  
//  myCalculator(50,5,myDisplayer);


// let numbers = [1, 2, 4, 7, 3, 5, 6];
// numbers.sort((a, b) => a - b);
// console.log(numbers); // [ 1, 2, 3, 4, 5, 6, 7 ]


// // prints out 1 and 3 before 2
console.log('1')
//asychronous waits and allows other code to execute
setTimeout(function afterTwoSeconds() {
  console.log('2')
}, 2000)



// setInterval(myFunction, 1000);

// function myFunction() {
//   let d = new Date();
//   document.getElementById("demo").innerHTML=
//   d.getHours() + ":" +
//   d.getMinutes() + ":" +
//   d.getSeconds()
//   ;
// }

// console.log('3')

// function myDisplayer(some) {
//     document.getElementById("demo").innerHTML = some;
//   }
  
//   function getFile(myCallback) {
//     let req = new XMLHttpRequest();
//     req.open('GET', "mycar.html");
//     req.onload = function() {
//       if (req.status == 200) {
//         myCallback(this.responseText);
//       } else {
//         myCallback("Error: " + req.status);
//       }
//     }
//     req.send();
//   }
  
//   getFile(myDisplayer); 

// var formUploader = require('formuploader')
// document.querySelector('form').onsubmit = formUploader.submit

var fs = require('fs');

fs.readFile('/Does/not/exist', handleFile)

function handleFile (error, file) {
  if (error) return console.error('Uhoh, there was an error', error)
  // otherwise, continue on and use `file` in your code
}
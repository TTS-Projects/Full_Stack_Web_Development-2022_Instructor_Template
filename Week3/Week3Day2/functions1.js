// let landscape = function() {
//     let result = "empty";

//     let flat = function(size) {
//         for (let count = 0; count < size; count++)
//             result += " _ ";
//     };

//     let mountain = function(size) {
//         result += "/";
//         for (let count = 0; count < size; count++)
//             result += " '";
//         result += "\\";
//     };

//      flat(1);
//     mountain(4);
//     // flat(6);
//     // mountain(1);
//     // flat(1);
//     return result;
// };

// console.log(landscape());

// function outer(){
  
//     let a = 'hi';
//     let b = 2;
//     console.log(a,b)
//     function inner() {
//      console.log(a)
//     }
  
//     inner();
//     console.log("outer function call")
//   }
  
//   outer();

let teacher = {
	name: 'Assaf',





	sayName: function() {
		console.log(this.name);
	}
}
teacher.sayName(); //'Assaf'
console.log(teacher.name)
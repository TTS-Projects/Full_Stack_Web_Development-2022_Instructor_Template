//Define a function
function anyNameHere(parameter1) {
    console.log(parameter1);
}
//Define a function
function saySomething(something) {
	console.log(something);
}
//define a no parameter function
function noParameterFunction(){
    console.log("hi!!!")
}
// //create function with return value
// function add(number1, number2) {
//     return number1 + number2;
// }



//slide 4
//saySomething("44"); //logs "Hello function!"

//noParameterFunction(); //function being called

//function called with 2 parameters and return value
// let sum = add(1,2);
// console.log(sum); // 3
//wrong way
// function add(number1, number2) {
//      number1 + number2;
// }

// let sum = add(1,2);
// console.log(sum) // undefined



// //slide 6
// function print(a=3,b=4) {
// 	console.log(a,b)
// }

// print(1); // '1,undefined'
// print(1,2,3,4,5,6,7,8) // '1,2'
// print(); //undefined, undefined

// //programmer
// function add() {
// 	let sum = 0;
// 	for(let i = 0; i < arguments.length; i++) { //0 1 2 3 4 5 6 7 8 9
// 		sum += arguments[i];
//         console.log(sum)
// 	}
// 	return sum;
// }

// //client
// add(1,2,3,4,5,6,7,8,93,120);

let myFunction = function add(...rest) {
	let sum = 0;
	for(let i = 0; i < rest.length; i++) {
		sum += rest[i];
        console.log(sum)
	}
	return sum;
}
	
myFunction(1,2,3,4,5,6,7,8,93,120);


//variable assigned function


// let notHoisted = function() {
//    console.log("bar");
// };
// notHoisted(); // TypeError: notHoisted is not a function



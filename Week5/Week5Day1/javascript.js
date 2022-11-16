// //Get a single node
// let el = document.getElementById('username');

// //Get all inputs
// let inputs = document.getElementsByTagName('input');
// let inError = document.getElementsByClassName('error');

// // console.log(inputs.length); //2
// // console.log(inError.length); //1
// // let nodeArray = [1,3,3,4,5,6,67];
// // nodeArray.forEach
// //Get all inputs
// let firstButton = document.querySelector('button');
// let inErrorSelector = document.querySelectorAll('input.error');

// console.log(firstButton); //single button node
// console.log(inError); //Node list of inputs with class 'error'

// let links = document.querySelectorAll('a');
// let arrayOfLinks = Array.from(links);

// console.log(arrayOfLinks[0]);
// //Works!
// let linkCount = links.length;
// let firstLink = links[0];

// //converting to an array
// console.log(arrayOfLinks[0]);
// //now works!
// links.forEach(function(link){
// 	console.log(link.href);
// });
var x = document.getElementById("top");
var listItems = x.querySelector('ul');
console.log(listItems.length); //2
let selectedItem = document.querySelector('li.selected');
let first = selectedItem.previousElementSibling;
let last = selectedItem.nextElementSibling;
let list = selectedItem.parentElement;
let header = selectedItem.parentElement.parentElement;
let section = selectedItem.parentElement.parentElement.nextElementSibling;
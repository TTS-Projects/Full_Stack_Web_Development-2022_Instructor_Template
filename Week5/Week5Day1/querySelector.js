//Get all inputs
let firstButton = document.querySelector('button');
let inError = document.querySelectorAll('input.error');

// console.log(firstButton); //single button node
// console.log(inError); //Node list of inputs with class 'error'


let links = document.querySelectorAll('a');

//Works!
let linkCount = links.length;
let firstLink = links[0];
let arrayOfLinks = Array.from(links);
//Doesn't work!
links.forEach(function(link){
	//do something with link
});

//grabbing ul children nodes
let listItems = document.querySelector('ul').children;
console.log(listItems.length); //2


// let selectedItem = document.querySelector('li.selected');
// let first = selectedItem.previousElementSibling;
// let last = selectedItem.nextElementSibling;
// let list = selectedItem.parentElement;
// let header = selectedItem.parentElement.parentElement;
// let section = selectedItem.parentElement.parentElement.nextElementSibling;

// //console.log(selectedItem)



// //find h2 using document.query....
// //let selectedItem = document.querySelectorAll('h2.highlight')
// let divClassCol = document.querySelector('div.col');
// let headerNode = divClassCol.previousElementSibling;
// //let ulNode = headerNode.children;
// let liLast = divClassCol.previousElementSibling.children[0].children[0];

// console.log(liLast)


//Laziness is your friend...
// let q = document.querySelector.bind(document)
// let qa = document.querySelectorAll.bind(document);


// let headerNode2 = q('header');
// qa('section');
// q('section.current');
// q('section.current').nextElementSibling;
// q('section.current').previousElementSibling.children[0];
// q('h2.highlight').parentElement.parentElement;

// let foo = Array.from(qa('section h2'))
//     .map(function(headline){
//         return headline.parentElement;
//     });
// console.log(foo)

//Get all inputs
// let div = document.querySelector('div');
// let a = document.querySelector('a');

// console.log(a.innerHTML); //"click me"
// console.log(div.innerHTML); //'<a href="#">Click me</a>'

// a.innerHTML = "Updated link text";

let a = document.querySelector('a');

//Get an attribute
console.log(a.href); //"http://google.com"

//Set an attribute
a.name = 'new link name';

//Add a new attribute
a.target = "_blank";

let el = document.getElementById('myEl');
el.addEventListener('click', function(event){
	alert('clicked!');
})

//Combine with DOM editing
el.addEventListener('mouseover', function(event){
	el.innerHTML('over');
})

document.querySelector('.outer').addEventListener('click', function(event){
    // e represents the event (element that has been clicked)
console.log(event.target, event.currentTarget);
//inner, outer
})
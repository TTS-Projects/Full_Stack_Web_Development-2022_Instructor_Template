//first line
let superHeroes = [
    ["Batman", "Bruce Wayne"],
    ["Spiderman", "Peter Parker"],
    ["The Flash", "Barry Allen"]
  ];

 let secretIdentity; // second bullet point


secretIdentity = superHeroes.map(function(revealArray){
    return revealArray.join(" is "); // ["batman" ,  "Bruce Wayne"] --> "Batman"

})

//fullNames === ["Cam Newton", "Ted Ginn", "Greg Olsen"]
console.log(secretIdentity.join("\n"))

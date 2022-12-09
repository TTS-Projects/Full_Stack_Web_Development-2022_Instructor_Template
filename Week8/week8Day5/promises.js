// const myPromise = 
//   (new Promise(myExecutorFunc))
//   .then(handleFulfilledA,handleRejectedA)
//   .then(handleFulfilledB,handleRejectedB)
//   .then(handleFulfilledC,handleRejectedC);

// // or, perhaps better ...

// const myPromise =
//   (new Promise(myExecutorFunc))
//   .then(handleFulfilledA)
//   .then(handleFulfilledB)
//   .then(handleFulfilledC)
//   .catch(handleRejectedAny);
  
//   const promiseA = new Promise(myExecutorFunc);
//   const promiseB = promiseA.then(handleFulfilled1, handleRejected1);
//   const promiseC = promiseA.then(handleFulfilled2, handleRejected2); 

const promiseA = new Promise( (resolutionFunc,rejectionFunc) => {
    resolutionFunc(777);
});
// At this point, "promiseA" is already settled.
promiseA.then( (val) => console.log("asynchronous logging has val:",val) );
console.log("immediate logging");

// produces output in this order:
// immediate logging
// asynchronous logging has val: 777


// // an async that will always return 1 regardless of input parameter
// async function f() {
//     return 1;
//   }

 
//f().then(alert); // 1

// async function g() {

//     let promise = new Promise((resolve, reject) => {
//       setTimeout(() => resolve("done!"), 1000)
//     });
  
//     let result = await promise ; // wait until the promise resolves (*)
  
//     alert(result); // "done!"
//   }
  
//   g();

//let promise = fetch(url, [options]) //basic syntax of fetching.

// let response = await fetch(url);

// if (response.ok) { // if HTTP-status is 200-299
//   // get the response body
//   let json = await response.json();
// } else {
//   alert("HTTP-Error: " + response.status);
// }

fetch('https://javascript.info/article/promise-chaining/user.json')
  // .then below runs when the remote server responds
  .then(function(response) {
    // response.text() returns a new promise that resolves with the full response text
    // when it loads
    return response.json();
  })
  .then(function(user) {
    // ...and here's the content of the remote file
    console.log(user);
    console.log(user.isAdmin);
    console.log(user.name); // {"name": "iliakan", "isAdmin": true}
});


// same as before, but response.json() parses the remote content as JSON
fetch('https://javascript.info/article/promise-chaining/user.json')
  .then(response => response.json())
  .then(user => alert(user.name)); // iliakan, got user name


// Make a request for user.json
fetch('https://github.com/garzarobm/TTSGITHUB2/Week8/Week8Day4/mygithubusers.json')
// Load it as json
.then(response => response.json())
// Make a request to GitHub
.then(user => fetch(`https://api.github.com/users/`))
// Load the response as json
.then(response => response.json())
// Show the avatar image (githubUser.avatar_url) for 3 seconds (maybe animate it)
.then(githubUser => {
  let img = document.createElement('img');
  img.src = githubUser.avatar_url;
  img.className = "promise-avatar-example";
  document.body.append(img);
});
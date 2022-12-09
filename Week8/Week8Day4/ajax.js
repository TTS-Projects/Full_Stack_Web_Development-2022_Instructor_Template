function ajaxCall() {
  let ajaxRequest = new XMLHttpRequest();

  ajaxRequest.onreadystatechange = function() {
    if (ajaxRequest.readyState == XMLHttpRequest.DONE ) {
      if (ajaxRequest.status == 200) {
        let myDiv = document.getElementById('main');
        let newDiv = document.createElement('div');
        newDiv.innerHTML = ajaxRequest.responseText;
        myDiv.appendChild(newDiv);
      }
      else if (ajaxRequest.status == 400) {
        console.log('There was an error 400');
      }
      else {
        console.log('something else other than 200 was returned');
      }
    }
  };

  ajaxRequest.open("GET", 'http://jsonplaceholder.typicode.com/todos', true);
  ajaxRequest.send();
}


//version 1
var form = document.querySelector('form')
form.onsubmit = function (submitEvent) {
  var name = document.querySelector('input').value
  request({
    uri: "http://example.com/upload",
    body: name,
    method: "POST"
  }, function (err, response, body) {
    var statusMessage = document.querySelector('.status')
    if (err) return statusMessage.value = err
    statusMessage.value = body
  })
}
//v2
var form = document.querySelector('form')
form.onsubmit = function formSubmit (submitEvent) {
  var name = document.querySelector('input').value
  request({
    uri: "http://example.com/upload",
    body: name,
    method: "POST"
  }, function postResponse (err, response, body) {
    var statusMessage = document.querySelector('.status')
    if (err) return statusMessage.value = err
    statusMessage.value = body
  })
}
//v3
document.querySelector('form').onsubmit = formSubmit

function formSubmit (submitEvent) {
  var name = document.querySelector('input').value
  request({
    uri: "http://example.com/upload",
    body: name,
    method: "POST"
  }, postResponse)
}

function postResponse (err, response, body) {
  var statusMessage = document.querySelector('.status')
  if (err) return statusMessage.value = err
  statusMessage.value = body
}
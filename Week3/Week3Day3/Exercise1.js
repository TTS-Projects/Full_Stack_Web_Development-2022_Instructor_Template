let shoppingList = ['pop tarts', 'ramen noodles', 'chips', 'salsa','coffee'];
shoppingList.push('fruit loops');
let index = shoppingList.indexOf('coffee');
shoppingList[index] = 'fair trade coffee';
//console.log(shoppingList);
shoppingList.splice(2,2,'rice','beans');
console.log(shoppingList);

let myCart = [];

myCart.push(shoppingList.pop());
console.log(myCart);
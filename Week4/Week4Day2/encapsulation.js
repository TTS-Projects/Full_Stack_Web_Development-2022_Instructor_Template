//encapsulation example
class person{
	constructor(name,id){
		this.name = name;
		this.id = id;
	}
	add_Address(add){
		this.add = add;
	}
	getDetails(){
		console.log(`\nName is ${this.name},\nAddress is: ${this.add}`);
	}
}

let person1 = new person('Mukul',21);
person1.add_Address('Delhi');
person1.getDetails();
console.log(person1.name);

let person2 = new person();
person2.getDetails();


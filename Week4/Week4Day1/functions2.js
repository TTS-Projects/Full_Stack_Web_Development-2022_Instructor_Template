//course OBJECT
// let course = {
// 	name: 'JavaScript Applications',
// 	awesome: true
// }

	
// let students = [
// 	{firstName: 'Cam', lastName: 'Newton'},
// 	{firstName: 'Ted', lastName: 'Ginn'},
// 	{firstName: 'Greg', lastName: 'Olsen'}
// ]
	
// // let fullNames = students.map(function(student){
// // 	return `${student.firstName} ${student.lastName}`;
// // })

// let fullNames = students.map(function(student){
// 	return ( (student.firstName) + " " + (student.lastName));
// })

// 


// let students = [
// 	{name: 'Cam Newton', assignmentsCompleted: 6},
// 	{name: 'Ted Ginn', assignmentsCompleted: 10},
// 	{name: 'Greg Olsen', assignmentsCompleted: 8}
// ]

// let totalAssignments = students.reduce(function(sum,current){
// 	return sum + current.assignmentsCompleted;
// }, 0);

// totalAssignments === 24;

// setTimeout(function(){
// 	console.log('later')
// },5000);

// console.log('now');




let teacher = {
	name: 'Shane',
	speak: function() {
		
		//Save this to a variable
		let self = this;
		
		//self is visible inside function because of closure
		setTimeout(function(){
			console.log('later my name is ' + self.name);
		},3000);
	}
}

teacher.speak();
console.log("hi, this came first")
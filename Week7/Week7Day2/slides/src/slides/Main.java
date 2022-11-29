package slides;

import java.io.Console;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		carTesting();
		
//		Console console = System.console();
//
//		Person firstPerson = new Person();
//
//		Person secondPerson = new Person("John");
//
//		Person thirdPerson = new Person("Jane", 45, "London");
//		thirdPerson.sayHello();
//		System.out.println("Jane will be " + thirdPerson.birthday() + " years old next year ");
//		System.out.println(thirdPerson.birthYear(2018));
//		
//		//usage of class that inherits a person
////		Student new_student = new Student();
////	    new_student.name = "Michael";
////	    new_student.age = 20;
////	    new_student.gradYear = 2020;
////	    System.out.println("Name: " + new_student.name + "\nAge: " 
////	        + new_student.age +"\nGraduation Year: " + new_student.gradYear 
////	        + "\nEnrolled? " + new_student.enrolled);
////	    new_student.enrolledStudent();
//	    
//	    
//	    // placing students in an arraylist
//	    ArrayList<Student> studentList = new ArrayList<Student>();
//
//	    Student new_student2 = new Student();
//	    new_student2.name = "Michael";
//	    new_student2.age = 20;
//	    new_student2.gradYear = 2020;
//	    studentList.add(new_student2);
//	  
//	    Student new_student3 = new Student();
//	    new_student3.name = "Janice";
//	    new_student3.age = 32;
//	    new_student3.gradYear = 2019;
//	    studentList.add(new_student3);
//	  
//	   
//	    
//	    studentList.add(Student.addStudents("Angela", 43, 1996, false));
//	    studentList.add(Student.addStudents("Daniel", 33, 2002, true));
//	    studentList.add(Student.addStudents("Ronald", 19, 2021, false));
//	
//	    String studentName;
//	      int studentAge;
//	      int studentGradYear;
//	      boolean enrollmentStatus;
//	      String complete = "no";
//	    //loop keeps getting user input as long as the complete variable equals "no"
//	      while (complete.equals("no")) {
//	        studentName = console.readLine("Enter a name: ");
//	        studentAge = Integer.parseInt(console.readLine());
//	        studentGradYear = Integer.parseInt(console.readLine("Year of Graduation: "));
//	        enrollmentStatus = Boolean.parseBoolean(console.readLine("Enrolled (enter true or false: "));
//	        studentList.add(Student.addStudents(studentName, studentAge, studentGradYear, enrollmentStatus));
//	        complete = console.readLine("List complete? Enter yes or no: ");
//	      }
//	    //enhanced for loop to describe all students.
//	    for (Student s : studentList){
//		      System.out.println("Name: " + s.name + "\nAge: " + 
//		      s.age +"\nGraduation Year: " + s.gradYear + 
//		      "\nEnrolled? " + s.enrolled + "\n");
//		    }
	
	}
	public static void carTesting() {
		  Car myCar = new Car("crossover", "blue");
		  
	      System.out.println(myCar); // output: This crossover car is blue.
	 
	}

}



	  

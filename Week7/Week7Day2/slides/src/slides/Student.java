package slides;

public class Student extends Person {
	int gradYear; 
	  boolean enrolled = false;

	  void enrolledStudent(){
	    enrolled = true;
	  }
	  static Student addStudents(String name, int age, int gradYear, boolean enrolled){
			 
		    Student new_student = new Student();
		    new_student.name = name;
		    new_student.age = age;
		    new_student.gradYear = gradYear;
		    new_student.enrolled = enrolled;
		    return new_student;

		    }
	    
	    //We added an additional instance variable 
	    //and method to our new class
}

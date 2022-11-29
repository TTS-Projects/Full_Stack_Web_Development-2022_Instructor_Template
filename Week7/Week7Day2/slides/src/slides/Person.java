package slides;

public class Person {
	//Instance Variables
	public Integer height;
	String name; 
    int age; 
    String location;
	


	//getters & setters
	
	
	
	//constructors
	public Person() {
		
	}
	public Person (String name) {
	    this.name = name; 
	}
	public Person (String nameOfPerson, int age, String location) {
	    
	    this.name = nameOfPerson; 
	    this.age = age; 
	    this.location = location; 

	}
	
	
	//methods
	public void sayHello(){
	   	System.out.println("Hello " +  name);

	   	return;
	}
	public void sayHello(String firstName){
	    System.out.println("Hello " + firstName);
	}
	public int birthday() {
	    return age + 1;
	}
	public int birthYear(int currentYear) {
        int birthYear = currentYear - age; 
        //age is the instance variable 
        //that we have saved

        return birthYear;
    }
	public void reallyHardMath(){
	    Double answer = (-5 + Math.sqrt(5*2 - 4 * (8*15)))/(2 * 8);
	    System.out.println(answer);
	}
	
}

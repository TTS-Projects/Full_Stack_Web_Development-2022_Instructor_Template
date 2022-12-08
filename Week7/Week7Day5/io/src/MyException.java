package src;

public class MyException extends Exception {
	String greeting;
	   
	   public MyException(String greeting) {
	      this.greeting = greeting;
	      System.out.println(greeting + " is not an appropiate greeting.");
	   }
	   
	   public String sayHello() {
	      return greeting;
	   }
}

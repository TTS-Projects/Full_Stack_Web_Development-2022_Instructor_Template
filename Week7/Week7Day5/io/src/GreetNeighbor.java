package src;

public class GreetNeighbor {
	   
	   public GreetNeighbor() {
	      
	   }
	   
	   public static void sayHelloNeighbor(String greeting) throws MyException {
	      if (greeting.equals("Hello")) {
	      	System.out.println(greeting + " neighbor!  Welcome!");
	      } else {
	   	 throw new MyException(greeting);
	      } 
	   }

	   public static void main(String[] args) throws MyException {
	       GreetNeighbor welcome = new GreetNeighbor();
	       sayHelloNeighbor("Goodbye");
	   }
	}   
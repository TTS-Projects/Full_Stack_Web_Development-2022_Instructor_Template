package src;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
  public static void main(String[] args) {
    int result = divide();
    System.out.println(result);
  }
  
  private static int divide() {
    int x = getInt();
    int y = getInt();
    System.out.println("x is " + x + ", y is " + y);
    return x / y;
  }
  
  private static int getInt() {
    Scanner s = new Scanner(System.in);
    System.out.println("Please enter a number");
    Boolean check = true;
    while(check) {
      try {
    	System.out.println("Please enter a number");

    	
        Integer a =  s.nextInt();
        if (a!=null) {
        	check = false;
        	return a;
        }
        
       
      } catch(InputMismatchException e) {
        s.nextLine(); // read past end of line, move to next line
        System.out.println("Error - please enter a number");
      }
    }
  }
}
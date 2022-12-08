package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int x = 100;
    int y = 0;
    //System.out.println(divideLBYL(x, y));
    //System.out.println(divideEAFP(x, y));
    if( true){
        throw new IllegalArgumentException("I just manually threw this exception");
    }
  
  }
//lbyl checks a value for null or the value that would cause the exception (0 in this case)
  private static int divideLBYL(int x, int y) {
    if(y != 0) {
      return x / y;
    } else {
      return 0;
    }
  }
  public static int getIntLBYL() {
	    Scanner s = new Scanner(System.in);
	    boolean isValid = true;
	    System.out.println("Please enter a number.");
	    String input = s.next();
	    for(int i=0; i<input.length(); i++) {
	      if(!Character.isDigit(input.charAt(i))) {
	        isValid = false;
	        break;
	      }
	    }
	    if(isValid) {
	      return Integer.parseInt(input);
	    }
	    return 0;
	  }
//eafp uses try and catch functions
  private static int divideEAFP(int x, int y) {
    try {
      return x / y;
    } catch(Exception e) {
      return 0;
    }
  }
  public static int getIntEAFP() {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Please enter a number.");
	    try {
	      return s.nextInt();
	    } catch(InputMismatchException e) {
	      return 0;
	    }
	  }
}
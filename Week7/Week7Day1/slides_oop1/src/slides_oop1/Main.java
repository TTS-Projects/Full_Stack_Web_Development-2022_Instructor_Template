package slides_oop1;

import java.util.ArrayList;
import java.util.Scanner;

//imports after package statement

//after the imports comes the class statement
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<String> someList = null;
//		 
//		// some other code here, may or may not assign a reference to list
//		 
//		if (someList != null)
//		{
//		    System.out.println("number elements: " + someList.size());
//		}
//		else
//		{
//		    System.out.println("List is still uninitialized.");
//		}
		
		
		
//		//conversion into int from string
//		String numberInString = "22";
//		Integer numberAfterConversion = Integer.parseInt(numberInString);
//		System.out.println(numberInString.getClass());
//		System.out.println(numberAfterConversion.getClass());
		
		
		//instantiating and using a car object
		Car car = new Car();
		car.setColor("blue"); 
		car.getColor();
		car.start();
		car.drive();
		System.out.println(car.toString());

		Car sporty = new Car("Red", 2);
		sporty.start();
		sporty.drive();
		 
		Car family = new Car();
		family.setColor("Gold");
		family.setNumberOfDoors(4);
		family.start();
		family.drive();

		Scanner scanner = new Scanner(System.in);

		
	}
	public static void hi() {
		System.out.println("hi");
	}
	

}

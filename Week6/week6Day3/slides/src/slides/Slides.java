package slides;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Slides {
	public static void main(String[] args) throws IOException {
//		BufferedReader reader = new BufferedReader(new FileReader("myTextFile.txt"));
//		String line = reader.readLine();
//		while (line != null)
//		{
//		    System.out.println(line);
//		    line = reader.readLine();
//		}
//		int count = 44;
//		if ( count > 20)
//		{
//		    String msg = "Count is large!";
//		    System.out.println(msg);
//		}
//		 
//		
//		 
//		if ( count > 50 )
//		{
//		    String msg = "Count is VERY large!";
//		    System.out.println(msg);
//		}
//		System.out.println("Finished checking count.");
//		 
		// output:
		// Count is large!
		// Finished checking count.

		//nesteed if
		int count = 55;
		if ( count > 20 )
		{
		    String msg = "Count is large!";
		    if ( count > 50 )
		    {
		        msg = msg + "\nCount is VERY large";
		    }
		    System.out.println(msg);
		}
		System.out.println("Finished checking count.");
		
		
		//CheckId(false, 21, true);
		
		// imagine a List, someList, that is created previous to this code
		int listSize = 50;
		 
		if (listSize > 100)
		{
		    System.out.println("List is really big!");
		}
		else if (listSize > 80)
		{
		    System.out.println("List is kind of big.");
		}
		else if (listSize > 60)
		{
		    System.out.println("List is just a little over half big.");
		}
		else if (listSize > 30 && listSize <= 59)
		{
		    System.out.println("List is approaching small");
		}
		else
		{
		    System.out.println("List is small");
		}
		
		//switchStatement('x');
		int[] simpleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 
		// using the standard for loop and the length property of an array
		for (int i = 0; i < simpleArray.length; i++) 
		{
		    System.out.println("Normal for value: " + simpleArray[i]);
		}
		 
		// using the enhanced for loop
		for (int item : simpleArray) 
		{
		    System.out.println("Enhanced for: " + item);
		}
		 
		// both loops will print the their respective strings 1 - 10. 
	}
	static void CheckId( boolean validId, int age, boolean buyingAlc )
	{
	    if (validId)
	    {
	        System.out.println("Valid ID presented");
	        if((age>=21) && (buyingAlc))
	        {
	            System.out.println("Customer legal to purchase alcohol");
	        }
	    }
	    else 
	    {
	        System.out.println("Error: Invalid license");
	    }
	}
	
	static void switchStatement(char shirt) {
		
	       String msg= " ";
	       switch(shirt)
	       {
	               case 's':
	                      msg= "Shirt is small";
	                      break;
	                case 'm':
	                      msg= "Shirt is medium";
	                      break;
	                case 'l':
	                      msg= "Shirt is large";
	                      break;
	                 case 'x':
	                      msg= "Shirt is Xtra large";
	                      break;
	                 default:
	                      msg= "Unknown shirt size";
	                      break;
	       }
	       System.out.println(msg);
		
		}
	
}


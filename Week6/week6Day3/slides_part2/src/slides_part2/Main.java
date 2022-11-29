package slides_part2;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
//		insertOddData(43);
//		insertOddData(2);
//		int[] data = {1, 3, 4, 6};
//		System.out.println(getArraySum(data));
		
		
		for (int i = 0; i>0; i++ ) {
			System.out.println("I ran!");
		}
//		//make sure to import Random from java.util
		//System.out.println(add(1,3));
//		Random random = new Random();
//		int breakAt = random.nextInt(100);
//
//		//labeled loop
//		outer:
//		for(int x=1; x<=5; x++)
//		{
//		    System.out.println("Starting list " + x);
//
//		    for(int i=0; i<100; i++)
//		    {
//		        if ( i==breakAt)
//		        {
//		            System.out.println("Length of this list: " + breakAt);
//		            
//		            if (breakAt%x == 2)
//		            {
//		                System.out.println("List generation ended early!");
//		                //labeled break
//		                break outer;
//		            }
//		            else
//		            {
//		                break;
//		            }
//		        }
//		        System.out.println("Index: " + i);
//		    }
//		    System.out.println("Finished list " + x);
//		    // Get the next random number for a different size list
//		    breakAt = random.nextInt(100);
//		}
//		System.out.println("After the loop");
//		// generate a random number between 0 and 100
//		Random random2 = new Random();
//		int breakAt2 = random.nextInt(100);
//		 
//		// print a 'list' of random length
//		for(int i=0; i<100; i++)
//		{
//		    if ( i==breakAt2)
//		    {
//		        System.out.println("Random number was: " + breakAt);
//		        break;
//		    }
//		    // if number is even, skip to next iteration
//		    if ( i%2==0)
//		    {
//		        continue;
//		    }
//		    System.out.println("Index: " + i);
//		}
//		System.out.println("After the loop");
//		
//		// the snippet would print 5 'lists', each with the numbers 0-12 in them.
//		outer:
//		for(int i=0; i<5; i++)
//		{
//		    System.out.println("List number: " + i);
//		    for(int y=0; y<25; y++)
//		    {
//		        System.out.println("Index: " + y);
//		        if ( y == 12)
//		        {
//		            continue outer;
//		        }
//		    }
//		}

}
	//add function takes two Integers and returns the sum as an Integer variable.
	public static Integer add(Integer number1, Integer number2) {
		return(number1+number2);
	}
	public static void insertOddData(int data)
	{
	    // equal to 0 check
	    if (data == 0)
	    { 
	        return;
	    }
	    // Negative check
	    if (data < 0)
	    {
	        return;
	    }
	    // check to see if data is even or odd
	    if ( data%2 == 0)
	    {
	        return;
	    }
	 
	    // some code here to store the odd data somewhere
	    System.out.println("Odd Data Stored: " + data );
	    return;
	}
	 
	// find and return the sum of the array
	public static int getArraySum(int[] arr)
	{
	    // initialize to a valid default return value
	    int sum = 0;
	 
	    // array must have values to sum
	    if (arr.length > 0)
	    {
	        for( int n : arr)
	        {
	            sum += n;
	        }
	    }
	 
	    return sum;
	}
}

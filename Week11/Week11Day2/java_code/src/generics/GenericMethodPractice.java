package generics;

public class GenericMethodPractice {
	   public static < W > void printArray( W[] arrayIn) {
	      for(W element : arrayIn) {
	         System.out.printf("%s ", element);
	      }
	      System.out.println();
	   }
	   
	   public static <T extends Comparable<T>> int greaterThan(T[] numArray, T elem) {
		    int count = 0;
		    for (T e : numArray)
		        if (e.compareTo(elem) > 0)
		            ++count;
		    return count;
		}


		   public static void main(String args[]) {

		      Integer[] intArray = { 10, 20, 30, 40, 50 };
		      String[] stringArray = { "Java", "Ruby", "Python", "Swift"};
		      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		      System.out.println("Array integerArray contains:");
		      printArray(intArray);   

		      System.out.println("\nArray stringArray contains:");
		      printArray(stringArray);   

		      System.out.println("\nArray characterArray contains:");
		      printArray(charArray); 
		   }
		   
		}

	

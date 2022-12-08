package src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class CopyFile {

	public static void main(String args[]) throws  FileNotFoundException, IOException {  
	      FileInputStream in = null;
	      FileOutputStream out = null;
	 
	      //int value = 0;
	      //int division = 5 / value; // unchecked exception  
	      
	      //ArrayList<Integer> a = giveMeAArraylist([1,2,3]);
	      //a.get(2); //index out of bounds 
	      
	      //look before you leap 
//	      if (a != null) {
//	    	  
//	      }
	      
	      try {
	          in = new FileInputStream("C:\\Users\\Mike\\Documents\\TTS\\TTSgithub2\\Week7\\Week7Day5\\io\\src\\input.txt");
	          //in = new FileInputStream("input.txt");

	    	  out = new FileOutputStream("C:\\Users\\Mike\\Documents\\TTS\\TTSgithub2\\Week7\\Week7Day5\\io\\src\\output.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	            //System.out.println("writing out ");
	         }
	      }
	      catch(Exception e) {
	    	  //the code in case this fails
	    	  System.out.print("exception occured!");
	      }
	     
	      finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	            System.out.println("out closed");
	         }
	      }
	   }
}


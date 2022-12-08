package io_slides;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String args[]) throws  FileNotFoundException, IOException {  
	      FileInputStream in = null;
	      FileOutputStream out = null;
	 
	      try {
	         in = new FileInputStream("C:\\Users\\Mike\\Documents\\TTS\\TTSgithub2\\Week7\\Week7Day5\\io_slides\\src\\input.txt");
	         out = new FileOutputStream("C:\\Users\\Mike\\Documents\\TTS\\TTSgithub2\\Week7\\Week7Day5\\io_slides\\src\\output.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	            System.out.println("writing out ");
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	   }
}

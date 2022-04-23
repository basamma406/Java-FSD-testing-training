package Day14;
import java.io.File;
import java.io.IOException;


public class Assignment1 {

	public static void main(String[] args) {
			
		 try {
		      File myObj = new File("bookname.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("error message");						
					
	}
					
	}			
	}



package Day14;
import java.io.File; 

public class Assignment3 {

	public static void main(String[] args) {
		
		    File myObj = new File("Bookname.txt");
		    if (myObj.exists()) {
		      System.out.println(" BookNumber: " + myObj.getName());
		      System.out.println("Absolute path: " + myObj.getAbsolutePath());
		      System.out.println("this book is Write or not: " + myObj.canWrite());
		      System.out.println("this book is beautiful  " + myObj.canRead());
		      System.out.println("File size in bytes " + myObj.length());
		    } else {
		      System.out.println("The file does not exist.");
		    }
		  }
		
	}



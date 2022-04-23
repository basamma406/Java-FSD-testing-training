package Day13;

import java.util.ArrayList;
import java.util.List;
		 
	class Book{
		int year;  
		String name,author,publisher;  
		int quantity;  
		public Book( String name, String author, String publisher, int quantity,int year) {  
		    this.year=year;
		    this.name = name;  
		    this.author = author;  
		    this.publisher = publisher;  
		    this.quantity = quantity; 
		    
		}  
		}  
		public class Aftera4 {  
		public static void main(String[] args) {  
		    
		    List<Book> list=new ArrayList<Book>();  
		    
		    Book b1=new Book("Let us C","Yashwant Kanetkar","BPB",8,1993);  
		    Book b2=new Book("Data Communications and Networking","Forouzan","Mc Graw Hill",4,1967);  
		    Book b3=new Book("Operating System","Galvin","Wiley",6,1967);  
		    
		    list.add(b1);  
		    list.add(b2);  
		    list.add(b3);  
		    for(Book b:list){  
		   
		   
		        System.out.println(b.year+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		    }  
		
		}
		}
		
	
		    
		
		    
		   

			
	



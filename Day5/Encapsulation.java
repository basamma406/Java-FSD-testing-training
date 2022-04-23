package Day5; 
import Encap.*;
import java.util.Scanner;

 class Encapsulation {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
Student s=new Student();
String str=null;
System.out.println("enter the name");
str=sc.next();
s.setName(str);
Student r=new Student();
System.out.println("enter the name");
str=sc.next();
r.setName(str);
System.out.println(s.getName());
System.out.println(r.getName());

	}

}

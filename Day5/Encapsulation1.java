package Day5;

		import Encap1.*;
		import java.util.Scanner;

		public class Encapsulation1 {

			public static void main(String[] args) {
				
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		String str=null;
		System.out.println("enter the employee name");
		str=sc.next();
		e.setName(str);
		Employee a=new Employee();
		System.out.println("enter the another employee name");
		str=sc.next();
		a.setName(str);
		System.out.println(e.getName());
		System.out.println(a.getName());

			}

		}

	

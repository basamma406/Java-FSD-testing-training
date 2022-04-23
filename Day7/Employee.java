package Day7;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		String name;
	    float sal;
	    int doj; 
Scanner sc = new Scanner(System.in);
    System.out.print("Enter employee name :");
    name = sc.next();
    System.out.print("Enter employee salary :");
    sal = sc.nextFloat();
    System.out.print("Enter employee date of joining:");
    doj = sc.nextInt();


 System.out.println("Employee  details:");
 System.out.println("Employee  name is: " +name);
 System.out.println("Employee  salary is: " +sal);
 System.out.println("Employee  date of joining is: " +doj);	       
	    }
}

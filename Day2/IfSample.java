package Day2;

import java.util.Scanner;

public class IfSample {

	public static void main(String[] args) {
		System.out.println("enter the two numbers");
		Scanner as=new Scanner(System.in);
		double c;
		double a=as.nextDouble();
		double b=as.nextDouble();
		c=a+b;
		System.out.println("Addition :"+c);
		c=a-b;
		System.out.println("Substraction :"+c);
		c=a*b;
		System.out.println("multiplication:"+c);
		c=a/b;
		System.out.println("division:"+c);
		c=a%b;
		System.out.println("remainder:"+c);
		
		
	}

}

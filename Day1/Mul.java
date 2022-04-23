package Day1;
import java.util.Scanner;

public class Mul {
	static int sampl=6;

	public static void main(String[] args) {
		double a,b,c;
		Scanner ac=new Scanner(System.in);
		System.out.println("Enter the two  values");
		a=ac.nextDouble();
		b=ac.nextDouble();
		c=a+b;
		System.out.println("sum"+c);
		showsampl();
	}
	public static void showsampl(){
		
		System.out.print(sampl);
		
	}

}

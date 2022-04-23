package Day2;
import java.util.Scanner;

public class Whileloop1 {

	public static void main(String[] args) {
		
		int n;
	System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
		while(n>=1)
		{
			System.out.println(n);
			n--;
		}
	}

}

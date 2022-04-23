package Day3;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		System.out.println("enter the  number");
		Scanner cs=new Scanner(System.in);
		int n=cs.nextInt();
		boolean flag=false;
		for( int i=2;i<n;i++) {
			if(n%i==0)
			{
				flag=true;
				break;
			}
		}if(flag==true) {
		System.out.println("it is a not prime number");
		}
		else {
			System.out.println("it is  prime number");
		}
}
	}



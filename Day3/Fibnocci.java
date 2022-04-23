package Day3;
import java.util.Scanner;

public class Fibnocci {

	public static void main(String[] args) {
		int a=0,b=0,c=1;
		System.out.println("enter the number");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			  a=b;
			 b=c;
			 c=a+b;
			 System.out.println(" fibnocci series is :"+a);
			 
			
		}
		
	}

}

package Day2;
import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("enter the weight");
			int weight=sc.nextInt();
			if(weight>45) {
				System.out.println("you are eligible to donate the blood");
			}
			else
		{
			System.out.println("you  are not eligible to donate the blood");
		}
		}
		
			else {
				System.out.println("your age is greater than 18");
			}
		}
	}


	


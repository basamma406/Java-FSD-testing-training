package Day3;
import java.util.Scanner;
public class Smallest {

	public static void main(String[] args) {
		
				int smallest,temp;
				Scanner cs=new Scanner(System.in);
				System.out.println("Enter the tree numbers:");
				int a1=cs.nextInt();
				int a2=cs.nextInt();
				int a3=cs.nextInt();
				
				temp=a1<a2?a1:a2;
				smallest=a3<temp?a3:temp;
				System.out.println("Smallest number is :"+smallest);
			}

	
	}



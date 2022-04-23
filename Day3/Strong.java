package Day3;
import java.util.Scanner;

public class Strong {

		    public static void main(String args[])
		       {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("enter  a number : ");
		        int num=sc.nextInt();
		        int r,c=0;
		        while(num!=0) {
		        	r=num%10;
		        	if(r==0)
		        		c++;num=num/10;
		        }
		 
		        if(c>0)
		            System.out.println("it is a Duck number");
		        else
		            System.out.println("it is Not a duck number");
		    }
		}

	



package Day7;
import java.util.Scanner;

public class After2 {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        int arr[] = new int[5];
	        System.out.println("Enter 5 numbers:");
	        for (int i = 0; i < 5; i++) {
	            arr[i] = in.nextInt();
	        }
	        int max=arr[0];
	        for (int i = 0; i < arr.length; i++) {
	        	if (arr[i] > max)
	                max = arr[i];
	        }
	        System.out.println("Largest Number = " + max);
	}

}

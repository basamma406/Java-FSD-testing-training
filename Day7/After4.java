package Day7;
import java.util.Scanner;
public class After4 {

	public static void main(String[] args) {
		 int [] arr1;
	        int[] arr2;
	        int n=0,i=0;
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a no. of elements in the array");
	        n = sc.nextInt();
	        System.out.println("Enter numbers in array");
	        arr1=new int[n];
	        for(i=0;i< n;i++)
	        {
	            arr1[i]=sc.nextInt();
	        }  
	         arr2 = new int[arr1.length];
	         int j=arr1.length-1;
	        
	        for ( i = 0; i < arr1.length; i++)
	        {
	            arr2[i] = arr1[j];
	            j--;
	        }
	        System.out.println("Elements of original array: ");
	        for ( i = 0; i < arr1.length; i++)
	        {
	           System.out.print(arr1[i] + " ");
	        }

	        System.out.println("Elements of array in reverse order: ");
	        for ( i = 0; i < arr2.length; i++)
	        {
	           System.out.print(arr2[i] + " ");
	        }

	}

}

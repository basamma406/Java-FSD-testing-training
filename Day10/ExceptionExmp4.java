package Day10;

public class ExceptionExmp4 {

	public static void main(String[] args) {
		int sum=0;
		try
		{
			int[] arr1={1,2,3,4,5,6,7,8,9,10};
			System.out.println(arr1[15]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		for(int i=0;i<10;i++)
		{
			sum+=i;
		}
		System.out.println("the sum of the elements of the array is :"+sum);

	}

}

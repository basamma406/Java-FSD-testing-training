package Day15;

 class Selectionsort {

			void sort(int arr[])
			{  			
				int n = arr.length; 
				
				for (int i = 0; i < n-1; i++) 
				{
					int min_idx = i;//
					for (int j = i+1; j < n; j++) 
						{
							if (arr[min_idx] > arr[j])
							min_idx = j;//5
					}

				
					int temp = arr[min_idx];
					arr[min_idx] = arr[i];
					arr[i] = temp; 
					}}
	
				void printArray(int arr[])
				{
				int n = arr.length;
				for (int i=0; i<n; ++i)
					System.out.print(arr[i]+" ");
				System.out.println();
			}

			// Driver code to test above
			public static void main(String args[])
			{
				Selectionsort ob = new Selectionsort();
				int arr[] = {21,11,32,8,2,15,22};
				ob.sort(arr);
				System.out.println("Sorted array");
				ob.printArray(arr);
			}
	}



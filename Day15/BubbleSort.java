package Day15;

		class BubbleSort
		{
			void bubbleSort(int arr[])
			{ 
				int n = arr.length; 
				for (int i = 0; i < n-1; i++) 
					for (int j = 0; j < n-i-1; j++) 
					{
						if (arr[j] > arr[j+1])
						{
							// swap arr[j+1] and arr[j]//
							int temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1] = temp;
						}
						
					}
			}
			
			void printArray(int arr[])
			{
				int n = arr.length;//n=7 
				for (int i=0; i<n; ++i) 
					System.out.print(arr[i] + " ");
				System.out.println();
			}

			public static void main(String args[])
			{
				BubbleSort ob = new BubbleSort();
				int arr[] = {16,18,28,56,77,89,96};//size=7
				ob.bubbleSort(arr);
				System.out.println("Sorted array");
				ob.printArray(arr);
			}
	}



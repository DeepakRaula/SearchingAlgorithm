package searching;

import java.util.Scanner;

public class InterpolationSearch {
	
	// It only works on sorted array
		public static void selectionSort(int[] arr,int n) {
			if(n == 1) {
				return;
			}
			
			for(int i = 0; i < n-1; i++)
			{
				int minimum_index = i;
				
				for(int j = i+1; j <n; j++ )
				{
					if(arr[j] < arr[minimum_index])
					{
					minimum_index = j;
					}	
				}
				
				int temp = arr[minimum_index];
				arr[minimum_index] = arr[i];
				arr[i] = temp;
			}
			
		}
		
		public static void interPolationSearch(int[] arr, int low, int high, int num) {
			
			int pos = -1;
			boolean found = false;
			
			int mid;
			while(low <= high) {
				mid = low + (high - low) * ((num - arr[low])/(arr[high] - arr[low]));
				if(num == arr[mid]) {
					pos = mid;
					found = true;
					System.out.println("The element "+ num + " is present in " + pos + " postion in the given array");
					break;
				}else if(num < arr[mid]) {
					high = mid -1;
				}else {
					low = mid + 1;
				}
			}
			
			if((low > high) && (found == false)) {
				
				System.out.println("The element "+ num + " is not present in the given array");
				return;
				
			}
			
		}
		
		
		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			
			int[] array =  ArrayFunction.inputArray();
			
			selectionSort(array, array.length);
			
			System.out.println("the sorted array is : \n");
			
			ArrayFunction.printArray(array);
			

			System.out.println("Enter the element to be searched: \n");
			
			int num = s.nextInt();
			
			interPolationSearch(array,0, array.length-1, num);
			
		}

}

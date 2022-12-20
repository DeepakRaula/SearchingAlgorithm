package searching;

import java.util.Scanner;

public class ArrayFunction {
	
	public static void printArray(int[] arr) {

		for(int i = 0; i <= arr.length-1 ; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	
	public static int[] inputArray() {
		Scanner s = new Scanner(System.in);
		
		
		// input elements inside the array
		
		System.out.println("Enter the total number of elements in the array: \n");
		
		int noOfElements = s.nextInt();
		
		int arr[] = new int[noOfElements];
		
		for(int i = 0; i <= noOfElements-1 ; i++) {
			arr[i] = s.nextInt();
		}
		
		return arr;
	}

}

package searching;

import java.util.Scanner;

public class LinearSearch {
	
	public static void linearSearch(int[] arr, int num) {
		int pos = -1;
		boolean found = false;
		
		for(int i = 0; i < arr.length; i++) {
			if(num == arr[i]) {
				found = true;
				pos = i;
				System.out.println("The postion of "+num+" is "+pos+" in the given array");
				break;
			}
		}
		if(found == false) {
			System.out.println("The given element is not present in the array ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int[] array =  ArrayFunction.inputArray();
		
		System.out.println("the given array is :\n");
		
		ArrayFunction.printArray(array);
		
		System.out.println("Enter the element to be searched: \n");
		
		int num = s.nextInt();
		
		linearSearch(array, num);
		
	}

}

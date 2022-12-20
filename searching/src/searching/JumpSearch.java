package searching;

import java.lang.Math;

import java.util.Scanner;

public class JumpSearch {
	
	public static int jumpSearch(int[] arr, int low, int high, int num , int n) {
		
		int step = (int)Math.floor(Math.sqrt(n));
		int i;
		
		
		for(i = 0; i < step ; i++) {
			 if (num < arr[step]) {
				 high = step - 1;
			 }else {
				 low = step + 1; 
			 }
		}
		
		for(i = 0 ; i <= high ; i++) {
			
			if(arr[i] == num) {
				return i;
				
			}
		}
		
		return -1;
		
	}
	
	
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int[] array =  ArrayFunction.inputArray();
		
		System.out.println("the given array is :\n");
		
		ArrayFunction.printArray(array);
		
		System.out.println("Enter the element to be searched: \n");
		
		int num = s.nextInt();
		
		int low = 0;
		
		int high = array.length -1;
		
		
		int pos = jumpSearch(array,low,high, num, array.length);
		
		
		if (pos == -1) {
			System.out.println(" the element is not present in the array");
			
		}else {
			System.out.println(" the position of the element is "+ pos);
		}
	}

}

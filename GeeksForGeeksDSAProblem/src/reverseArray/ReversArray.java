package reverseArray;

import java.util.Arrays;

public class ReversArray {

	public static void main(String[] args) {
		
		int[]arr= {4,2,3,6,8,9,1,7};
		
		System.out.println(Arrays.toString(arr));
		
		reverseArray(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		

	}

	private static void reverseArray(int[] arr, int i, int j) {
		
		int temp=0;
		
		if(i>=j)
			return;
		
		temp=arr[i]; arr[i]=arr[j]; arr[j]=temp;
		
		reverseArray(arr, i+1, j-1);
		
	}

}

/*
 * Write a program to reverse an array or string

 * Given an array (or string), the task is to reverse the array/string. 
 * Examples:
 * 
 * Input : arr[] = {1, 2, 3} Output : arr[] = {3, 2, 1}
 * 
 * Input : arr[] = {4, 5, 1, 2} Output : arr[] = {2, 1, 5, 4}
 */

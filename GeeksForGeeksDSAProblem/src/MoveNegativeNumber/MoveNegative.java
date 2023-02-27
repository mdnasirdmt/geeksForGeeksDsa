package MoveNegativeNumber;

import java.util.Arrays;

public class MoveNegative {

	public static void main(String[] args) {

		int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		
		for (int i = 0; i < arr.length; i++) {
			
			int index=i;
			for (int j = i+1; j < arr.length; j++) {
			
				if(arr[j]<arr[index]) {
					index=j;
				}
			}
			
			int tem=arr[index];
			arr[index]=arr[i];
			arr[i]=tem;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}

//Move all negative numbers to beginning and positive to end with constant extra space
//Difficulty Level : Easy

//An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.
//
//Examples : 
//
//Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
//Output: -12 -13 -5 -7 -3 -6 11 6 5
//
//Note: Order of elements is not important here.
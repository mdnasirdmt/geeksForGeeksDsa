package kthElement;

import java.util.Arrays;

public class KthSmallestArrayElement {

	public static void main(String[] args) {
		
		
		int[]arr= {7,10,4,3,20,15};
		
		int k=3;
		
		
		System.out.println("kth smallest element in the array is : "+kthSmallest(arr, k));;

	}

	private static int kthSmallest(int[] arr, int k) {
		
		Arrays.sort(arr);
		
		return arr[k-1];
		
	}

}


//Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
//
//Note :-  l and r denotes the starting and ending index of the array.
//
//Example 1:
//
//Input:
//N = 6
//arr[] = 7 10 4 3 20 15
//K = 3
//Output : 7
//Explanation :
//3rd smallest element in the given 
//array is 7.

///////////////////////////////
//Example 2:
//
//Input:
//N = 5
//arr[] = 7 10 4 20 15
//K = 4
//Output : 15
//Explanation :
//4th smallest element in the given 
//array is 15.
//Your Task:
//You don't have to read input or print anything. Your task is to complete the function kthSmallest() which takes the array arr[], integers l and r denoting the starting and ending index of the array and an integer K as input and returns the Kth smallest element.
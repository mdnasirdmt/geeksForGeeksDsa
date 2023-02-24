package sortArray;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[]a= {0,2,1,2,0};
		
		int min=a[0];
		for (int i = 0; i < a.length-1; i++) {
			
			int index=i;
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[j]<a[index]) {
					
					index=j;
					
				}
				
				int tem= a[index];
				a[index]=a[i];
				a[i]=tem;
				
				
			}
		}
		
		System.out.println(Arrays.toString(a));
		
		
	}
	
	
	
	

}


//Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
//
//
//Example 1:
//
//Input: 
//N = 5
//arr[]= {0 2 1 2 0}
//Output:
//0 0 1 2 2
//Explanation:
//0s 1s and 2s are segregated 
//into ascending order.


///////////////////////////
//Example 2:
//
//Input: 
//N = 3
//arr[] = {0 1 0}
//Output:
//0 0 1
//Explanation:
//0s 1s and 2s are segregated 
//into ascending order.
//
//Your Task:
//You don't need to read input or print anything. Your task is to complete the function sort012() that takes an array arr and N as input parameters and sorts the array in-place.
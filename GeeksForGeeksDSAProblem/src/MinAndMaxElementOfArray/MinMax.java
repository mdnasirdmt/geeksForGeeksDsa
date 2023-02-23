package MinAndMaxElementOfArray;

import java.util.Arrays;

public class MinMax {

	public static void main(String[] args) {
		
		
		
		int[]arr= {43,5,6,32,56,3,2};
		
		Arrays.sort(arr);
		
		System.out.println("Min elemnt is "+ arr[0]+ "\n"+ "Max is "+arr[arr.length-1]);
		
		
		

	}

}

//Maximum and minimum of an array using minimum number of comparisons

//Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.
//
//Examples:
//
//Input: arr[] = {3, 5, 4, 1, 9}
//Output: Minimum element is: 1
//              Maximum element is: 9
//
//Input: arr[] = {22, 14, 8, 17, 35, 3}
//Output:  Minimum element is: 3
//              Maximum element is: 35
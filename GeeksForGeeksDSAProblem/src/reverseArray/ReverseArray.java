package reverseArray;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[]arr= {43,5,6,32,56,3,2};
		
		System.out.println(Arrays.toString(arr));
		
		int[]arr1=new int[arr.length];
		
		int j=0;
		for (int i = arr.length-1; i>=0; i--) {
			
			arr1[j++]= arr[i];
			
		}
		
		System.out.println(Arrays.toString(arr1));

	}

}

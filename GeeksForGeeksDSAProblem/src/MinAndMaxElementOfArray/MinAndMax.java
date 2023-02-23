package MinAndMaxElementOfArray;

public class MinAndMax {

	public static void main(String[] args) {
		
		int[]arr= {43,5,1,6,32,56,3,2};
		
//		int lp=arr[0];
//		int rp=arr[arr.length-1];
		
		int min= arr[0];
		int max= arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			if(min>arr[i]) {
				min=arr[i];
			}
			
			if(max<arr[i]) {
				max=arr[i];
			}
			
		}
		
		System.out.println("min "+min);
		System.out.println("max "+max);

	}

}

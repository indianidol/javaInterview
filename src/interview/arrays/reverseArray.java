package interview.arrays;

import java.util.Arrays;

public class reverseArray {

	 public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 4, 4,6, 5, 6,7};
	        reverseArray(arr1);
	     System.out.println(Arrays.toString(arr1));
	    }

	public static void reverseArray(int[] arr){
		
		
		int start = 0;
		int end = arr.length-1;
		int temp=0;
		while(start<end) {
			temp =arr[start];
			arr[start] = arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	//	System.out.println(end);
	/*
	 * for (int i=0; i<end;i++) { System.out.println(i); System.out.println(end-1);
	 * temp = arr[i]; arr[i]=arr[end-1]; arr[end-1]=temp; end--;
	 * 
	 * }
	 */
		
		
	}
	}


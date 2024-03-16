package interview.arrays;

import java.util.Arrays;

public class maxnumber {

	 public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 4,24, 4,6, 5, 6,7};
	      
	        System.out.println(maxnumber(arr1));
	    }
public static int maxnumber(int[] arr) {
	int max=arr[0];
	int start = 1;
	int end = arr.length;
	
	while(start<end) {
		if (max<=arr[start]) {
			max=arr[start];
		}
		start++;
	}
	
	return max;
	
	
}

	

}

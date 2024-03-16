package interview.arrays;

public class checksorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2= {1,2,2,3,4,5,1};
		System.out.print(checksorted(arr1));
		System.out.print(checksorted(arr2));
		

	}
	public static boolean checksorted(int[] arr) {
		boolean sorted = true;
		
		int start =0;
		int end = arr.length-1;
		while(start<end) {
			
			if(arr[start]<arr[start+1]) {
				
			
			}else {
				sorted= false;
			}
			start++;
		}
		
	
		return sorted;
	}
	

}

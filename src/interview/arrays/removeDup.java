package interview.arrays;
import java.util.*;

public class removeDup {
	public static void main(String[] args) {
		Object[] arr1= {1,1,2,3,4,2,6,1	};
		int len = arr1.length;
		System.out.println(len);
		
		Set<Integer> set = new HashSet<>();
		
		for(int i= 0 ; i<len;i++) {
			
			set.add((Integer) arr1[i]);
			
			
		}
		arr1 = set.toArray();
		System.out.println(Arrays.toString(arr1));
	}

}

package interview.collections;

import java.util.*;

public class FindDupInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 2, 1, 1, 2, 4, 5, 5, 7 };
		List<Integer> dups = findDuplicates(arr);
		System.out.println("Duplicates : "+dups);
	}

	public static List<Integer> findDuplicates(int[] arr) {

		List<Integer> result = new ArrayList<>();
		
		Set<Integer> set = new HashSet<>();
		for(int num:arr) {
			if(!set.add(num)) {
			result.add(num);
			}
			
		}

		return result;

	}

}

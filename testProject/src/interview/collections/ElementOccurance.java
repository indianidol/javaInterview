package interview.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class ElementOccurance {
		
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,2,3,3,2,1);
		
		Map<Integer, Integer> map = countOccurences(list);
		
		System.out.println("Occurences "+ map);
		
		
			
	}
	public static Map<Integer,Integer> countOccurences(List<Integer> list){
		
		 Map<Integer,Integer> count = new HashMap<>();
		 
		 
		 for (int num:list) {
			 count.put(num, count.getOrDefault(num, 0)+1);
		 }
		return count;
		
	}

}

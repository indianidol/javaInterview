package interview.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> mylist =Arrays.asList(1,2,2,23,3,3,31,1);
		
		System.out.println(removeDup(mylist));
			

	}
	
	public static List<Integer> removeDup(List<Integer> list){

		Set<Integer> set = 	new LinkedHashSet<>(list); 
		
		return new ArrayList<Integer>(set);	
				
	}

}


package interview.strings;

import java.util.HashMap;
import java.util.Map;

public class eachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="hello World";			
		Map<Character, Integer> charCount = new HashMap<>();
		
		for(char ch:str.toCharArray()) {
			
			if(ch >=32 && ch <=126) {//ASCII chars only
			charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
			}
		}
		
		
		for(Map.Entry<Character,Integer > entry: charCount.entrySet()) {
			System.out.println("'"+entry.getKey()+"'appears "+entry.getValue()+" times");
		}
		
		

	}

}

package interview.strings;

public class reverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="hello World";
		
		//String[] words = str.split("\\s"); // Split by WhiteSpace 
		char[] words = str.toCharArray();
		
		StringBuilder reversedStr = new StringBuilder();
		for(int i=words.length -1; i>=0;i--) {
			reversedStr.append(words[i]).append(" ");
		}
		System.out.println(reversedStr);
		

	}

}

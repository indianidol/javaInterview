package interview.strings;

public class charCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test ="the quick brown fox";
		
		char ch = 'o';
		
		int count =0;
		for (int i=0; i<test.length();i++) {
			if(ch==test.charAt(i)) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}

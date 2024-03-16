package testProject;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello";

		StringBuffer reversed = new StringBuffer();

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed.append(str.charAt(i));
		}

		System.out.println(reversed.toString());
	}

}

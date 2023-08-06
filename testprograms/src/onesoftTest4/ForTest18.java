package onesoftTest4;

public class ForTest18 {
	public static void main(String[] args) {
		String str = "OnESofthf";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z')
				count++;

		}
		System.out.println(count);

	}

}

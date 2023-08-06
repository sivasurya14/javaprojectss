package onesoftTest4;

public class ForTest15 {
	public static void main(String[] args) {
		String name = "valleyw";

		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				continue;
			}
			count++;
		}
		System.out.println(count);
	}
}
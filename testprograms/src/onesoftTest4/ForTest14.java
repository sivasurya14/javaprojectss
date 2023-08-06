package onesoftTest4;

public class ForTest14 {
	public static void main(String[] args) {
		String va = "madame";
		int count = 0;

		for (int i = 0; i <= va.length() - 1; i++) {
			char ch = va.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
		System.out.println(count);
	}
}
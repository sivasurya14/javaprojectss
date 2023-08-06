package onesoftTest4;

public class ForTest17 {
	public static void main(String[] args) {
		String str = "onesoft2800";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8'
					|| ch == '9' || ch == '0')
				count++;
		}
		System.out.println(count);
	}
}

package day1program;

public class NumberIntochar {
	public static void main(String[] args) {

		String s = "a3b3c2";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				System.out.print(s.charAt(i));
			} else {

				int a = Integer.parseInt(String.valueOf(s.charAt(i)));

				for (int j = 1; j < a; j++) {
					System.out.print(s.charAt(i - 1));
				}
			}
		}
	}
}

package day4Program;

public class PalindromeExample {

	public static String checkPalin(String value) {

		String revers = "";
		for (int i = value.length() - 1; i >= 0; i--) {
			revers = revers + value.charAt(i);
		}
		if (value.toLowerCase().equalsIgnoreCase(revers)) {
			return value + " is Palindrome";
		} else {
			return value + " is not palidrome";
		}
	}

	public static void main(String[] args) {

		System.out.println(checkPalin("ram"));
	}

}

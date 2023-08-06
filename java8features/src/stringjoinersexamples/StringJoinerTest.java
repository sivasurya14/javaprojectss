package stringjoinersexamples;

public class StringJoinerTest {
	public static void main(String[] args) {
		String name = "siva";
		char ch ;
		int length = name.length();
		for (int i = length - 1; i >= 0; i--) {
			ch = name.charAt(i);
			System.out.print(ch);
		}
	}

}

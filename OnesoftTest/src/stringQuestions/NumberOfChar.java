package stringQuestions;

public class NumberOfChar {

	public static void main(String[] args) {

		String value = "a1d3dt4d";
		int count = 0;

		for (int i = 0; i <= value.length() - 1; i++) {
			char cha = value.charAt(i);
			if (cha >= 'a' && cha <= 'z') {
				count++;
				System.out.println(cha);
				//System.out.println("");
			}
		}
		System.out.println(" number of count is : " + count);
	}

}

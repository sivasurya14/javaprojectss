package lmsTestExamples;

public class UniqueCharacters {
	public static void main(String[] args) {
	String ss = "welcome";
        int count = 0;
		 for (int i = 0; i < ss.length(); i++) {
		  char ch = ss.charAt(i++);
			 char chr = ss.charAt(i);

			if (ch == chr) {
				count++;

			}
		}
		System.out.println(count);

	}

}

package lmsTestExamples;

public class ReadStringsFromArgs {

	public static void main(String[] args) {
		String name = "sivasuriyans";
		char ch = name.charAt(0);

		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (ch == name.charAt(i))

				count++;
		}
		System.out.println(count);
	}
}

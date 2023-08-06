package stringRegex;

import java.util.regex.Pattern;

public class StrinRegexPattern1 {
	public static void main(String[] args) {
		String name = "sivasuriyan";

		boolean name1 = name.matches(".*\\d.*");
		System.out.println(name1);
		boolean name2 = Pattern.matches("s*", name);
		System.out.println(name2);
	}
}
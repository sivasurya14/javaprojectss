package lmsTestExamples;

public class StringContainsEx {
	public static void main(String[] args) {
		String sm = "singapore";
		String ss = "gae";
		int count = 0;
		for (int i = 0; i < ss.length(); i++) {
			char ch = ss.charAt(i);
			for (int j = 0; j < sm.length(); j++) {
				char ch1 = sm.charAt(j);
				if (ch == ch1) {
					// char nam = sm.charAt(j);
					count++;
				}
			}
		}
		if (sm.contains(ss)) {

			System.out.println("ALL PRESENT");
		} else if (count == ss.length()) {
			System.out.println("ALL SCATTRED");
		} else if (count >= ss.length()) {
			System.out.println("SOME SCATTRED");

		} else {

			System.out.println("NON PRESENT");
		}
	}
}

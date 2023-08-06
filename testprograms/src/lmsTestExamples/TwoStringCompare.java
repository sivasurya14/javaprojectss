package lmsTestExamples;

public class TwoStringCompare {
	public static void main(String[] args) {
		String name1 = "KEEP";
		String name2 = "PEEK";
		int count = 0;
	    int num=name1.length();
		for (int i = 0; i < name1.length(); i++) {
			char ch = name1.charAt(i);
			for (int j = 0; j < name2.length(); j++) {
				char ch1 = name2.charAt(j);
				if (ch == ch1) {
					count++;
					break;
				}
			}
		}
		//System.out.println(count);
		if (count ==num) {

			System.out.println("ANAGARAM");
		} else
		System.out.println("NOT ANAGARAM");

	}

}

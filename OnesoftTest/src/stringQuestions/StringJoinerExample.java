package stringQuestions;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		
		StringJoiner names = new StringJoiner(",");
		names.add("siva");
		names.add("dinesh");
		names.add("suresh");
		names.add("guru");				
	System.out.println(names);
		
	}
}

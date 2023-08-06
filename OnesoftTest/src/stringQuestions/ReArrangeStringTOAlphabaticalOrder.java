package stringQuestions;

import java.util.Arrays;

public class ReArrangeStringTOAlphabaticalOrder {
	public static void main(String[] args) {
		
		String value = "abcfed";
		
		char[]  stringvalue = value.toCharArray();
		
		Arrays.sort(stringvalue);
		
		System.out.println(stringvalue);
		
		
	}
}

package day4Program;

import java.util.Arrays;

public class StringIntoSort {
	public static void main(String[] args) {
		String name = "sivasuriyan";
		char[] ch = name.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);

	}
}
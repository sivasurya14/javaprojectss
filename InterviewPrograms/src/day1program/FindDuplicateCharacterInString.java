package day1program;

import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateCharacterInString {

	public static void main(String[] args) {
		
		String input = "one s1oft technologies";
		String name = input.replaceAll(" ", "");
		
		System.out.println(name);

		Map<Character, Long> countDuplicate = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		System.out.println("Duplicate elements with Count : ");
		countDuplicate.forEach((k, v) -> {
			if (v > 1) {

				System.out.println(k + ":" + v);
			}

		});

		System.out.println("\n");
		System.out.println("Unique Elelments With count : ");

		countDuplicate.forEach((k, v) -> {
			
			

			if (v <= 1) {

				System.out.println(k + ":" + v);
			}

		});

	}
}

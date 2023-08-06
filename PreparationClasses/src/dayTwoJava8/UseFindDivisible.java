package dayTwoJava8;

import java.util.Arrays;
import java.util.List;

public class UseFindDivisible {
	public static void main(String[] args) {
		
		
		List<Integer> numbers = Arrays.asList(30, 12, 23, 31,15,20);
		
		FindDivisible find = (val) -> {
			for (Integer no : val) {
				if (no % 2 == 0 && no % 3 == 0) {
					System.out.println(no);
					}
			}
		};
		find.findDivisiblenumbers(numbers);
	}
}

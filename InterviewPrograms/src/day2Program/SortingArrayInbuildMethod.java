package day2Program;

import java.util.Arrays;
import java.util.Collections;

public class SortingArrayInbuildMethod {

	public static void main(String[] args) {

		Integer[] var = { -1, 2, 3, 10, 4, 3, -3, 6, 1, 8 };

		// Arrays.sort(var,Collections.reverseOrder());

		Arrays.sort(var);

		int max = 0;
		System.out.println("sorting the element: ");
		for (int i = 0; i < var.length; i++) {
			System.out.println(var[i]);
			if (i == var.length - 2) {
				max += var[i];

			}
		}
		System.out.println("Second Maximum of array is :" + max);
	}
}

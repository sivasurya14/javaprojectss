package testprogramss;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Test5 {

	public static boolean isPrime(int c) {
		boolean prime = true;
		for (int i = 2; i < c / 2; i++) {
			if (c % i == 0) {
				prime = false;
				break;
			}

		}

		return prime;
	}

	public static void main(String[] args) {
		Test5 test = new Test5();
		String b = "23,24,25,26";
		List<String> al = new ArrayList<>();
		al = Arrays.asList(b.split(","));
		List<Integer> num = new ArrayList<>();
		for (String sd : al) {

			int number = Integer.parseInt(sd);
			num.add(number);

		}
		for (int i = 0; i < num.size(); i++) {
			int c = num.get(i);
			boolean ball = test.isPrime(c);
			if (0 < i) {
				System.out.print(",");
			}
			if (ball) {
				System.out.print(c + "-PRIME");

			}

			else {
				System.out.print(c + "-NOT PRIME");
			}

		}

	}

}

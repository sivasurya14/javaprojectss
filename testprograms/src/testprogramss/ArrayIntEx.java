package testprogramss;

import java.util.ArrayList;
import java.util.List;

public class ArrayIntEx {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(9);
		al.add(22);
		al.add(41);
		al.add(20);
		al.add(11);

		System.out.println("----Normal Iteration---");
		System.out.println(al);

		System.out.println("----Using For Loop-----");

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("--- Square of the numbes Using Loop for Loop----- ");
		int temp;
		for (int i = 0; i < al.size(); i++) {
			temp = al.get(i) * al.get(i);
			System.out.println(temp);

		}
		System.out.println("---to find the Numbers add or even----");
		int i = 0;
		while (i < al.size()) {
			if (al.get(i) % 2 == 0) {
				System.out.println(al.get(i) + " is even number");
			} else {
				System.out.println(al.get(i) + " is add number");
			}
			i++;
		}

		System.out.println("find the numbeers are square or not ");

		for (int i1 = 0; i1 < al.size(); i1++) {
			int num = al.get(i1);
			boolean square = false;

			for (int j = 1; j <= num; j++) {
				if (j * j == num) {
					square = true;
					break;
				}
			}

			if (square)
				System.out.println(num + " is Square");
			else

				System.out.println(num + " is not square");
		}

		System.out.println("-----To find the numbers are prime are not-----");

		for (int i1 = 0; i1 < al.size(); i1++) {
			int num = al.get(i1);
			boolean square = false;
			int m;
			for (int j = 1; j <= num; j++) {
				m = num % j;
				if (m == 0) {
					square = true;
					break;
				}
			}
			if (square) {
				System.out.println(num + " is prime");
			}
			else {
				System.out.println(num + " is not prime");
		}
			}
	}
}

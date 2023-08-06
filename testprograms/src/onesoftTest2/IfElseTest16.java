package onesoftTest2;

import java.util.Scanner;

public class IfElseTest16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the number here -> ");
		int no = scan.nextInt();
		if (no % 2 == 1) {
			if (no % 5 == 0)
				System.out.println("the number is odd and divisible by 5");
		}

		else if (no % 4 == 0)
			System.out.println("the number is even and divisible by 4 ");

	}

}

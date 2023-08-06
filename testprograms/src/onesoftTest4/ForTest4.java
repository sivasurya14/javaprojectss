package onesoftTest4;

import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number ");
		try {
			int num = scan.nextInt();
		}
//		} catch (Exception e) {
//			System.out.println(e + " it is inputmismatch exception");

		finally {
			System.out.println("finally block is excuted");
		}
		int num1 = 5;
		int temp = 0;
		for (int i = 0; i <= 5; i++) {
			temp = 2 * i + 1;
			System.out.print(" " + temp);
		}

	}
}

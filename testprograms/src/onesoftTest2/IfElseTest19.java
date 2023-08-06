package onesoftTest2;

import java.util.Scanner;

public class IfElseTest19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the sqft :");
		int sq = scan.nextInt();
		if (sq >= 450)
			System.out.println(" need 2 ton ac");
		else if (sq <= 185)
			System.out.println(" need  1 ton ac");

	}

}

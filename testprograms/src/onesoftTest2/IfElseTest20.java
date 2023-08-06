package onesoftTest2;

import java.util.Scanner;

public class IfElseTest20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the gram here :");
		int gold = scan.nextInt();
		int temp = 0;
		if (gold <= 25) {
			temp = gold * 1000;
			System.out.println("the fine is " + temp);
		} else if (gold >= 25 && gold <=100) {
			System.out.println("2 years imprisonment ");
		} else if (gold > 100)
			System.out.println("5 years imprisonment");

	}

}

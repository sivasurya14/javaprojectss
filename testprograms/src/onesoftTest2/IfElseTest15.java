package onesoftTest2;

import java.util.Scanner;

public class IfElseTest15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the character to check vowels -> ");
		String name = scan.nextLine();

		if (name.equals("a") || name.equals("e") || name.equals("i") || name.equals("o") || name.equals("u"))
			System.out.println("this is vowel");
		else
			System.out.println("this is not an alphabet");

	}
}

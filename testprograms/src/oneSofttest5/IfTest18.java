package oneSofttest5;

import java.util.Scanner;

public class IfTest18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the  railway time here...");
		int time = scan.nextInt();
		if (time >= 6 && time < 8)
			System.out.println("breakfast");
		if (time >= 11 && time < 15)
			System.out.println("Lunch");
		if (time >= 19 && time <=24)
			System.out.println("dinner");
	}
}

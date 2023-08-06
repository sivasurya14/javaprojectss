package oneSofttest5;

import java.util.Scanner;

public class IfTest13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your weight...");
		int weight = scan.nextInt();
		System.out.println("Enter your run time in minutes per day");
		int time = scan.nextInt();
		int temp = 0, temp1 = 0;
		if (time == 30) {
			temp = weight - 5;
			System.out.println("your weight is " + temp);
		} else if (time == 60) {
			temp1 = weight - 10;
			System.out.println("your weight is " + temp1);

		}

	}
}
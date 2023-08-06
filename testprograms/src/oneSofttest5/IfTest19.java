package oneSofttest5;

import java.util.Scanner;

public class IfTest19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the unit you used here -> ");
		int str = scan.nextInt();
		int temp2 = 0;
		if (str <= 100) {
			System.out.println("no charge");
		} else if (str > 100 && str <= 200) {
			int temp = (str - 100) * 5;
			System.out.println("your bill  amount is " + temp);
		} else if (str > 200) {
			temp2 = (str - 200) * 10 + 500;
			System.out.println("your bill amount is " + temp2);

		}

	}
}
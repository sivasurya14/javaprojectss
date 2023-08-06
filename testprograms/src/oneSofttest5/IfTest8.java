package oneSofttest5;

import java.util.Scanner;

public class IfTest8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number ");
		int val = scan.nextInt();
		System.out.println("enter the second number ");
		int val1 = scan.nextInt();
		int add=val+val1;
		int temp = 0;
		int temp2 = 0;
		if (add < 50) {
			temp2 = add* add* add;
			System.out.println("cube of the " + temp2);
		} else {
		temp = add * add;
		System.out.println("square of the " + temp );
		}
	}

}

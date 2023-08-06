package oneSofttest5;

import java.util.Scanner;

public class IfTest12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the time here ");
		int time = scan.nextInt();
		if (time >= 6 && time < 11)
			System.out.println("Good morning");
		if (time >= 11 && time < 15)
			System.out.println("Good After noon");
		if (time >= 15 && time < 18)
			System.out.println("Good Evening ");
		if (time > 18 && time < 24)
			System.out.println("Goood night");
	}

}

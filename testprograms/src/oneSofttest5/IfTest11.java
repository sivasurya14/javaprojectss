package oneSofttest5;

import java.util.Scanner;

public class IfTest11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The percentage here -> ");
		int perc = scan.nextInt();
		if (perc <=75)
			System.out.println("you are not eligible to write exam  ");
		if (perc > 75)
			System.out.println("you are eligible to write exam");

	}

}

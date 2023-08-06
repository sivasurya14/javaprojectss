package oneSofttest5;

import java.util.Scanner;

public class IfTest20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter the number -> ");
		int no = scan.nextInt();
		int temp = 0;
		temp = no % 10;
		System.out.println(temp);
	}

}

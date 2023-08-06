package oneSofttest5;

import java.util.Scanner;

public class IfTest17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of swing here -> ");
		int no = scan.nextInt();
		int temp = 0;
		if (no <= 5) {
			temp = no * 250;
			System.out.println("the capacity of " + no + " wing fan is " + temp + "fps");
		} else
			System.out.println(no + " is Invalid wing");
	}

}

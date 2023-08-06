package oneSofttest5;

import java.util.Scanner;

public class IfTest10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the Age of A");
		int val = scan.nextInt();
		System.out.println("enter the Age of B");
		int val2 = scan.nextInt();
		System.out.println("enter the Age of C");
		int val3 = scan.nextInt();
		if (val > val2 && val > val3)
			System.out.println("A IS ELDER");
	
		if (val2 > val && val2 > val3)
			System.out.println("B IS ELDER");
		if (val3 > val && val3 > val2)
			System.out.println("C IS ELDER");
		if (val < val2 && val < val3) {
			System.out.println("A IS YOUNGER");
			if (val2 < val && val2 < val3)
				System.out.println("B IS YOUNGER");
			if (val3 < val && val3 < val2)
				System.out.println("C IS YOUNGER");
		}
	}
}
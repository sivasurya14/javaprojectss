package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample2 extends Sample1 {
	void name() {
		int z = 0;
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter the number :");
			z = s.nextInt();
			System.out.println("your typeed is :  " + z);
		} catch (InputMismatchException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Sample2 s2 = new Sample2();
		s2.add(29, 0);
		s2.name();
	}
}

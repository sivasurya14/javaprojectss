package oneSofttest5;

import java.util.Scanner;

public class IfTest14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the IQ ");
		float iq = scan.nextFloat();
		if (iq == 8.1f)
			System.out.println("8.1 is Horse IQ");
		if (iq == 8.3f)
			System.out.println("8.3  is cow IQ");
		if (iq == 8.8f)
			System.out.println("8.8 is Goat IQ");
		if (iq == 9.0f)
			System.out.println("9.0 is Squirrel IQ");

	}

}

package oneSofttest5;

import java.util.Scanner;

public class IfTest16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Switch");
		String str = scan.nextLine();
		if (str.equalsIgnoreCase("on"))
			System.out.println("THE LIGHT IS ON ");
		if (str.equalsIgnoreCase("off"))
			System.out.println("THE LIGHT IS OFF");

	}

}

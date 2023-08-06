package doubt;

import java.util.Scanner;

public class UsingWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("enter the  name here :");
			String name = scan.next();
			System.out.print("enter your 1st mark :");
			int mark1 = scan.nextInt();
			System.out.print(" enter mark 2 :");
			int mark2 = scan.nextInt();
			System.out.print("enter the mark 3 : ");
			int mark3 = scan.nextInt();
			int total = 0;
			if (mark1 > 35 || mark2 > 35 || mark3 > 35) {
				total = mark1 + mark2 + mark3;
				System.out.println(name + " your total mark is : " + total);
			} else if (mark1 <= 35) {

				System.out.println("you are fail in mark1");
			}

			else if (mark2 <= 35) {

				System.out.println("you are fail in mark1");
			} else if (mark3 <= 35) {

				System.out.println("you are fail in mark1");
			}
		}
	}
}

package doubts;

import java.util.Scanner;

public class StringEx {
	public static void main(String[] args) {

		System.out.println("enter the name ");
		Scanner scan = new Scanner(System.in);
		String name1 = scan.next();

		int no = 0;
		for (int i = 0; i < name1.length(); i++) {
			if (name1.charAt(i) == 'a') {
				no++;
				System.out.println(name1.charAt(i));
			}
		}
		System.out.println(no);

	}
}

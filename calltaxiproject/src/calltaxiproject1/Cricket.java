package calltaxiproject1;

import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
       	Scanner sc = new Scanner(System.in);

		System.out.println("start to hit the ball press 0 or 1");
		System.out.println("0 is dot ball (out) and 1 is you hitted the ball ");
		int sc1 = sc.nextInt();
       for(int i = 0;i<=0;i++) {
		if (sc1 <= 0) {
			System.out.println("you are out ");
		} else if (sc1 > 0) {

			System.out.print("your score is - " + sc1);
			int a = sc.nextInt();
			int a1 = a + sc1;
			System.out.print("your score is " + a1);
			int b = sc.nextInt();
			int b1 = b + a1;
			System.out.print("your score is " + b1);
			int c = sc.nextInt();
			int c1 = c + b1;
			System.out.println("your score is " + c1);
			int d = sc.nextInt();
			int d1 = d + c1;
			System.out.println("your score is " + d1);
			int e = sc.nextInt();
			int e1 = e + d1;
			System.out.println("your score is " + e1);
			int f = sc.nextInt();
			int f1 = f + c1;
			System.out.println(" your score is " + f1);
			int t = a + b + c + d + e + f;
			System.out.println(" your Total score is = " + t);

		} else {
			System.out.println("you are out");
		}
	}

	}
}
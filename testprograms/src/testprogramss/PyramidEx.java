package testprogramss;

import java.util.Scanner;

public class PyramidEx {

	public static void main(String[] args) {
		
		int space;
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the values");

		int n = scan.nextInt();
		System.out.println("your pattern is ");
		for (int i = 1; i <= n; i++) {
			
			for(space=1;space<=n-i;space++) {
				
				System.out.print("  ");
				
			}
			
			for (int j = 1; j <=2*i-1;j++) {

    
				System.out.print("* "); }
				
				System.out.println("");// new line
		//}
	}}}
//}

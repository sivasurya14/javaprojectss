package mathsClassExample;

import java.util.Scanner;

public class DoubleMethodTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number.");
		Double d1 = scanner.nextDouble();
		System.out.println("Enter second number");
		Double d2 = scanner.nextDouble();
		// return the smaller of two values
		Double d3 = Double.min(d1, d2);
		System.out.println("Enter third number");
		Double d4 = scanner.nextDouble();
		Double d5 = Double.min(d3, d4);
		System.out.println("The smaller number is: " + d5);
		
		System.out.println("######-----find min in INTEGER 232.3value---- ######## : ");
		System.out.println("Enter first number.");
	      int s1 = scanner.nextInt();
		System.out.println("Enter second number");
		 int s2 = scanner.nextInt();		// return the smaller of two values
		int s3 = Integer.min(s1, s2);
		System.out.println("Enter third number");
	    int  s4 = scanner.nextInt();
		int  s5 = Integer.min(s3, s4);
		System.out.println("The smaller number is: " + s5);
		
		
		
		
		
		

	}

}

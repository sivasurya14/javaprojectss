package javamaathsexamples;

import java.util.Scanner;

public class TernaryOperatorUse {
	String getName(int a) {
		return (a % 2 ==0) ? "even" : "odd";
	}
	public static void main(String[] args) {
		TernaryOperatorUse n = new TernaryOperatorUse();
      while(true) {
		System.out.print("enter the number : ");
		Scanner scan = new Scanner(System.in);
		int nn = scan.nextInt();
		System.out.println((nn!=0)? n.getName(nn) :"Invalid");
		}
}
}

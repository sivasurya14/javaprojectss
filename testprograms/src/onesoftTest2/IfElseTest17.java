
package onesoftTest2;

import java.util.Scanner;

public class IfElseTest17 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the shoe size ");
		int size=scan.nextInt();
		if(size<6)
			System.out.println("Child");
		else if (size>=6&&size<=10)
			System.out.println("Adult");
		else 
			System.out.println("adult and taller");
		
		
		
		
		
	}
}

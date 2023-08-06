package oneSofttest5;

import java.util.Scanner;

public class IfTest9 {
	public static void main(String[] args) {
		int temp=0;
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the length");
			int val = scan.nextInt();
			System.out.println("enter the breadth");
			int val2 = scan.nextInt();
			if(val==val2)
				System.out.println("this is square ");
			else 
				System.out.println("this is not a square");	
	}

}

package oneSofttest5;

import java.util.Scanner;

public class IfTest1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the shoe size here -> ");
		int size = scan.nextInt();
		if(size<=6)
			System.out.println("CHILD");
		if(size>6&&size<10)
			System.out.println("ADULT");
		if(size>=10)
			System.out.println("TALLER");
		
		
		
		
		
		
		
		
		
	}

}

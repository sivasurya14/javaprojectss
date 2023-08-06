package onesoftTest2;

import java.util.Scanner;

public class IfElseTest18 {
	 public static void main(String[] args) {
		 int price=100;
		 Scanner scan = new Scanner(System.in);
		 	System.out.print("enter your age : ");
		 int rs=scan.nextInt();
		 if(rs<60&&rs>18)
			 System.out.println("you get 10 ruppes discount");
		 else if(rs<=18)
			 System.out.println("you get 20 rupees discount");
		 else 
			 System.out.println("you get 5 discount ");
			 
		 
		 
		 
		 
	}
}

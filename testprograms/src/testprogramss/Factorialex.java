package testprogramss;

import java.util.Scanner;

public class Factorialex {
	public static void main(String[] args) {
		int t;
		for(t=1;t<=10;t++) {
		
		int i,fact=1;
	Scanner scan=new Scanner(System.in)	;
	
	System.out.print("enter the values here -> ");
	int n=scan.nextInt(); 
	
		for(i=1;i<=n;i++) {
			
			fact=fact*i;
			
		}
		
		System.out.println( n +"  factorial number is : "+fact);
		
	} }
	
}

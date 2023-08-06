package miniproject;

import java.util.Scanner;

public class Machine {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("enter the number   n");
	int n = scan.nextInt();
	int sum=0;
	for(int n1=1 ; n1<=25; n1++) {
		sum=sum+n1;
		
		if(sum==25)
			System.out.println("enter what you whant : ");
			else 
				System.out.println(" in sufficient amount ");
			
			
		}
		
		
	}
	
	
}
	
	


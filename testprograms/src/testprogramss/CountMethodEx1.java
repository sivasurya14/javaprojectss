package testprogramss;

import java.util.Scanner;

public class CountMethodEx1 {
	
	public static void main(String[] args) {
		
		COuntMethodEx sd =new COuntMethodEx();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String : ");
		
		String name =scan.nextLine();
	
	              sd.display(name);		
	}

}

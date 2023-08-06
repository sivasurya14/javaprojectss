package Java8features;

import java.security.DomainCombiner;

public class FucntionalInterface implements  Interface1 {
	
	public void display (String s) {
		
		System.out.println(s);
		
	}
	public static void main(String[] args) {
		
	FucntionalInterface c = new FucntionalInterface();
	     c.display("hello everyone ");
		
		
	}
	

}

package java8features;

import java.security.DomainCombiner;

public class DefaultEX implements DefaultMethod {
	
	public void say(String msg) {
		
		System.out.println(msg);
	
		
		
	}
	
	public static void main(String []args) {
		
		DefaultEX de = new DefaultEX();
		
		de.say("it is printed");
		de.sayable();
		
	
		
		
	
		
	}

}

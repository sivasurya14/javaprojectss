package java8features;

public class StaticMethodTest1 {
	
	public static void display () {
		
		System.out.println("it is static method reference example");
	}

	public static void main(String []args) {
		
		StaticMethodRef se=StaticMethodTest1::display;
		
		se.show();
		
	}
	}



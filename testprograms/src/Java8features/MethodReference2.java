package Java8features;

import colectionTestExample.MehtodOverRiding;

public class MethodReference2 {
	public void sayable() {
		System.out.println("this is implementation of abstract method in java ");
	}

	public static void sayble2() {
		System.out.println("this is static method reference : ");
	}

	public static void main(String[] args) {

		MethodReference2 some = new MethodReference2();
		InterfaceForMethodRef1 sd = some::sayable;
		sd.display();
		sd.add();
		InterfaceForMethodRef1 sd1 =MethodReference2::sayble2;
		
		
		
	}
}

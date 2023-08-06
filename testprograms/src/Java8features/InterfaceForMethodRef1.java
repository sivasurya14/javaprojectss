package Java8features;

public interface InterfaceForMethodRef1 {
	void display();
	void display1();
	default void add() {
		System.out.println("this is default method in java ");
	}
	static void show() {
		System.out.println("this is static method in java ");
	}
}

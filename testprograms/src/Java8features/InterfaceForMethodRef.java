package Java8features;

public interface InterfaceForMethodRef {
	void say();
	default void doit() {
		System.out.println("this is dafault method :");
	}
	static void doitnow() {
		System.out.println("this is static method in java ");
	}
}

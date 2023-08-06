package java8features;

public interface DefaultMethod {
	

	
	public default void sayable() {
		
		System.out.println("this deafult method");
	}
	void say(String msg);
}

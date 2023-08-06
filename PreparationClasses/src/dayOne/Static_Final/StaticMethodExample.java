package dayOne.Static_Final;

public class StaticMethodExample {

	public static int addNumbers(int a, int b) {

		int c = a + b;

		return c;

	}
	
	

	public static void main(String[] args) {

		// StaticMethodExample s = new StaticMethodExample();

		System.out.println(StaticMethodExample.addNumbers(10, 20));

	}

}

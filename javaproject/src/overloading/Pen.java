package overloading;

public class Pen {
	static int sum(int a, int b) {

		return a + b;
	}

	static String sum(String a, String b) {
		return a + "  " + b;
	}

	public static void main(String[] args) {

		// Pen g = new Pen();

		System.out.println("the sum of the two number is :" + Pen.sum(12, 34));
		System.out.println("the add of the two names is :" + Pen.sum("siva", "suriyan"));

	}
}

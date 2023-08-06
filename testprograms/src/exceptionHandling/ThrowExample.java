package exceptionHandling;

public class ThrowExample {

	public void validate(int a) {
		try {
			if (a > 18)
				throw new ArithmeticException(" you are not eligible :");
		} finally {
			System.out.println("your ");
		}
	}
	public static void main(String[] args) {
		ThrowExample n = new ThrowExample();
		n.validate(19);
		System.out.println("rest of the code will be excuted......");
	}
}
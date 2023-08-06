package exceptionHandling;

public class ExceptionTestWIthTry {
	public static void main(String[] args) {
		int a = 0;
		int b = 10;

		try {
			int c = b / a;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("code is excuted...");
	}
}

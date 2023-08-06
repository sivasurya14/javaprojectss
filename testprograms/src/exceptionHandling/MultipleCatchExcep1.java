package exceptionHandling;

public class MultipleCatchExcep1 {
	public static void main(String[] args) {

		int a = 0;
		int b = 10;

		try {
			int c = b / a;
		}

		catch (NullPointerException f) {
			System.out.println(f);
		} catch (ArithmeticException w) {
			System.out.println(w);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

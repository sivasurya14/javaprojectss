package testprogramss;

public class TestFactorial {
	public static void main(String[] args) {

		int a = 105;

		if (a < 0) {
			System.out.println("invalid number");
		} else if (a > 100) {
			System.out.println("out of range ");
		} else {
			int sum11 = 1;
			for (int i = 1; i <= a; i++) {

				sum11 = sum11 * i;
			}
			System.out.println(sum11);
		}

	}
}

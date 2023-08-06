package exceptionHandling;

public class NesttedTryBlock {

	public void age(int a) {

		if (a > 18) {

			System.out.println("you are eligible to vote :");

		} else {
			System.out.println("you  not are eligible to vote ");
		}
	}

	public static void main(String[] args) {

		try {
			int a = 0;
			int b = 10;
			int c = b / a;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e);
			try {
				int a = 0;
				int b = 0;
				int ac = a / b;
			} catch (Exception d) {
				System.out.println(d);
			}
			System.out.println("hiiii");

			NesttedTryBlock s = new NesttedTryBlock();
			s.age(25);
		}
	}
}

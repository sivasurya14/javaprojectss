package testprogramss;

public class CheckPrime {
	public static void main(String[] args) {
		String a = "17";
		int al = Integer.parseInt(a);

		if (al <= 0) {

			System.out.println("invalid");
		} else {
			boolean prime = false;
			for (int i = 2; i < al; i++) {
				if (al % i == 0) {
					prime = true;
					break;
				}

			}
			if (prime) {
				System.out.println("NOt Prime");
			} else {
				System.out.println("Prime");
			}
		}
	}
}

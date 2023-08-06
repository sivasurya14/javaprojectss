package onesoftTest4;

public class ForTest22 {
	public static void main(String[] args) {
		long num = 123456;
		int a =String.valueOf(num).length();
		for (int i = 0; i <a; i++) {
			long c = num % 10;
			long d = num / 10;
			num = d;
			if (c % 2 == 0)
				System.out.print(c + "  is even ");
			else
				System.out.print(c + " is odd  ");
		}
	}

}

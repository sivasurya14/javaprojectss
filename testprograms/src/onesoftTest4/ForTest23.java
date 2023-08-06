package onesoftTest4;

public class ForTest23 {
	public static void main(String[] args) {
		long num = 123456;
		int a = String.valueOf(num).length();
		int count = 0;
		for (int i = 0; i <= a; i++) {
			long c = num % 10;
			long d = num / 10;
			num = d;
			if (c % 2 == 1)
				count++;
		}
		System.out.println(count);

	}
}
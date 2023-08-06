package onesoftTest4;

public class ForTest13 {
	public static void main(String[] args) {
		int val = 10;
		int temp = 0;
		for (int i = 0; i <= val; i++) {
			if (i % 2 == 0)
				temp = temp + i;

		}
		System.out.println(temp);

	}
}

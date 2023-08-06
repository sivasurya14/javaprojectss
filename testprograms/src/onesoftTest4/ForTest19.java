package onesoftTest4;

public class ForTest19 {
	public static void main(String[] args) {

		float[] b = { 1.1f, 2.2f, 3.34f };
		float temp = 0, temp1 = 0, temp2 = 0, temp3 = 0;
		for (int i = 0; i < b.length; i++) {
			float arr = b[i];
			temp = arr * 100;
			temp1 = temp % 100;
			temp2 = temp1 / 100;
			temp3 = temp3 + temp2;

		}
		System.out.println(temp3);
	}

}

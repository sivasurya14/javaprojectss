package onesoftTest4;

public class ForTest21 {
	public static void main(String[] args) {
		float[] b = { 1.1f, 2.2f, 3.3f };
		float temp = 0;
		for (float arr : b) {

			temp = temp + arr*arr;
		}
		System.out.println(temp);
	}

}

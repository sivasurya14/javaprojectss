package colectionTestExample;

public class MethodOverloadingTEst {

	int show(int a, int b) {
		return a + b;
	}

	float show(int a, int b, int c) {

		return a + b + c;

	}

	public static void main(String[] args) {
		MethodOverloadingTEst c = new MethodOverloadingTEst();

		System.out.println(c.show(2, 3));
		System.out.println(c.show(2, 3, 5));

	}

}

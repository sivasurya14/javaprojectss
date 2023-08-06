package onesoftTest2;

public class IfElseTest12 {
	public static void main(String[] args) {
		int mark = 50;
		if (mark < 40)
			System.out.println("Fail");
		else if (mark > 90)
			System.out.println(" A grade ");
		else if (mark >= 90 && mark < 75)
			System.out.println(" B grade");
		else
			System.out.println("C grade");

	}

}

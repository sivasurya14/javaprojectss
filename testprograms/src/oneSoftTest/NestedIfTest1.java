package oneSoftTest;

public class NestedIfTest1 {
	public static void main(String[] args) {
		int value = -1;

		if (value == 0)
			System.out.println("Zero");
		else if (value > 0)
			System.out.println("Positive");
		if (value < 0)
			System.out.println("Negative");
		
	}
}

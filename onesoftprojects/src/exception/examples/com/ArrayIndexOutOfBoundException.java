package exception.examples.com;

public class ArrayIndexOutOfBoundException {
	public static void main(String[] args) {
		try {
			int no[] = { 1, 2, 3, 4, 5 };
			System.out.println(no[8]);
		} finally {
			System.out.println("this code will execute...");
		}

		System.out.println("Rest of the code.. ");
	}
}

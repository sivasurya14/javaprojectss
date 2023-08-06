package newtest;

public class UseTEst1 {
	public static void main(String[] args) {
		Test1[] sd = new Test1[5];

		sd[0] = new Test1(1, "author", "title", 230, 100);
		sd[1] = new Test1(1, "author", "title", 230, 100);
		sd[2] = new Test1(1, "author", "title", 230, 100);
		sd[3] = new Test1(1, "author", "title", 230, 100);
		sd[4] = new Test1(1, "author", "title", 230, 100);

		for (int i = 0; i <= sd.length; i++) {

			System.out.println(sd);

		}

	}
}

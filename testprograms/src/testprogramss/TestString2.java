package testprogramss;

public class TestString2 {
	public static void main(String[] args) {
	     String str=args[0];
		int n = args[0].length();
		if (n % 2 == 0) {
			System.out.println(str.substring(0, n / 2) + "-" + str.substring(n / 2));
		}

		else if (n % 2 == 1){ 
			System.out.println(
					str.substring(0, n / 2) + "-" + str.substring(n / 2, n / 2 + 1) + "-" + str.substring(n / 2 + 1));
		}

	}
}
  
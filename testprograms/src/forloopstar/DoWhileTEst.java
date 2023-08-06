package forloopstar;

public class DoWhileTEst {
	public static void main(String[] args) {
		int i = 0;
		while (i <= 20) {
			if (i % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
			i++;
		}
	}
}

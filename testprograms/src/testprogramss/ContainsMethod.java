package testprogramss;

public class ContainsMethod {
	public static void main(String[] args) {
		String ab = "0";
    try {
		int sd = Integer.parseInt(ab);
	

		if (sd <= 0) {
			System.out.println("INVALID");
		} else {
			boolean isSquare = false;

			for (int i = 2; i < sd; i++) {

				if (i * i == sd) {
					isSquare = true;
					break;
				}
			}
			if (isSquare) {
				System.out.println("square");
			} else {
				System.out.println("not square");
			}
		}
		}
		catch(NumberFormatException e) {
			System.out.println("INVALID");
		
		
	}
}
}
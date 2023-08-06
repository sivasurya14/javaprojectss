package lmsTestExamples;

public class SquareValueFromArgs {
	public static void main(String[] args) {

		String num = args[0];
		int temp = 0;
		String[] no = num.split(",");
		for (String sd : no) {
			int b = Integer.parseInt(sd);
			temp = b * b;
			System.out.println(temp);

		}
	}
}

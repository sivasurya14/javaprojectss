package lmsTestExamples;

public class AdditionValueFromARGS {
	public static void main(String[] args) {
		String num = args[0];
		String val[] = num.split(",");
		int temp = 0;
		for (String sd : val) {
			int no = Integer.parseInt(sd);

			temp = temp + no;

		}

		System.out.println(temp);

	}
    
}

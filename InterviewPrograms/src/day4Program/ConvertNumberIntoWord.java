package day4Program;

public class ConvertNumberIntoWord {

	private static final String[] numbers = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };
	private static final String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };

	public static String numberToWords(int num) {
		if (num < 20) {
			return numbers[num];
		} else if (num < 100) {
			int tensDigit = num / 10;
			int onesDigit = num % 10;
			if (onesDigit == 0) {
				return tens[tensDigit];
			} else {
				return tens[tensDigit] + " " + numbers[onesDigit];
			}
		} else {
			return Integer.toString(num);
		}
	}

	public static void main(String[] args) {
		int number = 23;
		String textRepresentation = numberToWords(number);
		System.out.println(textRepresentation);
	}
}

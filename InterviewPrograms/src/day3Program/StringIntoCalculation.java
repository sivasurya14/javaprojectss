package day3Program;

public class StringIntoCalculation {
	public static void main(String[] args) {
		
		   String val = "1+3-6";
			int result = 0;
			int currentNo = 0;
			char operator = '+';
			
			for (int i = 0; i < val.length(); i++) {
				char c = val.charAt(i);

				if (Character.isDigit(c)) {
					currentNo = currentNo+(c - '0');
				}

				if (!Character.isDigit(c) || i == val.length() - 1) {
					if (operator == '+') {
						result =result+currentNo;
					} else if (operator == '-') {
						result =result-currentNo;
					}
					operator = c;
					currentNo = 0;
				}
			}
			 System.out.println("Addition of the value is : "+result);
		}
}

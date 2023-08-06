package day1program;

public class StringTransformation {

	    public static void main(String[] args) {
	        String val = "a2b3c23";
	        String transformedString = transformString(val);
	        System.out.println("Transformed string: " + transformedString);
	    }

	    private static String transformString(String input) {
	        StringBuilder result = new StringBuilder();
	        char currentChar = 0;
	        int count = 0;

	        for (char c : input.toCharArray()) {
	            if (Character.isLetter(c)) {
	                if (currentChar != 0) {
	                    result.append(String.valueOf(currentChar).repeat(Math.max(0, count)));
	                    count = 0;
	                }
	                currentChar = c;
	            } else {
	                count = count * 10 + Character.getNumericValue(c);
	            }
	        }

	        if (currentChar != 0) {
	            result.append(String.valueOf(currentChar).repeat(Math.max(0, count)));
	        }

	        return result.toString();
	    }
	}

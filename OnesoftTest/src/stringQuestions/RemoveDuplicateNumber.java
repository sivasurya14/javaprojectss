package stringQuestions;

public class RemoveDuplicateNumber {
	public static void main(String[] args) {
		String number = "1,2,3,1,2,3,4,5";
		int val = 0;
		int val1 = 0;
		int temp = 0;

		String[] numberr = number.split(",");

		for (int i = 0; i <= numberr.length - 1; i++) {
			for (int j = i + 1; j <= numberr.length - 1; j++) {
				val = Integer.parseInt(numberr[i]);
				val1 = Integer.parseInt(numberr[j]);		
			if(val==val1) {
				//System.out.println("True");
				System.out.println(val1);
				}
			
			}

		}
//System.out.println(temp);
	}
}

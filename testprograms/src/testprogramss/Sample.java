package testprogramss;

public class Sample {
	public static void main(String[] args) {
		int well = 0, temp = 0, temp1 = 0;
		int count = 0;
		while (temp <= 48) {

			temp1 = temp + 5;
			if (temp1 == 51) {
				System.out.println(temp1 + "  finished");
				break;
			}
			temp = temp1 - 3;
			System.out.println(temp + " now frog is here  ");
			well++;
			count++;
		}
		System.out.println("total jump is " + count);
	}

}

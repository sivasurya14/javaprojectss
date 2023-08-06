package exception.examples.com;

public class Usethrow {

	public void checkNum(int num) {
		
		if (num<1) {
			
			throw new ArithmeticException("\n numberr is negative cannot calculate ");
		}
		else {
			System.out.println(num*num);
		}
	}
	public static void main (String []args ) {
		Usethrow checkn = new Usethrow();
		
		checkn.checkNum(-3);
		
		System.out.println("Rest of the code : ");
	}
	}
	

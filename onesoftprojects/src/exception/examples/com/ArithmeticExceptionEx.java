package exception.examples.com;

public class ArithmeticExceptionEx {
	public static void main(String[] args) {

		int num = 5;
   try {
		int remi = num / 0;
   } catch (Exception e) {
	   System.out.println(e);
   } 
		System.out.println("");

	}
}

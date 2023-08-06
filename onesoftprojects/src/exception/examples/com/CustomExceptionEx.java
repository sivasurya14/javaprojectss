package exception.examples.com;

public class CustomExceptionEx extends Exception {
	
	public CustomExceptionEx(String e) {
      super(e);
	}
	public static void main(String[] args) throws CustomExceptionEx {
		System.out.println(" starts ");
		int no = 5;
		if (no < 18) {
			throw new CustomExceptionEx("not eligible ");
		} else {
			System.out.println("Eligible");
		}		
		System.out.println("Printing......");
	}
}

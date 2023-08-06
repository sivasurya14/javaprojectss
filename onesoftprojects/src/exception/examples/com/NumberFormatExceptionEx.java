package exception.examples.com;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {

		String name = "siva";
		try {
			int no = Integer.parseInt(name);

			System.out.println(no);
		} catch (Exception e) {
			System.out.println(e+"number format exception occured... ");
		}
		
		System.out.println("Rest of the code....");
	}

}

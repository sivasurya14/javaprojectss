package exception.examples.com;

public class UseThorws {

	public static int Cal(int num, int num1) {
		int div = num / num1;

		return div;
	}
	public static void main(String[] args) {
		UseThorws check = new UseThorws();
       try {
		System.out.println(check.Cal(10, 0));
       }catch(Exception e) {
    	   System.out.println(e);
       }
		System.out.println("rest of the code...");
	}
}
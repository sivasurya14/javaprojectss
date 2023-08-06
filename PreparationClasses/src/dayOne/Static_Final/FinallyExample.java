package dayOne.Static_Final;

public class FinallyExample extends Exception {
	public FinallyExample(String message) {
		super(message);
	}
	public static void main(String[] args) throws FinallyExample {
		int a = 17;
		try {
			if (a < 18) {
				throw new FinallyExample("throw not eligible...");
			} else {
				System.out.println("eligible...");
			}
	} 
//		catch (FinallyExample e) {
//			System.out.println(e);
//		}
		finally {
		}
		System.out.println("finally block Excuted...");
	}
}

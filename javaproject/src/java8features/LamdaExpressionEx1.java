package java8features;

public class LamdaExpressionEx1 {

	public static void main(String[] args) {
		int width = 10;
		LamdaExpressionEx d2 = () -> {
		System.out.println("drawble" + width);
		System.out.println("hiii");};
        d2.draw();
	}
}
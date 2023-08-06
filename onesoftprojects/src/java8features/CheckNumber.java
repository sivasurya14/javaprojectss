package java8features;

public class CheckNumber {

	public static void main(String[] args) {

		FindNumber multiple = (num, num1, num2) -> (num * num1 * num2);
		FindNumber add = (num, num1, num2) -> (num + num1 + num2);
		FindNumber max = (num, num1, num2) -> (num / 5);

		System.out.println(multiple.add(10, 20, 30));
		System.out.println(add.add(10, 10, 10));
		System.out.println(max.add(10, 15, 30));
	}
}

package collection;

import java.util.Scanner;
import java.util.Stack;

public class StackExample1 {

	public static void main(String[] args) {

		Stack<String> values = new Stack<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Give Number of Names u want to add : ");

		int numberOfValues = scan.nextInt();

		for (int i = 0; i < numberOfValues; i++) {

			System.out.println("Enter the name : ");

			String names = scan.next();
			values.push(names);

		}

		System.out.println("List of names : ");
		//values.pop();
		values.forEach(System.out::println);

		System.out.println("Peek Method : " + values.peek());
		scan.close();
	}
}

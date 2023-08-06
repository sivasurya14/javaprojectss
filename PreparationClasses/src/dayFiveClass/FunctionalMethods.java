package dayFiveClass;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalMethods {
	public static void main(String[] args) {

		Function<Integer, String> fun = (a) -> "added value is " + (100 + a);
		System.out.println(fun.apply(500));

		Consumer<Integer> con = (b) -> System.out.println(b*10);
		con.accept(10);
		
		Supplier<String> suplier = ()-> "Hello World";

		System.out.println(suplier.get());
		
		Predicate<Integer> pre = (a) -> a % 20 == 0;

		System.out.println(pre.test(200));

	}
}

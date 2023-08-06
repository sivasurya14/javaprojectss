package optionClassExamples;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) throws Exception {

		String str[] = new String[10];

		System.out.println(str[5]);

		Optional<String> checkNullable = Optional.ofNullable(str[5]);
		Optional<String> checkoff = Optional.empty();
		
		System.out.println(checkNullable);
//		System.out.println(checkNullable.get());

		System.out.println();
		
		if (checkNullable.isPresent()) {

			System.out.println("S");

		} else { 
	       
			System.out.println("String contians null value ");

		}
		System.out.println(checkoff.isEmpty());
	   
	   System.out.println(checkNullable.orElse("no value present"));
}
}
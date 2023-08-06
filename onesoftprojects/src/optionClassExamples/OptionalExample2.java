package optionClassExamples;

import java.util.Optional;

public class OptionalExample2 {
	public static void main(String[] args) {
		
		Mobile m1 = new Mobile(1, "samsung", 25000);
		Mobile m2 = new Mobile(2, "vivo", 22000);
		Mobile m3 =  null;
	
		Optional<Mobile> check = Optional.of(m1);
		Optional<Mobile> checkNullable =Optional.ofNullable(m1);
		
		System.out.println("Check isPresent() "+checkNullable.isPresent());
		 
		System.out.println("Check empty()"+ checkNullable.empty());
		  System.out.println("Check isEmpty() : "+checkNullable.isEmpty());
		  System.out.println("Check OrElse()  : "+checkNullable.orElse(m1)); 
		  System.out.println("check Orlse()  : "+checkNullable.orElse(new Mobile(4, "Redmi", 10000)));
		  System.out.println("Check toString()  : "+checkNullable.toString());
		  
		  
	      System.out.println("Check orELseThrow : "+checkNullable.orElseThrow());   
	      System.out.println("Check Get method : "+check.get());
	    //  System.out.println(check);
	}
}
																																														
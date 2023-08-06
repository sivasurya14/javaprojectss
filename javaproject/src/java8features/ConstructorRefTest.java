package java8features;

public class ConstructorRefTest {
	public static void main(String[] args) {
		
		ConstructorRef ref=Message::new;
		
		
		ref.getMessage("constructor reference is tested");
		
		
	}

}

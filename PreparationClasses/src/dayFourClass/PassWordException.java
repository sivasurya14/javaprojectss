package dayFourClass;

public class PassWordException extends Exception{

	public PassWordException(String message) {
		super(message);
			
	}
	@Override
	 public void printStackTrace() {		 
		System.out.println(" Exceptio From Overrided PrintStackTrace: password must Contain more than 8 Character: ");
	 }
	
}

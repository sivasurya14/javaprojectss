package dayFourClass;

public class Login {
	
	public void login(String password) {
		try {
		if(password.length()>8) {		
			System.out.println("Sucessfully loged in..");
		}else {			
			throw new PassWordException("Must contain more than 8 character : ");
		}
		}catch(PassWordException e) {
			//System.out.println("");
			e.printStackTrace();
			//System.out.println(e);
			
		}	
		
		System.out.println("Next Line is Printing....");
		
	}

}

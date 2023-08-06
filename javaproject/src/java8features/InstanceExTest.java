package java8features;

public class InstanceExTest {
	void display() {
		
	System.out.println("this is instance method example");
	}
	
	
	public static void main(String[] args) {
		
	InstanceExTest test=new InstanceExTest();
	
     InstanceEx test1=test::display;
     
     test1.show();
     
     InstanceEx test2=new InstanceExTest()::display;
     
     test2.show();
		
		
	}

}

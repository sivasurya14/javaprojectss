package dayOne.Static_Final;

public class SampleThreadExample extends Thread {
	
	@Override	
	public void run() {		
		System.out.println("run method invoked...");
	}
	    public static void main(String[] args) {	
	    SampleThreadExample thread = new SampleThreadExample();
    	thread.start();
		
		
		
	}
}

package dayOne.Static_Final;

public class SampleThread2Ex implements Runnable {

	@Override
	public void run() {
		synchronized (SampleThread2Ex.class) {
			System.out.println(" Thread is running...");
			try { 
				
				SampleThread2Ex.class.wait(5000);
				System.out.println(" Hello..");
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		SampleThread2Ex s = new SampleThread2Ex();
		Thread t = new Thread(s);
		t.start();
		Thread.sleep(2000);
		synchronized (t) {
			t.notify();
		}
		System.out.println(" HI..");

	}

}

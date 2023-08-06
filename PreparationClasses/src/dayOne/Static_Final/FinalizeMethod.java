package dayOne.Static_Final;

public class FinalizeMethod {

	@Override

	public void finalize() {
		System.out.println("Collected");
	}

	public static void main(String[] args) {

		FinalizeMethod s1 = new FinalizeMethod();
           s1= new FinalizeMethod();
		//System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());
		System.gc();

	}
}

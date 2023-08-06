package staticuseEx;

public class FInalizeMethodEx {
	@Override
	public void finalize() {
		System.out.println("collected");
	}

	public static void main(String[] args) {
		FInalizeMethodEx f1 = new FInalizeMethodEx();
		System.out.println(f1.hashCode());
		f1 = new FInalizeMethodEx();
		System.out.println(f1.hashCode());
		System.gc();
	}
}

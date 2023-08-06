package testprogramss;

public class StringExample2 {
	public static void main(String[] args) {
		String a = new String("siva");
		String b = new String("siva");
		StringExample t = new StringExample();
		StringExample2 t1 = new StringExample2();
		System.out.println(t.hashCode() + " " + t1.hashCode());
		int aa = a.hashCode();
		int bb = b.hashCode();
		System.out.println(aa + " " + bb);
		
	}
}

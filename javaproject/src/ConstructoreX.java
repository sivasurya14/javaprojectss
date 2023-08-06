
public class ConstructoreX {
	private int a=1;
	private int b=2;
	public ConstructoreX() {
	}
	public ConstructoreX(int a, int b) {
		this.a = a;
		this.b = b;
	}
	void add() {
		int c = a + b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		ConstructoreX v = new ConstructoreX(10, 20);
		ConstructoreX s = new ConstructoreX();
		v.a = 50;
		v.b = 70;
		s.b = 200;
		s.a = 100;
		v.add();
		s.add();

	}
}

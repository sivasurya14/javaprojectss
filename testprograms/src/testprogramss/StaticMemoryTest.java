package testprogramss;

public class StaticMemoryTest {
	int a = 10;
	static int b = 10;
	void display() {
		int c = 10;
		a++;
		b++;
		c++;
		System.out.println(c);
	}
	public static void main(String[] args) {
		StaticMemoryTest x = new StaticMemoryTest();
		StaticMemoryTest x1 = new StaticMemoryTest();
		StaticMemoryTest x2 = new StaticMemoryTest();
		x.display();
		x.display();
		System.out.println(x.a + " " + b);
		x1.display();
		x1.display();
		System.out.println(x1.a + "" + b);
		x2.display();
		x2.display();
		System.out.println(x2.a + " " + b);
	}
}
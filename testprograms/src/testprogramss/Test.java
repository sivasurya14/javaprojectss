package testprogramss;

public class Test {

	static int m1;
	static int m2;
	static int m3;

	public static void main(String[] args) {

		Test t = new Test();
		t.setMarks(70, 40, 50);

		t.showMarks();

		int tt = getTotal(m1,m2,m3);
		
		System.out.println("totals of marks is :"+tt);

	}

	public void setMarks(int a, int b, int c) {

		m1 = a;
		m2 = b;
		m3 = c;

	}

	public void showMarks() {

		System.out.println(m1 + " " + m2 + " " + m3);

	}

	static public int getTotal(int m1, int m2, int m3) {

		return m1 + m2 + m3;
	}
}

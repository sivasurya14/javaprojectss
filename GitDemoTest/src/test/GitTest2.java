package test;

public class GitTest2 {

	int add(int a, int b) {

		return a + b;
	}

	int muti(int a, int b) {
		return a * b;
	}
	public static void main(String[] args) {
		GitTest2 d = new GitTest2();
		System.out.println(d.add(10, 2));
		System.out.println(d.muti(10, 20));
	}
}

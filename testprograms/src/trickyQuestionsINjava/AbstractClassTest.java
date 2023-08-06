package trickyQuestionsINjava;

public class AbstractClassTest extends AbstractExample {
	void show() {
		System.out.println("implented by normal class ");
	}

	void display() {
		System.out.println("it is overided");
	}
	public static void main(String[] args) {
		AbstractClassTest test = new AbstractClassTest();
		test.show();
		test.display();
		test.intermethod();
	}
}

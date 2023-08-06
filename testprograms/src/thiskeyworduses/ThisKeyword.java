package thiskeyworduses;

public class ThisKeyword {

	void display() {

		System.out.println("this is class level method");
	}

	void show() {
		
		System.out.println("this is another methos");
		// this keyword used to invoke the current class method 
		this.display();

	}

	public static void main(String[] args) {
		ThisKeyword n = new ThisKeyword();
		n.show();
	}
}

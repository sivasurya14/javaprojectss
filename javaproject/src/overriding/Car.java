package overriding;

class Car extends Bike {

	static int  display(int a , int b) {
		//super.display();
		
		return a+b;

	}

	public static void main(String[] args) {
		Car g = new Car();
		System.out.println(display(2,3));
		

	}
}

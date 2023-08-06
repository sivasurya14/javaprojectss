package colectionTestExample;

public class Fuction1 extends MehtodOverRiding  {
	
	
	void add( int a , int b) {
		System.out.println("add method from function");
		
		int c = a*b;
		System.out.println(c);
		super.add(2, 2);
		
	}

	public static void main(String[] args) {
		
		Fuction1 c = new Fuction1();
		c.add(2, 4);
		//c.add(2, 3);
		
		
		
	}
}

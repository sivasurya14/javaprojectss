package staticuseEx;

public class UseFinally {

	public static void main(String[] args) {

	try {	int[] a = { 1, 2, 3, 4 };

		System.out.println(a[6]);
	}
	finally {
		System.out.println("this code will execute...");
	}
	
	}

}

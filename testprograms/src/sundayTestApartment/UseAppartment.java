package sundayTestApartment;

public class UseAppartment {
	public static void main(String[] args) {
		Playground c = new Playground(2, 4, false);
		Playground c1 = new Playground(2, 4, false);
		Playground c2 = new Playground(2, 4, false);
		Floors f1 = new Floors(1, "3bhk", "blue");
		Floors f2 = new Floors(2, "2bhk", "red");
		Floors f3 = new Floors(3, "1bhk", "white");
		SuperMarket s = new SuperMarket(201, "natchithra apt", false, false);
		SuperMarket s1 = new SuperMarket(101, "natchithhra apt", true, false);
		SuperMarket s2 = new SuperMarket(101, "natchitra", true, false);
		SuperMarket[] superm = new SuperMarket[3];
		superm[0] = s;
		superm[1] = s1;
		superm[2] = s2;
		Floors floors[] = new Floors[3];
		floors[0] = f1;
		floors[1] = f2;
		floors[2] = f3;
		Floors f4 = new Floors();
String get = f4.getFloor();
		// System.out.println(get);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);

	}

}

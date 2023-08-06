package dayOne.Static_Final;

public class StringBuilderExample {
	public static void main(String[] args) {

		StringBuilder name1 = new StringBuilder("siva");
		StringBuilder name2 = new StringBuilder("siva");
		StringBuilder name3 = new StringBuilder("siva");

		System.out.println(name1 + " " + name1.hashCode());
		name1.append("suriyan");
		System.out.println(name1 + " " + name1.hashCode());
		System.out.println(name2 + " " + name2.hashCode());
		System.out.println(name3 + " " + name3.hashCode());

//	name1.delete(2, 4);
//	System.out.println(name1+" "+name1.hashCode());
//    name1.replace(3, 5, "d");
//    System.out.println(name1);
	}
}

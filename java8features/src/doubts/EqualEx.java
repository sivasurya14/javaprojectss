package doubts;

public class EqualEx {
	public static void main(String[] args) {
		int i = 10;
		int j = i;
		String name = "siva";
		String name1 = "siva";
		String name3 = new String("siva");
		System.out.println(name1 == name3);
        System.out.println(name1.equals(name3));
		System.out.println(name == name1);
		System.out.println(j);

	}

}

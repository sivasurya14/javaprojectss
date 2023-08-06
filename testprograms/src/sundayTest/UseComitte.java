package sundayTest;

public class UseComitte {
	public static void main(String[] args) {

		Address a = new Address(23, "sr street", "chennai", 600007);
		Address a1 = new Address(22, "sd street", "thiruvannamalai", 600043);
		Address a2 = new Address(21, "sa street", "chennai", 600043);
		Member m1 = new Member(2, "sury", false);
		Member m2 = new Member(2, "Ezhil", false);
		Member m3 = new Member(2, "dhinesh", false);
		Member[] member = new Member[3];
		member[0] = m1;
		member[0] = m2;
		member[0] = m3;
		Address c = new Address();
		String city = c.getCity();
		System.out.println(city);
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
	}
}

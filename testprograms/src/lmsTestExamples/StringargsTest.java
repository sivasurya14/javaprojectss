package lmsTestExamples;

public class StringargsTest {

	public static void main(String[] args) {

		String sd = args[0];

		String[] val = args[0].split(",");

		int id = Integer.parseInt(val[0]);
		String name = val[1];
		String city = val[2];

		System.out.println(id + " " + name + " " + city);

	}
}

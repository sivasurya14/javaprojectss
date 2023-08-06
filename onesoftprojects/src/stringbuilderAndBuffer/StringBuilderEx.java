package stringbuilderAndBuffer;

public class StringBuilderEx {
	public static void main(String[] args) {
		StringBuilder name = new StringBuilder("davithaguru");

		String name1 = "guru";
	//	String name2 = "guru";
		System.out.println(name1 + " " + name1.hashCode());
	      name1 =name1.concat("baran");
		System.out.println(name1 + " " + name1.hashCode());
		
		//Using String Buffer 
		StringBuffer name3 = new StringBuffer("guru");
		System.out.println(name3 + " " + name3.hashCode());
		StringBuffer name4 = name3.append("baran");
		System.out.println(name4 + " " + name4.hashCode());
		
		
		System.out.println(name3 + " "+name3.hashCode());
		// System.out.println(name.append("suriya"));

	}

}

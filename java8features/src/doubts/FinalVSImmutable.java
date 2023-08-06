package doubts;

public class FinalVSImmutable {

	static String name0 ="siva";
	
	public static void main(String[] args) {
		String name0 = "guru";
		String name1 = "siva";
		String name2 = "siva";
		String name1Concat = name1.concat("surya");
		String name3 = new String("siva");
		//StringBuilder name4 = new StringBuilder("siva");
	
		System.out.println("Name0 Hashcode" + name0.hashCode());
		System.out.println("Name1 Hashcode " + name1.hashCode());
		System.out.println("Name2 Hashcode " + name2.hashCode());
		System.out.println("Hashcode for name2 after assign new value" + name2.hashCode());
		System.out.println("Name3 Hashcode " + name3.hashCode());
		//System.out.println("Name4 Hashcode " + name4.hashCode());
		//name4.append("surya");
		//System.out.println("Name4 Hashcode after appending " + name4.hashCode());

		System.out.println("Name1concat Hashcode " + name1Concat.hashCode());
		 StringBuffer sb = new StringBuffer("Hello");
		// Even though reference variable sb is final
		// We can perform any changes
		sb.append("GFG");
       
        
		System.out.println(sb);

		// Here we will get Compile time error
		// Because reassignment is not possible for final variable
		// sb = new StringBuffer("Hello World");
  
		System.out.println(sb);
		System.out.println(name1==name2);

		if (name1 == name2) {
			System.out.println("name1 and name2 are present in same memory location");
		} else
			System.out.println("name1 and name2 are present in different memory location");
		
	}
}

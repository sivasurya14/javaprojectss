package stringbuilderAndBuffer;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuilder name = new StringBuilder("Sivasuriyan");
	
		System.out.println(name.reverse());
		System.out.println(name.replace(0, 04, "x"));
        System.out.println(name);		
	}

}

package day4Program;

public class FindPrefix {
	public static void main(String[] args) {

		String name[] = { "ram", "ramcharan", "ramvishnu", "ramvilash" };

		String val1 = null, val2 = null, prefix = "";
		for (int i = 0; i < 2; i++) {
			val1 = name[i];
			val2 = name[i + 1];
		}
		int a=0;
		for (int i = 0; a==0 && i < val1.length(); i++) {			
			for (int j =i; j < val2.length(); j++) {
				if (val1.charAt(i) == val2.charAt(j)) {
					prefix = prefix + val1.charAt(i);
					  break;
				}else {
					a=1;
					break;
				
				}
			}
		}
		System.out.println("Prefix of the String is : "+prefix);
	}
}
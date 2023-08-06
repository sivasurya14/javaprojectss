package stringreverseEx;

public class StringReversEx {

	public static void main(String[] args) {
		String name = "sivasuriyan";
		for (int i = name.length() - 1; i >= 0; i--) {
			 String namereverse = ""+name.charAt(i);	
		}
		//System.out.println(namereverse);
	}
}

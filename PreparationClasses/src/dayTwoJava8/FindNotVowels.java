package dayTwoJava8;

public class FindNotVowels {

	
	public static void main(String[] args) {
		
		String val[]= {"sun", "moon","siva","ball"};
		
		FindVowels s = (values)->{
			for(int i=0; i<=values.length-1;i++) {	
				
				if(values[i].contains("a")||values[i].contains("e")||values[i].contains("i")||values[i].contains("o")||values[i].contains("u")) {										
					continue;
				}
				else {					
					System.out.println(values[i]);
				}
					
			}
				
		};
		
		s.findNoVowels(val);
	}
	
	
}
	
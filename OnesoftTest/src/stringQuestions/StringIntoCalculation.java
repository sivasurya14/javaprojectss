package stringQuestions;

public class StringIntoCalculation {
	
	public static void main(String[] args) {
		
		String value ="2-1";
		int sub =0;
		int add=0;
		int temp=0;
		for(int i =0; i<value.length()-1; i++) {
			for(int j=i+1; j<value.length()-1; j++) {
				char ch =value.charAt(i);
				char ch1=value.charAt(j);
			//	char ch2=value.charAt(j)+1;
				if(ch1=='-') { 	
					System.out.println(ch+"printing...");
					sub=ch-value.charAt(++j);
				System.out.println(sub);
				}
				if(ch1=='+') {
					
					add =ch+ch1++;
				System.out.println(add);
			}
			
			
			}	
		}
		//System.out.println();
	}

}

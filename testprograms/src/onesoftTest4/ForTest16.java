package onesoftTest4;

public class ForTest16 {
		public static void main(String[] args) {
			String str = "i like to sing song and dance";
			int count=0;
			for(int i = 0 ; i <str.length(); i++) {
			 char ch = str.charAt(i);	
			 	if(ch==' ')
			 		count++;
			}
			System.out.println(count);
}
}

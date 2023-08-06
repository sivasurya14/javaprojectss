
public class OverLoding {
	
	int sum (int a ,int b) {
		return a+b;
	}
		
		int sum( int a, int b, int c) {
			
			return a+b+c;
			
		}
	 public static void main (String[]args) {
		 
		OverLoding ov= new OverLoding();
		System.out.println("the sum of the two number is : "+ov.sum(2,3));
			System.out.println(" the sum of the three is : "+ ov.sum(1,2,2));
		
	 
		
	}

}

package dayOne.Static_Final;

public class SampleStatic {
	
	public static void main(String[] args) {
		
		SampleStatic s1= new SampleStatic();
		SampleStatic s2 = new SampleStatic();
		SampleStatic s3= new SampleStatic();
				
	}
	
	    static int a=0;
		public SampleStatic() {
			
		a++;	
		System.out.println(a);	
			
		}
		static {
			System.out.println("this is static block...");
		}
		
	}



package MyApplication;

public class IfConditions {
	public static void main(String[] args) {

		int a = 10, b = 2, c = 30, d = 40;

		if (a > b && a > c && a > d)

			System.out.println("a is bigger");
		else
			System.out.println("  a is not bigger ");
                int count=0;
                for(int i =0;i<21; i++) {
                	if(i%5==0) {
                	continue;
                	}
                	count++; 
                	System.out.println(i);	
                }
                    System.out.println("total iteration is "+count);
	
	
	}	

}

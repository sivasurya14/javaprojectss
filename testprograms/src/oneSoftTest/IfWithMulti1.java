package oneSoftTest;

public class IfWithMulti1 {
	public static void main(String[] args) {
		int age=50;
		
		if(age<13)
			System.out.println("Kid");
		if(age<=20&&age>=13)
			System.out.println("Teenage");
		if(age>20&&age<=50)
			System.out.println("Adult");
		if(age>50)
			System.out.println("Old Age");
		
		
		
	}

}

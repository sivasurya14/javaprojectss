package variables;

public class StaticExample {
		 static int a=144;  
		   static int b=205;
		 static  void display() {   
			   System.out.println(a+b);
		   }
		public static void main(String args[]){  
			//StaticExample ss=new StaticExample();			
			String a="apple";
			String b="apple";
			String c = new String ("apple");
			boolean s=a.equals(c);
			if(a==c)
				System.out.println("true");
			else 
				System.out.println("false");
			System.out.println(s);
		display();  
		//System.out.println(b);  
		}}
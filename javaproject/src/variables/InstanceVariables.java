package variables;

public class InstanceVariables {
	int a=10;  
	int b=20;
	int c =a+b;
	public static void main(String []args) {
	  InstanceVariables ds=new  InstanceVariables();
	  String sd="siva";
	  String ss="siva";
	  String s1 = new String ("siva");
    System.out.println(sd.hashCode());
    System.out.println(ss.hashCode());
    System.out.println(s1.hashCode());
	System.out.println(ds.a);  
	System.out.println(ds.b);
	System.out.println(ds.c);
	
	}}  

	


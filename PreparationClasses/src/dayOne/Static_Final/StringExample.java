package dayOne.Static_Final;

public class StringExample {
	public static void main(String[] args) {
		String name="siva";	
		String name1="siva";
		String name2="siva";
		System.out.println(name+" "+name.hashCode());
		System.out.println(name1+" "+name1.hashCode());
		System.out.println(name2+" "+name2.hashCode());
		
		    name=name.concat("suriyan");
		    	   System.out.println(name+" "+name.hashCode());
		       
		    	   System.out.println(name1+" "+name1.hashCode());
		   		System.out.println(name2+" "+name2.hashCode());		
		   
	}

}

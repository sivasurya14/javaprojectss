package oneSoftTest;

public class IfWithMulti2 {
	public static void main(String[] args) {
		int ramesh=20;
		int suresh=25;
		int rajesh=14;
		
		if(ramesh<suresh&ramesh<rajesh)
			System.out.println("Ramesh is Younger");
		if(suresh<ramesh&&suresh<rajesh)
			System.out.println("Suresh is younger");
		if(rajesh<ramesh&&rajesh<suresh)
			System.out.println("Rajesh is younger");
		
		
		
		
	}

}

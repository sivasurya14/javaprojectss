package encapsulation;

public class TestExample1 {

	public static void main(String []args) {
		
		Example1 sg = new Example1 ();

		sg.setId(-1);
		sg.setName("siva");
		sg.setState("tamilnadu");
		sg.setCity("thiruvannamalai");
		System.out.println(sg.getId());
		System.out.println(sg.getName());
		System.out.println(sg.getCity());
	    System.out.println(sg.getState());	
	}
}

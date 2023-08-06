package encapsulation;

public class Example1 {
	
	int id;
	String name;
	String city;
	String state;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		
		if(id>0)
//			System.out.println(" warn : id should be greater than 0 :");    
			this.id=id;	
			}
	public String getName() {
		return name;
	}
	public void setName(String name) {
	   this.name=name;
		
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String getState() {
		return state;}
	
		
		public void setState(String state) {
			
			this.state=state;
			
		}
		
		
		
}
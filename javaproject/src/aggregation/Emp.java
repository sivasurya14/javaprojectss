package aggregation;

public class Emp {
	int i;
	int id;
	String name;
	Address address;

	public Emp(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;

	}

	void display() {
		System.out.println("id is  :" + id + "   " + "name is :" + name);
		System.out.println("door no " + address.doorno + " , " + "city: " + address.city + " , " + " state: "
				+ address.state + " ," + "country : " + address.country);

	}

	static public void main(String[] args) {
		Address address1 = new Address(12, "thiruvannamalai", "tamilnadu", "india");
		Address address2 = new Address(23, "villupuram", "tamilnadu", "india");
		Address address3 = new Address(21, "chennai", "tamilnadu", "india");
		Address address4 = new Address(24, "kadalore", "tamilnadu", "india");
		Emp d = new Emp(1, "siva", address1);
		Emp s = new Emp(2, "suresh", address2);
		Emp a = new Emp(3, "Anu", address3);
		Emp e = new Emp(4, "guru", address3);
		d.display();
		s.display();
		a.display();
		e.display();
	}
}

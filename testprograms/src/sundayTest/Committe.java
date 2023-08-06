package sundayTest;

public class Committe {
	int id;
	String name;
	String chairmen;
	Address address;

	Member[] member;

	public Committe(int id, String name, Address address, Member[] member) {
		this.id = id;
		this.name = name;
		this.address = address;
	}	
}
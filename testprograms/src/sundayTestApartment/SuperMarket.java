package sundayTestApartment;

public class SuperMarket {
	int no;
	String address;
	boolean groceries;
	boolean applicences;
	public SuperMarket(int no, String address, boolean groceries, boolean applicences) {
		this.no = no;
		this.address = address;
		this.groceries = groceries;
		this.applicences = applicences;
	}
	@Override
	public String toString() {
		return "SuperMarket [no=" + no + ", address=" + address + ", groceries=" + groceries + ", applicences="
				+ applicences + "]";
	}

	
}

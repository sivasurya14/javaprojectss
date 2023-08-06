package Medicine;

public class Brands {
	String brandname;
	String mg;
	int price;
	String mol;

	public Brands(String brandname, String mg, int price, String mol) {
		super();
		this.brandname = brandname;
		this.mg = mg;
		this.price = price;
		this.mol = mol;
	}

	@Override
	public String toString() {
		return "Brands [brandname=" + brandname + ", mg=" + mg + ", price=" + price + ", mol=" + mol + "]";
	}
}

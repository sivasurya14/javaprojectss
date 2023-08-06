package sundayTest;

public class Address {
	int doorno;
	String street;
	String city;
	int pincode;

	Address(int doorno, String street, String city, int pincode) {

		this.doorno = doorno;
		this.street = street;
		this.city = city;
		this.pincode = this.pincode;

	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public String getCity() {
		if (this.pincode / 1000000 == 6) {

			return "tamilnadu";
		} else if (pincode / 100000 == 4) {

			return "maharashtra";
		}
		return "other state";

	}

	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}

}

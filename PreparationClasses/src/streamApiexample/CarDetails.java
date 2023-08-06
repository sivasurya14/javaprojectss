package streamApiexample;

public class CarDetails {

	int id;
	String brand;
	int price;
	
	
	
	
	public CarDetails(int id, String brand,int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CarDetails [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}

	
	
}

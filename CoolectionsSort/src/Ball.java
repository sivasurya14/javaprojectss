
public class Ball implements Comparable<Ball> {
	
	int price;
	String colour;
	String brand;
	
	public Ball (int price, String colour,String brand) {
		
		this.price=price;
		this.brand=brand;
		this.colour=colour;
		
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Ball [price=" + price + ", colour=" + colour + ", brand=" + brand + "]";
	}

	
}

package ComparableTest;

public class Mobile implements Comparable<Mobile> {
	private Integer price;
	private String model;
	private String colour;

	public Mobile(Integer price, String model, String colour) {
		this.price = price;
		this.model = model;
		this.colour = colour;

	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public String toString() {
//
//		return " Mobile price " + price + " Mobile model " + model + " mobile colur " + colour;
//
//	}
//	@Override
//	public int compareTo(Mobile s) {
//		return this.price.hashCode() - s.price.hashCode();
//	}

}

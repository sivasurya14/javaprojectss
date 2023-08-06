package sundayTestApartment;

public class Floors {
	int floorno;
	String floortype;
	String floorcolour;

	public Floors(int floorno, String floortype, String floorcolour) {
		this.floorno = floorno;
		this.floortype = floortype;
		this.floorcolour = floorcolour;
	}

	public Floors() {

	}

	@Override
	public String toString() {
		return "Floors [floorno=" + floorno + ", floortype=" + floortype + ", floorcolour=" + floorcolour + "]";
	}

	String getFloor() {

		try {if (this.floortype.equals("3bhk"))
			return "available";}
		
		catch (Exception e) {System.out.println(e);}
			return "not avilable";

	}

}

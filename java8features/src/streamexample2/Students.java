package streamexample2;

public class Students {
	int id;
	String name;
	String gender;
	String degeree;
    int percent;
    String city ;
	public Students(int id, String name, String gender, String degeree, int percent, String city) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.degeree = degeree;
		this.percent = percent;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDegeree() {
		return degeree;
	}
	public void setDegeree(String degeree) {
		this.degeree = degeree;
	}
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
		
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", gender=" + gender + ", degeree=" + degeree + ", percent="
				+ percent + ", city=" + city + "]";
	}
}

	
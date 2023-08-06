package MapExample;

public class Emp {

	private int id;
	private String name;
	private String depart;

	public int getId() {
		return id;
	}

	public void setId(int i) {
		this.id = id;

	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;

	}
public Emp(int id,String name ,String depart) {
	this.id=id;
	this.name=name;
	this.depart=depart;
}

@Override
public String toString() {
	return "Emp | emp id=" + id + ", emp  name=" + name + ", emp  depart=" + depart + "|";
}

}

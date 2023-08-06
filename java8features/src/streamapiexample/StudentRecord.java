package streamapiexample;

public class StudentRecord {
	private  int id;
    private String name;
    private	String degree;
	private int percentage;
	public StudentRecord(int id, String name, String degree, int percentage) {
		super();
		this.id = id;
		this.name = name;
		this.degree = degree;
		this.percentage = percentage;
			
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
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "StudentRecord [id=" + id + ", name=" + name + ", degree=" + degree + ", percentage=" + percentage + "]";
	}
}

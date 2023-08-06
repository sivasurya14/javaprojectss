package collectioncoversion;

public class StudentEntity {
	int id ;
	String name ;
	String dep ;
	String college ;
	int percentage ;
	public StudentEntity(int id, String name, String dep, String college, int percentage) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.college = college;
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
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student Details [id=" + id + ", name=" + name + ", dep=" + dep + ", college=" + college + ", percentage="
				+ percentage + "]";
	}
	

}

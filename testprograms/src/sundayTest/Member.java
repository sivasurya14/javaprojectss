package sundayTest;

public class Member {

	int id;
	String name;
	Boolean gender;

	Member(int id, String name, boolean gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
}

package day3class;

import java.util.Objects;

public class Student {

	int id;
	String name;
	int rollno;
	int age;

	public Student() {

	}
	public Student(int id, String name, int rollno, int age) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.age = age;
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

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
	}	

}

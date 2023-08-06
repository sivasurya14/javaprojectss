package com.collectiontest;

import java.util.ArrayList;

public class Student {
	int id;
	String name ;
	String dept;
	int year;
	String college;
	//ArrayList<Integer> mark = new ArrayList<>();
	public Student(int id, String name, String dept, int year, String college, ArrayList<Integer> mark) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.year = year;
		this.college = college;
		//this.mark = mark;
	}
	public Student() {
		// TODO Auto-generated constructor stub
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	//}
	//public ArrayList<Integer> getMark() {
		//return mark;
//	}
	//public void setMark(ArrayList<Integer> mark) {
		//this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", year=" + year + ", college=" + college
				+ "]";
	}	
}

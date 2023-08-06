package javaStreamExamples;

import java.util.*;

public class Product {

	int id;
	String name;
	float pricee;

	public Product(int id, String name, float pricee) {

		this.id = id;

		this.name = name;
		this.pricee = pricee;

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

	public float getPricee() {
		return pricee;
	}

	public void setPricee(float pricee) {
		this.pricee = pricee;
	}

}

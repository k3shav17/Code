package com.tejas;

public class Employee {

	private int id;
	private String name;

	public Employee() {

	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Name: " + name + " Id: " + id;
	}
}

package com.damladincer.practice3;

public class Person {
	private String name;
	private String address;

	// Constructor
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	// Getters & Setters
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person[name= " + this.name + ",address= " + this.address + "]";
	}

}

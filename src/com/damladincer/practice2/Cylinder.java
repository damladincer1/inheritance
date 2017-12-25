package com.damladincer.practice2;

public class Cylinder extends Circle {

	private double height;

	// Constructors
	public Cylinder() {
		super();
		this.height = 1.0;
	}

	public Cylinder(double radius) {
		super(radius);
		this.height = 1.0;
	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}

	// Getters & Setters
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// Methods
	public double getVolume() {
		return super.getArea() * this.height;
	}

	@Override
	public double getArea() {
		return 2 * super.getArea() + 2 * Math.PI * this.getRadius() * this.height;
	}
	
	@Override
	public String toString() {
		return "Cylinder: subclass of " + super.toString() + ", height:" + this.height;
	}
}
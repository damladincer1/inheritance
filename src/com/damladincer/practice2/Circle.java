package com.damladincer.practice2;

public class Circle {

	private double radius;
	private String color;

	// constructors
	public Circle() {
		this.radius = 1.0;
		this.color = "red";
	}

	public Circle(double radius) {
		this.radius = radius;
		this.color = "red";
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	// getter & setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Methods
	public double getCircumference() {
		return 2 * Math.PI * this.radius;
	}
	
	public double getArea() {
		return Math.pow(getRadius(), 2) * Math.PI;
	}
	
	@Override
	public String toString() {
		return "Circle[radius=" + getRadius() + ",color=" + getColor() + "]";
	}
}
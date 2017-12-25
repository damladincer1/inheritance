package com.damladincer.practice2;

public class Circle extends Shape {

	private double radius;

	// constructors
	public Circle() {
		super();
		this.radius = 1.0;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(double radius, String color) {
		super(color, false);
		this.radius = radius;
	}
	
	public Circle(double radius,String color, boolean isDrawn) {
		super(color,isDrawn);
		this.radius=radius;
	}

	// getter & setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Methods
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	@Override
	public double getArea() {
		return Math.pow(getRadius(), 2) * Math.PI;
	}
	
	@Override
	public String toString() {
		return "Circle[radius=" + this.radius + ",color=" + super.getColor() + "]";
	}
}
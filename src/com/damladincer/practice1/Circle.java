package com.damladincer.practice1;

public class Circle {

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double circleArea() {
		return Math.pow(this.radius, 2) * Math.PI;
	}

	public double circumference() {
		return 2 * Math.PI * this.radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
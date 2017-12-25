package com.damladincer.practice2;

public abstract class Shape {
	
	private String color;
	private boolean isDrawn;

	public Shape() {
		this.color = "red";
		this.isDrawn = false;
	}
	
	public Shape(String color, boolean isDrawn) {
		this.color = color;
		this.isDrawn = isDrawn;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isDrawn() {
		return isDrawn;
	}

	public void setDrawn(boolean isDrawn) {
		this.isDrawn = isDrawn;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
}
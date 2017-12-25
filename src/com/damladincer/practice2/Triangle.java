package com.damladincer.practice2;

public class Triangle extends Shape {
	
	private double x;
	private double y;
	private double z;
	
	public Triangle(double x, double y, double z) throws TriangleIsNotValidException {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		validate();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	public void validate() throws TriangleIsNotValidException {
		if (!(this.x + this.y > this.z && this.y + this.z > this.x && this.z + this.x > this.y)) {
			throw new TriangleIsNotValidException();
		}
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
}
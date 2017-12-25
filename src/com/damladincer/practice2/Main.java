package com.damladincer.practice2;

import com.damladincer.practice1.NumberFormatter;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("The circle area : " + NumberFormatter.format(circle.getArea(), 2));
		System.out.println(circle.toString());
		
		Cylinder cylinder = new Cylinder();
		System.out.println(cylinder.toString());
		System.out.println("The Cylinder area is: " + NumberFormatter.format(cylinder.getArea(), 2));
		System.out.println("The volume is: " +NumberFormatter.format(cylinder.getVolume(), 2));
		
		Square square = new Square(5);
		System.out.println("The area of square: " +square.getArea());
		System.out.println("The perimeter of square " + square.getPerimeter());
		
		Rectangle rectangle = new Rectangle(12, 25);
		System.out.println("The area of rectangle: " +rectangle.getArea());
		System.out.println("The perimeter of rectangle " + rectangle.getPerimeter());
		
		try {
			Triangle triangle = new Triangle(3, 4, 5);
		} catch (TriangleIsNotValidException e) {
			System.out.println("Triangle is not valid");
		}
		
		
		Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
		System.out.println(s1);                    // which version?
		System.out.println(s1.getArea());          // which version?
		System.out.println(s1.getPerimeter());     // which version?
		System.out.println(s1.getColor());
		System.out.println(s1.isDrawn());
//		System.out.println(s1.getRadius());
		   
		Circle c1 = (Circle)s1;                   // Downcast back to Circle
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isDrawn());
		System.out.println(c1.getRadius());
		   
//		Shape s2 = new Shape();
		   
		Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   // Upcast
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
//		System.out.println(s3.getWidth());
		   
		Rectangle r1 = (Rectangle)s3;   // downcast
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getWidth());
		   
		Shape s4 = new Square(6.6);     // Upcast
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());

		  
//		 Take note that we downcast Shape s4 to Rectangle, 
		//  which is a superclass of Square, instead of Square
		Rectangle r2 = (Rectangle)s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		System.out.println(r2.getWidth());
		   
		// Downcast Rectangle r2 to Square
		Square sq1 = (Square)r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getWidth());

	}

}

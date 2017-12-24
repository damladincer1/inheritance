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

	}

}

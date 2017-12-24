package com.damladincer.practice1;


import java.util.Locale;
import java.util.Scanner;

/**
 * Exercise CircleComputation (User Input): Write a program called
 * CircleComputation, which prompts user for a radius (in double) and compute
 * the area and circumference of the circle rounded to 2 decimal places. The
 * output shall look like:
 * 
 * Enter the radius: 1.2 The area is: 4.52 The circumference is: 7.53 Hints: π
 * is kept in a constant called Math.PI.
 * 
 * @author damla
 *
 */
public class CircleCalculation {

	public static void main(String[] args) {
		System.out.println("Please enter the radius");
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.ENGLISH);
		double radius = scan.nextDouble();
		Circle circle = new Circle(radius);
		
		System.out.println("The area is: "+NumberFormatter.format(circle.circleArea(), 2));
		System.out.println("The circumference is: "+NumberFormatter.format(circle.circumference(), 2));
		
		scan.close();
	}
}
package com.damladincer.practice3;

public class Main {

	public static void main(String[] args) {
		Student student = new Student("damla", "onur mahallesi", "comp. eng", 2010, 1.700);
		Staff staff = new Staff("emre", "sarmaşık caddesi", "iyte", 5.500);
		
		System.out.println(student.toString());
		System.out.println(staff.toString());
	}

}

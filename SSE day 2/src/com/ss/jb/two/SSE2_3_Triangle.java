package com.ss.jb.two;

public class SSE2_3_Triangle implements SSE2_3_Shape{
	// Initial values for triangle
	double base = 0.0;
	double height = 0.0;
	double area = 0.0;
	
	public void calculateArea() {
		// Random numbers used to show basic calculation of area
		base = 6.0;
		height = 4.0;
		area = 0.5 * base * height;
	}
	
	// Displays the base, height and area
	public void display() {
		System.out.println("Base of triangle is: " + base + "\nHeight of triangle is: " + height + "\nArea of triangle is: " + area);
	}
	
}

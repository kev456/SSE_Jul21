package com.ss.jb.two;

public class SSE2_3_Rectangle implements SSE2_3_Shape {
	// Initial values for each variable
	double base = 0.0;
	double height = 0.0;
	double area = 0.0;
	
	public void calculateArea() {
		// Random values used to show basic calculation of area
		base = 8.0;
		height = 5.0;
		area = base * height;
	}
	
	// Displays base, height, and area
	public void display() {
		System.out.println("Base of rectangle is: " + base + "\nHeight of rectangle is: " + height + "\nArea of rectangle is: " + area);
	}
	
}

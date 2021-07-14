package com.ss.jb.two;

public class SSE2_3_Circle implements SSE2_3_Shape {
	// Initial values for each variable
	double r = 0.0;
	double pi = 3.14;
	double area = 0.0;
	
	public void calculateArea() {
		// Random number used to show basic calculation of area
		r = 5.0;
		area = pi * r * r;
	}
	
	// Displays radius and area
	public void display() {
		System.out.println("Radius of circle is: " + r + "\nArea of circle is: " + area);
	}
	
}

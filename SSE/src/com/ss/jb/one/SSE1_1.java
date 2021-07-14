package com.ss.jb.one;

public class SSE1_1 {
	public void rightTriangle() {

		// How many rows the triangle has
		int num_row = 5;

		System.out.println("1)");
		
		// For loop to create right triangle made up of *
		for (int i = 1; i <= num_row; ++i) {
			
			// if else statement for making the triangle filled with * and the last row as .
			if (i != num_row) {
				for (int j = 1; j <= i; ++j) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j < 10; j++) {
					System.out.print(".");
				}
			}

			System.out.println();
		}

	}
	
	public void upsideDownRightTriangle() {

		// Number of rows that the triangle has
		int num_row = 5;

		System.out.println("2)");
		
		// For loop to create a descending right triangle
		for (int i = num_row; i >= 1; --i) {
			
			// if else statement for first line to be made up of . while the rest of the triangle is *
			if (i != num_row) {
				for (int j = 1; j <= i; ++j) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j < 10; j++) {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
	
	public void fullTriangle() {

		// How many rows the triangle has
		int num_row = 5;
		
		System.out.println("3)");

		// For loop to create the full triangle
		for (int i = 1; i <= num_row; i++) {
			for (int j = i; j < num_row; j++) {
				System.out.print(" ");
			}
			
			// if else statement to make the full triangle filled with * and last row filled with .
			if (i != num_row) {
				for (int k = 1; k < (i * 2); k++) {
					System.out.print("*");
				}
			} else {
				for (int k = 0; k < (i * 2); k++) {
					System.out.print(".");
				}
			}

			System.out.println();
		}
	}
	
	public void upsideDownFullTriangle() {

		// How many rows the triangle has
		int num_row = 5;

		System.out.println("4)");
		
		// For loop to create the full triangle
		for (int i = num_row; i >= 1; i--) {
			for (int j = num_row; j > i; j--) {
				System.out.print(" ");
			}
			
			// if else statement to make first row filled with . and the rest with *
			if (i != num_row) {
				for (int k = 1; k < (i * 2); k++) {
					System.out.print("*");
				}
			} else {
				for (int k = 0; k < (i * 2); k++) {
					System.out.print(".");
				}
			}

			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		SSE1_1 triangle = new SSE1_1();
		triangle.rightTriangle();
		triangle.upsideDownRightTriangle();
		triangle.fullTriangle();
		triangle.upsideDownFullTriangle();
	}
	
}

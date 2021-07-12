package com.ss.jb.two;

/**
 * @author kevki
 *
 */

// Purpose of this assignment is to have certain shapes inherit methods from parent shape interface class

import java.util.Scanner;

// Interface class to have multiple inheritance
interface SSE2_3_Shape {

	void calculateArea();

	void display();
}

// Main class
public class SSE2_3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Ask user what shape he/she wants to see
		System.out.println("What Shape do you have (triangle, rectangle, circle): ");
		String shape = input.next();

		// if statement for triangle shape
		if (shape.equalsIgnoreCase("triangle")) {
			SSE2_3_Triangle obj = new SSE2_3_Triangle();
			obj.calculateArea();
			obj.display();
		} else {
			// if statement for rectangle shape
			if (shape.equalsIgnoreCase("rectangle")) {
				SSE2_3_Rectangle obj = new SSE2_3_Rectangle();
				obj.calculateArea();
				obj.display();
			}

			else {
				// if statement for circle shape
				if (shape.equalsIgnoreCase("circle")) {
					SSE2_3_Circle obj = new SSE2_3_Circle();
					obj.calculateArea();
					obj.display();
				}

				// else statement if wrong shape is listed
				else {
					System.out.println("Wrong shape entered");
				}
			}

		}
	}
}

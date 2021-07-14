package com.ss.jb.two;

// @author kevki

import java.util.Scanner;

// Purpose of this assignment is to collect data from user and find the max and position

public class SSE2_2 {

	// Method to finding the max number in the 2D array provided
	public static double getMaxNumber(double[][] array) {
		double max = 0.0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
		}
		return max;
	}

	// Method for getting the position of the max number in the 2D array
	public static void getPosition(double[][] array, double max) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == max) {
					a = i;
					b = j;
				}
			}
		}
		System.out.println("Position of max number is: " + a + ", " + b);
	}

	public static void main(String[] args) {

		Scanner val = new Scanner(System.in);
		double maximum_Num = 0.0;

		// Asks user how many rows of data he/she has
		System.out.println("How many 2D arrays do you have: ");
		int dim = val.nextInt();

		// Creates a 2D array with correct dimensions
		double[][] twoD_array = new double[dim][2];

		// Asks user to input the values of each row until dimension is filled
		System.out.println("Enter the numbers for 2D array in groups of two separated with a space and new line: ");

		for (int row = 0; row < dim; row++) {
			for (int col = 0; col < 2; col++) {
				twoD_array[row][col] = val.nextDouble();
			}
		}
		
		// Gets the max number from the 2D array and prints it out
		maximum_Num = getMaxNumber(twoD_array);
		System.out.println("The maximum number in the array is: " + maximum_Num);
		
		// Gets the position of the max number and prints it out
		getPosition(twoD_array, maximum_Num);
	}

}

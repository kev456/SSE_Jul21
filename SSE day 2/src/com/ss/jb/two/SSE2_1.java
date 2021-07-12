package com.ss.jb.two;

import java.util.Scanner;

// Purpose of this assignment is to add up all the values the user inputs

public class SSE2_1 {

	public static void main (String [] args) {
		
		float num = 0;
		Scanner need_num = new Scanner (System.in);
		
		System.out.println("How many numbers do you want to add: ");
		int val = need_num.nextInt();
		
		for (int i = 0; i < val; i++) {
			System.out.println("Enter number " + (i + 1) + ": ");
			float add = need_num.nextFloat();
			num += add;
		}
		
		System.out.println("The value of adding all your numbers up is: " + num);
		
	}
}

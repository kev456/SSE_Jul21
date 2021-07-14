package com.ss.jb.one;

import java.util.Scanner;

public class SSE1_2 {

	public static void main (String []args) {
		
		// Variables to keep track of how many times user guess and what the guessing number is
		int count = 0;
		int x = (int)(Math.random() * 100);
		
		// Scanner to take user input
		Scanner input = new Scanner(System.in);
		
		// do while loop to continue guessing till user gets the right answer
		do {
		System.out.println("Guess a number between 1-100:");
		int y = input.nextInt();
		count++;
		
		// if else statement to find out if the user is within 10 of the correct answer
		if (y <= x + 10 && y >= x - 10){
			System.out.println("You got within 10 of the correct answer! The answer is: " + x);
			break;
		}
		else {
			System.out.println("Wrong. Guess again.");
		}
		
		// if statement for when user guesses wrong 5 times
		if (count == 5) {
			System.out.println("Sorry. The correct answer is " + x);
		}
		
		} while (count < 5);
		
		
	}
}

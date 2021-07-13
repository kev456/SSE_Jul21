package com.ss.jb.three;

// imports required for this assignment
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// Purpose of this assignment is to write more words into an existing text file
public class SSE3_2 {

	public static void main(String[] args) {
		
		// Asks user what to put into the text file
		Scanner input = new Scanner(System.in);
		System.out.println("Enter text to append into File: ");
		String words = input.nextLine();
		
		// Try/Catch statement to append user's words into the file
		try (PrintWriter pw= new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\kevki\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE\\SSE Java Day 3\\resources\\text_files\\jb_day3", true)))) {
			
			pw.println(words);
			
			// Tells user that it worked
			System.out.println("Successfully appended into file");
		}
		catch(IOException e){
			System.out.println("IOException: " + e);
		}
	}

}

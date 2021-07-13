package com.ss.jb.three;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Purpose of this assignment is to count how many times a letter or word is shown in the file the user wants 
public class SSE3_3 {

	// Initial variables
	private FileReader file = new FileReader(
			"C:\\Users\\kevki\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE\\SSE Java Day 3\\resources\\text_files\\jb_day3");
	private String find;

	// Constructor
	SSE3_3(FileReader file, String find) throws IOException {
		this.file = file;
		this.find = find;

	}

	// Method to read the file user wants
	private String readFile() throws IOException {
		String lines;

		try (BufferedReader br = new BufferedReader(file)) {
			StringBuilder sb = new StringBuilder();
			String words = br.readLine();

			while (words != null) {
				sb.append(words);
				sb.append(System.lineSeparator());
				words = br.readLine();
			}
			lines = sb.toString();
		}
		return lines;
	}

	// Method to count a single letter user wants to find
	private int countChar(String words) {
		int count = 0;

		for (int i = 0; i < words.length(); i++) {
			if (Character.toLowerCase(words.charAt(i)) == Character.toLowerCase(find.charAt(0))) {
				count++;
			}
		}
		return count;
	}

	// Method to count a word user wants to find
	private int countWord(String file) throws FileNotFoundException {
		int count = 0;
		Scanner s = new Scanner(new File(file));
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNext()) {
			list.add(s.next());
		}
		String[] arr = list.toArray(new String[0]);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equalsIgnoreCase(find)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);

		// Asks user what file and what letter/word he/she wants counted up
		System.out.println("What is the absolute path for the file you want to read: ");
		String doc = input.next();

		System.out.println("What letter/word do you want to count up: ");
		String find = input.next();

		System.out.println(find.length());

		FileReader file = new FileReader(doc);
		SSE3_3 counts = new SSE3_3(file, find);

		// if statements to see if user wants a letter or a word counted up
		if (find.length() == 1) {
			System.out.println("The number of times " + find + " is counted: " + counts.countChar(counts.readFile()));
		}
		if (find.length() > 1) {
			System.out.println("The number of times " + find + " is counted: " + counts.countWord(doc));
		}
	}
}

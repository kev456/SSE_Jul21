package com.ss.jb.three;

import java.io.File;
import java.util.Scanner;

// Purpose of this assignment is to list all directories and sub directories user wants from a path 

public class SSE3_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Asks user what directory files he/she wants
		System.out.println("Enter a directory: ");
		String path = input.next();
		
		// Creates a new file and array of files
		File file = new File(path);
		File[] files = file.listFiles();
		
		// For loop to get the names of the file and absolute path of a directory
		for (File x : files) {
			if (x.isFile()) {
				System.out.println(x.getName());
			}
			else if (file.isDirectory()) {
				System.out.println(x.getAbsolutePath());
			}
		}

	}

}

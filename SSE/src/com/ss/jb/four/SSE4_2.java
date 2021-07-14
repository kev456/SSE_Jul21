package com.ss.jb.four;

// Purpose of this assignment is to create a deadlock situation

public class SSE4_2 {

	public static void main(String[] args) {
		// Initial variables
		String one = "I am running";
		String two = "I am sprinting";

		// First thread synchronizing string one then string two
		Runnable t1 = new Runnable() {
			public void run() {
				try {
					synchronized (one) {
						synchronized (two) {
							System.out.println(one + two);
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		// Second thread synchronizing string two then string one
		Runnable t2 = new Runnable() {
			public void run() {
				try {
					synchronized (two) {
						synchronized (one) {
							System.out.println(two + one);
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		// Running both threads causing a deadlock
		new Thread(t1).start();
		new Thread(t2).start();
	}
}
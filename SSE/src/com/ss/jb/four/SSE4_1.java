package com.ss.jb.four;

// Purpose of this assignment is to implement a SIngleton with double checked locking

public class SSE4_1 {

	private static SSE4_1 instance = null;
	private SSE4_1() {

	}
	
	public static SSE4_1 getInstance() {
		// first check
		if (instance == null) {
			synchronized (SSE4_1.class) {
				
				// second check
				if (instance == null) {
					instance = new SSE4_1();
				}
			}
		}
		
		return instance;
	}
}

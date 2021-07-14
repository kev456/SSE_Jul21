package com.ss.jb.four;

import java.util.LinkedList;

// Purpose of this assignment is to make a code that does not make consumer consume more than producers can produce

public class SSE4_3 {

	// Creates linked list to account for producer and consumer
		LinkedList<Integer> list = new LinkedList<>();
		int space = 5;

		// Method for producing goods
		public void produce() throws InterruptedException {
			int good = 0;
			while (true) {
				synchronized (this) {
					
					// Tells producers to wait until space is open
					while (list.size() == space)
						wait();
					System.out.println("Produced: " + good);

					list.add(good++);
					
					// Tells consumers that there is something to take
					notify();
					Thread.sleep(1000);
				}
			}
		}

		// Method for consumers to consume when there is something to take
		public void consume() throws InterruptedException {
			while (true) {
				synchronized (this) {
					
					// Tells consumer to wait until producer makes something
					while (list.size() == 0)
						wait();
					int good = list.removeFirst();
					System.out.println("Consumed: " + good);
					
					// Tells producer that there is space to create more
					notify();
					Thread.sleep(1000);
				}
			}
		}
		
		public static void main(String[] args) throws InterruptedException{
			SSE4_3 track = new SSE4_3();
			
			// One thread for producers
			Thread producer = new Thread(new Runnable() {
				public void run() {
					try {
						track.produce();
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			
			// one thread for consumers
			Thread consumer = new Thread(new Runnable() {
				public void run() {
					try {
						track.consume();
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			
			// Starts both threads
			producer.start();
			consumer.start();
			
			// Consumer thread waits until producer thread is complete
			producer.join();
			consumer.join();
			
		}

}

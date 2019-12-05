package com.paru.threads.volatilee;

/**
 * volatile keyword is used to mark a Java variable as "being stored in main
 * memory". that every read of a volatile variable will be read from the
 * computer's main memory, and not from the CPU cache, and that every write to a
 * volatile variable will be written to main memory, and not just to the CPU
 * cache.
 * 
 * http://tutorials.jenkov.com/java-concurrency/volatile.html
 *
 */
public class VolatileTest {
	public static volatile int values = 0;

	public static void main(String[] args) throws InterruptedException {
		Listener listener = new Listener();
		listener.start();
		Modifier modifier = new Modifier();
		modifier.start();
	}

	static class Listener extends Thread {
		public void run() {
			int lisner_value = values;
			while (lisner_value < 5) {
				if (lisner_value != values) {
					System.out.println("lister values: " + values);
					lisner_value = values;
				}
			}
		}
	}

	static class Modifier extends Thread {
		public void run() {
			int modifier_value = values;
			while (values < 5) {
				System.out.println("modifier values: " + (modifier_value + 1));
				values = ++modifier_value;
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

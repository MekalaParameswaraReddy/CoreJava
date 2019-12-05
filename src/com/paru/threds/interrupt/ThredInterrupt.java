package com.paru.threds.interrupt;

/**
 * we can interrupt the sleeping thread using interrupt() method. But we should
 * know when to interrupt.
 *
 */
public class ThredInterrupt extends Thread {

	public void run() {
		try {
			System.out.println("befor sleep");
			Thread.sleep(1000);
			System.out.println("After sleep");
		} catch (InterruptedException e) {
			System.out.println("Thred is interrupted");
		}
		System.out.println("Going with normal execution");
	}

	public static void main(String[] args) {
		ThredInterrupt one = new ThredInterrupt();
		one.start();
		one.interrupt();
	}
}

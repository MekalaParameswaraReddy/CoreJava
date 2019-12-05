package com.paru.threads.deadlock;

public class DeadLock {
	
	static Object lock1 = new Object();
	static Object lock2 = new Object();

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				synchronized (lock1) {
					System.out.println("Thread 1 : holding object 1");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Thread 1 : Wating for object 2");
					synchronized (lock2) {
						System.out.println("Thread 1 : holding object 2");
					}
				}
			}
		}.start();

		new Thread() {
			public void run() {
				// synchronized (lock1) { // to avoid dead lock.
				synchronized (lock2) {
					System.out.println("Thread 2 : holding object 2");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Thread 2 : Wating for object 1");
					// synchronized (lock1) { // to avoid dead lock.
					synchronized (lock1) {
						System.out.println("Thread 2 : holding object 1");
					}
				}
			}
		}.start();
	}
}

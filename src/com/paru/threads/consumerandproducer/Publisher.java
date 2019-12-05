package com.paru.threads.consumerandproducer;

public class Publisher implements Runnable {
	private Message message;

	Publisher(Message message) {
		this.message = message;
	}

	public void run() {
		synchronized (message) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " Started...");
			for (int i = 1; i <= message.initial_size; ++i) {
				message.al.add("A" + i);
				System.out.println("Published! ==> " + "A" + i);
				message.count++;
				if (message.getCount() >= 5 || (message.al.size() == message.initial_size)) {
					try {
						message.notify();
						message.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			System.out.println(name + " end !");
		}
	}
}

package com.paru.threads.consumerandproducer;

public class Consumer implements Runnable {
	private Message message;

	Consumer(Message message) {
		this.message = message;
	}

	public void run() {
		synchronized (message) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " Started...");
			for (int i = 0; i < message.al.size(); ++i) {
				System.out.println("Consumed! ==> " + message.al.get(i));
				message.count--;
				if (message.count == 0) {
					message.notify();
					try {
						if (message.al.size() == message.initial_size) {
							break;
						}
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

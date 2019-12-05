package com.paru.threads.consumerandproducer;

public class PublisherConsumerTest {

	public static void main(String[] args) throws InterruptedException {
		Message msg = new Message();
		msg.initial_size = 20;

		Publisher publisher = new Publisher(msg);
		Thread publisherThread = new Thread(publisher, "publisher_Thread");
		publisherThread.start();

		Consumer consumer = new Consumer(msg);
		Thread consumerThread = new Thread(consumer, "consumer_Thread");
		consumerThread.start();
	}
}

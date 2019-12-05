package com.paru.threads;

/**
 * The join() method waits for a thread to die.
 * 
 * Do observe, once t1 dies then only t2 and t3 will start.
 * 
 * By default, each thread has a name i.e. thread-0, thread-1 and so on. We can
 * change the name of the thread by using setName() method.
 */
public class JoinTest implements Runnable {

	public static void main(String[] args) {
		JoinTest join = new JoinTest();
		Thread t1 = new Thread(join);
		t1.setName("t1");
		Thread t2 = new Thread(join);
		t2.setName("t2");
		Thread t3 = new Thread(join);
		t3.setName("t3");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; ++i) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

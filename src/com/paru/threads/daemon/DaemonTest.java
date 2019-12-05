package com.paru.threads.daemon;

/**
 * It provides services to user threads for background supporting tasks. Its
 * life depend on the mercy of user threads i.e. when all the user threads dies,
 * JVM terminates this thread automatically.
 * 
 * There are many java daemon threads running automatically e.g. gc, finalizer
 * etc.
 * 
 * It is a low priority thread.
 * 
 * You can see all the detail by typing the jconsole in the command prompt. The
 * jconsole tool provides information about the loaded classes, memory usage,
 * running threads etc.
 */
public class DaemonTest extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Deamon Works....!");
		} else {
			System.out.println("user Thared works...");
		}
	}

	/**
	 * 
	 * We can't set thread as daemon once it is started, it will throw
	 * 'IllegalThreadStateException'
	 */
	public static void main(String[] args) {
		DaemonTest t1 = new DaemonTest();
		t1.setDaemon(true);
		t1.start();
		DaemonTest t2 = new DaemonTest();
		t2.start();
		DaemonTest t3 = new DaemonTest();
		t3.start();
		// t3.setDaemon(true);
	}
}

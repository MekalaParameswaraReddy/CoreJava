package com.paru.threads;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class TestRun2 extends Thread{
	public void run(){
		for(int i=0;i<=10;++i){
			System.out.println("i = "+i);
			try {
				Thread.currentThread().sleep(1000);
				//Thread.currentThread().getContextClassLoader().get
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestRun2 testRun1 = new TestRun2();
		/*testRun1.start();
		testRun1.start();*/
		
		TestRun2 testRun2 = new TestRun2();
		testRun2.run();
		testRun2.run();
		
	}

}

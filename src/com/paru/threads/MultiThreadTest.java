package com.paru.threads;

import java.math.BigDecimal;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class MultiThreadTest {
	
	public int getRecords (){
		return 1000;
	}
	
	public void test () {
		int count = getRecords();
		int threadCount = count/100;
		int start = 1;
		int size = 2;
		int end = 2;
		for(int i =1; i< threadCount; ++i){
			new Thread (){
				public void run (){
					
				}			
			}.start();
		}
		
		while(start < count) {
			process(start, end);
			start += size;
			end += 2;
		}
		
	}
	public void process(int start , int end) {
		for(int i = start; i <= end; ++ i){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		MultiThreadTest t1 = new MultiThreadTest();
		
		
		double d1 = 110621668.55;
		double d2 = 1234567.55;
		double d3 = d1;
		System.out.println("--" + d1);
		System.out.println("--" + d2);		
		String dVaule = Double.toString(d3);
		if(dVaule.contains("E")){
			double d4 = BigDecimal.valueOf(d3).doubleValue();
			System.out.println( d4 + "===");
		}
		
		
		
		long beginTime = System.currentTimeMillis();
		t1.test();
		long endTime = System.currentTimeMillis();
		long timeTaken = endTime - beginTime;
		//System.out.println("total time == " + timeTaken/1000 + " seconds");
	}
}

package com.pramesh;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class SingleTon1 {

	private static SingleTon1 singleTon = null;
	static int i = 0;

	/*private SingleTon1() {
		i++;
		System.out.println("object is created." + i);
	}*/

	public static SingleTon1 getInstance() {
		if (singleTon == null) {
			singleTon = new SingleTon1();
			return singleTon;
		} else {
			return singleTon;
		}
	}
}

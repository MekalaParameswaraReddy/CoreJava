package com.pramesh;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class SingleTon2 {

	Exception createException = null;
	static int i = 0;

	private SingleTon2() {
		i++;
		System.out.println("SingleTon2 object is created." + i);
	}

	private static class SingleTonHelper {
		public static final SingleTon2 instance = new SingleTon2();
	}

	public static SingleTon2 getInstance() {
		if (SingleTonHelper.instance.createException == null) {
			return SingleTonHelper.instance;
		} else {
			throw new RuntimeException(SingleTonHelper.instance.createException);
		}
	}
}

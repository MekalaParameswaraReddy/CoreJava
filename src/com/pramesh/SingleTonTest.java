package com.pramesh;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class SingleTonTest {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 10; ++i) {
			SingleTon1 s1 = SingleTon1.getInstance();
			System.out.println(s1.hashCode());
		}
		SingleTon1.getInstance();
		Class c = Class.forName("com.pramesh.SingleTon1");
		SingleTon1 s1 = (SingleTon1) c.newInstance();
		System.out.println(s1.hashCode());
		/*for (int i = 0; i < 10; ++i) {
			SingleTon2 s2 = SingleTon2.getInstance();
			System.out.println(s2.hashCode());
		}
		SingleTon2.getInstance();*/
	}

}

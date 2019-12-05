package com.paru.staticVSdynamicLoading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicLoading {
	
	/**
	 * [Class.forName(-)] static method returns the class object associated with the
	 * class name. The string className can be supplied dynamically at run time.
	 * Once the class is dynamically loaded the class.newInstance() method returns
	 * an instance of the loaded class.
	 */
	public void dynamicLoadingTest() {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the class name");
		try {
			String className = br.readLine();
			Class dynaObject = Class.forName(className);
			Object obj = dynaObject.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * In static class loading Classes are statically loaded with Java’s "new"
	 * operator. In this case, the retrieval of class definition and instantiation
	 * of the object is done at compile time.
	 */
	public static void main(String[] args) {
		DynamicLoading dynamicLoading = new DynamicLoading();
		dynamicLoading.dynamicLoadingTest();
	}
}

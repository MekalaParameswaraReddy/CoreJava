package com.paru.designpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingletonTest extends Thread {

	/**
	 * If no synchronized: All threads called getInstance() method at a time through
	 * run().
	 */
	public void run() {
		Singleton.getInstance();
	}

	/**
	 * Do observe that, even though we are repeating 5 times only one object will
	 * create. Because getInstance() method gets called one after another.
	 * 
	 * in overridden clone method also we are returning the same class object.
	 */
	public void test() {
		for (int i = 0; i <= 5; ++i) {
			Singleton sg = Singleton.getInstance();
			Singleton sg1 = null;
			try {
				sg1 = (Singleton) sg.clone();
			} catch (CloneNotSupportedException e) {
				System.out.println(e.getMessage());
			}
			if (sg.hashCode() != sg1.hashCode()) {
				System.out.println("Both sg and sg1 hashCodes are not equal");
			} else {
				System.out.println("Both sg and sg1 hashCodes are  equal");
			}

		}
	}

	public void handlingSerializationIssue() throws Exception {
		String path = "D:\\Practice_Workspace\\CoreJava\\src\\com\\paru\\designpattern\\Singleton.txt";
		Singleton sg = Singleton.getInstance();
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(sg);
		System.out.println("Singleton Serialization is done. hascode is :" + sg.hashCode());

		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Singleton sg1 = (Singleton) ois.readObject();
		System.out.println("Singleton de-Serialization is done. hascode is :" + sg1.hashCode());
		if (sg.hashCode() == sg1.hashCode()) {
			System.out.println("Both Serialization  and de-Serialization objects are equal");
		} else {
			System.out.println("Both Serialization  and de-Serialization objects are not equal");
		}

	}

	/**
	 * To overcome reflection issue, enums are used. java ensures that enum value is
	 * instantiated only once.
	 */
	public void singleToUsingReflection() {
		Singleton sg = Singleton.getInstance();
		Singleton sg1 = null;
		try {
			Constructor[] constructors = Singleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				sg1 = (Singleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("singleton using Reflection API");
		System.out.println(sg.hashCode());
		System.out.println(sg1.hashCode());

	}

	/**
	 * if no synchronized below 3 statements will create 3 objects. 2 created
	 * threads + 1 main thread. each thread will create their own object for
	 * 'Singleton' class. All threads starts at a time.
	 * 
	 * @throws Exception
	 * 
	 */
	public static void main(String[] args) throws Exception {
		SingletonTest singletonTest1 = new SingletonTest();
		singletonTest1.start();
		SingletonTest singletonTest2 = new SingletonTest();
		singletonTest2.start();
		SingletonTest mainThread = new SingletonTest();
		mainThread.test();
		//mainThread.handlingSerializationIssue();
		//mainThread.singleToUsingReflection();
		Thread.sleep(100);
		Singleton.getInstance().getObjectCount();
		Class c = Class.forName("com.paru.designpattern.Singleton");
	    System.out.println((Singleton) c.newInstance());
		
	}
}

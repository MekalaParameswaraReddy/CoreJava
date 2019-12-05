package com.paru.serialization.subclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SubClassSerilizableTest {
	String nokiaPath = "D:\\Practice_Workspace\\CoreJava\\src\\com\\paru\\serialization\\subclass\\Nokia.txt";
	String redmiPath = "D:\\Practice_Workspace\\CoreJava\\src\\com\\paru\\serialization\\subclass\\Redmi.txt";
	FileOutputStream fos = null;
	ObjectOutputStream oos = null;
	FileInputStream fis = null;
	ObjectInputStream ois = null;

	public void persistRedmi(Redmi redmi) {
		try {
			fos = new FileOutputStream(redmiPath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(redmi);
			System.out.println("Redmi object is serilized.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void dePersistRedmi() {
		try {
			fis = new FileInputStream(redmiPath);
			ois = new ObjectInputStream(fis);
			Redmi redmi = (Redmi) ois.readObject();
			System.out.println("Redmi object is de-serilized.");
			System.out.println("Redmi Battery type." + redmi.getBatteryType());
			System.out.println("Redmi model is." + redmi.getModel());
			System.out.println("Redmi Name is." + redmi.getName());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * Nokia class is serialized even if we don't implemented from Serializable
	 * interface, Because Nokia super class 'Moblie' is implemented from the
	 * 'Serializable' interface: sub class inherits all properties from it's super
	 * class. Conclusion is subclass not required to implement 'Serializable'
	 * interface :
	 * 
	 */
	public void persistNokia(Nokia nokia) {
		try {
			fos = new FileOutputStream(nokiaPath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(nokia);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Nokia object is serilized.");
	}

	/**
	 * Applicable same above [Method: persistNokia(Nokia nokia)] said logic.
	 */
	public void dePersistNokia() {
		try {
			fis = new FileInputStream(nokiaPath);
			ois = new ObjectInputStream(fis);
			Nokia nokia = (Nokia) ois.readObject();
			System.out.println("Nokia object is de-serilized.");
			System.out.println("nokia Battery type." + nokia.getBatteryLife());
			System.out.println("nokia model is." + nokia.getModel());
			System.out.println("nokia Name is." + nokia.getName());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		Redmi redmi = new Redmi("Touch phone", "Anroid", "High quality battery");
		Nokia nokia = new Nokia("Keyboard", "Press model", "low quality battery");
		SubClassSerilizableTest scst = new SubClassSerilizableTest();
		scst.persistNokia(nokia);
		scst.dePersistNokia();
		System.out.println("*************************");
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		scst.persistRedmi(redmi);
		scst.dePersistRedmi();
	}

}

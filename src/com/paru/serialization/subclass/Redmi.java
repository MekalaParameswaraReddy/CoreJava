package com.paru.serialization.subclass;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Redmi extends Mobile {

	private static final long serialVersionUID = 1L;
	private String batteryType;

	public Redmi(String name, String model, String batteryType) {
		super(name, model);
		this.batteryType = batteryType;
	}

	public String getBatteryType() {
		return batteryType;
	}

	/**
	 * There is no direct way to prevent subclass from serialization in java. One
	 * possible way by implementing the writeObject() and readObject() methods in
	 * the subclass and needs to throw NotSerializableException from these methods.
	 * These methods are executed during serialization and de-serialization
	 * respectively.
	 */
	private void writeObject(ObjectOutputStream out) throws NotSerializableException {
		System.out.println("Stopping Subclass serialization");
		throw new NotSerializableException();
	}

	/**
	 * Same as above[method: writeObject(ObjectOutputStream out)] said logic.
	 * 
	 */
	private void readObject(ObjectInputStream ois) throws NotSerializableException {
		System.out.println("Stopping Subclass de-serialization");
		throw new NotSerializableException();
	}
}

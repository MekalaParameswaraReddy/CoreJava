package com.pramesh;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public enum SingletonEnum {
	INSTANCE;
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
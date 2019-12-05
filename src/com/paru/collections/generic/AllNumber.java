package com.paru.collections.generic;

/**
 * This class can accept all data types as input. (This class is generic class)
 * 
 * @param <T>
 *            : T can be any data type.
 */
public class AllNumber<T> {
	private T number;

	AllNumber(T number) {
		this.number = number;
	}

	public T getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "AllNumber [number=" + number + "]";
	}
}

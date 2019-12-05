package com.paru.collections.custom;

/**
 * Custom ArrayList which handles: Add, Remove, get, size, length, Dynamic size
 * increasing.
 * 
 * Functions: 
 * 		add(Object element)
 * 		remove(int index)
 * 		get(int index)
 * 		size()
 * 		length()
 * 
 * Requisites:
 * 		Object Array
 * 		actSize Variable
 * 
 * Exception Handling:
 * 		ArrayIndexOutOfBoundsException
 * 
 * Test Class:
 * 
 */
public class CustomArrayList {

	private Object[] obj = null;
	private int actSize = 0;

	/**
	 * Initially 3 is the size, when we trying to insert 4 th element then size is
	 * doubled, and so on....
	 */
	CustomArrayList() {
		obj = new Object[3];
	}

	public void add(Object element) {
		if (actSize == obj.length) {
			increaseSize(element);
		} else {
			obj[actSize++] = element;
		}
	}

	public Object get(int index) {
		if (index < actSize) {
			Object indexElement = obj[index];
			return indexElement;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	private void increaseSize(Object element) {
		int basicSize = obj.length;
		int incSize = basicSize * 2;
		Object[] tempObj = new Object[incSize];

		for (int i = 0; i < basicSize; ++i) {
			tempObj[i] = obj[i];
		}

		obj = null;
		actSize = 0;
		obj = new Object[incSize];

		for (int i = 0; i < basicSize; ++i) {
			obj[actSize++] = tempObj[i];
		}
		obj[actSize++] = element;
	}

	public int size() {
		return actSize;
	}

	public int length() {
		return obj.length;
	}

	public void print() {
		for (int i = 0; i < actSize; ++i) {
			System.out.print(obj[i] + " : ");
		}
		System.out.println();
	}

	public Object remove(int index) {
		if (index < actSize) {
			Object reovedElement = obj[index];
			obj[index] = null;
			int temp = index;
			while (temp < actSize) {
				obj[temp] = obj[temp + 1];
				obj[temp + 1] = null;
				temp++;
			}
			actSize--;
			return reovedElement;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
}

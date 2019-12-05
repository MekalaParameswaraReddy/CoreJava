package com.paru.array;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class UniqueElement {

	int size = 7;
	int[] arr = new int[size];
	int[] unique = new int[size];

	public void fill() {
		arr[0] = 5;
		arr[1] = 7;
		arr[2] = 9;
		arr[3] = 7;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 5;
	}

	public void dis() {
		for (int i = 0; i < arr.length; ++i) {
			boolean flag = false;
			for (int j = 0; j < unique.length; ++j) {
				if (arr[i] == unique[j]) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println(arr[i]);
			}
		}
	}

	public void findUnique() {
		for (int i = 0; i < arr.length; ++i) {
			for (int j = i + 1; j < arr.length; ++j) {
				if (arr[i] == arr[j]) {
					unique[i] = arr[i];
				}
			}
		}
		System.out.println("-----------------");
		System.out.println(unique[0]);
		System.out.println(unique[1]);
		System.out.println(unique[2]);
		System.out.println(unique[3]);
		System.out.println(unique[4]);
		System.out.println(unique[5]);
		System.out.println(unique[6]);
		System.out.println("-----------------");
	}

	public static void main(String[] args) {
		UniqueElement uniqueElement = new UniqueElement();
		uniqueElement.fill();
		System.out.println("Before unique: " );
		uniqueElement.dis();
		uniqueElement.findUnique();
		System.out.println("After unique: " );
		uniqueElement.dis();
	}
}

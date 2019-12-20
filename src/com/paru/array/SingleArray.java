package com.paru.array;

public class SingleArray {
	int[] arr = new int[5];
	int[][] dd_arr = new int[5][5];

	public int[] fill() {
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = i + 1;
		}
		return arr;
	}

	public void show(int[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
	}

	public void dd_fill() {
		int start = 10;
		for (int i = 0; i < dd_arr.length; ++i) {
			for (int j = 0; j < dd_arr[i].length; ++j) {
				dd_arr[i][j] = start;
				start++;
			}
		}
	}

	public void dd_show() {
		for (int i = 0; i < dd_arr.length; ++i) {
			for (int j = 0; j < dd_arr[i].length; ++j) {
				System.out.print(dd_arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void findingElementInDD(int number) {
		int count = 0;
		boolean exit = false;
		for (int i = 0; i < dd_arr.length; ++i) {
			for (int j = 0; j < dd_arr[i].length; ++j) {
				if (dd_arr[i][j] == number) {
					System.out.println(number + " Found at (" + i + "," + j
							+ ")");
					exit = true;
					break;
				}
				count++;
			}
			if (exit) {
				break;
			}
		}
		if (!exit) {
			System.out.println("not found");
		}
		System.out.println("loop was repeated " + count + " times");
	}

	public void sort() {
		System.out.println("before sorting ");
		show(unSort);

		for (int i = 0; i < unSort.length; ++i) {
			for (int j = i + 1; j < unSort.length; ++j) {
				int temp = 0;
				if (unSort[i] < unSort[j]) {
					temp = unSort[i];
					unSort[i] = unSort[j];
					unSort[j] = temp;
				}
			}
		}

		System.out.println("After sorting ");
		show(unSort);
	}

	int[] unSort = new int[5];

	public void randomArr() {
		unSort[0] = 4;
		unSort[1] = 5;
		unSort[2] = 1;
		unSort[3] = 3;
		unSort[4] = 2;
	}

	public static void main(String[] args) {
		SingleArray singleArray = new SingleArray();
		// singleArray.fill();
		// singleArray.show();
		singleArray.dd_fill();
		singleArray.dd_show();
		singleArray.findingElementInDD(15);
		//singleArray.randomArr();
		//singleArray.sort();
	}
}

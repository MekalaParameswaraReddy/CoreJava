package com.paru.file.folderAndSubfolders;

import java.io.File;

/**
 * Program to display the folders and sub-folders and files within it.
 */
public class RecursiveFileDisplay {

	public void check() {
		String folderPath = "D:\\Parent";
		String filePath = "D:\\Parent\\ch1\\file_ch1.txt";
		File folder = new File(folderPath);
		File file = new File(filePath);

		if (folder.isDirectory()) {
			System.out.println(folderPath + " : is a directory / floder");
		}
		if (file.isFile()) {
			System.out.println(filePath + " : is a file");
		}
		System.out.println("*************** Check END *****************");
	}

	public void recursiveDisplay(File file, int tabLevel) {
		// To display the tabs:
		for (int tab = 0; tab < tabLevel; tab++)
			System.out.print("\t");

		File[] arr = file.listFiles();
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i].isDirectory()) {
				System.out.println("[" + arr[i].getName() + "]");
				recursiveDisplay(arr[i], tabLevel + 1);
			} else if (arr[i].isFile()) {
				System.out.println(arr[i].getName());
			}
		}
	}

	public static void main(String[] args) {
		String folderPath = "D:\\Parent";
		File folder = new File(folderPath);
		RecursiveFileDisplay fileRecursive = new RecursiveFileDisplay();
		fileRecursive.check();
		fileRecursive.recursiveDisplay(folder, 0);
	}

}

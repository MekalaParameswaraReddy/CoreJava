package com.paru.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class will read data from one file --> eliminate the duplicate records
 * based on id & written to another file.
 */
public class FileReadAndWrite {

	ArrayList<Record> arrayList;
	File inFile;
	File outFile;
	String readPath = "C:\\Users\\515189\\Desktop\\Perparation\\Core\\src\\com\\paru\\file\\AllRecords.txt";
	String writePath = "C:\\Users\\515189\\Desktop\\Perparation\\Core\\src\\com\\paru\\file\\UniqueRecords.txt";
	FileReader fr;
	FileWriter fw;
	BufferedReader br;
	BufferedWriter bw;

	/**
	 * This method will initialize the resources.
	 */
	public void setup() {
		arrayList = new ArrayList<Record>();
		inFile = new File(readPath);
		outFile = new File(writePath);
	}

	/**
	 * This method will read data from file --> prepares Record object --> store
	 * records into array list by eliminating the duplicate records.
	 */
	public void readFromFile() {
		String line;
		try {
			fr = new FileReader(inFile);
			br = new BufferedReader(fr);
			while ((line = br.readLine()) != null) {
				String arr[] = line.split(",");
				Record record = new Record();
				record.setId(Integer.parseInt(arr[0]));
				record.setName(arr[1]);
				record.setAddress(arr[2]);
				if (!arrayList.contains(record)) {
					arrayList.add(record);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Writing records into file.
	 */
	public void writeIntoFile() {
		try {
			fw = new FileWriter(outFile);
			bw = new BufferedWriter(fw);
			Iterator<Record> it = arrayList.iterator();
			while (it.hasNext()) {
				Record record = it.next();
				bw.write(record.getId() + "," + record.getName() + "," + record.getAddress() + "\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("done");
	}

	public static void main(String[] args) {
		FileReadAndWrite frnw = new FileReadAndWrite();
		frnw.setup();
		frnw.readFromFile();
		frnw.writeIntoFile();
	}
}

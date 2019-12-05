package com.paru.designpattern;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class SingleTonLogFile {
	
	SingleTonLogFile(){
		System.out.println("object is created.");
	}

	public void createFile() throws IOException {
		Date date = new Date();
	System.out.println(date);
		File file = new File(date + "abc.txt");
		file.createNewFile();
		if(file.exists()) {
			System.out.println("file created");
		}else {
			System.out.println("not");
		}
		
	}
	public static void main(String[] args) throws IOException {
		for(int i =0;i<5;++i) {
			SingleTonLogFile logFile = new SingleTonLogFile();
			logFile.createFile();
		}	

	}

}

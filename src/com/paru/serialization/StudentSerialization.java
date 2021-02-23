package com.paru.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * If you don't want to serialize any data member of a class, you can mark it as
 * transient.
 * 
 * If there is any static data member in a class, it will not be serialized
 * because static is the part of class not object.
 * 
 * serialver -classpath D:\Practice_Workspace\CoreJava\bin
 * com.paru.serialization.StudentSerialization
 */

public class StudentSerialization  {
	
	String filePath = "D:\\Learnings\\Practice_Workspace_Java_1\\Core\\src\\com\\paru\\serialization\\student.txt";

	public void persist(Student serObj) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(filePath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(serObj);
			System.out.println("Student object is Serialized successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.flush();
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void dePersist() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(filePath);
			ois = new ObjectInputStream(fis);
			Student ss = (Student) ois.readObject();
			System.out.println("Student object is deSerialized successfully details are.");
			System.out.println(ss.id);
			System.out.println(ss.getName());
			System.out.println(ss.getAddress());
			System.out.println(ss.getPwd());
			System.out.println(ss.company);
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

}

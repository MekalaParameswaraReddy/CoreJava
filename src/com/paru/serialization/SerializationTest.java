package com.paru.serialization;

public class SerializationTest {

	public static void main(String[] args) {
		Student student = new Student(10,"Raja1","hyd1","xyz");
		StudentSerialization ss =  new StudentSerialization();
		ss.persist(student);
		ss.dePersist();
	}
}

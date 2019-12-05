package com.paru.serialization;

import java.io.Serializable;

/**
 * How to test 'serialVersionUID': take some value for serialVersionUID = 10L :
 * Serialize the student object : modify the value of serialVersionUID = 103L
 * then try to de-Serialize the student object, will get :: local class
 * incompatible: stream classdesc serialVersionUID = 10, local class
 * serialVersionUID = 103 exception :: serialized version is mismatched.
 */
public class Student implements Serializable {

	private static final long serialVersionUID = 10L;
	private String name;
	private String address;
	private transient String pwd;
	int id;
	static String company = "SSS IT Pvt Ltd";// it won't be serialized

	public Student(int id, String name, String address, String pwd) {
		this.name = name;
		this.address = address;
		this.pwd = pwd;
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPwd() {
		return pwd;
	}

	public int getId() {
		return id;
	}

	public static String getCompany() {
		return company;
	}

}

package com.paru.serialization.subclass;

import java.io.Serializable;

public class Mobile implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String model;

	public Mobile(String name, String model) {
		super();
		this.name = name;
		this.model = model;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getName() {
		return name;
	}

	public String getModel() {
		return model;
	}

}

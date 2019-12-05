package com.paru.serialization.subclass;

public class Nokia extends Mobile {

	private static final long serialVersionUID = 1L;
	private String batteryLife;

	public Nokia(String name, String model, String batteryLife) {
		super(name, model);
		this.batteryLife = batteryLife;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getBatteryLife() {
		return batteryLife;
	}

}

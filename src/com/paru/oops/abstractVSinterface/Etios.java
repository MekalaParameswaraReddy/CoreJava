package com.paru.oops.abstractVSinterface;

public class Etios extends CarCommon implements CarBasic {

	@Override
	public void numberOfGares() {
		System.out.println("Etios have " + 4 + " Gares");
	}

	@Override
	public void typeOfWheels() {
		System.out.println("Etios have Tubed whells");
	}

	@Override
	public void numberOfSeats() {
		System.out.println("Etios have " + 4 + " Seats");
	}

	@Override
	public void stearingPlace() {
		System.out.println("Stearing ins right side");
	}
}
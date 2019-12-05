package com.paru.oops.abstractVSinterface;

public class Innova extends CarCommon implements CarBasic {
	private int handBreak = 1;

	@Override
	public void numberOfGares() {
		System.out.println("Innova have " + 5 + " Gares");
	}

	@Override
	public void typeOfWheels() {
		System.out.println("Innova have Tube less whells");
	}

	@Override
	public void numberOfSeats() {
		System.out.println("Innova have " + 6 + " Seats");
	}

	@Override
	public void numberOfBreaks() {
		int breaks = minimumBreaks + handBreak;
		System.out.println("innova has one hand break");
		System.out.println("innova has total" + breaks + " Breaks");
	}

	@Override
	public void stearingPlace() {
		System.out.println("Stearing is in left side");
	}
}

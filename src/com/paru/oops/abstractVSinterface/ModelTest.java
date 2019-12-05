package com.paru.oops.abstractVSinterface;

public class ModelTest {

	public static void main(String[] args) {
		System.out.println("Innova detalis::");
		Innova innova = new Innova();
		innova.NumberOfWheels();
		innova.numberOfBreaks();
		innova.stearingShape();

		innova.numberOfGares();
		innova.typeOfWheels();
		innova.numberOfSeats();

		innova.doorGlassType();

		System.out.println();
		System.out.println("Etios detalis::");

		Etios etios = new Etios();
		etios.NumberOfWheels();
		etios.numberOfBreaks();
		etios.stearingShape();

		etios.numberOfGares();
		etios.typeOfWheels();
		etios.numberOfSeats();

		etios.doorGlassType();
	}
}
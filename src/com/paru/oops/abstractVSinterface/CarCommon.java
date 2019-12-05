package com.paru.oops.abstractVSinterface;

/**
 * If you plan to creating multiple versions of your component, create an
 * abstract class. By updating the base class, all inheriting classes are
 * automatically updated with the change.
 * 
 * If you are designing large functional units, use an abstract class.
 */
public abstract class CarCommon {

	int minimumBreaks = 2;

	public void NumberOfWheels() {
		System.out.println("car should have " + 4 + " Wheels");
	}

	public void numberOfBreaks() {
		System.out.println("car should have " + minimumBreaks + " Breaks");
	}

	public void stearingShape() {
		System.out.println("Steairng is in round shape");
	}

	/**
	 * Sub classes have implemented in their own way. The way 'Innova' is
	 * implemented is quite different form 'Etios', but both should be
	 * implemented 'stearingPlace()' method.
	 */
	public abstract void stearingPlace();

	/**
	 * Few years later this rule has been added. it should be applicable for all
	 * classes, so we added this method as concrete in abstract class.
	 * Automatically this feature is available in all classes.
	 */
	public void doorGlassType() {
		System.out.println("Doors glass type should be Transparent");
	}
}

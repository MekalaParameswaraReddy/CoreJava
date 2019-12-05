package com.paru.Strings.immutable;

/**
 * Creating the immutable class which may have another class as data type. These
 * class 'Address' (we do not have any control on Address class), it may come
 * from jar file or may from another source.
 */
final public class Persion {

	private final int id;
	private final String name;
	Address address;

	/**
	 * If we use the 'this.addres = address;' we will get modified values. to avoid
	 * this we holding the first state of Address by creating the new object and
	 * setting the initial state for Address.
	 * 
	 */
	public Persion(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		// this.address = address;
		this.address = new Address();
		this.address.setDist(address.getDist());
		this.address.setState(address.getState());
		this.address.setZip(address.getZip());

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}
}

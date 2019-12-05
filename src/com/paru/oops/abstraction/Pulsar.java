package com.paru.oops.abstraction;

public class Pulsar extends TwoWheeler {

	public Pulsar() {
		System.out.println("Pulsar constructor");
	}

	@Override
	public void gares() {
		System.out.println("pulsar have " + 5 + "gares");
	}

	@Override
	public void breaks() {
		System.out.println("pulsar have Disk break at front");
		System.out.println("pulsar have normal break at rare");
	}

	public void model() {
		System.out.println("pulsar have sports and normal models");
	}
}
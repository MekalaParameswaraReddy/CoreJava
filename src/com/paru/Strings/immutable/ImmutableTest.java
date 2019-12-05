package com.paru.Strings.immutable;

public class ImmutableTest {

	public static void main(String[] args) {
		Address address = new Address();
		address.setDist("Prakasam");
		address.setState("A.P");
		address.setZip("523368");
		Persion persion = new Persion(1, "Paramesh", address);
		System.out.println(persion.getId());
		System.out.println(persion.getName());
		System.out.println(persion.getAddress().getDist());
		System.out.println(persion.getAddress().getState());
		System.out.println(persion.getAddress().getZip());

		System.out.println("=== Modifying address details ===");

		address.setDist("Siva mogga");
		address.setState("Karntaka");
		address.setZip("526618");

		System.out.println(persion.getAddress().getDist());
		System.out.println(persion.getAddress().getState());
		System.out.println(persion.getAddress().getZip());
	}
}

package com.paru.oops.abstraction;

public class WalmartItem {

	/*
	 * A WalmartItem have many properties.
	 */
	private int itemid;
	private String itemname;
	private String itemseller;
	private int weight;
	private int cost;
	private String color;
	private boolean archived;
	private String specification;

	/*
	 * We are hiding item seller & archiving details, while displaying item
	 * details on site.
	 * 
	 * Do observe that displyonSite() hiding the itemseller, archived details,
	 * this is called abstraction.
	 */
	public void displyonSite() {
		System.out.println(itemid);
		System.out.println(itemname);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(weight);
		System.out.println(specification);

	}

	/*
	 * We are hiding item seller, item id & archiving details, while displaying
	 * item details on site.
	 */
	public void customer() {
		System.out.println(itemname);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(weight);
		System.out.println(specification);
	}

	/*
	 * We are hiding all the details except item seller, item id & archiving
	 * details, while displaying item details on site.
	 */
	public void itemMaintaing() {
		System.out.println(itemid);
		System.out.println(itemseller);
		System.out.println(archived);
	}

}
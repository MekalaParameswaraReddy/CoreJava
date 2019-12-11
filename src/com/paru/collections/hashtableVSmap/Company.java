package com.paru.collections.hashtableVSmap;

public class Company {
	
	private String name;
	private String sector;
	private String quoteIn;

	public Company(String name, String sector, String quoteIn) {
		super();
		this.name = name;
		this.sector = sector;
		this.quoteIn = quoteIn;
	}

	public String getName() {
		return name;
	}

	public String getSector() {
		return sector;
	}

	public String getQuoteIn() {
		return quoteIn;
	}

}

package com.paru.threads.consumerandproducer;

import java.util.ArrayList;

public class Message {
	int count = 0;
	int initial_size;
	ArrayList<String> al = new ArrayList<String>();

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}

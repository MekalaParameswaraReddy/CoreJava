package com.paru.ws;

import javax.xml.ws.Endpoint;

public class WebservicePublisher {

	public static void main(String[] args) {	
		Endpoint.publish("http://localhost:9990/ws/webserviceProducerSOAP", new WebserviceProduceImpl());
		System.out.println("Published.");
	}
}

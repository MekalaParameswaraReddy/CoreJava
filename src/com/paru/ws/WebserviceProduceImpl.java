package com.paru.ws;

import javax.jws.WebService;

@WebService(targetNamespace = "http://com.paru.ws/", 
			endpointInterface = "com.paru.ws.WebserviceProduce", 
			serviceName = "webserviceProducer", 
			portName = "webserviceProducerSOAP")

public class WebserviceProduceImpl implements WebserviceProduce {

	@Override
	public String getWish(String name) {
		return "Good night " + name;
	}

	@Override
	public int add(int x, int y) {
		return x + y;
	}
}

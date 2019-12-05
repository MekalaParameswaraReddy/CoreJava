package com.paru.ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class WebserviceConsumer {
public static void main(String[] args) throws MalformedURLException {
	URL url = new URL("http://localhost:9990/ws/webserviceProducerSOAP?wsdl");
	QName name = new QName("http://com.paru.ws/", "webserviceProducer");
	Service service= Service.create(url, name);
	WebserviceProduce wp = service.getPort(WebserviceProduce.class);
	System.out.println(wp.getWish("paramesh"));
	System.out.println(wp.add(10, 10));
}
}

package com.paru.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * usually targetNamespace should be like :- http:// + package name (if not it
 * will take default like :- http:// + package name in reverse )
 * 
 * serviceName like name of your web service, same will be reflect in wsdl, (if
 * not it will take interface (WebserviceProduce) name as default)
 * 
 * portName for naming the port, it's like <url-pattern>, the same is reflected
 * in WSDL URL.
 * 
 * wsdlLocation = "WebserviceProducer.wsdl"
 */

@WebService(targetNamespace = "http://com.paru.ws/", endpointInterface = "com.paru.ws.WebserviceProduce", serviceName = "webserviceProducer", portName = "webserviceProducerSOAP")
@SOAPBinding(style = Style.RPC)
public interface WebserviceProduce {
	/**
	 * If we not specified 'action': <soap:operation soapAction=""> is empty in WSDL
	 * :- if we want to specify we need to use 'targetNamespace + serviceName +
	 * method name'. now in WSDL
	 * <soap:operation soapAction="http://com.paru.ws/webserviceProducer/getWish"/>
	 *
	 * WebParam: not seen much effected in WSDL.
	 */

	@WebMethod(action = "http://com.paru.ws/webserviceProducer/getWish")
	public String getWish(
			@WebParam(partName = "name", name = "String", targetNamespace = "http://com.paru.ws/") String name);

	@WebMethod(action = "http://com.paru.ws/webserviceProducer/add")
	public int add(int x, int y);
}

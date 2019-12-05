package com.paru.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class MyServer {
public static void main(String[] args) {
	//System.setProperty("java.rmi.server.hostname","localhost");
	
	try {
		//LocateRegistry.createRegistry(2020);
		Adder add =new AdderRemote();
		Naming.rebind("rmi://localhost:2020/sonoo",add);  
	} catch (Exception e) {		
		e.printStackTrace();
	}
	System.out.println("Server started ....");
}
}

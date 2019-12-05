package com.paru.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class AdderRemote extends UnicastRemoteObject implements Adder{

	/**
	 * Default Constructor
	 */
	protected AdderRemote() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int add(int x, int y) throws RemoteException {
		return x+ y;
	}

}

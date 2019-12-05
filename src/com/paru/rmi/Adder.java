package com.paru.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public interface Adder extends Remote{
	public int add(int x,int y)throws RemoteException;
}

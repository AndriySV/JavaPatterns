package com.as.structural.proxy.simpleExample;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {

	public String on() throws RemoteException;

	public String off() throws RemoteException;
}

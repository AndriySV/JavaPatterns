package com.as.structural.proxy.gumballWithProxy;

import java.rmi.*;

import com.as.structural.proxy.gumballWithProxy.state.State;

public interface GumballMachineRemote extends Remote {
	public int getCount() throws RemoteException;

	public String getLocation() throws RemoteException;

	public State getState() throws RemoteException;
}

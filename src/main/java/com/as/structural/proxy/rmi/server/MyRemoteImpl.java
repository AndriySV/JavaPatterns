package com.as.structural.proxy.rmi.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	public MyRemoteImpl() throws RemoteException {
	}

	@Override
	public String sayHello() throws RemoteException {
		return "Server says Hello !";
	}
	
	public static void main(String[] args) {
		
		try {
			MyRemoteImpl server = new MyRemoteImpl();
			
			Naming.rebind("RemoteHello", server);
		
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}

}

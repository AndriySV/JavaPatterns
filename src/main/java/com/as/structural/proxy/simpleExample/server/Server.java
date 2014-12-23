package com.as.structural.proxy.simpleExample.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.as.structural.proxy.simpleExample.MyRemote;

@SuppressWarnings("serial")
public class Server extends UnicastRemoteObject implements MyRemote {

	protected Server() throws RemoteException {
	}

	public String on() {
		return "TV was turned on";
	}

	public String off() {
		return "TV was turned off";
	}
	
	public static void main(String[] args) {
	
		try {
			MyRemote server = new Server();
			Naming.rebind("tv", server);
			
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}

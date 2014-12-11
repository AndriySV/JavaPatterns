package com.as.structural.proxy.rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRemoteClient {
	
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}

	private void go() {
		try {
			MyRemote server = (MyRemote) Naming.lookup("rmi://192.168.1.2/RemoteHello");
			
			String string = server.sayHello();
			
			System.out.println(string);
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
}

package com.as.structural.proxy.simpleExample.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.as.structural.proxy.simpleExample.MyRemote;

public class Client {

	public static void main(String[] args) {
		try {
			MyRemote server = (MyRemote) Naming.lookup("rmi://192.168.1.2/tv");

			String result = server.on();
			System.out.println(result);
			
			result = server.off();
			System.out.println(result);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}

}

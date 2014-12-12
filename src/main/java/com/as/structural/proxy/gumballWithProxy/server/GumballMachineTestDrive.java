package com.as.structural.proxy.gumballWithProxy.server;

import java.rmi.*;

import com.as.structural.proxy.gumballWithProxy.GumballMachineRemote;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachineRemote gumballMachine = null;
		int count = 60;
		String ip = "192.168.1.2";

		try {
			gumballMachine = new GumballMachine(ip, count);
			
			Naming.rebind("//" + ip + "/gumballmachine", gumballMachine);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

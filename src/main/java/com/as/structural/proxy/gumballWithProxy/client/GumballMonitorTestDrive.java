package com.as.structural.proxy.gumballWithProxy.client;

import java.rmi.*;

import com.as.structural.proxy.gumballWithProxy.GumballMachineRemote;

public class GumballMonitorTestDrive {

	public static void main(String[] args) {
		String location = "rmi://" + "192.168.1.2" + "/gumballmachine";
		GumballMonitor monitor;

		try {
			GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location);

			monitor = new GumballMonitor(machine);
			monitor.report();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

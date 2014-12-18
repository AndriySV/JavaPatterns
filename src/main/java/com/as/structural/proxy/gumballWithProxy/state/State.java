package com.as.structural.proxy.gumballWithProxy.state;

import java.io.*;

public interface State extends Serializable {
	public void insertQuarter();

	public void ejectQuarter();

	public void turnCrank();

	public void dispense();
}

package com.as.behavioral.command.simpleExample;

import com.as.behavioral.command.simpleExample.command.Command;

public class Invoker {
	
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void buttonWasPressed() {
		command.execute();
	}
	
}

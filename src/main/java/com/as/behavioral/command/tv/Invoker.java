package com.as.behavioral.command.tv;

import com.as.behavioral.command.tv.command.Command;

public class Invoker {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void buttonWasPressed() {
		command.execute();
	}
	
	public void undoButtonWasPressed() {
		command.undo();
	}
}

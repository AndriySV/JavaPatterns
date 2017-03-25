package com.as.behavioral.command.simpleExample.command;

import com.as.behavioral.command.simpleExample.TV;

public class TvOnCommand implements Command {
	private TV tv;
	
	public TvOnCommand(TV tv) {
		this.tv = tv;
	}
	
	public void execute() {
		tv.on();
	}

}

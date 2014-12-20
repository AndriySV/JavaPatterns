package com.as.behavioral.command.simpleExample.command;

import com.as.behavioral.command.simpleExample.TV;

public class TvOffCommand implements Command {
	private TV tv;
	
	public TvOffCommand(TV tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.off();
	}

}

package com.as.behavioral.command.tv.command;

import com.as.behavioral.command.tv.TV;

public class TvOnCommand implements Command {
	private TV tv;
	
	public TvOnCommand(TV tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.on();
	}

	@Override
	public void undo() {
		tv.off();
	}

}

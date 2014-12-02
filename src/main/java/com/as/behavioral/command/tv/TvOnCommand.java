package com.as.behavioral.command.tv;

public class TvOnCommand implements Command {
	private TV tv;
	
	public TvOnCommand(TV tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.on();
	}

}

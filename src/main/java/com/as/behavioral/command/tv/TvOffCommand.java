package com.as.behavioral.command.tv;

public class TvOffCommand implements Command {
	TV tv;
	
	public TvOffCommand(TV tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.off();
	}

	@Override
	public void undo() {
		tv.on();
	}

}

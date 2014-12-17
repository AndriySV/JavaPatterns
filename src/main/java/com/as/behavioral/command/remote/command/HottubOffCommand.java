package com.as.behavioral.command.remote.command;

import com.as.behavioral.command.remote.receiver.Hottub;


public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.cool();
		hottub.off();
	}
}

package com.as.behavioral.command.remote.command;

import com.as.behavioral.command.remote.receiver.Light;

public class LightOffCommand implements Command {
	private Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.off();
	}

}

package com.as.behavioral.command.remote.command;

import com.as.behavioral.command.remote.receiver.Light;

public class LightOnCommand implements Command {
	private Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

}

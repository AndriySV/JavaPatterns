package com.as.behavioral.command.remote.command;

import com.as.behavioral.command.remote.receiver.Light;


public class LivingroomLightOnCommand implements Command {
	Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}

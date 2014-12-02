package com.as.behavioral.command.remote.command;

import com.as.behavioral.command.remote.receiver.Light;


public class LivingroomLightOffCommand implements Command {
	Light light;

	public LivingroomLightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}
}

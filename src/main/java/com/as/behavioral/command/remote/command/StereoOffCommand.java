package com.as.behavioral.command.remote.command;

import com.as.behavioral.command.remote.receiver.Stereo;

public class StereoOffCommand implements Command {
	private Stereo stereo;
	
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		stereo.off();
	}

}

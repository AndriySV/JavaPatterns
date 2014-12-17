package com.as.behavioral.command.remote.command;

import com.as.behavioral.command.remote.receiver.Stereo;

public class StereoOnWithCDCommand implements Command {
	private Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

}

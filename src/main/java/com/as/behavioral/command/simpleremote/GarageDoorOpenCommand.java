package com.as.behavioral.command.simpleremote;

public class GarageDoorOpenCommand implements Command {
	private GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.open();
	}

}

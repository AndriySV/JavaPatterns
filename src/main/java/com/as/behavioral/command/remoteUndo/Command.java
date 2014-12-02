package com.as.behavioral.command.remoteUndo;

public interface Command {
	public void execute();
	public void undo();
}

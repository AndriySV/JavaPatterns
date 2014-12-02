package com.as.behavioral.command.tv;

public class Main {
	
	public static void main(String[] args) {
		
		Invoker invoker = new Invoker();
		
		TV tv = new TV();
		TvOnCommand tvOnCommand = new TvOnCommand(tv);
		TvOffCommand tvOffCommand = new TvOffCommand(tv);
		
		invoker.setCommand(tvOnCommand);
		invoker.buttonWasPressed();
		
		invoker.undoButtonWasPressed();
		
		invoker.setCommand(tvOffCommand);
		invoker.buttonWasPressed();
		
		invoker.undoButtonWasPressed();
		
	}
}

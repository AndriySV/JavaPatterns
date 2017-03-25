package com.as.behavioral.command.simpleExample;

import com.as.behavioral.command.simpleExample.command.TvOffCommand;
import com.as.behavioral.command.simpleExample.command.TvOnCommand;

public class Client {

	public static void main(String[] args) {
		TV tv = new TV();
		
		TvOffCommand tvOffCommand = new TvOffCommand(tv);
		TvOnCommand tvOnCommand = new TvOnCommand(tv);
		
		Invoker invoker = new Invoker();
		
		invoker.setCommand(tvOnCommand);
		invoker.buttonWasPressed();
		
		invoker.setCommand(tvOffCommand);
		invoker.buttonWasPressed();
		
	}

}

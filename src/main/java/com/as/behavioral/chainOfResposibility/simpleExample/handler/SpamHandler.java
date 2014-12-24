package com.as.behavioral.chainOfResposibility.simpleExample.handler;

public class SpamHandler implements Handler {
	private String condition;
	
	public SpamHandler(String condition) {
		this.condition = condition;
	}

	@Override
	public void handelRequest() {
		if (condition.equals("spam")) {
			System.out.println("It's SPAM !");
		} else {
			new FanHandler(condition).handelRequest();
		}
		
		
	}

}

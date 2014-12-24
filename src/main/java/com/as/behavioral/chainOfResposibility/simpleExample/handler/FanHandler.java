package com.as.behavioral.chainOfResposibility.simpleExample.handler;

public class FanHandler implements Handler {
	private String condition;

	public FanHandler(String condition) {
		this.condition = condition;
	}

	@Override
	public void handelRequest() {
		if (condition.equals("fan")) {
			System.out.println("It's FAN !");
		} else {
			System.out.println("It's somesing else !");
		}
	}

}

package com.as.behavioral.strategy.simpleExample.dynamicContent;

public class CannotFly implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can not fly ");
	}

}

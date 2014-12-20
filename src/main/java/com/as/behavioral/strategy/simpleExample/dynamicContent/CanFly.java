package com.as.behavioral.strategy.simpleExample.dynamicContent;

public class CanFly implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can fly");
	}

}

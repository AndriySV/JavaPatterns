package com.as.behavioral.strategy.simpleExample.staticContent;

import com.as.behavioral.strategy.simpleExample.dynamicContent.FlyBehavior;

public abstract class Duck {
	private FlyBehavior flyBehavior;
	
	public void swim() {
		System.out.println("I can swim ");
	}
	
	public void display(){
		name();
		swim();
		flyBehavior.fly();
		
		System.out.println("----------------------");
	}

	public abstract void name();
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	
}

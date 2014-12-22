package com.as.structural.decorator.simpleExample.decorator;

import com.as.structural.decorator.simpleExample.component.Beverage;

public class Milk extends Decorator {
	private Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public void description() {
		beverage.description();
		System.out.print( "+ Milk ");
	}

}

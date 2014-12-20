package com.as.structural.decorator.simpleExample.decorator;

import com.as.structural.decorator.simpleExample.component.Beverage;

public class Sugar extends Decorator {
	private Beverage beverage;
	
	public Sugar(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public void description() {
		beverage.description();
		System.out.print("+ Sugar ");

	}

}

package com.as.structural.decorator.StarbuzzCoffee;

public class Soy extends CondimentDecoratior {
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + .15;
	}

}

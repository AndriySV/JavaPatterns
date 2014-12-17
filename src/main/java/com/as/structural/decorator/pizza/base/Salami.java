package com.as.structural.decorator.pizza.base;

import com.as.structural.decorator.pizza.Pizza;

public class Salami extends Pizza {

	public Salami() {
		description = "Salami";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}

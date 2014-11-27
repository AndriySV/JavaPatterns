package com.as.structural.decorator.pizza.base;

import com.as.structural.decorator.pizza.Pizza;

public class Calzone extends Pizza {

	public Calzone() {
		description = "Calzone";
	}
	
	@Override
	public double cost() {
		return 1.29;
	}

}

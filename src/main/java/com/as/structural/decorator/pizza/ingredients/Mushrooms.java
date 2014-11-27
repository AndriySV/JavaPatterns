package com.as.structural.decorator.pizza.ingredients;

import com.as.structural.decorator.pizza.Decorator;
import com.as.structural.decorator.pizza.Pizza;

public class Mushrooms extends Decorator {
	private Pizza pizza;
	
	public Mushrooms(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Mushrooms";
	}

	@Override
	public double cost() {
		return pizza.cost() + .40;
	}

}

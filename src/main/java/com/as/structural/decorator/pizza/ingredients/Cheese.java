package com.as.structural.decorator.pizza.ingredients;

import com.as.structural.decorator.pizza.Decorator;
import com.as.structural.decorator.pizza.Pizza;

public class Cheese extends Decorator {
	private Pizza pizza;

	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Cheese";
	}

	@Override
	public double cost() {
		return pizza.cost() + .30;
	}

}

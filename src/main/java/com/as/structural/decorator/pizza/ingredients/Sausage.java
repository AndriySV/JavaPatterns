package com.as.structural.decorator.pizza.ingredients;

import com.as.structural.decorator.pizza.Decorator;
import com.as.structural.decorator.pizza.Pizza;

public class Sausage extends Decorator {
private Pizza pizza;
	
	public Sausage(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Sausage";
	}

	@Override
	public double cost() {
		return pizza.cost() + .39;
	}

}

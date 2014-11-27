package com.as.structural.decorator.pizza.ingredients;

import com.as.structural.decorator.pizza.Decorator;
import com.as.structural.decorator.pizza.Pizza;

public class Tomato extends Decorator {
private Pizza pizza;
	
	public Tomato(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Tomato";
	}

	@Override
	public double cost() {
		return pizza.cost() + .19;
	}

}

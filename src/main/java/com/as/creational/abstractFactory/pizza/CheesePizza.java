package com.as.creational.abstractFactory.pizza;

import com.as.creational.abstractFactory.pizza.ingradient.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory  ingredientFactory; 
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System. out. println ("Preparing  "  +  name); 
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}

}

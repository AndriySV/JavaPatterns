package com.as.creational.abstractFactory.pizza.ingradientFactory;

import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Cheese;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Clams;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Dough;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Pepperoni;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Sauce;
import com.as.creational.abstractFactory.pizza.ingradientFactory.ingradients.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggies[] createVeggies();

	public Pepperoni createPepperoni();

	public Clams createClam();
}
